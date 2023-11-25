import java.util.ArrayList;
import java.util.*;

public class arrays {
    // for (int num : arr).....sout (num  + " ")
            /*this will go on each element of array and print it*/

    // PRIMITIVES :- qntities that cn not be further broken down like boolean, int etc.
                    //the are stored in stack
    // OBJECTS :-
                    // Stored in heap mem and accessed reference variable (arr[0]).

    // int [][] arr=new int[3][] .......(rows is mandatory).......[array of arrays]

    // arr[rows][colums]
                    // arr[rows].length
                    // ENHANCED FOR LOOP for printing
                            /* for (int a : arr){
                            * sout (Arrays.toString(a))
                            * }*/
    // ArrayList<integer> list = new Arraylist <>();
                    // for arrays who u do not know the size
                    // list.add() , list.set(index, towhat), list.remove(index), list.get(index)
                    // arraylist does have a limit....but when limit is reached....new list created....old ones added to new....new elements add to new too

    // CONVERT STRING TO ARRAY.........Arrays.toString(strvariablename.toCharArray())

    public static void main(String[] args) {

//        Scanner sc =new Scanner(System.in);
//        int [] arr = new int[4];
//        int [] arr1 = new int[4];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();
//        }





// 2. WAP for concatenation

/*
        int [] arr2 = new int[arr1.length+arr.length];


        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=sc.nextInt();
        }

        for (int i = 0; i < (arr.length+arr1.length); i++) {
            if(i<arr.length){
                arr2[i]=arr[i];
            }else{
                arr2[i]=arr1[i- arr1.length];
            }


        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " , ");

        }*/

// 3. sum of elements

/*        int sum=0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum=sum+arr[j];

            }
        arr1[i]=sum;
        sum=0;

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " , ");
        }*/

// 4. WAP max val of customer

/*        int[][] accounts={{1,5},{7,3},{3,5}};
        int[] data=new int[accounts.length];
        int sum=0;

        for (int cstmer = 0; cstmer < accounts.length; cstmer++) {
            for (int accbal = 0; accbal < accounts[cstmer].length; accbal++) {
                sum=sum +accounts[cstmer][accbal];
            }
            data[cstmer]=sum;
            sum=0;

        }
        int max=0;

        for (int cstmer = 0; cstmer < data.length ; cstmer++) {

            System.out.println("Customer"+ (cstmer+1)+" = "+ data[cstmer]);
            if (data[cstmer]>max){
                max=data[cstmer];
            }else{
                max=data[cstmer];
            }

        }
        System.out.println("Max value is "+ max);*/

// 5. WAP to shuffle array
/*

        int[] nums = {2,5,1,3,4,7};
        int n=3;
        int[] arr=new int[2*n];


        for (int i = 0; i < n; i++) {
            arr[i*2]=nums[i];
            arr[i*2+1]=nums[i+n];
        }
        System.out.println(Arrays.toString(arr));*/


        int[][] matrix={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        int minval=0,index=0,max=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                minval=matrix[i][0];

                if (matrix[i][j]<minval){
                    minval=matrix[i][j];
                    index=j;
                }

            }

            for (int j = 0; j < matrix.length; j++) {
                max=matrix[0][index];
                for (int k = 1; k < matrix.length; k++) {
                    if (max < matrix[k][index]) {
                        max = matrix[k][index];
                    }
                }
            if (max==minval){
                System.out.println("luncky nummber = "+ minval);
                break;
                }

            }




        }









    }






}
