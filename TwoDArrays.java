import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {

    // 2D arrays
    Scanner sc=new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int numbers[][] = new int[rows][cols];
    //input arrays values
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            numbers[i][j] = sc.nextInt();
        }
    }
    //output arrays values
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            System.out.print(numbers[i][j]+" ");
        }
        System.out.println();
    }

    // finding x inex in 2D array
    int x = sc.nextInt();
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            if(numbers[i][j] == x){
                System.out.print("X found at the index of : " + i+","+j);
            }
        
        }
        System.out.println();
    }


    }
    
}
