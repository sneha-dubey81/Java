public class arr_sumEven {
    public static void main(String[] args) {
        int[] arr={2,-7,0,5,6,-3,0,1,53,0,534,0};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>2&&arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
