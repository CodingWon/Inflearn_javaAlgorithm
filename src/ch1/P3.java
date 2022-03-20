package ch1;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String answer = solution(str);
        System.out.println(answer);
    }

    private static String solution(String str) {
        String[] arr = str.split(" ");
        String answer = "";
        String tmp ="";
        int len = arr.length;
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i].length() >= arr[i+1].length()){
                tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tmp;
            }
        }

        return arr[len-1];
    }
}
