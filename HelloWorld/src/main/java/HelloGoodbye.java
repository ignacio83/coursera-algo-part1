public class HelloGoodbye {
  public static void main(String[] args) {
    sayHello(args);
    sayGoodbye(args);
  }

  private static void sayHello(String[] args) {
    final var sbHello = new StringBuilder("Hello ");
    for (int i = 0; i < args.length; i++) {
      sbHello.append(args[i]);
      if (i + 1 != args.length) {
        sbHello.append(" and ");
      } else {
        sbHello.append(".");
      }
    }
    System.out.println(sbHello);
  }

  private static void sayGoodbye(String[] args) {
    final var sbGoodbye = new StringBuilder("Goodbye ");
    for (int i = args.length - 1; i > -1; i--) {
      sbGoodbye.append(args[i]);
      if (i != 0) {
        sbGoodbye.append(" and ");
      } else {
        sbGoodbye.append(".");
      }
    }
    System.out.println(sbGoodbye);
  }
}
