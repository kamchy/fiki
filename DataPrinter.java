public class DataPrinter{
  public static void main (String [] args) throws Exception  {
    if (args.length < 1) {
      System.out.println("Usage: java DataPrinter number_of_strings [string_length]");
      System.exit(0);
    }
    int length = 10;
    if (args.length == 1) {
      System.out.format("Defaulting to srings of length %d%n", length);
    } else if (args.length >= 2) {
      length = Integer.parseInt(args[1]);
    }
    int count = Integer.parseInt(args[0]);
    int seed = 12;
    for (String s: SampleData.generate(seed, count, length)){
      System.out.println(s);
    }
  }
}
