public class Principal{
  public static void main(String[] args){
    //armazenar tudo na memória
    int n = Interface.pecaQuantCarros();
    Carro[] frota = new Carro[n];
    for (int i = 0;i < n;i++){
      frota[i] = Interface.pegueCarro();
    }
    Carro c = Principal.maisCaro(frota);
    Interface.mostreMensagem("Carro mais caro é\n" + c);
    Interface.mostreMensagem("Relatório (por marca)\n" +  Principal.relatorioPorMarca(frota));
    Interface.mostreMensagem("Relatório (por ano)\n" +  Principal.relatorioPorAno(frota));
  }
  
  public static Carro maisCaro(Carro[] lista){
    if (lista == null || lista.length <= 0)
      return null;
    Carro cMaisCaro = lista[0];
    for (int i = lista.length - 1;i > 0;i--){
      if (cMaisCaro.informePreco() < lista[i].informePreco()){
        cMaisCaro = lista[i];
      }
    }
    return cMaisCaro;
  }
  
  public static String relatorioPorMarca(Carro[] f){
    int[] cont = new int[Carro.marcas.length];
    for(int i = 0; i < f.length; i++){
      String m = f[i].informeMarca();
      for(int j = 0; j < Carro.marcas.length; j++){
        if(Carro.marcas[j].equalsIgnoreCase(m)){
          cont[j]++;
          break;
        }
      }        
    }
    String s = "Marca     Quant\n";
    for(int j = 0; j < Carro.marcas.length; j++)
      s += Carro.marcas[j] + "     " + cont[j] + "\n";
    return s;
  }
  
  public static String relatorioPorAno(Carro[] f){
    final int anos = (2014 - 2000) + 1;
    int[] cont = new int[anos];
    for(int i = 0; i < f.length; i++){
      int anoAtual = f[i].informeAno();
      if(anoAtual >= 2000 && anoAtual <= 2014)
        cont[anoAtual - 2000]++;
    }
    String s = "Ano     Qtde\n";
    for(int j = 0; j < anos; j++)
      s += (j + 2000) + "     " + cont[j] + "\n";
    return s;
  }
}