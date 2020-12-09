// Реализация "пузырьковой" сортировки

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int item = arr.length - 1; item > i; item--) {
                if (arr[item - 1] > arr[item]) {
                    int swap = arr[item];
                    arr[item] = arr[item - 1];
                    arr[item - 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, -20, 47, 9, -2, -8, 99};

        bubbleSort(arr);

        for (int i : arr)
            System.out.print(i + " ");
    }
}