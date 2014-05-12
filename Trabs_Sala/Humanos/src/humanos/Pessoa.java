package humanos;

public class Pessoa 
{
    private String nome;
    private char sexo;
    private int idade;
    public Pessoa (String vNome,char vS, int vI)
    {
        nome = vNome;
        vS = Character.toUpperCase (vS);
        if (vS=='F'||vS=='M')
            sexo = vS;
        else
            sexo = '*';
        idade = vI;
        if (idade < 0)
            idade = 0;
        if (idade >150)
            idade = 150;
    }
    public String informeNome ()
    {
        return nome;
    }
    public void recebaValorNome (String vN)
    {
        nome = vN;
    }
    public char informeSexo ()
    {
        return sexo;
    }
    public boolean recebaValorSexo (char vS)
    {
        vS = Character.toUpperCase (vS);
        if (vS== 'F'&& vS== 'M')
        {
            sexo = vS;
        return true;
        }
        return false;
    }
    public int informeIdade ()
    {
        return idade;
    }
    public int recebaValorIdade (int vI)
    {
        idade = vI;
        if (idade < 0)
            idade = 0;
        if (idade > 150)
            idade = 150;
        return idade;
    }
    public String toString ()
    {
        return "Nome: "+nome+"\nSexo: "+sexo+"\nIdade: "+idade;
    }
    public Pessoa oClone ()
    {
        return new Pessoa (nome, sexo, idade);
    }
}