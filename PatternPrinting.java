public class PatternPrinting {
    public static void main (String[] args){
        
        /* pattern no 1
            *****
            *****
            *****
            *****
        
        for(int i=1; i<5 ; i++){
            for(int j=1; j<6;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        } */

        
        /* Pattern 2
           * * * * *    row    = 4
           *       *    column = 5
           *       *
           * * * * *
        
        int m=4;
        int n=5;
        for(int i=1 ; i<=m ;i++){
            for(int j=1 ; j<=n ; j++){
                if(i==1 || j==1 || i==m || j==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } */
        

        /* Half pyramid print pattern no3 
        *
        * *           n=4
        * * *
        * * * *
       
        int n=4;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */

        /* down pyramid pattern no4
        ****
        ***
        **
        *
        

        int n=4;
        for(int i=n; i>=1 ; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /* pattern no5
               *
              ** 
             ***
            ****
        */
        int n=4;

        // outer loop
        for(int i=1;i<=n;i++){
            //inner loop for --> space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // inner loop2 for --> star print
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        

    }
    
}
