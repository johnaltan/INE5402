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