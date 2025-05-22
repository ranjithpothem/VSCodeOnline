
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.function.Predicate; 

class PredicateExaple {
    public static void main(String[] args) {
        Predicate<Integer> predicate=num-> num>10;
        Predicate<String> predicateString=str-> str.contains("ji");
        
        System.out.println(predicate.test(11));
        System.out.println(predicateString.test("ranjith"));
       Predi test1=num -> num<10;
        System.out.println(test1.test1(9));
    }
}
interface Predi
{
    boolean test1(int number);
}