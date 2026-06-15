public class Recursion1 {

    // public static int calFactorial(int n) {
    //     if( n == 1 || n==0){
    //         return 1;
    //     }

    //     int fact_nm1 = calFactorial(n-1);
    //     int fact_n = n*fact_nm1;
    //     return fact_n;

       
    // }
    // public static void main (String[] args) {
    //     int n = 5;
    //     calFactorial(n);
    //     System.out.println(calFactorial(n));

    // }


    // // print the fibonacci series till nth term
    // public static void printFib(int a ,int b,int n){
    //     if( n==0){
    //         return;
    //     }

    //     int c = a+b;
    //     System.out.println(c);
    //     printFib(b, c, n-1);
    // }
    // public static void main(String[] args) {
    //   int a=0 , b = 1;
    //   System.out.println(a);
    //   System.out.println(b);
    //   int n = 7;
    //   printFib(a, b, n-2);  
    // }

    // PRINT X^N (STACK HEIGHT N)
    public static int calcPower( int x , int n) {
        if( n == 0){
            return 1;
        }

        if(x == 0){
            return 0;
        }

        int xPowernm1 = calcPower(x, n-1);
        int xPowern = x*xPowernm1;
        return xPowern;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans = calcPower(x, n);
        System.out.println(ans);
        
    }
}