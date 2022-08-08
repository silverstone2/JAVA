package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		// 지역변수(local variable) : method 안에 선언하는 변수
		// java에서는 전역변수가 아예 없다. 구분은 지역변수 아니면 필드
		// java는 변수를 선언하고 값을 넣지 않으면 디버깅과정에서 건너뜀
		System.out.println("main 메소드가 시작 되었습니다.");
		
		int num1;
		String name1;
					
		//아직 만들어지지 않았기 때문에 num1은 참조 불가
		//int result = 10 + num1;
		
		//아직 만들어지지 않았기 때문에 name1은 참조불가
		//System.out.println("name1:"+name1);
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
