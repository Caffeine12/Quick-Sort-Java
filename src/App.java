import java.util.Arrays;

public class App {
    public static int[] arr = {10, 5, 55, 18, 25, 7, 42, 45};
    public static void main(String[] args) throws Exception {
        int start = 0;
        int end = arr.length-1;
        quickSort(start,end);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int start, int end)
    {
        if(start<end)
        {
            int j = partition(start,end);
            quickSort(start,j);
            quickSort(j+1, end);

        }
        

    }
    public static int partition(int start, int end)
    {
        int pivot = arr[start];
        int i = start;
        int j = end+1;
        while(i<j)
        {
            do
            i++;           
            while(arr[i]<pivot && i!=end);
            do
            j--;
            while(arr[j]>pivot);
            if(i<j)
            swap(i,j);
        }
        if(j!=start)
        swap(start,j);
        return j;
    }
    public static void swap(int i, int j)
    {
        int swap = arr[i];
        arr[i]=arr[j]; 
        arr[j]=swap;

    }
}
