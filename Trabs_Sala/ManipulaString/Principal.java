public class Principal{
  public static void main(String[] args){
    if(!args[0].isEmpty()){
      System.out.println("Palavras " + ManipulaString.quantPalavras(args[0]));
    }
  }
}