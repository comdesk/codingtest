package baekjoon;

import java.util.Scanner;

class Test2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        String num2 = sc.next();

        System.out.println(num1 * Integer.parseInt(num2.substring(2)));
        System.out.println(num1 * Integer.parseInt(num2.substring(1, 2)));
        System.out.println(num1 * Integer.parseInt(num2.substring(0, 1)));
        System.out.println(num1 * Integer.parseInt(num2));

    }
}

//알고리즘
//1. num1과, num2의 일의 자리 수 곱셈
//2. num1과, 십의 자리 수 곱셈
//3. num1과, 백의 자리 수 곱셈
//4. num1과 num2 곱셈
//* substring은 half-open 이다.