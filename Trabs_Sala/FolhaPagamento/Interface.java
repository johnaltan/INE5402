import javax.swing.JOptionPane;

public class Interface {
    public Interface(){}
    
    private double pegueDouble(String msg){
        return Double.parseDouble(JOptionPane.showInputDialog(msg + "\n(separado por um ponto)"));
    }

    private int pegueInt(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }

    private String pegueString(String msg){
        return JOptionPane.showInputDialog(msg);
    }
    
    private char pegueChar(String msg){
        return JOptionPane.showInputDialog(msg).charAt(0);
    }
    
    public char pegueTipo(){
        char vTipo;
        do{
            vTipo = Character.toUpperCase(pegueChar("Informe o Tipo do funcionario:\nchefe(C)\nfuncionario(F)\napoio(A)"));
        } while(vTipo != 'C' && vTipo != 'F' && vTipo != 'A');
        return vTipo;
    }
    
    public String pegueNome(){
        return pegueString("Informe o nome do funcionario:");
    }
    
    public char pegueSexo(){
        char vSexo;
        do{
            vSexo = Character.toUpperCase(pegueChar("Informe o sexo do funcionario:"));
        } while(vSexo != 'M' && vSexo != 'F' && vSexo != 'O');
        return vSexo;
    }
    
    public int pegueIdade(){
        return pegueInt("Informe a idade do funcionario:");
    }
    
    public double pegueSalarioBase(){
        return pegueDouble("Informe o salario base do funcionario:");
    }
    
    public double pegueProdutividade(){
        return pegueDouble("Informe a produtvidade do funcionario:");
    }
    
    public int pegueNumeroDependentes(){
        return pegueInt("Informe a quantidade de dependentes do funcionario:");
    }
    
    public double pegueGratificacaoChefia(){
        return pegueDouble("Informe a gratificacao do chefe:");
    }
    
    public Funcionario pegueFuncionario(){
        while(true){
            switch(pegueTipo()){
                case 'C':
                    return new Chefe(pegueNome(),pegueSexo(),pegueIdade(),pegueSalarioBase(),pegueProdutividade(),pegueNumeroDependentes(),pegueGratificacaoChefia());
                case 'F': case 'A':
                    return new Funcionario(pegueNome(),pegueSexo(),pegueIdade(),pegueSalarioBase(),pegueProdutividade(),pegueNumeroDependentes());
                default:
                    break;
            }
        }
    }
    
    public int pecaQuantFuncionarios(){
        return pegueInt("Informe a quantidade de funcionarios");
    }
    
    private void mostreMsg(String msg){
        JOptionPane.showMessageDialog(null,msg);
    }
    
    public void mostreDemonstrativo(Funcionario f){
        String saida = f.toString();
        saida += "\nSalario bruto: " + f.fornecaSalBruto();
        saida += "\nDesconto: " + f.fornecaDesconto();
        saida += "\nSalario liquido: " + f.fornecaSalLiquido();
        if(f instanceof Chefe){
            saida += "\nEste e um chefe e sua gratificacao e de: " + ((Chefe)f).informeGratChefia();
        }
        else if(f instanceof Apoio){
            saida += "\nEste e um funcionario de apoio e seu auxilio educacao e: " + ((Apoio)f).fornecaGratApoio();
        }else{
            saida += "\nFunc comum.";
        }
        mostreMsg(saida);
    }
}

























