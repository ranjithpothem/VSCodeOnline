public class StringPrograms {

 
    String str;
     String str1="hello";
    public static void main(String[] args) {
       
        // String name;
        // String surname="pothem";
        // System.out.print(name+surname);
        StringPrograms sp= new StringPrograms();
        sp.usingMethod();
    }
    private void call(){
        System.out.println("calling");
    }

    private void usingMethod(){
      System.out.println(str+str1);
      this.call();
    }
}