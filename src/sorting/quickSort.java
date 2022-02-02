package sorting;

public class quickSort {

    public static void main(String[] args) {
        int[] a = { 5, 4, 10, 2, 30, 45, 34, 14, 18, 9 };

        qSort(a,0,a.length -1);
        printArray(a);
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void qSort(int a[], int low, int high) {
        if (low < high){
            int pi = partition(a,low,high);

            qSort(a,low,pi-1);
            qSort(a,pi+1,high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
