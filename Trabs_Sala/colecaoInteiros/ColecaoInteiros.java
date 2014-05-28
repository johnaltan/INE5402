public class ColecaoInteiros{
    private int[] x;
    private int n;
    
    public ColecaoInteiros(int capacidade){
        n = 0;
        x = new int[capacidade];
    }
    
    public ColecaoInteiros(int[] z){
        n = z.length;
        x = new int[n];
        for(int i = 0; i < n; i++) x[i] = z[i];
    }
    
    public int informeN(){
        return n;
    }
    
    public boolean colocouValor(int valor){
        if(n < x.length){
            x[n++] = valor;
            return true;
        }
        return false;
    }
    
    public void coloqueValor(int v){
        if(n == x.length){
            int [] aux = new int [n + 5];
            for(int i = 0; i < n; i++) aux[i] = x[i];
            x = aux;
        }
        x[n++] = v;
    }
    
    public int informeValor(int posicao){
        if((posicao >= 0) && (posicao < n)) return x[posicao];
        return Integer.MIN_VALUE;
    }
    
    public int informePos(int valor){
        for(int i = 0;i < n;i++) {
            if(x[i] == valor) return i;
        }
        return -1;
    }
    
    public String toString(){
        String ret = "{";
        for (int i = 0;i < (n - 1);i++){
            ret += x[i] + ", ";
        }
        ret += "}";
        return ret;
    }
}