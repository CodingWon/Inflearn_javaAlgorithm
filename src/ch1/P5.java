package ch1;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String answer = solution(str);
        System.out.println(answer);
    }

    private static String solution(String str) {
        String answer ="";
        char[] arr = str.toCharArray();
        int lt =0;
        int rt = arr.length-1;
        while (lt <rt){
            if(Character.isAlphabetic(arr[lt]) && Character.isAlphabetic(arr[rt])){
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }else if(!Character.isAlphabetic(arr[lt])){
                lt++;
            }else if(!Character.isAlphabetic(arr[rt])){
                rt--;
            }

        }
        return String.valueOf(arr);
    }
}
