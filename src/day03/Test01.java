package day03;

import java.util.Scanner;
import java.io.*;

public class Test01 {
	public static void main(String[] args) throws IOException{
		
		/*
		//예제 1.
		Scanner input = new Scanner(System.in);
		int select;
		System.out.print("수 입력 : ");
		select = input.nextInt();
		switch(select) {
		case 1 : System.out.println("1. 입력한 수 : " + select);break;
		case 2 : System.out.println("2. 입력한 수 : " + select);break;
		case 3 : System.out.println("3. 입력한 수 : " + select);break;
		default : System.out.println("4. 입력한 수 : 1, 2, 3이 아닌 다른 수");
		
		
		//예제 2.
		int num;
		char ch;
		System.out.print("문자 입력 : ");
		num =  System.in.read() ;
		switch(num){
			case 'a' : System.out.println("a입력");break;
			case 'A' : System.out.println("A입력");break;
			default : System.out.println("a가 아닌 다른 값 입력");
		}
		
		
		//예제 3.
		Scanner input = new Scanner(System.in);
		String name;
		while(true) {
			System.out.println("이름 입력");
			System.out.print(">>> ");
			name = input.next();
			System.out.println("당신의 이름은 " + name + " 이군요");
		}
		
		//예제 4.
		//날짜를 입력받아 1일이면 '월' 2일이면 '화' ... 7일이면 '일' 8일 '월' 숫자에 맞춰 요일을 출력하시오.
		Scanner input = new Scanner(System.in);
		int day1 = 0;
		int day2 = 0;
		while(true) {
			System.out.print("날짜를 입력하시오 : ");
			day1 = input.nextInt();
			day2 = day1 % 7;
			switch(day2) {
			case 0 : 
				System.out.println("일요일입니다.");break;
			case 1 :
				System.out.println("월요일입니다.");break;
			case 2 :
				System.out.println("화요일입니다.");break;
			case 3 :
				System.out.println("수요일입니다.");break;
			case 4 :
				System.out.println("목요일입니다.");break;
			case 5 :
				System.out.println("금요일입니다.");break;
			case 6 :
				System.out.println("토요일입니다.");break;
			}
		}
		

		
		//예제 5.
		//우리집, 회사 등록 후 보기
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		String house = null;			//String house = "";   쓰레기값(더미변수)
		String firm = null;			//String firm = "";      쓰레기값(더미변수)
		while(flag) {
			int num;
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			System.out.println("4. 시스템 종료");
			System.out.print("숫자를 1, 2, 3, 4 중에 하나 입력하시오 : ");
			num = input.nextInt();
			switch(num) {
			case 1 : 
				System.out.print("우리집 : ");
				house = input.nextLine();
				//house = input.next();
				//System.in.read();
				break;
			case 2:
				System.out.print("회사 : ");
				firm = input.nextLine();
				break;
			case 3:
				System.out.println("우리집 : " + house);
				System.out.println("회사 : " + firm);
				break;
			case 4:
				System.out.println("프로그램 종료");
				flag = false;
				break;
				
			}
		}
		*/
		
		
	}
}
