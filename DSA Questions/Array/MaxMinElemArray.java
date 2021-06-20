public class MaxMinElemArray {
    
    public void max(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        System.out.println("Maximimum Element =>" + arr[max]);
    }
    
    public void min(int[] arr) {
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        System.out.println("Minimum Element =>" + arr[min]);
    }
    public static void main(String[] args) {
        MaxMinElemArray obj = new MaxMinElemArray();
        int[] arr ={1,2,9,7,3,6};
        obj.max(arr);
        obj.min(arr);
    }
}
