public class Principal {

    public static void main(String[] args){
        Interface aInterface = new Interface();
        int nf = aInterface.pecaQuantFuncionarios();
        for(int i = 1; i <= nf; i++){
            Funcionario f = aInterface.pegueFuncionario();
            aInterface.mostreDemonstrativo(f);
        }
    }
}
