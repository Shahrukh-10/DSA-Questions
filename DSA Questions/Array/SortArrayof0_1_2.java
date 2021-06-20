public class SortArrayof0_1_2 {
    // Sort Array without any sorting algorithm

    public void sort(int[] arr) {
        int i=0;
        int j=0;
        int k=0;
        for (int x : arr) {
            if (x==0) {
                i++;
            }
            else if(x==1){
                j++;
            }
            else if(x==2){
                k++;
            }
        }
        for (int y = 0; y < i; y++) {
            arr[y]=0;
        }
        for (int y = i; y < i+j; y++) {
            arr[y]=1;
        }
        for (int y = i+j; y < i+j+k; y++) {
            arr[y]=2;
        }
        for (int k1 : arr) {
            System.out.print(k1+" ");
        }
    }
    public static void main(String[] args) {
        SortArrayof0_1_2 obj = new SortArrayof0_1_2();
        int[] arr={0,2,0,1,2,0,1,2,0};
        obj.sort(arr);
    }
}
