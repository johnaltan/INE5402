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