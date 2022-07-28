package test.mypac;
/*
 * Data Transfer Object 클래스 만들기
 * 
 * 1. 필드의 접근 지정자를 private 로 설정한다.
 * 2. default 생성자가 있어야한다.
 * 3. 필드에 저장할 모든 값을 전달 받는 생성자가 있어야 한다.
 * 4. 필드에 접근할 수 있는 getter, setter 메소드가 표준에 맞게 작성되어야 한다. 
 */
public class MemberDto {
	/*
	 * private를 통해서 필드를 캡슐화(숨기고 보호)하는 것임. 선언된 객체에서만 사용가능하다.
	 * 값을 불러올때는 메소드를 통해서 불러들어오고 이를 setter, getter 메소드라고 함
	 */
	private int num;
	private String name;
	private String addr;
	
	public MemberDto() {}

	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
