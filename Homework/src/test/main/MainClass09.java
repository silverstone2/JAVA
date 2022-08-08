package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.FriendDto;
import test.util.DBConnect;

public class MainClass09 {
	public static void main(String[] args) {
		// 수정할 회원의 정보
		int num = 1;
		String name = "에이콘";
		String addr = "강남역";
		
		FriendDto dto = new FriendDto();
		update(dto);
	}
	
	public static void update(FriendDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new DBConnect().getConn();
			
			String sql="UPDATE friend"
		               + " SET name=? , addr=?"
		               + " WHERE num=?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			
			pstmt.executeUpdate();
			System.out.println("회원정보가 수정되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료됩니다...");
	}
}
