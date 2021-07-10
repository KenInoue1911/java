class Main {
  public static void main(String[] args) {
    int number = 12;
    //numberが20よりも小さい時、どちらでもない時の条件分岐
    if (number < 10) {
      System.out.println("10よりも小さい");
    } else if(number < 20) {
      System.out.println("10以上、20よりも小さい");
    } else {
      System.out.println("20以上");
    }
  }
}
