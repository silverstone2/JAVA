package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass11 {
	public static void main(String[] args) {
		int num = 5;
		// 지역 변수 num에 담긴 내용을 메소드의 인자로 전달해서 회원 한명의 정보를 얻어낸다.
		MemberDto dto = getData(num);
		if(dto == null) {
			System.out.println(num+" 번 회원은 존재하지 않습니다.");
		} else {
			System.out.println(num +" 번 회원의 이름은 "+dto.getName()+" 이고 주소는 "+dto.getAddr()+" 입니다.");
		}
	}
	
	
	// 인자로 전달되는 번호에 해당되는 회원 한명의 정보를 리턴하는 메소드
	public static MemberDto getData(int num) {
		// 필요한 객체를 담을 지역 변수를 미리 만든다.
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		MemberDto dto = null;
		
		try {
			conn = new DBConnect().getConn();
			// 실행할 sql문 구성하기
			String sql = "SELECT name, addr"
					+ " FROM member"
					+ " WHERE num=?";
			
			pstmt = conn.prepareStatement(sql);
			// ?에 바인딩 할 내용이 있으면 바인딩 실시
			pstmt.setInt(1, num);
			// select문 수행하고 결과를 ResultSet으로 얻어내기
			rs = pstmt.executeQuery();
			/*
			 * primary key 로 select를 하게 되면 select된 row는 최대 1개이므로
			 * cursor를 반복문 돌면서 여러번 내릴 필요가 없다.
			 * 즉, rs.next() 는 한번만 수행되면 된다.
			 */
			if(rs.next()) {
				// 커서가 위치한 곳에서 select 된 칼럼 정보를 얻어낸다. -> 밑의 두 정보는 rs.next가 true인 조건부에서만 작동이 되야하므로 if조건문으로 묶어준다
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				// select 도니 정보를 MemberDto 객체를 생성해서 담는다
				dto = new MemberDto();
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e) {}
		}
		// select된 row가 없다면 dto 는 null이다
		return dto;
	}
}
