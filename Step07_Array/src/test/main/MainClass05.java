package test.main;

import test.mypac.MemberDto;

public class MainClass05 {
	public static void main(String[] args) {
		MemberDto dto = new MemberDto();
		/*
		 * 설명하기 쉽게 비유
		 * 
		 * 스크린 리모콘
		 * 메소드 : 동작 버튼들
		 * 필드 : 안의 부품들
		 * 하지만 필드의 값들을 보여주지 않음(안의 부품들이 보이는 채로 나두면 고장날 수 있기 때문에)
		 */
		
		// Setter 메소드 테스트
		dto.setNum(1);
		dto.setName("김구라");
		dto.setAddr("노량진");
		
		// Getter 메소드 테스트
		int num = dto.getNum();
		String name = dto.getName();
		String addr = dto.getAddr();
		
		// 생성자의 인자로 필드에 저장할 값을 모두 전달하면서 객체 생성하기
		MemberDto dto2 = new MemberDto(2, "해골", "행신동");
	}
}
