import java.util.*;
class SampleData {
  private static final Random r = new Random();
  static List<String> generate(int seed, int count) {
    List<String> list = new ArrayList<String>();
    r.setSeed(seed);
    for (int i = 0; i < count; i++) {
      list.add(randomWord(10));
    }
    return list;
  }
  static String randomWord(int len) {
    char[] array = new char[len];
    for (int i = 0; i < len; i++) {
      array[i] = (char)r.nextInt(256);
    }
    return new String(array);
  }
}