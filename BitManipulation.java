import java.util.Scanner;

public class BitManipulation {
    public static void main (String[] args) {
    
    // Bit Manipulation
    //get
    //set
    //clear
    //update

    // Get Bit
    // int n=5; // 0101
    // int pos = 3;
    // int left_shift = 1<<pos;
    // if((left_shift & n)== 0){
    //     System.out.println("Bit was zero");
    // } else {
    //     System.out.println("Bit was one");}

    // set bit
    // int n=5;// 0101
    // int pos=2;
    // int bitMask = 1<<pos;//0001 --> 0100

    // int newNumber = bitMask | n; // 0100 | 0101 =0101
    // System.out.println(newNumber);

    //Clear Bit 
    // int n=5;
    // int pos = 2;
    // int bitMask = 1<<pos;
    // int notBitMask = ~(bitMask);
    
    // int newNumber = notBitMask & n;
    // System.out.println(newNumber);

    //Update Bit
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
    int n=5;
    int pos=1;
    
    int bitMask=1<<pos;

    // if oper = 1 then set bit else oper = 0 clear bit

    if (oper == 1){
        // Set Bit
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    } else {
        // Clear Bit 
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n ;
        System.out.println(newNumber);
    }

    

    }
    
}
