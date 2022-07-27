package test.main;

import test.mypac.Arrow;
import test.mypac.Gun;
import test.mypac.MyObject;
import test.mypac.Puzzle;
import test.mypac.Radio;

public class MainClass04 {
	public static void main(String[] args) {
		MyObject obj = new MyObject();
		obj.setNum(999);
		obj.setName("kim");
		
		//useRadio()메소드도 호출해보세요.
		obj.useRadio(new Radio());
		
		// 메소드의 인자로 전달할 값이 이미 준비 되어 있을 수도 있다.
		Radio rad = new Radio();
		// 이미 준비 되어 있다면 메소드 호출하면서 준비된 값을 참조해서 전달하면 된다.
		obj.useRadio(rad);
		
		// attack() 메소드를 호출해 보세요
		obj.attack(new Gun(), new Arrow());
		
		Gun gun = new Gun();
		Arrow arr = new Arrow();
		obj.attack(gun, arr);
		
		obj.puzzling(new Puzzle());
	}
}
