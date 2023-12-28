public class SlidingWindow {
    public static void main(String args[])
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int K = 3; //K is length of window
        printKMax(arr, arr.length, K); //calling method or function
    }
    static void printKMax(int arr[], int N, int K)
    {
        int j;
        int max;

        for (int i = 0; i <= N - K; i++) {

            max = arr[i];

            for (j = 1; j < K; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            System.out.print(max + " ");
        }
    }
}
