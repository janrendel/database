package chp08.ex8_6;

import java.util.Scanner;

public class MainMyMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수값 : ");
        int n1 = scanner.nextInt();
        System.out.print("첫번째 정수값 : ");
        int n2 = scanner.nextInt();

        System.out.printf("%d 과(와) %d 중에 더 큰 값: %d\n",n1,n2,myMath.max(n1,n2));
        System.out.printf("%d 과(와) %d 중에 더 작은 값: %d\n",n1,n2,myMath.max(n1,n2));

        scanner.close();
    }
}