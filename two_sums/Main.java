public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 7, 8};
        int target = 11;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + target);
                    return;
                }
            }
        }
    }
}
