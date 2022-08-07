package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.dto.FriendDto;
import test.util.DBConnect;

public class MainClass11 {
	public static void main(String[] args) {
		int num = 4;
		
		FriendDto dto = getData(num);
		if(dto == null) {
			System.out.println(num+" 번 회원은 존재하지 않습니다.");
		} else {
			System.out.println(num +" 번 회원의 이름은 "+dto.getName()+" 이고 주소는 "+dto.getAddr()+" 이고 전화번호는 "+dto.getPhone()+" 입니다.");
		}
	}
	
	public static FriendDto getData(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		FriendDto dto = null;
		
		try {
			conn = new DBConnect().getConn();
			String sql = "SELECT name, addr, phone"
					+ " FROM friend"
					+ " WHERE num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String phone = rs.getString("phone");
				
				dto = new FriendDto();
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
				dto.setPhone(phone);
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
		return dto;
	}
}
