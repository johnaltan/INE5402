/************************************************************************************/
/* Instituicao: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informatica e Estatistica                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 04                                                                                          */
/* Descricao: Software para manipular contas bancarias                                       */
/*                                                                                                                           */

public class Principal {
    public static void main(String[] args){
        Interface aInterface = new Interface();
        int contas = aInterface.pegueQtdeContas();
        int ordem = 1;
        while(contas > 0){
            boolean executarMenuConta = true;
            ContaBancaria conta = aInterface.pegueConta(ordem);
            do{
                switch(aInterface.mostreMenu()){
                    case 1:
                        if(!conta.efetueDeposito(aInterface.pegueValor("Digite valor de deposito.")))
                            aInterface.mostreMsg("Deposito nao efetuado.");
                        break;
                    case 2:
                        if(!conta.efetueSaque(aInterface.pegueValor("Digite valor de saque.")))
                            aInterface.mostreMsg("Saque nao efetuado.");
                        break;
                    case 3:
                        aInterface.mostreMsg("Valor de saldo = " + Double.toString(conta.informeSaldo()));
                        break;
                    case 4:
                        executarMenuConta = false;
                        break;
                }
            }while(executarMenuConta);
            ordem++;
            contas--;
        }
    }
}