/************************************************************************************/
/* Instituição: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informática e Estatística                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 01                                                                                          */
/* Descrição: Software para calcular área e perímetro de retângulo                      */
/*                                                                                                                           */
/************************************************************************************/

public class Principal {
	public static void main(String[] args){
		Retangulo retangulo = new Retangulo();
		Interface aInterface = new Interface();
		retangulo.recebaValorBase(aInterface.pegueValor("Informe a base do retângulo: "));
		retangulo.recebaValorAltura(aInterface.pegueValor("Informe a altura do retângulo: "));
		aInterface.mostreValor("Perímetro do retângulo: ",retangulo.informePerimetro());
		aInterface.mostreValor("Área do retângulo: ",retangulo.informeArea());
	}
}