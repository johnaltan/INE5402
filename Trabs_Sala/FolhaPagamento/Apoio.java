public class Apoio extends Funcionario{
    protected double gratApoio;
    public Apoio(String vNome, char vSexo, int vI, 
                       double vSB, double vProd, int vND){
        super(vNome,vSexo,vI,vSB, vProd, vND);
        gratApoio = (nd > 5)? 600 : nd * 120;
    }
    
    public double fornecaGratApoio(){
        return gratApoio;
    }
    
    public double fornecaSalBruto(){
        return salBase + prod + gratApoio;
    }
    
    public double fornecaDesconto(){
        double bruto = fornecaSalBruto() - gratApoio;
        if(bruto <= 1000)
            return 0.0;
        if(bruto <= 1800)
            return bruto * 0.1 - 100;
        return bruto * 0.25 - 370;
    }
}