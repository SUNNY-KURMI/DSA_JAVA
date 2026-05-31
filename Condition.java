import java.util.*;
public class Condition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if ( a == b){
        //     System.out.println("Equal");
        // } 

        // if (a > b){
        //     System.out.println("greater");
        // }

        // if (a < b){
        //     System.out.println("lesser");
        // }

        int button  = sc.nextInt();

        switch(button){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("namste");
            break;
            default : System.out.println("invalid button");
        }
    }
    
}
