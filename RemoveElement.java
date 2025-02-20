
class RemoveElement {
    public static int[] Remove(int arr[], int target) {
        int newarr[] = new int[arr.length - 1];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {  
                newarr[index++] = arr[i];
            }
        }

        for (int i = 0; i < index; i++) { 
            System.out.println(newarr[i]);
        }

        
        return newarr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 3;
        Remove(arr, target);
    }
}
