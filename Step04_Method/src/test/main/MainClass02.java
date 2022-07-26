package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {
		// Car car1 = new Car(); Car()에서 public을 뺐기 때문에 다른 패키지에서는 객체 생성이 되질 않음.
		// Car 객체의 참조값을 얻어내서 drive() 메소드를 여기서 호출해 보세요.
		MyObject myobj = new MyObject();
		Car car1 = myobj.getCar();
		car1.drive();
		
		// 위의 3줄을 합쳐서 한줄로 작성하면 아래 와 같다
		//new MyObject.getCar().drive();
	}
}
