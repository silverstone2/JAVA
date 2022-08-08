package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		// 밑에 중괄호는 class를 의미한다 . class는 익명의 클래스 이고 Weapon을 상속받은 클래스이다.
		Weapon w1 = new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("몰라 몰라 아무나 공격하자");	
			}
		};
		useWeapon(w1);
		
		// 지역변수 만들지 않고 바로 익명클래스로 객체 생성 후 참조값 전달하기
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("공중 공격을 해요!");
				System.out.println("공중 공격을 해요!");
			}
		});
		
		
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
