public class HelloWorld {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Hello world");
    } else {
      for (String name : args) {
       System.out.println("Hello " + name);
      }
    }
  }
}
