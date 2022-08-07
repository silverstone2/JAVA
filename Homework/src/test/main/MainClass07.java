package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.FriendDto;
import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		// friend 테이블에 추가할 회원정보
		String name = "김구라";
		String addr = "노량진";
		String phone = "010-2222-2222";
		
		// FriendDto 객체 사용
		FriendDto dto = new FriendDto();
		dto.setName(name);
		dto.setAddr(addr);
		dto.setPhone(phone);
		
		insert(dto);
	}
	
	public static void insert(FriendDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = new DBConnect().getConn();
			
			String sql = "INSERT INTO friend"
					+ " (num, name, addr, phone)"
					+ " VALUES(friend_seq.NEXTVAL, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setString(3, dto.getPhone());
			
			pstmt.executeUpdate();
			System.out.println("추가되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
