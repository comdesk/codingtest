package baekjoon;

import java.util.Scanner;

public class Test2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M < 45) {
            M = (M + 60) - 45;
            if (H < 1) {
                H = 23;
            } else {
                H = H - 1;
            }
        } else {
            M = M - 45;
        }

        System.out.println(H + " " + M);
    } //main
}

//알고리즘
//1. 입력된 M에서 45를 뺀다.
//2. 1번에서 만약 M < 45라면, (M+60)-45, H-1을 한다.
//3. 2번에서 만약 H < 1이라면, H=23이다.
