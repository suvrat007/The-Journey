

import java.util.*;

public class conditionals {



    public static void main(String[] args) {


 // 1. WAP to find area of circle, rhombus, triangle, rectangle, quilateral trialngle, isosclestriangle, parralellogram
        Scanner sc=new Scanner(System.in);
        System.out.print("AREAS YOU CAN FIND OUT :-\n" +
                "1. CIRCLE\n" +
                "2. RHOMBUS\n" +
                "3. EQUILATEREAL TRIANGLE\n" +
                "4. SCALENE TRIANGLE\n" +
                "5. RECTANGLE\n" +
                "6. PARALLELOGRAM\n");
        System.out.print("ENTER NUMBER OF THE AREA YOU WANT TO FIND OUT : ");
        int num=sc.nextInt();

        if (num==1){
                circle();}
        if (num==2) {
            rhombus();
        }
        if (num==3) {
            eqtri();
        }
        if (num==4) {
            sctriangle();
        }
        if (num==5) {
            rectangle();
        }
        if (num==6) {
            parallelogram();
        }



    }

    static void circle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of circle : ");
        int r=sc.nextInt();
        System.out.println("THE AREA OF THE CIRCLE IS : " + (2*3.14*r));
    }

    static void rectangle(){
        Scanner sc=new Scanner(System.in);
        System.out.print("length : ");
        int l=sc.nextInt();
        System.out.print("breadth : ");
        int b=sc.nextInt();
        System.out.println("THE AREA OF TEH RECTANGLE IS : " + (l*b));

    }

    static void eqtri(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of sides : ");
        int side= sc.nextInt();
        System.out.println("The area of this equilateral triangle is : "+ ((1.73/4)*side*side));
    }

    static void rhombus(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of diagonal1");
        int d2=sc.nextInt();
        System.out.println("enter length of diagonal2");
        int d1=sc.nextInt();
        System.out.println("The area of the given rhombus is : " + (d1*d2));
    }

    static void parallelogram(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter length of base :");
        int b=sc.nextInt();
        System.out.print("enter length of height :");
        int h=sc.nextInt();
        System.out.print("The area of parallelogram is :" + (b*h));

    }

    static void sctriangle(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter length of base :");
        int side1=sc.nextInt();
        System.out.print("enter length of base :");
        int side2=sc.nextInt();
        System.out.print("enter length of base :");
        int side3=sc.nextInt();

        double s = ((double) (side1 + side2 + side3) / 2);
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("The area of the scalene triangle is: " + area);
    }
}
