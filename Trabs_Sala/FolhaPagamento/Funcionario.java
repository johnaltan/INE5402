public class Funcionario extends Pessoa{
    protected double salBase;
    protected double prod;
    protected int nd;
    
    public Funcionario(String vNome, char vSexo, int vI, 
                       double vSB, double vProd, int vND){
        super(vNome,vSexo,vI);
        salBase = vSB;
        if(salBase < 0) salBase = 0;
        prod = vProd;
        if(prod < 0) prod = 0;
        nd = vND;
        if(nd < 0) nd = 0;
    }
    
    public double informeSalBase(){
        return salBase;
    }
    
    public boolean recebaValorSalBase(double vSB){
        if(vSB >= 0){
            salBase = vSB;
            return true;
        }
        return false;
    }
    
    public String informeNome(){
        return super.toString();
    }
}