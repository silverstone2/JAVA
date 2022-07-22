package test.main;

import test.mypac.Member;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//Member 객체를 생성해서 그 참조값을 mem1 이라는 지역변수에 담아보세요.(1줄)
		Member mem1 = new Member();
		mem1.num = 1;
		mem1.name = "김구라";
		mem1.addr = "노량진";
		
		//Member 객체를 생성해서 그 참조값을 mem2 이라는 지역변수에 담고 해골의 정보도 담아 보세요
		Member mem2 = new Member();
		mem1.num = 2;
		mem1.name = "해골";
		mem1.addr = "행신동";
	}
}
