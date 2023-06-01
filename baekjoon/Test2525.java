package baekjoon;

import java.util.Scanner;

public class Test2525 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        B += C;

        if (B > 59) {
            while (B >= 60) {
              B -= 60;
              A++;
                if (A == 24) {
                    A = 0;
                } //if
            } //while
        } //if

        System.out.println(A + " " + B);
    } //main
} //end class

//알고리즘
//1. B + C를 해서 B에 대입한다.
//2. 1번의 결과 B > 59이면, B-60, A+1을 B <60일 때까지 반복한다.
//3. 2번을 반복할 때, 만약 A가 23이면 A는 0이다.