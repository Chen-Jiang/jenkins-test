Public class Number {
  int max_n = 10;
  public void printNum() {
    int n = 0;
    while (n<=max_n) {
      System.out.println("Print numbers here: " + n);
    }
  }
  
  
  public static void main(String[] args){
    new Number().printNum();
  }


}
