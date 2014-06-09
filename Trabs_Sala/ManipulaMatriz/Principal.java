public class Principal{
    public static void main(String[] args){
        int[][] a = Interface.pegueMatriz();
        if(ManipulaMatriz.eQuadrada(a)) Interface.mostreMensagem("Matriz quadrada");
        else Interface.mostreMensagem("Matriz não é quadrada");
        int linha = Interface.pegueInteiro("Digite linha a somar");
        Interface.mostreMensagem("Soma da linha " + linha + " = " + ManipulaMatriz.someLinha(a,linha));
        Interface.mostreMensagem("Maior valor "+ ManipulaMatriz.informeMaior(a));
        Interface.mostreMensagem("Soma acima diagonal "+ ManipulaMatriz.someAcimaDiagonal(a));
        int[][] transp = ManipulaMatriz.informeTransposta(a);
        Interface.mostreMensagem("Transposta a seguir");
        Interface.mostreMatriz(transp);
        Interface.mostreMatriz(ManipulaMatriz.informeIdentidade(3));
    }
}