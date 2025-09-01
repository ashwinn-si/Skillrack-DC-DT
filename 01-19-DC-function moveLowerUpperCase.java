public class 01-19-DC-function moveLowerUpperCase {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    for(char ch: str.toCharArray()){
      if(Character.isLowerCase(ch)){
        System.out.print(ch);
      }
    }
    for(char ch: str.toCharArray()){
      if(!Character.isLowerCase(ch)){
        System.out.print(ch);
      }
    }
  }
}
