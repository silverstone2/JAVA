package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass06 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		// friend_seq 이라는 시퀀스를 이용해서 아래의 회원정보를 추가하고자 한다.
	      String name = "이은석";
	      String addr = "서울시";
	      String phone = "010-1111-1111";
		
	      try {
	    	  conn = new DBConnect().getConn();
	    	  
	    	  String sql = "INSERT INTO friend"
	    			  + " (num, name, addr, phone)"
	    			  + " VALUES(friend_seq.NEXTVAL, ?, ?, ?)";
	    	  
	    	  pstmt = conn.prepareStatement(sql);
	    	  
	    	  pstmt.setString(1, name);
	    	  pstmt.setString(2, addr);
	    	  pstmt.setString(3, phone);
	    	  
	    	  pstmt.executeUpdate();
	    	  System.out.println("회원정보를 수정했습니다.");
	    	  
	      } catch (Exception e) {
			e.printStackTrace();
		}
	}
}
