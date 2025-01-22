import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyOfCharactersUsingAllApproches {
    public static void main(String args[]){
        String str="ranjithpothem";

        //using hashMap
      Map<Character,Integer> hashMap=new HashMap<Character,Integer>();
       
      for(int i=0;i<str.length();i++){
        hashMap.put(str.charAt(i),hashMap.getOrDefault(str.charAt(i), 0)+1);
      }
       System.out.println(hashMap.entrySet());

       //Streams
       str.chars()
       .mapToObj(c->(char)c)
       .collect(Collectors.groupingBy(c->c,Collectors.counting()))
       .forEach((e,m)->System.out.println(e+":"+m));

       //using arrays

       char[] ch=new char[128];
       for(int i=0;i<str.length();i++){
        ch[str.charAt(i)]++;
       }
       for(int i=0;i<128;i++){
        if(ch[i]>0){
            System.out.println(ch[i]+""+(char)i);
        }
       }

    }

}
