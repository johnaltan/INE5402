/************************************************************************************/
/* Instituicao: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informatica e Estatistica                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 03                                                                                          */
/* Descricao: Software para simular relogio                                                          */
/*                                                                                                                           */
/************************************************************************************/

import java.lang.Thread;

public class Principal {
    public static void main(String[] args){
        Interface aInterface = new Interface();
        int relogios = aInterface.pegueQtdeRelogios();
        int ordem = 1;
        boolean relogioZerado = false;
        Relogio maiorRelogio = new Relogio();
        while(relogios > 0){
            Relogio relogio = aInterface.pegueRelogio(ordem);
            if(relogio.fornecaSegundos() == 0) relogioZerado = true;
            if(maiorRelogio.fornecaSegundos() < relogio.fornecaSegundos())
                maiorRelogio = relogio;
            ordem++;
            relogios--;
        }
        aInterface.mostreMsg("O maior horario e o que marca: " + maiorRelogio.fornecaHorario());
        if(relogioZerado)
            aInterface.mostreMsg("Algum horario igual a 0:0:0 foi inserido");
        else
            aInterface.mostreMsg("Nenhum horario igual a 0:0:0 foi inserido");
    }
}