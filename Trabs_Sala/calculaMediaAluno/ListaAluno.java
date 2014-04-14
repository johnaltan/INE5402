public class ListaAluno {
    
    private Aluno aluno;
    private ListaAluno proxAluno;
    
    public ListaAluno(){
        aluno = null;
        proxAluno = null;
    }
    
    public Aluno pegaAluno(int nAluno){
        int n = 0;
        ListaAluno prox = proxAluno;
        do{
            if(n == nAluno) return prox.informeAluno();
            n++;
            prox = prox.pegaProximo();
        }while(prox != null);
        return null;
    }
    
    public Aluno pegaAluno(String nomeAluno){
        ListaAluno prox = proxAluno;
        do{
            Aluno a = prox.informeAluno();
            if(a.informaNome().equals(nomeAluno)) return a;
            prox = prox.pegaProximo();
        }while(prox != null);
        return null;
    }
    
    public void adicionaAluno(Aluno vAluno){
        ListaAluno novo = new ListaAluno();
        novo.recebaValorAluno(vAluno);
        novo.recebaValorProx(proxAluno);
        proxAluno = novo;
    }
    
    public Aluno informeAluno(){
        return aluno;
    }
    
    private ListaAluno pegaProximo(){
        return proxAluno;
    }
    
    private void recebaValorAluno(Aluno vAluno){
        aluno = vAluno;
    }
    
    private void recebaValorProx(ListaAluno vProx){
        proxAluno = vProx;
    }
}