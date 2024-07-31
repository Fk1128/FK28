package ex04_if;

import java.util.Scanner;

public class Ex02_if_else {
	public static void main(String[] args) {
		int num = 5 ;
		if(num > 4 ) {
			System.out.println(num +"은 4보다 큽니다 .");
		} else {
			System.out.println(num +"은 4보다 작습니다 .");
		}
		//-----------------------------------------------
		// 두개의 숫자 비교하기 
		int a=4 ; 
		int b=10 ;
		if (a > b) {
			System.out.println("a 가 b 보다 큽니다. ");
		} else {
			if( a==b) {
				System.out.println("a는 b 와 같습니다");
			}else {
				System.out.println("a는 b보다 작거나 같습니다 .");		
			}	
		}
			System.out.println("--------------------------");
			//int 형 변수 x 가 10보다 크고 20보다 작을 때 true 인 조건식
			Scanner sc = new Scanner(System.in);
			
			//int x = sc.nextInt() ;
			//System.out.println();
			int x= 15 ;
			if(x > 10 && x < 20) {
				System.out.println("true");	
			}
			
			char ch = 'b';
			if(ch == 'x' && ch=='X') {
				System.out.println("true");
			}
			
			char ch2 = 'c' ;
			
			if((ch2 >= 'a' && ch2<= 'z' ) || (ch2 >= 'A' && ch2 <='Z')) {
				System.out.println("true");
			}
	
			
			
			
			//char형 변수 ch가 'x' 또는 'X' 일 때 true인 조건식 
			
			//char형변수 ch2 가 알파벳 (대문자 또는 소문자) 일 때 true인 조건식
			
			//삼항연산자로 만들었던 X 개의 농구공을 담기위한 박스의 개수 구하기를 조건문으로 만들기
			
	}
}


