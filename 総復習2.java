class Main {
  public static main(String[] args) {
    int[] numbers = {1, 4, 6, 9, 13, 16};

    int oddSum = 0;
    int evenSum = 0;
    //for文を用いて、配列numbersの偶数の和と奇数の和を求める
    for (int number : numbers ) {
      if (number % 2 == 0) {
        evenSum += number;
      } else {
        oddSum += number;
      }
    }
    System.out.println("奇数の和は"+oddSum+"です");
    System.out.println("偶数の和は"+evenSum+"です")
  }
}
