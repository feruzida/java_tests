import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Input text: ");
        String str = a.nextLine();

        System.out.println("Enter the number of matches n: ");
        int n = a.nextInt();
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j =0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count == n) {
                System.out.println(words[i]);
                break;
            }
        }
    }
}
