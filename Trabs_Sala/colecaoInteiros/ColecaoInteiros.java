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
    
    public boolean excluaValor(int valor){
        int i = informePos(valor);
        if (i < 0) return false;
        while(i < (n - 1)) x[i++] = x[i];
        n--;
        return true;
    }
    
    public int [] informeNegativos(){
        int neg = 0;
        for(int i = 0; i < n; i++) if(x[i] < 0) neg++;
        int [] b = new int[neg];
        if(neg == 0) return null;
        for(int i = 0, k = 0; i < n; i++){
            if(x[i] < 0) b[k++] = x[i];
        }
        return b;
    }
    
    public ColecaoInteiros informeUniao(ColecaoInteiros outra){
        ColecaoInteiros uniao = new ColecaoInteiros(n + outra.n);
        uniao.n = n + outra.n;
        for(int i = 0; i < n; i++) uniao.x[i] = this.x[i];
        for(int i = 0; i < outra.n; i++) uniao.x[n + i] = outra.x[i];
        return uniao;
    }
    
    public void ordeneCrescente(){  //Metodo selecao direta
        for(int i = 0; i < (n - 1); i++){
            int posMenor = i;
            for(int m = i; m < n; m++)
                if(x[posMenor] > x[m]) posMenor = m;
            int aux = x[i];
            x[i] = x[posMenor];
            x[posMenor] = aux;
        }
    }
    
    public void ordeneCrescente1234567890(){
        int [][] a = new int[3];
        a[0] = new int[3];
        a[1] = new int[2];
        a[2] = new int[3];
    }
    
    public String toString(){
        String ret = "{";
        int i = 0;
        for (;i < (n - 1);i++){
            ret += x[i] + ", ";
        }
        ret += x[i] + "}";
        return ret;
    }
    
    public static void main(String [] args){
        int[] a = {0};
        ColecaoInteiros colecao1 = new ColecaoInteiros(new int[] {9,3,6,4,5});
        System.out.println("Colecao 1: " + colecao1);
        colecao1.ordeneCrescente();
        System.out.println("Colecao ordenada: " + colecao1);
    }
}