public class Chefe extends Funcionario{
    protected double gratChefia;
    
    public Chefe(String vNome, char vS, int vI, double vSB, double vP,
                int vND, double vGC){
        super(vNome,vS,vI,vSB,vP,vND);
        gratChefia = vGC;
        if(gratChefia < 0) gratChefia = 0;
    }
    
    public double informeGratChefia(){
        return gratChefia;
    }
    
    public boolean recebaValorGratChefia(double valor){
        if(valor >= 0){
            gratChefia = valor;
            return true;
        }
        return false;
    }
    
    public double fornecaSalBase(){
        return salBase + prod + gratChefia;
    }
}