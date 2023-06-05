public class Main {
    public static void main(String[] args) {

        int[] testTombA = {1, 2, 3, 4, 5, 6, 7};
        int[] testTombB = {12, 6, 21, 0, -3};
        System.out.println("Merge sort");
        System.out.println(isSorted(testTombA));
    }


    public static boolean isSorted(int[] tomb) {
        for (int i = 0; i < tomb.length - 1; i++) {
            if (tomb[i] > tomb[i + 1]) {

                return false;
            }
        }
        return true;
    }


}