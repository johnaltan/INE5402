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

public class Principal {
public static void main(String[] args){
		Ponto ponto1 = new Ponto();
		Ponto ponto2 = new Ponto();
		Interface aInterface = new Interface();
		ponto1.recebaValorX(aInterface.pegueValor("Informe a abscissa X do ponto1 "));
		ponto1.recebaValorY(aInterface.pegueValor("Informe a ordenada Y do ponto1 "));
		ponto2.recebaValorX(aInterface.pegueValor("Informe a abscissa X do ponto2 "));
		ponto2.recebaValorY(aInterface.pegueValor("Informe a coordenada Y do ponto2 "));
		aInterface.mostreValor("Distância entre os pontos: ",ponto1.informeDistancia(ponto2));
		aInterface.mostreValor("Distância entre o ponto1 e a origem: ",ponto1.informeDistanciaOrigem());
		aInterface.mostreValor("Distância entre o ponto2 e a origem: ",ponto2.informeDistanciaOrigem());
	}
}