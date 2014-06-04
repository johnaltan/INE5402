public class Principal{
    public static void main(String [] par){
        int[][] a = Interface.pegueMatriz();
        Interface.mostreMatriz(a);
        int soma = Principal.some(a);
        Interface.mostreMensagem("Soma: " + soma);
    }
    
    public static int some(int[][] x){
        int soma = 0;
        for(int i = 0; i < x.length; i++)
            for(int j = 0; j < x[0].length; j++)
                soma += x[i][j];
        return soma;
    }

}