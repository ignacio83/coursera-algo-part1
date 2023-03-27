import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
  public static void main(String[] args) {
    String champion = null;
    for (int i = 0; !StdIn.isEmpty(); i++) {
      final String word = StdIn.readString();
      final boolean ok = StdRandom.bernoulli(1 / (i + 1.0));
      if (ok) {
        champion = word;
      }
    }
    StdOut.println(champion);
  }
}
