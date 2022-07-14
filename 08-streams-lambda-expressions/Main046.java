import java.util.function.*;

public class Main046 {
  public static void main(String... args) {
    BinaryOperator<Long> lambda = (a, b) -> {
      long a = 10L;
      return a*b;
    };

    var result = lambda.apply(5L, 10L);
    System.out.println(result);
  }
}
