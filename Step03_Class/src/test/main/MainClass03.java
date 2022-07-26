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
		mem2.num = 2;
		mem2.name = "해골";
		mem2.addr = "행신동";
		
		// mem1, mem2 에 들어있는 참조값을 이용해서 showInfo() 메소드 호출하기
		// 필드를 가르킬때는 무조건 this.을 붙여야한다 붙이지 않을 경우에는 지역변수를 가르킴
		mem1.showInfo();
		mem2.showInfo();
	}
	// 현재 상태 : 메인 메소드가 런할때만 잠깐 살아있고 메인 메서드가 종료되면 죽어버림. 
}

/*
 * heap영역은 객체가 만들어지는 영역
 * main메소드는 메모리의 static 영역 내 class안에 들어 있음.
 * static 예약어가 붙어 있는 메소드들은 static 영역에 존재한다. 
 * 자바에서는 메소드가 단독으로 존재할 수가 없다(즉, 객체에 의존해서 메소드가 만들어진다)
 * static 영역은 class가 통째로 올라간다(static 영연 내의 하나만 존재해야함) -> 각각의 값들을 클래스명으로 구분함
*/
