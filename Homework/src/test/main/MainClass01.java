package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass01 {
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
	      
	      // SELECT 작업
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      try {
	    	  // sql 실행문
	    	  String sql = "SELECT num, name, addr, phone FROM friend"
	    			  + " ORDER BY num ASC";
	    	  
	    	  pstmt = conn.prepareStatement(sql);
	    	  rs = pstmt.executeQuery();
	    	  
	    	  while(rs.next()) {
	    		  int num = rs.getInt("num");
	    		  String name = rs.getString("name");
	    		  String addr = rs.getString("addr");
	    		  String phone = rs.getString("phone");
	    		  System.out.println("번호 : "+num+" | 이름 : "+name+" | 주소 : "+addr+" | 전화번호 : "+phone);
	    	  }
	    	  
	      } catch (Exception e) {
			e.printStackTrace();
		}
	    System.out.println("main 메소드가 종료됩니다.");
	}
}
