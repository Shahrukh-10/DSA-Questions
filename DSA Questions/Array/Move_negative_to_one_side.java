public class Move_negative_to_one_side {

    public void oneSide(int[] arr) {
        int li = 0;
        int hi = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            while (li <= hi) {
                if (arr[li] > 0 && arr[hi] < 0) {
                    int temp = arr[hi];
                    arr[hi] = arr[li];
                    arr[li] = temp;
                }
                li++;
                hi--;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Move_negative_to_one_side obj = new Move_negative_to_one_side();
        int[] arr = { 1, 2, 3, -1, -5, -6, 1, 9, 9, -5, -7, -1 };
        obj.oneSide(arr);

    }

}