public class Java8Streams
{  
    public static void main(String args[])
 {
    List<String> strList = Arrays.asList("a", "hello", "world", "program", "or", "example");
long num = strList.stream()
 .filter(x -> x.length()> 3) 
 .count(); 
System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);
 }
}



