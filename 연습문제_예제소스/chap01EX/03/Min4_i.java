// 연습1-3
// 네 값의 최솟값을 구하여 출력

import java.util.Scanner;

class Min4_i {

	//--- a, b, c, d의 최솟값을 구하여 반환 ---//
	static int min4_i(int a, int b, int c, int d) {
		int min = a;						

		if(b < min){
			min = b;
		}
		if(c < min){
			min = c;
		}
		if(d < min){
			min = d;
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;

		System.out.println("최솟값 구하기");
		System.out.print("a를 입력하세요 : ");
		a = sc.nextInt();
		System.out.print("b를 입력하세요 : ");
		b = sc.nextInt();
		System.out.print("c를 입력하세요 : ");
		c = sc.nextInt();
		System.out.print("d를 입력하세요 : ");
		d = sc.nextInt();

		int min = min4_i(a, b, c, d);	// a, b, c의 최솟값

		System.out.println("최솟값은 " + min + "입니다.");
	}
}
