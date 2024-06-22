// 연습1-10
// 양의 정숫값의 자릿수를 구하여 출력

import java.util.Scanner;

class DigitsNo_i {

	public static void main(String[] args) {
		int count = 0;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요 : "); 
		i = sc.nextInt();
		while (i > 0){
			i /= 10;
			count ++;
		}

		System.out.println("그 수는 "+ count +"자리입니다");

	}
}
