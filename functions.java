import java.util.*;
public class functions {

    // to pass arrays to a function use [(data type)...v]
    // make sure the above thing is in the last of the arguments
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("sum = " + sum(num1,num2));
        System.out.println("product = "+ prod(num1,num2));
        prime(num1,num2);

    }
    static int sum(int a, int b){
        return a+b;
    }
    static int prod(int a , int b){
        return a*b;
    }
    static void prime(int a, int b){

        int max=0;
        if (a>b){
            max=a;
        }else {
            max=b;
        }

        for (int i = 1; i <max ; i++) {
            if (a%i==0){
                System.out.println(a + "is composite");
            } else{
                System.out.println(a+" is prime");
                break;
            }
            if (b%2==0) {
                System.out.println(b +" is prime");

            }else{
                System.out.println(b+"is prime");
                break;
            }
        }
    }
}
