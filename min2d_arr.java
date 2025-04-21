public class min2d_arr {
    public static void main(String[] args) {
        int arr[][] = { {1,2,3} , {11,22,33} };
        int min =arr[0][0];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j]<min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);

    }
    
}
