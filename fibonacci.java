public class fibonacci {
    public static void main(String[]args){
        System.out.println("Fibonacci sequence:");
        int n = 10; // number of terms to generate
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}