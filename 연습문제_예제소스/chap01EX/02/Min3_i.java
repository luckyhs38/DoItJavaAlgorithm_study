// 연습1-2
// 세 값의 최솟값을 구하여 출력

import java.util.Scanner;

class Min3_i {

	//--- a, b, c의 최솟값을 구하여 반환 ---//
	static int min3_i(int a, int b, int c) {
		int min = a;						

		if(b < min){
			min = b;
		}
		if(c < min){
			min = c;
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.println("최솟값 구하기");
		System.out.println("a를 입력하세요 : ");
		a = sc.nextInt();
		System.out.println("b를 입력하세요 : ");
		b = sc.nextInt();
		System.out.println("c를 입력하세요 : ");
		c = sc.nextInt();

		int min = min3_i(a, b, c);	// a, b, c의 최솟값

		System.out.println("최솟값은 " + min + "입니다.");
	}
}
