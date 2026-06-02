import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {

        /*
         * // method-1 type[] arrayName = new type[size]
         * int [] marks=new int[3];
         * marks[0]=98;
         * marks[1]=97;
         * marks[2]=96;
         * for(int i=0;i<3;i++){
         * System.out.
         * println("marks of physics , chemistry  and maths are given in order:" +
         * marks[i]);
         * }
         */

        // // method -2 type [] arrayName = {98,87,55}
        // int marks [] = {98,78,76};
        // for(int i=0;i<3;i++){
        // System.out.println("marks of physics , chemistry and maths are given in
        // order:" + marks[i]);
        // }

        // qestion -1
        // take an array as input form user.search for a given number x and print the
        // index at which it occurs

    //     Scanner sc=new Scanner(System.in);
    //     int size = sc.nextInt();
    //     int number[]=new int[size];
    //     for(int i=0;i<size;i++){
    //         number[i]=sc.nextInt();
    //     }

    //     //output 
    //     for(int i=0;i<size;i++){
    //         System.out.println("output :"+number[i]);
    //     }

    Scanner sc=new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[]=new int[size]; // array defining

    // input arrays values
    for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
    }
    System.out.print("you entered all the values of arrays\nEnter the number you want to find its index in array:");

    int findNum =sc.nextInt();
    for(int i=0;i<size;i++){
        if(findNum == numbers[i]){
            System.out.println("Index value of the Number: "+i);
        }
    }

    }

}
