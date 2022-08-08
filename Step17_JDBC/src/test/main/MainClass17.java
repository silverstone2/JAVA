package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass17 {
	public static void main(String[] args) {
		/*
		 * MemberDao 객체를 이용해서 회원 전체 목록을 얻어와서
		 * 아래와 같은 형식으로 출력해보세요.
		 * 
		 * 번호 => 1, 이름 => 김구라, 주소 => 노량진
		 * 번호 => 2, 이름 =>	해골, 주소 => 행신동
		 */
		
		List<MemberDto> list = new MemberDao().getList();
		
		for(MemberDto dto:list) {
		System.out.println("번호 : "+dto.getNum()+", 이름 : "+dto.getName()+", 주소 => "+dto.getAddr());
		}
	}
}
