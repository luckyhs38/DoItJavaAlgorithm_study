
import java.util.Scanner;
// 두 변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램
public class Difference_i {

    public static void main(String[] args) {
    
        Scanner  sc = new Scanner(System.in);
        System.out.print("a값: "); 
        int a = sc.nextInt();
        System.out.print("b값: "); 
        int b = sc.nextInt();
        while (a > b) {
            System.out.println("a보다 큰 값을 입력하세요"); 
            System.out.print("b값: "); 
            b = sc.nextInt();
        }                
        
        System.out.println("b-a는 " + (b - a)  + "입니다"); 

    }

    
}

