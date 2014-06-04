public class ManipulaMatriz{
    public static boolean eQuadrada(int[][] m){
        return m.length == m[0].length;
    }
    
    public static int someLinha(int[][] m, int linha){
        if((linha < 0) || (linha >= m.length)) return Integer.MIN_VALUE;
        int soma = 0;
        for(int i = 0; i < m[0].length; i++) soma+= m[linha][i];
        return soma;
    }
    
    public static int informeMaior(int[][] m){
        int maior = m[0][0];
        for(int i = 0; i < m.length; i++)
            for(int j = 0; j < m[0].length;j++)
                if(maior < m[i][j]) maior = m[i][j];
        return maior;
    }
    
    public static int[][] informeTransposta(int[][] a){
        int[][] transpA = new int[a[0].length][a.length];
        for (int i = 0;i < a.length;i++)
            for (int j = 0; j < a[i].length;j++)
                transpA[j][i] = a[i][j];
        return transpA;
    }
    
}