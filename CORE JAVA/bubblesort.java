import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {5, 4 ,3, 2, 1};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr)
    {
        boolean swaped;
        for(int i = 0; i < arr.length; i++)
        {
            swaped = false;
            for(int j = 1; j < arr.length-i; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;
                }
            }
            if(!swaped)
            {
                break;
            }
        }
    }
}
