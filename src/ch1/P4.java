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
            char [] arr = strarr[i].toCharArray();
            int lt =0;
            int rt = arr.length-1;
            while (lt<rt){
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
            strarr[i] = String.valueOf(arr);
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
