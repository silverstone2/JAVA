package test.dto;

public class MemberDto {

	private int num;
	private int name;
	private String addr;
	private String subject;
	
	public MemberDto() {};
	
	public MemberDto(int num, int name, String addr, String subject) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
		this.subject = subject;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
