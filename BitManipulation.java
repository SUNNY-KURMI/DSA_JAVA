public class BitManipulation {
    public static void main (String[] args) {
    
    // Bit Manipulation
    //get
    //set
    //clear
    //update

    // set 
    int n=5; // 0101
    int pos = 3;
    int left_shift = 1<<pos;
    if((left_shift & n)== 0){
        System.out.println("Bit was zero");
    } else {
        System.out.println("Bit was one");
    }


    }
    
}
