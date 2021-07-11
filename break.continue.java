class Main {
  public static void main(String[] args) {
    System.out.println("===  while文 ===");
    int i = 1;
    while (i < 10) {
      // iが5の倍数の時、繰り返す処理を終了する。
      if (i % 5 == 0) {
        break;
      }

      System.out.println(i);
      i++;
    }

    System.out.println("=== for文 ===");
    for (int j = 1; j < 10; j++) {
      // jが3の倍数の時、処理をスキップ
      if (j % 3 == 0) {
        continue;
      }

      System.out.println(j);
    }
  }
}
