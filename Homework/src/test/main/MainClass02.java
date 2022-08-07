package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass02 {
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
	      
	      // friend 테이블에 추가할 회원의 정보
	      int num = 4;
	      String name = "해골";
	      String addr = "행신동";
	      String phone = "010-4444-4444";
	      
	      PreparedStatement pstmt = null;
	      try {
	    	  String sql = "INSERT INTO friend"
	    			  + " (num, name, addr, phone)"
	    			  + " VALUES(?, ?, ?, ?)";
	    	  
	    	  pstmt = conn.prepareStatement(sql);
	    	  
	    	  pstmt.setInt(1, num);
	    	  pstmt.setString(2, name);
	    	  pstmt.setString(3, addr);
	    	  pstmt.setString(4, phone);
	    	  
	    	  // sql문 실행(업데이트 작업)
	    	  pstmt.executeUpdate();
	    	  System.out.println("회원정보를 저장했습니다.");
	      } catch (Exception e) {
			e.printStackTrace();
		}
	    System.out.println("main 메소드가 종료됩니다.");
	}
}
