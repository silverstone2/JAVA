package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass04 {
	public static void main(String[] args) {
		Connection conn = null;
	      
	      try {
	         //오라클 드라이버 로딩 작업
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         conn = DriverManager.getConnection(url, "scott", "tiger");
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      int num = 2;
	      String addr = "신도림";
	      
	      PreparedStatement pstmt = null;
	      try {
	    	  String sql = "UPDATE friend"
	    			  + " SET addr=?"
	    			  + " WHERE num=?";
	    	  
	    	  pstmt = conn.prepareStatement(sql);
	    	  
	    	  pstmt.setString(1, addr);
	    	  pstmt.setInt(2, num);
	    	  
	    	  pstmt.executeUpdate();
	    	  System.out.println("회원정보가 수정되었습니다.");
	      } catch (Exception e) {
			e.printStackTrace();
		}
	    System.out.println("main 메소드가 종료됩니다.");
	}
}
