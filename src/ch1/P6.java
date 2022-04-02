package ch1;

import java.util.Calendar;
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = solution(str);
        System.out.println(answer);
    }
    static String solution(String str){
        String answer ="";
        for(int i = 0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
            return answer;
    }
}
