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

public class Retangulo {
	private double base;
	private double altura;
	
	public Retangulo(){
		base = 0;
		altura = 0;
	}
	
	public void recebaValorBase(double vBase) {
		base = vBase; 
	}
	
	public void recebaValorAltura(double vAltura) {
		altura = vAltura; 
	}
	
	public double informePerimetro() {
		return (2 * (base + altura));
	}
	
	public double informeArea(){
		return (base * altura);
	}
}