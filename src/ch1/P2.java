package ch1;

import java.util.Locale;
import java.util.Scanner;

public class P2 {

    public static String solution(String str){

        String result ="";
        for(int i =0; i<str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))) {
               result += Character.toUpperCase(str.charAt(i));
            }else{
                result += Character.toLowerCase(str.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer = solution(str);
        System.out.println(answer);
    }
}
