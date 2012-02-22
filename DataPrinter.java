public class DataPrinter{
  public static void main (String [] args) throws Exception  {
    if (args.length < 1) {
      System.out.println("Number of strings expected");
      System.exit(0);
    }
    int count = Integer.parseInt(args[0]);
    int seed = 12;
    for (String s: SampleData.generate(seed, count)){
      System.out.println(s);
    }
  }
}
