public class Kth_Min_Max_Elem_Array {

    public void min(int[] arr, int k) {
        int min = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[min] > arr[i]) {
                min = i;
                count++;
            }
            if (count == k) {
                break;
            }
        }
        System.out.println("K th minimum element = > " + arr[min]);
    }

    public void max(int[] arr, int k) {
        int max = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[max] < arr[i]) {
                max = i;
                count++;
            }
            if (count == k) {
                break;
            }
        }
        System.out.println("K th maximum element = > " + arr[max]);
    }

    public static void main(String[] args) {
        Kth_Min_Max_Elem_Array obj = new Kth_Min_Max_Elem_Array();
        int[] arr ={ 5,4,3,2,6,7,1,3,9,};
        obj.min(arr, 3); // Kth smallest element;
        obj.max(arr, 3); // Kth largest element
    }
}