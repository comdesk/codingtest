package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10; i++) {
            sb.setLength(0);
            int result = Integer.parseInt(input) * i;
            sb.append(input)
                    .append(" * ")
                    .append(i)
                    .append(" = ")
                    .append(result);
            System.out.println(sb);
        }
    }
} //end class
