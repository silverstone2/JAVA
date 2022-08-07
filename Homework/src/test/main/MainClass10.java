package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		
		// 삭제
		int num =1;
		
		delete(num);
	}
	
	public static void delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new DBConnect().getConn();
			
			String sql = "DELETE FROM friend"
					+ " WHERE num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			System.out.println("회원정보가 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
