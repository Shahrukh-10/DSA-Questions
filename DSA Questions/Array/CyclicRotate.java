public class CyclicRotate {

    public void rotate(int[] arr) {
        int n = arr.length;
        System.out.print(arr[n - 1] + " ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        CyclicRotate obj = new CyclicRotate();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        obj.rotate(arr);
    }
}
