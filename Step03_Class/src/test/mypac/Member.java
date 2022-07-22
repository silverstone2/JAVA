package test.mypac;
/*
 * Member 객체에 회원의 번호, 이름, 주소를 담고 싶다면
 * 클래스를 어떻게 설계를 해야 할까?
 * 
 * 저장소(field)가 3개 필요하다.
 * field의 type 은 int, String, String 이 적당할 것 같음
 * 필드에 값은 나중에 new Member() 한 이후에 담을 예정
 */
public class Member {
	// field 선언하기(저장소만 필요하면 field만 선언해도 된다) * field는 값은 안 넣어도 된다
	public int num;
	public String name;
	public String addr;
}
