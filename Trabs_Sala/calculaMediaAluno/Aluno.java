import java.util.ArrayList;
import java.util.Iterator;

public class Aluno{
    private String nome;
    private ArrayList<Double> notas;
    
    public Aluno(String vNome, double vNota0, double vNota1, double vNota2){
        this.nome = vNome;
        notas = new ArrayList<Double>();
        recebaValorNotas(vNota0);recebaValorNotas(vNota1);recebaValorNotas(vNota2);
    }
    
    public Aluno(String vNome){
        this.nome = vNome;
        notas = new ArrayList<Double>();
    }
    
    public Aluno(String vNome, int vNotas){
        this.nome = vNome;
        notas = new ArrayList<Double>();
        for(;vNotas > 0; vNotas--) recebaValorNotas(vNotas);
    }
    
    public String informaNome(){
        return nome;
    }
    
    public void recebaValorNome(String vNome){
        nome = vNome;
    }
    
    public double informaNotas(int nNota){
        return notas.get(nNota);
    }
    
    public void recebaValorNotas(double vNota, int nNota){
        notas.add(nNota,vNota);
    }
    
    public void recebaValorNotas(double vNota){
        notas.add(vNota);
    }
    
    public double informaMedia(){
        return informaMedia(-1);
    }
    
    public double informaMedia(int qtde){
        double vTotal = 0;
        int vDenominador = 0;
        Iterator it = notas.iterator();
        while(it.hasNext()){
            vTotal += (Double)it.next();
            vDenominador++;
            qtde--;
            if (qtde == 0){
                break;
            }
        }
        return (vTotal / vDenominador);
    }
}