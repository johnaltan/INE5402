/************************************************************************************/
/* Instituicao: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informatica e Estatistica                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 06                                                                                          */
/* Descricao: Software para simular concurso MegaSena                                      */
/*                                                                                                                           */

import javax.swing.JOptionPane;

public class Interface {
    public Interface(){}
    
    public static double pegueDouble(String msg){
        return Double.parseDouble(JOptionPane.showInputDialog(msg));
    }

    public static int pegueInt(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }

    public static String pegueString(String msg){
        return JOptionPane.showInputDialog(msg);
    }
    
    public static char pegueChar(String msg){
        return JOptionPane.showInputDialog(msg).charAt(0);
    }
    
    private static String pegueNome(){
        return pegueString("Informe o nome do apostador:");
    }
    
    private static char pegueSexo(){
        char vSexo;
        do{
            vSexo = Character.toUpperCase(pegueChar("Informe o sexo do apostador:"));
        } while(vSexo != 'M' && vSexo != 'F' && vSexo != 'O');
        return vSexo;
    }
    
    private static int pegueIdade(){
        return pegueInt("Informe a idade do apostador:");
    }
    
    private static int[] pegueApostas(){
        int n;
        do{
            n = Interface.pegueInt("Informe quantidade de numeros a apostar (entre 6 e 10 inclusive)");
        }while(n < 6 || n > 10);
        int[] apostados = new int[n];
        String msg = "Informe inteiro (entre 1 e 60 inclusive)";
        boolean aprovado;
        for(int i = 0; i < n; i++){
            do{
                do{
                    apostados[i] = Interface.pegueInt(msg);
                }while(apostados[i] < 1 || apostados[i] > 60);
                aprovado = true;
                for(int j = 0;j < i; j++){
                    if(apostados[j] == apostados[i]){
                            aprovado = false;
                            break;
                    }
                }
            }while(!aprovado);
            if(i == 0) msg += "\nQue nao seja: ";
            msg += apostados[i] + " ";
        }
        return apostados;
    }
    
    public static Apostador pegueApostador(){
        return new Apostador(Interface.pegueNome(),Interface.pegueSexo(),Interface.pegueIdade(),Interface.pegueApostas());
    }
    
    public static void mostreMsg(String msg){
        JOptionPane.showMessageDialog(null,msg);
    }
    
    public static void mostreResultadoApostador(Apostador apostador){
        String msg = "Apostador: " + apostador.informeNome() + "\nObteve " + apostador.informePontos() + " pontos";
        Interface.mostreMsg(msg);
    }
    
    public static void mostreResultadoConcurso(Concurso concurso){
        int[] n = concurso.informeSorteados();
        String msg = "Sorteados: ";
        for(int i = 0; i < n.length; i++) msg += n[i] + " ";
        msg += "\nConcurso arrecadou: R$ " + concurso.informeTotalArrecadado();
        Interface.mostreMsg(msg);
    }
    
    public static boolean temOutro(){
        int ret = JOptionPane.showConfirmDialog(null,"Inserir mais algum apostador?");
        if(ret == JOptionPane.OK_OPTION) return true;
        return false;
    }
}

























