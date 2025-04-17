public class compare {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={1,2,3};
        int count=0;
        for(int i=0;i<arr1.length;i++) {
            if(arr1[i]==arr2[i]) {
            count++;
        }}
        if(count==arr1.length) {
            System.out.println("arrays are equal");
        }
        else {
            System.out.println("arrays are not equal");
        }

    }
    
}
