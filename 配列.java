class Main {
  public static void main(String[] args) {
    //変数namesに、配列を代入
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビー"};
    System.out.println(names[0]);
    System.out.println(names[2]);
  }
}

class Main {
  public static void main(String[] args) {
    String[] languages = {"Ruby", "PHP", "Python"};
    System.out.println(languages[1]);

    languages[1] = "Java"
    System.out.println(languages[1]);
  }
}

class Main {
  public static void main(String[] args) {
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    for (int i = 0; i < names.length; i++) {
      Sytem.out.println("私の名前は"+names[i]+"です");
    }
  }
}

class Main {
  public static void main(String[] args) {
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    for (String name: names) {
      System.out.println("私の名前は"+name+"です");
    }
  }
}
