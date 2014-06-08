/************************************************************************************/
/* Instituicao: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informatica e Estatistica                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 06                                                                                          */
/* Descricao: Software para simular concurso MegaSena                                      */
/*                                                                                                                           */

public class Concurso{
    private int totalArrecadado;
    private int[] sorteados;
    
    public Concurso(){
        totalArrecadado = 0;
        sorteados = new int[6];
    }
    
        
    public int[] informeSorteados(){
        int[] n = new int[sorteados.length];
        for(int i = 0; i < n.length; i++) n[i] = sorteados[i];
        return n;
    }
    
    public int informeTotalArrecadado(){
        return totalArrecadado;
    }
    
    public void sorteie(){
        boolean aprovado;
        for(int i = 0; i < 6; i++){
            do{
                sorteados[i] = (int)(Math.random() * 60 + 1);
                aprovado = true;
                for(int j = 0;j < i; j++){
                    if(sorteados[j] == sorteados[i]){
                            aprovado = false;
                            break;
                    }
                }
            }while(!aprovado);
        }
    }
    
    public void arrecade(int qtdeNumeros){
        switch(qtdeNumeros){
            case 6: 
                totalArrecadado += 1;
                break;
            case 7:
                totalArrecadado += 7;
                break;
            case 8:
                totalArrecadado += 28;
                break;
            case 9:
                totalArrecadado += 168;
                break;
            case 10:
                totalArrecadado += 1260;
                break;
            default:
                break;
        }
    }
}