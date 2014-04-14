/************************************************************************************/
/* Instituição: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informática e Estatística                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 02                                                                                          */
/* Descrição: Software para calcular distâncias no plano cartesiano                      */
/*                                                                                                                           */
/************************************************************************************/

import javax.swing.JOptionPane;

public class Interface {
	
	public Interface() {
	}
	
	public double pegueValor(String msg){
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
	public void mostreValor(String msg, double valor){
		JOptionPane.showMessageDialog(null,msg + valor);
	}	
}