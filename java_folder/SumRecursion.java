public class SumRecursion {
    public static void printSum(int n, int sum, int i) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(n, sum, i + 1); // Corrected parameter order
    }
    
    public static void main(String args[]) {
        printSum(10, 0, 1);
    }
}
