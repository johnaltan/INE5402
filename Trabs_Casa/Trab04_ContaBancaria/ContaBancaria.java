/************************************************************************************/
/* Instituicao: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informatica e Estatistica                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 04                                                                                          */
/* Descricao: Software para manipular contas bancarias                                       */
/*                                                                                                                           */

public class ContaBancaria{
    private String nome;
    private int num;
    private double saldo;
    private double limite;
    
    public ContaBancaria(String vNome, int vNum, double vSaldo, double vLimite){
        recebaValorNome(vNome);
        recebaValorNumero(vNum);
        recebaValorSaldo(vSaldo);
        recebaValorLimite(vLimite);
    }
    
    public String informeNome(){
        return nome;
    }
    
    public int informeNumero(){
        return num;
    }
    
    public double informeSaldo(){
        return saldo;
    }
    
    public double informeLimite(){
        return limite;
    }
    
    public void recebaValorNome(String vNome){
        nome = vNome;
    }
    
    public void recebaValorNumero(int vNum){
        num = vNum;
    }
    
    public void recebaValorSaldo(double vSaldo){
        if(vSaldo >= 0.0){
            saldo = vSaldo;
            return;
        }
        saldo = 0;
    }
    public void recebaValorLimite(double vLimite){
        if(vLimite >= 0.0){
            limite = vLimite;
            return;
        }
        limite = 0;
    }
    
    public boolean efetueDeposito(double vDeposito){
        if(vDeposito > 0){
            saldo += vDeposito;
            return true;
        }
        return false;
    }
    
    public boolean efetueSaque(double vSaque){
        if(vSaque <= (saldo + limite)){
            saldo -= vSaque;
            return true;
        }
        return false;
    }
}