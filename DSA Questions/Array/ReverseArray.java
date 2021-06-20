public class ReverseArray {
    public void reverse(int[] arr) {
        int li = 0;
        System.out.println(arr.length);
        int hi = arr.length - 1;
        while (li < hi) {
            int temp = arr[li];
            arr[li] = arr[hi];
            arr[hi] = temp;
            li++;
            hi--;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        obj.reverse(arr);
    }
}