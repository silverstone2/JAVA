package test.mypac;

//인터페이스는 상속받는 것이 아닌 구현하는 것
public class MyRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("채널을 올려요!");
	}

	@Override
	public void down() {
		System.out.println("채널을 내려요!");
	}
}
