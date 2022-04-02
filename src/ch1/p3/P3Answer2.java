package ch1.p3;

import java.util.Scanner;

public class P3Answer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String answer = solution(str);
        System.out.println(answer);

    }
    private static String solution(String str) {
        String answer = "";
        int pos;
        int max = Integer.MIN_VALUE;
        int min =0;
        while((pos = str.indexOf(' ')) != -1){
            String tmp = str.substring(0,pos);
            min = answer.length();
            if(max < min){
                max = min;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > max){
            answer = str;
        }
        return answer;
    }
}
