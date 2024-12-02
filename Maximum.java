public class Maximum {
    public static int max(int arr[])
    {
        int n=arr.length;
        int maxi=arr[0];
        for(int i=1;i<n;i++)
        {
            if(maxi>arr[i])
            {
                maxi=arr[i];
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[]={4,3,5,4,6,4,3,2,4,6,5,4};
        System.out.println(max(arr));
    }
}
