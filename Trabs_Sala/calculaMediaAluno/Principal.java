public class Principal{
    public static void main(String[] args){
        /*Interface aInterface = new Interface();
        Aluno umAluno = aInterface.pegueAluno();
        /*Aluno outroAluno = aInterface.pegueAluno();
        aInterface.mostraMedia(umAluno);
        aInterface.mostraMedia(outroAluno);
        int t;
            for (t = 0;t < 5000; t++){
                umAluno = new Aluno(Integer.toString(t),t);
            }
        while (true){
            //try{
            //Thread.sleep(10000);
            //System.out.println(Integer.MAX_VALUE);
            //System.gc();
            //Thread.sleep(10000);
            //System.out.println(Integer.MIN_VALUE);
            //}catch(Exception e){}
        }*/
        ListaAluno alunos = new ListaAluno();
        
        alunos.adicionaAluno(new Aluno("Tiburcio"));
        alunos.adicionaAluno(new Aluno("Jucelino"));
        alunos.adicionaAluno(new Aluno("Gioconda"));
        alunos.adicionaAluno(new Aluno("Getulio"));
        alunos.adicionaAluno(new Aluno("Cabreston"));
        
        System.out.println("Aluno n = 1, tem nome: " + alunos.pegaAluno(1).informaNome());
        System.out.println("Aluno n = 2, tem nome: " + alunos.pegaAluno(2).informaNome());
        
    }
}