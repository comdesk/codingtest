package baekjoon;

import java.util.Scanner;

public class Test2480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b || a == c) {
            System.out.println(1000 + a * 100);
        } else if (b == c) {
            System.out.println(1000 + b * 100);
        } else {
            System.out.println(Math.max(Math.max(a, b), c) * 100);
        }
    } //main
} //end class

//알고리즘
//1. 같은 눈이 3개일 때
//   - a = b, b = c 일 때, 자동으로 a=b=c 성립
//2. 같은 눈이 2개일 때
//   - a = b 또는 a = c일 때 => a로 계산
//   - b = c 일 때 => b로 계산
//3. 모두 다른 눈일 때
//   - 위의 경우가 모두 아닐 때
