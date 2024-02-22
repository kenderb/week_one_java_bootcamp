public class BasicOperations {
    public static int sumNumbers(int n) {
        /* Iterative solution O(N)*/
        int count = 0;
        int sum = 0;

        do {
            count++;
            sum += count;
        } while(count < n);

        /* Math solution O(1)*/
        // int sum = (n * (n + 1)) / 2;
        return sum;
    }
    
    public static int maxNumber(int[] arr) {
        /* Iterative solution O(N)*/
        int max = 0;
        int count = 0;

        do {
            count++;
            if (arr[count] > max) {
                max = arr[count];
            }

            /* Solution with library*/
            // max = Math.max(max, arr[count]);
        } while(count < arr.length - 1);

        return max;
    }
    
    public static void printEvenNumbers(int[] arr) {
        /* Iterative solution O(N)*/
        int count = 0;

        do {
            count++;
            if (arr[count] % 2 == 0) {
                System.out.println("Even number is: " + arr[count]);
            }
        } while(count < arr.length - 1);
    }
    
    public static boolean isPrimeNumber(int num) {
      if (num < 2) {
        return false;
      }
      for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
      }
      return true;
    }
}
