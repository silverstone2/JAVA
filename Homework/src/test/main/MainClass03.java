package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass03 {
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
	      
	      PreparedStatement pstmt = null;
	      
	      int num = 1;
	      String phone = "010-1111-1111";
	      
	      try {
	    	// UPDATE 작업을 통한 정보 수정
	    	  String sql = "UPDATE friend"
	    			  + " SET phone=?"
	    			  + " WHERE num=?";
	    	  
	    	  pstmt = conn.prepareStatement(sql);
	    	  
	    	  pstmt.setString(1, phone);
	    	  pstmt.setInt(2, num);
	    	  
	    	  pstmt.executeUpdate();
	    	  System.out.println("회원정보를 수정했습니다.");
	      } catch (Exception e) {
			e.printStackTrace();
		}
	    System.out.println("main 메소드가 종료됩니다.");
	}
}
