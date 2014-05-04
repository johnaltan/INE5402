/************************************************************************************/
/* Instituicao: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informatica e Estatistica                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 03                                                                                          */
/* Descricao: Software para simular relogio                                                          */
/*                                                                                                                           */

import javax.swing.JOptionPane;

public class Interface {

    public Interface() {
    }
    
    public int pegueQtdeRelogios(){
        String qtde = JOptionPane.showInputDialog("Deseja trabalhar com quantos horarios?");
        return Integer.parseInt(qtde);
    }

    public Relogio pegueRelogio(int ordem){
        String sHora = JOptionPane.showInputDialog("Digite hora: (horario: " + Integer.toString(ordem) + ")");
        int hora = Integer.parseInt(sHora);
        String sMin = JOptionPane.showInputDialog("Digite minuto: (horario: " + Integer.toString(ordem) + ")");
        int minuto = Integer.parseInt(sMin);
        String sSeg = JOptionPane.showInputDialog("Digite segundo: (horario: " + Integer.toString(ordem) + ")");
        int segundo = Integer.parseInt(sSeg);
        return new Relogio(hora,minuto,segundo);
    }

    public void mostreMsg(String msg){
        JOptionPane.showMessageDialog(null,msg);
    }	
}