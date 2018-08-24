public class FibonacciIterative implements Fibonacci{



    public int fibonacci (int n){
        int current = 1;
        int prev = 1;

        if(n <= 1){             // check if negative
            return n;
        }

        for(int i = 2; i < n; i++){         // iterate starting at 2
            int temp = current;
            current += prev;
            prev = temp;
        }
        return current;
    }
}
