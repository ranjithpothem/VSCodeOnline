import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ArraysShouldSortWhenTheyAreInseting {
    public static void main(String[] args) {
        int[] arr={3,9,44,22,90,33,76};
        int[] arr1={3,54,32,78,90,77};

        Arrays.sort(arr);
        Arrays.sort(arr1);
        Map<Integer,Integer> map=new TreeMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(int num:arr1){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int temp=entry.getValue();
            for(int i=0;i<temp;i++){
                System.out.println(entry.getKey());
            }

        }

        System.out.println(map);

        
    }
    
}
