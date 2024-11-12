public class Check_if_Array_Is_Sorted_and_Rotated {
    public static void main(String[] args) {
        int nums[] = { 2, 1, 3, 4 };
        System.out.println(check(nums));
    }

    public static boolean check(int arr[]) {
        int n = arr.length;
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                ++c;
            }
        }
        if (arr[n - 1] > arr[0]) {
            ++c;
        }
        return c <= 1;
    }
}