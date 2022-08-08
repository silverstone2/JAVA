package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

/*
 * JAVA에서 작업의 성공 여부는 return type으로 알려준다.
 */

public class MainClass12 {
	public static void main(String[] args) {
		// 삭제할 회원의 번호라고 가정하자
		int num = 2;
		// 회원의 정보를 삭제하고 성공여부를 return 받는다.
		boolean isSuccess = delete(2);
		// 성공이나 실패냐에 따라 선택적인 작업을 할 수가 있다.
		if(isSuccess) {
			System.out.println(num+" 번 회원을 삭했습니다.");
		} else {
			System.out.println(num+" 번 회원 삭제 실패!");
		}
	}
	
	// 회원 한명의 정보를 삭제하는 메소드
	public static boolean delete(int num) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 변화된(추가, 수정, 삭제) 행의 갯수를 담을 지역변수를 미리 만들어둔다.
		int updateRowCount = 0;
		
		try {
			conn = new DBConnect().getConn();
			
			String sql = "DELETE FROM member"
					+ " WHERE num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			// 실행 후 메소드가 리턴해주는 변화된 행의 갯수를 지역변수에 담는다.
			updateRowCount = pstmt.executeUpdate();
			System.out.println("회원정보를 삭제했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         } catch (Exception e) {}
		}
		// 만일 변화된 행의 갯수가 0보다 크면
		if(updateRowCount > 0) {
			// 작업 성공의 의미이기 때문에 true를 리턴하고
			return true;
		} else {
			// 작업이 실패면 false를 리턴한다.
			return false;
		}
	}
}
