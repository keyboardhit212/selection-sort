public class SelectionSort {

    public static void main(String[] args) {
        int[] digits = {121, 4, 34, 12, 11, 2, 1};
        System.out.print("Before Sort: ");
        printArray(digits);
        System.out.println();
        selectionSort(digits);
        System.out.print("After Sort: ");
        printArray(digits);
    }

    public static void selectionSort(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            int lowest_index = i;
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[j] < digits[lowest_index])
                    lowest_index = j;
            }

            //Make a swap if a lesser number is found
            if (lowest_index != i) {
                int temp = digits[i];
                digits[i] = digits[lowest_index];
                digits[lowest_index] = temp;
            }
        }
    }

    public static void printArray(int[] digits) {
        for (int digit : digits)
            System.out.printf("%d ", digit);
    }
}
