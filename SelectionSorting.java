
public class SelectionSorting {

    public static void Sorting(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minpos = i; // current element 
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            // sawp

            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 4, 2, 86};
        Sorting(arr);
        Print(arr);
    }
}
