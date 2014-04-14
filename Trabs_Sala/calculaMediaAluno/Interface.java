import javax.swing.JOptionPane;

public class Interface{
    public Interface(){
    }
    
    public String pedeNome(){
        return JOptionPane.showInputDialog(null,"Informe o nome do aluno:");
    }
    
    public double pedeNota(int nNota){
        double ret = -1;
        do{
            try{
                ret = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a " + nNota + "� nota do aluno (separado por ponto)","Responda-me",JOptionPane.INFORMATION_MESSAGE));
        }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Voc� n�o est� colaborando !!!\nAntes de ir me d� um valor v�lido !!!","Preciso calcular !!!", JOptionPane.ERROR_MESSAGE);
            }
        } while (ret < 0);
        return ret;
    }
    
    public void mostraMedia(Aluno oAluno){
        JOptionPane.showMessageDialog(null,"A m�dia  do(a) " + oAluno.informaNome() + " �: \n" + Double.toString(oAluno.informaMedia())
            + "\n Sendo N1: " + oAluno.informaNotas(0) + ", N2: " + oAluno.informaNotas(1) + " e N3: " + oAluno.informaNotas(2) + ".\nE a media das duas primeiras notas �: "
            + Double.toString(oAluno.informaMedia(2)));
    }
    
    public Aluno pegueAluno(){
        String nome = this.pedeNome();
        Aluno aluno = new Aluno(nome);
        aluno.recebaValorNotas(this.pedeNota(1));aluno.recebaValorNotas(this.pedeNota(2));aluno.recebaValorNotas(this.pedeNota(3));
        return aluno;
    }
}