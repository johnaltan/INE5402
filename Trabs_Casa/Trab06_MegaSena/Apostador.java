/************************************************************************************/
/* Instituicao: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informatica e Estatistica                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 06                                                                                          */
/* Descricao: Software para simular concurso MegaSena                                      */
/*                                                                                                                           */

public class Apostador extends Pessoa{
    private int[] apostados;
    private int pontos;
    
    public Apostador(String vNome, char vS, int vI, int[] vApostados){
        super(vNome,vS,vI);
        apostados = vApostados;
        pontos = 0;
    }
    
    public int[] informeApostados(){
        return apostados;
    }
    
    public int informePontos(){
        return pontos;
    }
    
    public void verifiquePontos(int[] sorteados){
        for(int i = 0; i < sorteados.length; i++)
            for(int j = 0; j < apostados.length; j++)
                if(apostados[j] == sorteados[i])
                    pontos++;
    }
}