import java.util.Arrays;

public class BublleSort {
    public static void main(String[] args) {
        int[] arr={5,1,8,3,9,34,22};
        int[] arr1={5,1,8,3,9,34,22};
        int length=arr.length;
        //sorting using bubllesort
        //find the biggest number first eteration
        for(int i=0;i<length;i++){
            for(int j=1;j<length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                     arr[j-1]=arr[j];
                     arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        //using predefind method
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        
    }
}