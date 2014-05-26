public class Aluno extends Pessoa{
    private double pf;
    private int n;
    private double[] nt;
    
    public Aluno(String vNome, char vSexo, int vI){
        super(vNome,vSexo,vI);
        pf = 0.0;
        n = 0;
        nt = new double[20];
    }
    
    public double informePF(){
        return pf;
    }
    
    public boolean recebaValorPF(double vPF){
        if(vPF >= 0 && vPF <=10){
            pf = vPF;
            return true;
        }
        return false;
    }
    
    public int informeN(){
        return n;
    }
    
    public boolean recebaNotaNovoTeste(double nota){
        if(nota >= 0 && nota <= 10)
            if(n < 20){
                nt[n++] = nota;
                return true;
            }
        return false;
    }
    
    public double informeNotaUmTeste(int qual){
        if(qual >= 1 && qual <= n)
            return nt[qual - 1];
        return -1.0;
    }
    
    public double fornecaMenorNotaTeste(){
        double menor = nt[0];
        for(int i = 1; i < n; i++){
            if(nt[i] < menor) menor = nt[i];
        }
        return menor;
    }
    
    public double fornecaMediaTestes(){
        double soma = 0;
        for(int i = 0; i < n; i++) soma += nt[i];
        if(n == 1) return soma;
        return (soma - this.fornecaMenorNotaTeste()) / (n - 1);
    }
    
    public double fornecaMediaFinal(){
        return pf * 0.4 + this.fornecaMediaTestes() * 0.6;
    }
    
    public boolean foiAprovado(double c){
        return this.fornecaMediaFinal() >= c;
    }
}