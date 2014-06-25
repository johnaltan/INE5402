import javax.swing.JOptionPane;

public class Interface{
  public static int pecaQuantCarros(){
    return Interface.pegueInteiro("Com quantos carros deseja trabalhar?");
  }
  
  public static Carro pegueCarro(){
    Carro c = new Carro();
    while(!c.recebaAno(Interface.pegueInteiro("Informe ano de fabricação:")))
      Interface.mostreMensagem("Ano de fabricação inválido!");
    while(!c.recebaMarca(Interface.pegueString("Informe marca:")))
      Interface.mostreMensagem("Marca inválida!");
    while(!c.recebaPreco(Interface.pegueDouble("Informe preço do veículo:")))
      Interface.mostreMensagem("Preco inválido do veículo!");
    return c;
  }
  
  public static int pegueInteiro(String msg){
    return Integer.parseInt(JOptionPane.showInputDialog(msg));
  }
  
  public static double pegueDouble(String msg){
    return Double.parseDouble(JOptionPane.showInputDialog(msg));
  }
  
  public static String pegueString(String msg){
    return JOptionPane.showInputDialog(msg);
  }
  
  public static void mostreMensagem(String msg){
    JOptionPane.showMessageDialog(null,msg);
  }
  
}