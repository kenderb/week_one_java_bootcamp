public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sum from 1 to 255: " + BasicOperations.sumNumbers(255));
        int[] arr = {1, 10, 200, 4};
        System.out.println("maxNumber: " + BasicOperations.maxNumber(arr));
        BasicOperations.printEvenNumbers(arr);
        System.out.println("isPrimeNumber: " + BasicOperations.isPrimeNumber(9));
    }
}
