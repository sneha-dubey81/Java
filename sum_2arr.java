public class sum_2arr {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3,4,5};
        int sum1=0;
        for(int i=0;i<arr1.length;i++) {
            sum1=sum1+arr1[i];

        }
        int sum2=0;
        for(int i=0;i<arr1.length;i++) {
            sum2=sum2+arr2[i];

        }
        int sum=sum1+sum2;
        System.out.println("sum of arr1 and arr2 is :"+sum);

    }
    
}
