import java.util.Scanner;
public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Pass " + (i + 1) + ":");
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                for (int k = 0; k < n; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        bubbleSort(arr, n);

        System.out.print("Final Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        in.close();
    }
}


output: 
Enter number of elements: 4
Enter 4 integers:
1 3 23 53
Pass 1:
1 3 23 53
1 3 23 53
1 3 23 53

Pass 2:
1 3 23 53
1 3 23 53

Pass 3:
1 3 23 53

Final Sorted array: 1 3 23 53