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
  
  public static boolean ehPalindromo(String s){ // testado na metodologia POG
    s = s.trim().toUpperCase();
    for (int i = 0; i < (s.length() / 2);i++){
      if (s.charAt(i) != s.charAt(s.length() - i - 1)){
        return false;
      }
    }
    return true;
  }
  
  public static String maior(String[] s){
    if(s == null) 
      return null;
    String maior = s[0].trim();
    for(int i = 1; i < s.length; i++){
      if(s[i].trim().toLowerCase().compareTo(maior.toLowerCase()) > 0) 
        maior = s[i].trim();
    }
    return maior;
  }
  
  public static char letraMaisUtilizada(String texto){
    char[] s = texto.toUpperCase().toCharArray();
    int[] cont = new int[26];
    for(int i = 0; i < s.length; i++){
      if(s[i] >= 'A' && s[i] <= 'Z')
        cont[s[i] - 'A']++;
    }
    byte pos = 0;
    int max = cont[0];
    for(byte i = 0; i < cont.length; i++){
      if(cont[i] > max){
        max = cont[i];
        pos = i;
      }
    }
    return (char)('A' + pos);
  }
  
  public static int quantPalavras(String texto){
    String[] split = texto.split(" ");
    int quant = split.length;
    for(int i = 0; i < split.length; i++)
      if(split[i].equals(""))
        quant--;
    return quant;
  }
}