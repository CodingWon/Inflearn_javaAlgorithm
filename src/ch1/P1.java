package ch1;

import java.util.Scanner;

public class P1 {
    public static int solution(String str , char ch){
        int cnt =0;
        str = str.toUpperCase();
        ch = Character.toUpperCase(ch);
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);

        int result = solution(str ,ch);
        System.out.println(result);
    }
}
