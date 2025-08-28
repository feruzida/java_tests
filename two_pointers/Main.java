public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1, 1, 2, 2, 3, 3, 3, 3};
        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

