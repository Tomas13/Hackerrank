
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInts = scanner.nextInt();

        System.out.println("num " + numberOfInts);

        int[] array = new int[numberOfInts];
        for (int i = 0; i < numberOfInts; i++) {
            array[i] = scanner.nextInt();
        }


        printReverse(array);
    }

    private static void printReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

