package test.main;

import test.auto.Benz;
import test.auto.CampingCar;
import test.auto.Car;
import test.auto.Engine;

public class MainClass07 {
	public static void main(String[] args) {
		//Car c1 = new Car(new Engine());
		// Benz 객체를 생성해서 참조값을 car1 이라는 지역변수에 담아보세요
		Benz car1 = new Benz(new Engine());
		// car1에 들어 있는 참조값을 이용해서 달리기도 하고 부드럽게 달리기도 해 보세요
		car1.drive();
		car1.smoothDrive();
		
		/*
		 * 여름이니 Car 클래스를 상속받아서 CampingCar를 만들어보세요
		 * CampingCar 만의 메소드도 추가하세요
		 * 만든 CampingCar 클래스로 객체를 생성하고 메소드도 호출해보세요
		 * 어떻게 테스트했는지 CampingCar 클래스와 테스트한 main 메소드의 내용을 카톡으로 공유해보세요
		 */
		CampingCar car2 = new CampingCar(new Engine());
		car2.camping();
	}
}
