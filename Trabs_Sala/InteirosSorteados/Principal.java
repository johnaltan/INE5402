public class Principal{
  public static void main(String[] args){
    int n = 40;//Interface.pecaInteiroPositivo();
    int[] sorteados = Principal.sorteie(n);
    int[] freq = Principal.determineFrequencia(sorteados);
    //Interface.mostreFrequencia(freq);
    System.out.print("\n");
    for(int z : freq)
      System.out.print(z + " ");
    System.out.print("\n");
  }
  
  public static int[] sorteie(int n){
    int[] sort = new int[n];
    for(int i = 0; i < n; i++)
      sort[i] = (int)(Math.random() * 21);
    return sort;
  }
  
  public static int[] determineFrequencia(int[] v){
    int[] freq = new int[21];
    for(int i = 0; i < v.length; i++)
      freq[v[i]]++;
    return freq;
  }
}