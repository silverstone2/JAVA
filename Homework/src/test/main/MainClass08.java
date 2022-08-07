package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

import test.util.DBConnect;

public class MainClass08 {
	public static void main(String[] args) {
		String name = "해 골";
		String addr = "행신동";
		String phone = "010-4444-4444";
		
		// Map에 회원정보 담기
		Map<String, String> fri = new HashMap<>();
		fri.put("name", name);
		fri.put("addr", addr);
		fri.put("phone", phone);
		
		insert(fri);
	}
	
	public static void insert(Map<String, String> fri) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new DBConnect().getConn();
			
			String sql = "INSERT INTO friend"
					+ " (num, name, addr, phone)"
					+ " VALUES(friend_seq.NEXTVAL, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, fri.get("name"));
			pstmt.setString(2, fri.get("addr"));
			pstmt.setString(3, fri.get("phone"));
			
			pstmt.executeUpdate();
			System.out.println("회원정보가 수정되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e) {}
		}
		System.out.println("main 메소드가 종료됩니다...");
	}
}
