package humanos;

import javax.swing.JOptionPane;

public class Interface
{
    public Interface ()
    {
    }
    public Pessoa peguePessoa ()
    {
        String nome = JOptionPane.showInputDialog ("informe o nome da pessoa.");
        int idade;
        char sexo;
        do
        {
        String vSexo = JOptionPane.showInputDialog ("informe o sexo da pessoa");
        sexo = vSexo.charAt (0);
        sexo = Character.toUpperCase (sexo);
        if (sexo !='M'&& sexo!='F')
            JOptionPane.showMessageDialog (null, "sexo inválido");
        }
        while (sexo!= 'M' && sexo !='F');
        do
        {
            String vIdade = JOptionPane.showInputDialog ("informe a idade da pessoa");
            idade = Integer.parseInt (vIdade);
            if (idade < 0 || idade > 150)
                JOptionPane.showMessageDialog (null, "idade inválida");
        }
        while (idade < 0 || idade > 150);
        return new Pessoa (nome, sexo, idade);
    }
    public char pecaOutro ()
    {
        char resp = 'x';
        while (resp!='S' && resp!='N')
        {
            String v = JOptionPane.showInputDialog ("deseja incluir outra pessoa?");
            resp = v.charAt (0);
            resp = Character.toUpperCase (resp);
            if (resp!= 'S' && resp!= 'N')
                JOptionPane.showMessageDialog (null, "valor inválido");
        }
        return resp;
    }

}