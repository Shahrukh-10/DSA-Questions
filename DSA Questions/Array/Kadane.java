public class Kadane {

    public int kadane(int[] arr) {
        int maxEndHere = arr[0];
        int maxSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndHere = Math.max(arr[i], maxEndHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        System.out.println(maxSoFar);
        return maxSoFar;
    }

    public static void main(String[] args) {
        Kadane obj = new Kadane();
        int[] arr = { -4, 6, -3, 4, -2, -1, 9 };
        obj.kadane(arr);
    }
}
