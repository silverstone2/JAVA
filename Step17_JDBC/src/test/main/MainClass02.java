package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.jdbc.proxy.annotation.Pre;

public class MainClass02 {
	public static void main(String[] args) {
		//DB 연결객체를 담을 지역 변수 만들기
		// 오라클을 연동하려면 connection 객체를 얻어오는 작업을 거쳐야함
		Connection conn=null;
			      
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); //driver까지 패키지명 OracleDriver는 클래스명
			
			//접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			
			//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott", "tiger");
			
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// member 테이블에 추가할 회원의 정보라고 가정
		int num = 4;
		String name = "주뎅이";
		String addr = "봉천동";
		
		// SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역 변수 미리 만들기
		PreparedStatement pstmt = null;
		try {
			// 실행할 미완성의 sql문
			String sql="INSERT INTO member"
		               + " (num, name, addr)"
		               + " VALUES(?, ?, ?)";
			
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			
			// ? 에 값을 바인딩해서 미완성의 sql 문을 완성 시킨다.
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			
			//sql 문 실행하기(insert문은 update로 써줘야한다)
			pstmt.executeUpdate();
			
			System.out.println("회원 정보를 저장했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
