package practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {

		/*
		 - 스캐너를 사용하여 이름과 나이를 입력받아 아래와 같이 출력하세요.
		 (출력 함수는 마음대로 사용해서 출력하시고 출생년도는 입력사항이 아닙니다.)
		 
		 이름: XXX
		 나이: XX세
		 출생년도: XXXX년
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("이름을 입력하세요: ");
		System.out.print("> ");
		name = sc.next();
		
		System.out.println("나이를 입력하세요: ");
		System.out.print("> ");
		age = sc.nextInt();
		
		System.out.printf("이름: %s\n",name);
		System.out.printf("나이: %d\n",age);
		System.out.printf("출생년도: %d\n",2023-age+1);
		
		sc.close();
	} 

}
