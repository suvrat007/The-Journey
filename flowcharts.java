import java.util.*;

public class flowcharts {
    public static void main(String[] args) {
        
 // 1. WAP TO CHECK FOR LEAP YEAR


         Scanner sc=new Scanner (System.in);
        // System.out.print("ENTER THE YEAR : ");
        // int year=sc.nextInt();

        // if(year/4==0){
        //     System.out.println("LEAP YEAR");
        // }else{
        //     System.out.println("NOT leap year");
        // }

// 2. WAP to give sum of 2 nums

            // int frst=sc.nextInt();
            // int scnd=sc.nextInt();
            // System.out.println(frst+scnd);


// 3. WAP multiplication table of the given number

        // System.out.print("ENTER THE NUMBER U WANT MULTIPLICATION TABLE OF : ");
        // int num=sc.nextInt();
        // System.out.print("TILL WHERE DO U WANT THE TABLE : ");
        // int lim=sc.nextInt();

        // for (int i = 1; i <=lim; i++) {
        //     System.out.println(num + " * " + i + " = " + num*i);
            
        // }

// 4. WAP to find HCF and LCM

        System.out.print("ENTER FIRST NUMBER : ");
        int num1=sc.nextInt();
        System.out.print("ENTER SECONF NUMBER : ");
        int num2=sc.nextInt();
        int hcf=0,max;

        if(num1>num2){
            max=num1;
        }else{
            max=num2;
        }
        //HCF

        for (int i = 1; i <= max; i++) {
            if(i<=max && hcf%i==0){
                hcf/=i;
            }
            
        }
        System.out.print("HCF is " + hcf);




    }

}
