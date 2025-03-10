import java.util.*;

public class FindLongestSubStringWithRepeatingCharachers {
    public static void main(String[] args) {
        String str="helloworldfrommyworld";
       int i=0,j=i+1;
       int maxLength=0;
        while(i<str.length()-1){
            if(j>str.length()){
                i++;
                j=i+1;
            }
            String str1=str.substring(i, j);
            if(usingMethod(str1) && str1.length()>maxLength){
                maxLength=str1.length();
                j++;
            }
            else{
                j++;
            }
        }
        System.out.println(maxLength);
    }
    private static boolean usingMethod(String str){
         Map<Character,Integer> map=new HashMap<>();
         for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
         }
         for(int num: map.values()){
            if(num>1){
                return false;
            }
         }
        return true;
    }
    
}
