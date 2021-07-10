clss Main {
  public static void main(String[] args) {
    //trueと出力されるように
    System.out.println(true||false);
    //falseと出力されるように
    System.out.println(false&&true);
    // 8<5かつ3>=2の結果を出力
    System.out.println(8<5 && 3>=2);
    // 8<5または3>=2の結果を出力
    System.out.println(8<5 || 3>=2);
    //8<5でない結果の出力
    System.out.println(!(8<5));

  }
}
