/************************************************************************************/
/* Instituicao: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informatica e Estatistica                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 04                                                                                          */
/* Descricao: Software para manipular contas bancarias                                       */
/*                                                                                                                           */

import javax.swing.JOptionPane;

public class Interface {

    public Interface() {
    }
    
    public int mostreMenu(){
        String opcao = JOptionPane.showInputDialog("Escolha opcao: \n"+
                                                                            "1 - Efetuar deposito; \n" + 
                                                                            "2 - Efetuar saque;\n"+
                                                                            "3 - Consultar saldo;\n" +
                                                                            "4 - Sair da conta\n");
        return Integer.parseInt(opcao);
    }
    
    public double pegueValor(String msg){
        String vSaque = JOptionPane.showInputDialog(msg);
        return Double.parseDouble(vSaque);
    }
    
    public int pegueQtdeContas(){
        String qtde = JOptionPane.showInputDialog("Deseja trabalhar com quantas contas?");
        return Integer.parseInt(qtde);
    }

    public ContaBancaria pegueConta(int ordem){
        String nome = JOptionPane.showInputDialog("Digite nome do correntista: (conta num: " + Integer.toString(ordem) + ")");
        String sNum = JOptionPane.showInputDialog("Digite numero da conta: (conta num: " + Integer.toString(ordem) + ")");
        int num = Integer.parseInt(sNum);
        String sSaldo = JOptionPane.showInputDialog("Digite saldo: (conta num: " + Integer.toString(ordem) + ")");
        double saldo = Double.parseDouble(sSaldo);
        String sLimite = JOptionPane.showInputDialog("Digite limite: (conta num: " + Integer.toString(ordem) + ")");
        double limite = Double.parseDouble(sLimite);
        return new ContaBancaria(nome,num,saldo,limite);
    }

    public void mostreMsg(String msg){
        JOptionPane.showMessageDialog(null,msg);
    }
}