public class ListaAluno {

    private Aluno aluno;
    private ListaAluno proxAluno;
    
    public ListaAluno(){
        aluno = null;
        proxAluno = null;
    }
    
    public Aluno pegaAluno(int nAluno){
        int n = 0;
        ListaAluno prox;
        do{
            prox = pegaProximo();
            if(n == nAluno) return prox.informeAluno();
            n++;
        }while(prox != null);
        return null;
    }
    
    public Aluno informeAluno(){
        return aluno;
    }
    
    public ListaAluno pegaProximo(){
        return proxAluno;
    }
    
    private void recebaValorAluno(Aluno vAluno){
        aluno = vAluno;
    }
    
    public void adicionaAluno(Aluno vAluno){
        proxAluno = new ListaAluno();
        proxAluno.recebaValorAluno(vAluno);        
    }

}