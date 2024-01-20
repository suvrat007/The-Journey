public class patterns {
    public static void main(String[] args) {
        int num=5;
        p12(num);

    }
    static void p2(int n){
        for (int row = 1; row <= n; row++) {
            for (int clm = 1; clm <= row; clm++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }

    static void p4(int n){
        for (int row = 1; row <= n; row++) {
            for (int clm = 1; clm <= row; clm++) {
                System.out.print(clm);
            }
            System.out.println("");
        }
    }

    static void p6(int n){
        for (int row = 1; row <= n; row++) {
            for (int clm = n-row; clm >=0; clm--) {
                System.out.print(" ");
            }
            for (int clm = 1; clm <= row; clm++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void p8(int n){
        for (int row = 1; row <= n; row++) {
            for (int clm = n - row; clm >= 0; clm--) {
                System.out.print(" ");
            }
            for (int clm = 1; clm <= (2*row)-1; clm++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }
    static void p10(int n){
        for (int row = 1; row <=n ; row++) {
            for (int clm = n - row; clm >= 0; clm--) {
                System.out.print(" ");
            }
            for (int clm = 1; clm <= row; clm++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }

    static void p12(int n){
        for (int row = 1; row <=n ; row++) {
            for (int clm =1; clm <=row; clm++) {
                System.out.print(" ");
            }
            for (int clm = n; clm >=row; clm--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int row = 1; row <=n ; row++) {
            for (int clm = n-row; clm >=0 ; clm--) {
                System.out.print(" ");
            }
            for (int clm = 1; clm <=row ; clm++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
