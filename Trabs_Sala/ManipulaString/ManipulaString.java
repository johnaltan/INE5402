public class ManipulaString{
  
  public static boolean contem(String s, char c){
    for (int i = s.length() - 1;i >= 0;i--){
      if (s.charAt(i) == c){
        return true;
      }
    }
    return false;
  }
  
  public static int pegaUltimaOcorrencia(String s, char c){
    int i;
    for (i = s.length() - 1;i >= 0;i--){
      if (s.charAt(i) == c){
        break;
      }
    }
    return i;
  }
  
  public static boolean ehVogal(char c){
    c = Character.toUpperCase(c);
    if (c == 'O' ||
        c == 'I' ||
        c == 'A' ||
        c == 'U' ||
        c == 'E'){
      return true;
    }
    return false;
  }
  
  public static boolean ehConsoante(char c){
    if (Character.isLetter(c) && !ehVogal(c)){
      return true;
    }
    return false;
  }
  
  public static int quantLetras(String s){
    int quant = 0;
    for (int i = s.length() - 1;i >= 0;i--){
      if (Character.isLetter(s.charAt(i))){
        quant++;
      }
    }
    return quant;
  }
  
  public static String geraSenha(int quantCarac){
    int i;
    char carac;
    String ret = "";
    for (i = 0;i < quantCarac;i++){
      carac = (char)((int)(Math.random() * 26) + 'a');
      ret += carac;
    }
    return ret;
  }
}