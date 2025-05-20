
public class StringJoins {

    public static void main(String[] args) {
        String[] arr=new String[]{"hello","world","hi","ranjith"};
       String ok= String.join(",", arr);
       System.out.println(ok);
    }
}