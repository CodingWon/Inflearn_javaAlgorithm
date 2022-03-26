package ch1;

import java.util.Arrays;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] strarr = input(num,sc);
        solution(num,strarr);
        Arrays.stream(strarr).forEach(s -> System.out.println(s));
    }

    private static String[] solution(int num, String[] strarr) {

        for(int i =0; i<num; i++){
            String str = new StringBuilder(strarr[i]).reverse().toString();
            strarr[i] = str;
        }
        return strarr;
    }

    private static String[] input(int num, Scanner sc) {
        String[] strarr = new String[num];
        for(int i = 0; i<num; i++){
            strarr[i] = sc.next();
        }
        return strarr;
    }
}
