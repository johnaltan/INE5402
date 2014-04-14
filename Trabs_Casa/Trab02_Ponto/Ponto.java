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

public class Ponto {
	private double x;
	private double y;
	
	public Ponto(){
		x = 0;
		y = 0;
	}
	
	public Ponto(double vX, double vY){
		x = vX;
		y = vY;
	}
	
	public void recebaValorX(double vX) {
		x = vX; 
	}
	
	public void recebaValorY(double vY) {
		y = vY; 
	}
	
	public double informeX(){
		return x;
	}
	
	public double informeY(){
		return y;
	}
	
	public double informeDistancia(Ponto outroPonto) {
		return (Math.sqrt(Math.pow(x - outroPonto.informeX(),2) + Math.pow(y - outroPonto.informeY(),2)));
	}
	
	public double informeDistanciaOrigem() {
		return informeDistancia(new Ponto(0,0));
	}
}