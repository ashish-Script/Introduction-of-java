import java.util.Arrays;

class Swap{
    public static void swapp(int arr[],int a,int b)
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5};
            swapp(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
}