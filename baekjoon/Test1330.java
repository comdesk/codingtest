package baekjoon;

import java.util.Scanner;

public class Test1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String compare = Integer.compare(num1, num2) == -1 ? "<" : (Integer.compare(num1, num2) == 0 ? "==" : ">");

        System.out.println(compare);
    } //main
} //end class
