package test.dto;

public class FriendDto {
	private int num;
	private String name;
	private String addr;
	private String phone;
	
	public FriendDto() {};
	
	public FriendDto(int num, String name, String addr, String phone) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
		this.phone = phone;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
