/************************************************************************************/
/* Instituicao: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informatica e Estatistica                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 06                                                                                          */
/* Descricao: Software para simular concurso MegaSena                                      */
/*                                                                                                                           */

public class Pessoa {
    private String nome;
    private char sexo;
    protected int idade;
    
    public Pessoa (String vNome,char vS, int vI){
        nome = vNome;
        vS = Character.toUpperCase (vS);
        if (vS == 'F' || vS == 'M')
            sexo = vS;
        else
            sexo = '*';
        idade = vI;
        if(idade < 0)
            idade = 0;
        if(idade >150)
            idade = 150;
    }
    
    public String informeNome (){
        return nome;
    }
    
    public void recebaValorNome (String vN){
        nome = vN;
    }
    
    public char informeSexo (){
        return sexo;
    }
    
    public boolean recebaValorSexo (char vS){
        vS = Character.toUpperCase (vS);
        if(vS == 'F' && vS == 'M'){
            sexo = vS;
            return true;
        }
        return false;
    }
    
    public int informeIdade (){
        return idade;
    }
    
    public int recebaValorIdade (int vI){
        idade = vI;
        if(idade < 0)
            idade = 0;
        if(idade > 150)
            idade = 150;
        return idade;
    }
    
    public String toString (){
        return "Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " +idade;
    }
    
    public Pessoa oClone (){
        return new Pessoa(nome, sexo, idade);
    }
}