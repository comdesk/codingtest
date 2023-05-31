package baekjoon;

import java.util.Scanner;

public class Test2753 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int leap;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = 1;
                } else {
                    leap = 0;
                } //if-else
            } else {
                leap = 1;
            } //if-else
        } else {
            leap = 0;
        } //if-else

        System.out.println(leap);
    } //main
} //end class

//알고리즘
//1. 4의 배수인지 판단한다. 4의 배수가 아니라면 윤년이 아니다(끝).
//2. 1번이 맞으면 100의 배수인지 판단한다. 100의 배수가 아니라면 윤년이다(끝).
//3. 2번이 맞으면 400의 배수인지 판단한다. 400의 배수가 맞다면 윤년이다.