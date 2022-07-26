package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	// 아무런 값도 전달 받지 않는 기본 생성자
	public Member() {
		System.out.println("기본 생성자가 호출되었습니다.");
	}
	
	// 필드에 저장할 값을 전달 받는 생성자
	public Member(int num, String name, String addr) {
		this.num = num; //this.num 은 field를 가르킴
		this.name = name;
		this.addr = addr;
	}

	// 위의 상황은 생성자가 여러 개 정의(다중정의) 되어 있음 -> 생성자가 overloading 되어 있다고 함.
}