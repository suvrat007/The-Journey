package Grind75;
import java.io.*;
import java.util.Stack;

import static java.lang.Integer.toBinaryString;

public class AddBinary {
    public String addBinary(String a, String b) {
        int sum = findNum(a)+findNum(b);
        return toBinaryString(sum);
    }

    public static int findNum(String a){
        int suma = 0;
        for (int i = a.length()-1; i > 0  ; i--) {
            int pv = (int) Math.pow((double) 2,(double) i);
            suma+=pv*a.charAt(i);
        }
        return suma;
    }
    public String numToBinaryString(int a){
        Stack<Integer> st = new Stack<>();
        while(a>0){
            st.push(a%2);
            a= a/2;
        }
        String ans = "";
        while(!st.isEmpty()){
            ans+=st.pop();
        }

        return ans;
    }
}
