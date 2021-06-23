import java.util.HashSet;

public class Union_And_Intersection_Of_Two_Sorted_Arrays {

    public void intersection(int[] arr, int[] arr1) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr[i]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public void union(int[] arr, int[] arr1) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }
        for (int i : arr1) {
            hs.add(i);
        }
        System.out.println(hs.size());

    }

    public static void main(String[] args) {
        Union_And_Intersection_Of_Two_Sorted_Arrays obj = new Union_And_Intersection_Of_Two_Sorted_Arrays();
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] arr1 = { 5, 6, 7, 8, 9, 10 };
        obj.intersection(arr, arr1);
        obj.union(arr, arr1);
    }
}
