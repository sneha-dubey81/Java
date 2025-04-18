public class max_2arr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr2[]={5,6,3,7};
        int max=0;
        for(int i=0;i<arr.length;i++){
                if (arr[i]>max){
                    max=arr[i];
                }
                if(arr2[i]>max)
                {
                    max=arr2[i];
                }
        }
        System.out.println(max);
    }
}
