public class unique {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr2[]={5,6,3,7};
        int found;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==arr2[i]) {
                found =0;
            }
            else found=1;
            if (found==1){
                System.out.println(arr[i]+" "+arr2[i]);
            }
        }
    }
}
    

