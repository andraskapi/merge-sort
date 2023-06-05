public class Main {
    public static void main(String[] args) {

        int[] testTombA = {1, 2, 3, 4, 5, 6, 7};
        int[] testTombB = {12, 6, 21, 0, -3};
        System.out.println("Merge sort");
        System.out.println(isSorted(testTombA));
    }


    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {

                return false;
            }
        }
        return true;
    }

    public static int[] merge(int[] left, int[] right){
        return null;
    }

    public static int[] mergeSort(int[] array){
        return null;
    }


}