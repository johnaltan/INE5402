public class Carro{
  private int ano;
  private String marca;
  private double preco;
  
  public static boolean eMarcaValida(String m){
    String[] marcas = {"fiat","ford","GM","toyota","honda",
                      "renault","kia","citroen","peugeot",
                      "hyundai","bmw"};
    for(String s : marcas)
      if(s.equalsIgnoreCase(m.trim()))
        return true;
    return false;    
  }
  
  public Carro(int vAno, String vMarca, double vPreco){
    ano = vAno;
    if(ano < 1950)
      ano = 1950;
    if(Carro.eMarcaValida(vMarca))
      marca = vMarca;
    else
      marca = "Nao definida";
    preco = vPreco;
    if(preco < 0)
      preco = 0;    
  }
  
  public boolean recebaAno(int vAno){
    if(vAno < 1950)
      return false;
    ano = vAno;
    return true;
  }
  
  public boolean recebaMarca(String vMarca){
    if(!Carro.eMarcaValida(vMarca))
      return false;
    marca = vMarca;
    return true;
  }
  
  public boolean recebaPreco(double vPreco){
    if(vPreco < 0)
      return false;
    preco = vPreco;
    return true;
  }
  
  public int informeAno(){
    return ano;
  }
  
  public String informeMarca(){
    return marca;
  }
  
  public double informePreco(){
    return preco;
  }
  
}