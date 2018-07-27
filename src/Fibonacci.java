public class Fibonacci {
    static final int MAX = 50;
    //static final double π = 3.1454522;
    public static void main(String[] args) {
        //Print Fibonacci series that smaller 51
        int hi = 1;
        int lo = 1;
        System.out.println(lo);
        //while (hi < 51){
        while (hi < MAX){
            System.out.println(hi);
            hi = hi + lo;
            lo = hi - lo;
        }
        //System.out.println(π);
    }
}
