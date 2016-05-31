import java.util.*;
public class HelloWorld{
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Scanner scan = new Scanner(System.in);
    Reader r = new Reader(scan.nextLine());
    System.out.println(r.get());
  }
}
