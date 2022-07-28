package test.main;

import test.auto.CampingCar;
import test.auto.Engine;

public class MainClass08 {
	public static void main(String[] args) {
		CampingCar camp = new CampingCar(new Engine());
		
		camp.camping();
	}
}
