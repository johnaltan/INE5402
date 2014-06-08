/************************************************************************************/
/* Instituicao: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informatica e Estatistica                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 06                                                                                          */
/* Descricao: Software para simular concurso MegaSena                                      */
/*                                                                                                                           */

public class Principal{
    public static void main(String[] args){ 
        Concurso concurso = new Concurso();
        concurso.sorteie();
        do{
            Apostador apostador = Interface.pegueApostador();
            apostador.verifiquePontos(concurso.informeSorteados());
            concurso.arrecade(apostador.informeApostados().length);
            Interface.mostreResultadoApostador(apostador);
        }while(Interface.temOutro());
        
        Interface.mostreResultadoConcurso(concurso);
    }
}