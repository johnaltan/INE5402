public class Ip{
    private int n;
    
    public Ip(int vN){
        if (vN > 0){
            n = vN;
        } else {
            n = 1;
        }
    }
    
    public int informeN(){
        return n;
    }
    
    public boolean recebaValorN(int vN){
        if(vN > 0){
            n = vN;
            return true;
        }
        return false;
    }
    
    public boolean ePar(){
        return ((n % 2) == 0);
    }
    
    public int somaParesMenores(){
        return ((2 + (n-1)) * (n-1)) / 4;
    }
    
    public int fatorial(){
        int fat = 1;
        int m = n;
        while (m > 0){
            fat *= m--;
        }
        return fat;
    }
    
    public int sorteio(){
        return (Math.rand() % n);
    }
    
    public double s1(){
        double s = 1;
        for(int cont = n; cont > 0; cont--) s += cont / (n - (cont - 1));
        return s;
    }
    
    public int ultimoDigito(){
        return n % 10;
    }   
    
    public int somaDigitos(){
        int m = n;
        int soma = 0;
        while (m != 0){
            soma += m % 10;
            m /= 10;
        }
        return soma;
    }
    
    public int compara(Ip outro){
        if(outro.informeN() > n) return 1;
        if(outro.informeN() == n) return 0;
        if(outro.informeN() < n) return -1;
    }
    
    public int soma(Ip outro){
        return outro.informeN() + n;
    }
    
    public String ultimoDigitoExtenso(){
        switch(ultimoDigito()){
            case 0:
                return "zero";
            case 1:
                return "um";
            case 2:
                return "dois";
            case 3:
                return "tres";
            case 4:
                return "quatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "sete";
            case 8:
                return "oito";
            case 9:
                return "nove";
        }
    }
}