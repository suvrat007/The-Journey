package Grind75;

import java.util.ArrayList;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("d"));
    }
//    public static int longestPalindrome(String s) {
////        ArrayList<Character> list = new ArrayList<>();
//
//        Character[] list = new Character[s.length()];
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            list[i]=' ';
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < list.length; j++) {
//                if (list[j] !=s.charAt(i)){
//                    list[j]=(s.charAt(i));
//                }else{
//                    list[j]=' ';
//                    count+=2;
//                }
//            }
//        }
//
//        int dig = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (list[i]==' '){
//                dig++;
//            }
//        }
//
//        if (dig!=s.length()){
//            return (int) Math.sqrt(count)+1;
//        }
//
//        return (int) Math.sqrt(count);
//    }



    public static int longestPalindrome(String s) {
        Character[] list = new Character[s.length()];

        for (int i = 0; i < s.length(); i++) {
            list[i]=s.charAt(i);
        }
        int num = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                if (list[i]==list[j]){
                    num+=2;
                    list[i]=list[j]=' ';
                    break;
                }
                break;
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] != ' '){
                return num+1;
            }
        }
        return num;
    }

}
