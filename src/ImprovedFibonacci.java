public class ImprovedFibonacci {
    final static int MAX_INDEX = 20;

    public static void main(String[] args) {
        /**
         * Print out the first few Fibonacci numbers,
         * marking evens with a '*'
         */
        int lo = 1;
        int hi = 1;
        String mark = "";
        System.out.println(MAX_INDEX + ": " + lo);

        for (int i = MAX_INDEX - 1 ; i > 0; i--){
            if (hi % 2 == 0){
                mark = " *";
            }
            else{
                mark = " ";
            }

            System.out.println(i + ": " + hi + mark);

            hi = hi + lo;
            lo = hi - lo;
        }

    }

}
