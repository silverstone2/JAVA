package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MemberDao {
	/*
	 * 어떠한 서비스를 만드는데
	 * 
	 * 회원 한 명의 정보를 불러오는 작업 <- new MemberDao().getData()
	 * 회원 한 명의 정보를 삭제하는 작업 <- new MemberDao().delete()
	 * 회원 한 명의 정보를 수정하는 등의 작업을 <- new MemberDao().update()
	 * 
	 * code 의 여러 부분에서 해야하는 경우도 있지 않을까?
	 */
	// 1. 전체 회원의 목록을 리턴하는 메소드
	public List<MemberDto> getList() {
		  // 전체 회원 목록을 담을 ArrayList 객체는 미리 생성해둔다.
		  List<MemberDto> dtoList = new ArrayList<>();
		  
		  MemberDto dto = null;
		  Connection conn=null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      
	      try {
	    	  conn = new DBConnect().getConn();
	    	  String sql = "SELECT * FROM member"
	    			  + " ORDER BY num ASC";
	    	  pstmt = conn.prepareStatement(sql);
	    	  // SELECT문 수행하고 결과를 ResultSet으로 얻어내기
	    	  rs = pstmt.executeQuery();
	    	  // 반복문 돌면서
	    	  while(rs.next()) {
	    		  // 커서가 위치한 곳의 회원 한명의 정보를 MemberDto 객체에 담고
	    		  dto = new MemberDto();
	    		  dto.setNum(rs.getInt("num"));
	    		  dto.setName(rs.getString("name"));
	    		  dto.setAddr(rs.getString("addr"));
	    		// MemberDto 객체의 참조값을 ArrayList 객체에 누적시킨다.
	    		  dtoList.add(dto);
	    	  }
	      }catch (Exception e) {
			e.printStackTrace();
		}
	      // MemberDto 객체의 참조값이 순서대로 누적된 ArrayList 객체의 참조값을 리턴해준다.
	      return dtoList;
	}
	
	// 2. 특정 회원 한명의 정보를 리턴하는 메소드
	public MemberDto getData(int num) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		MemberDto dto = null;
		
		try {
			conn = new DBConnect().getConn();
			String sql = "SELECT * FROM member"
					+ " WHERE num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				// MemberDto 객체를 생성해서
				String name = rs.getString("name");
				// 지역변수에 있는 회원 번호를 담고
				dto = new MemberDto();
				// ResultSet으로부터 이름과 주소를 얻어내서 담는다.
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(rs.getString("addr"));
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
	
	// 회원 한명의 정보를 추가하고 성공여부를 리턴하는 메소드
	public boolean insert(MemberDto dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int updateRowCount = 0;
		
		try {
			conn = new DBConnect().getConn();
			
			String sql = "INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			
			updateRowCount = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         } catch (Exception e) {}
		}
		if(updateRowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	// 회원 한명의 정보를 수정하고 성공여부를 리턴하는 메소드
	public boolean update(MemberDto dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int updateRowCount = 0;
		
		try {
			conn = new DBConnect().getConn();
			
			String sql = "UPDATE member"
					+ " SET name=?, addr=?"
					+ " WHERE num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			
			updateRowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         } catch (Exception e) {}
		}
		if(updateRowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// 회원 한명의 정보를 삭제하고 성공여부를 리턴하는 메소드
	public boolean delete(int num) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int updateRowCount = 0;
		
		try {
			conn = new DBConnect().getConn();
			
			String sql = "DELETE FROM member"
					+ " WHERE num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			updateRowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         } catch (Exception e) {}
		}
		if(updateRowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
}
