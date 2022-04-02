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

    private static String solution(String str) {
        char[] arr = str.toCharArray();
        char[] tmp = new char[arr.length];
        int cnt = 0;
        for (int i = 0; i<arr.length; i++){
            boolean isEquals = false;
            for(int j = 0; j<tmp.length; j++){
              if(arr[i] == tmp[j]){
                  isEquals = true;
                  break;
              }
            }
            if(!isEquals){
                tmp[cnt] = arr[i];
                cnt++;
            }
        }
        String answer =  String.valueOf(tmp);
        answer = answer.trim();
        return answer;
    }
}
