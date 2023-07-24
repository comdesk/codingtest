package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //Scanner보다 BufferedReader가 빠르다.
        String loop = br.readLine();
        StringBuilder sb = new StringBuilder();

        int[] result = new int[Integer.parseInt(loop)];
        for (int i = 0; i < Integer.parseInt(loop); i++) {
            String ab = br.readLine();
            String[] arr = ab.split(" ");

            result[i] = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
} //end class
