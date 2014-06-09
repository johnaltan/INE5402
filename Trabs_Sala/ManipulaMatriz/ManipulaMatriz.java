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
    
    public static int[][] informeIdentidade(int ordem){
      if (ordem < 1){
        return null;
      }
      int[][] id = new int[ordem][ordem];
      for (int i = 0;i < id.length;i++){
        id[i][i] = 1;
      }
      return id;
    }
    
    public static int someAcimaDiagonal(int[][] m){
      if(ManipulaMatriz.eQuadrada(m)){
        int soma = 0;
        for(int i = 0; i < m.length; i++)
          for(int j = m[0].length - 1; j > i ; j--){
            soma += m[i][j];
        }
        return soma;
      }
      return Integer.MIN_VALUE;
    }
    
    public static boolean troqueLinha(int[][] m, int velha ,int nova){
      if(velha < 0 || nova < 0 || velha > m[0].length ||
        nova > m[0] || nova == linha)
        return false;
        
      int[] aux = m[nova];
      m[nova] = m[velha];
      m[velha] = aux;
      return true;
    }
    
    public int[] informeNaoNegativos(int[][] m){
      int quantN = 0;
      for(int i = 0; i < m.length; i++){
        for(int j = 0; j < m[i].length; j++){
          if (m[i][j] >= 0){
            quantN++;
          }
        }
      }
      if (quantN == 0){
        return null;
      }
      int[] vetor=new int[quantN];
      for(int i=m.length;i > 0;i--){
        for(int j = m[i].length;j > 0;j--){
          vetor[--quantN] = m[i][j];
        }
      }
      return vetor;
    }
    
    public static int informeLinhaMaiorSoma(int[][] m){
      int linha = -1;
      int maior = ManipulaMatriz.someLinha(m,0);
      for(int i = 1; i < m.length; i++){
        int somaAtual = ManipulaMatriz.someLinha(m,i);
        if(maior < somaAtual) {
          maior = somaAtual;
          linha = i;
        }
      }
      return linha;
    }
    
    public static int[][] some(int[][] m, int[][] n){
      if(m.length != n.length || m[0].length != n[0].length) return null;
      int[][] s = new int[m.length][m[0].length];
      for(int i = 0; i < m.length; i++)
        for(int j = 0; j < m[i].length; j++)
          s[i][j] = m[i][j] + n[i][j];
      return s;
    }
}