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
        int sub = (ePar() ? 2 : 1);
        return ((2 + (n-sub)) * (n-sub)) / 4;
    }
    
    public long fatorial(){
        long fat = 1;
        int m = n;
        while (m > 0){
            fat *= m--;
        }
        return fat;
    }
    
    public int sorteio(){
        return (int)(Math.random() * n);
    }
    
    public double s1(){
        double s = 0;
        for(int cont = n; cont > 0; cont--) s += (double)cont / (n - (cont - 1));
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
        return -1;
    }
    
    public Ip soma(Ip outro){
        return new Ip(outro.informeN() + n);
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
        }
        return "nove";
    }
    
    public double s2(){
        return 0.0;
    }
    
    public String paraHexa(){
        String str = new String();
        for(int m = n;m != 0; m >>= 4){
            char b = (char)(m & 0xF);
            b = (char)(b > 9 ? (b + 0x41 - 10) : (b + 0x30));
            str = Character.toString(b) + str;
        }
        return "0x" + str;
    }
    
    public boolean ePrimo(){
        for (int m = n - 1;m > 1;m--){
            if ((n % m) == 0) return false;
        }
        return true;
    }
}
    