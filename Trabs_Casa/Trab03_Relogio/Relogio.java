/************************************************************************************/
/* Instituicao: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informatica e Estatistica                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 03                                                                                          */
/* Descricao: Software para simular relogio                                                          */
/*                                                                                                                           */

public class Relogio{
    private int segundos;
    
    public Relogio(){
        segundos = 0;
    }
    
    public Relogio(int hora, int minuto, int segundo){
        recebaHorario(hora,minuto,segundo);
    }
    
    public void recebaHorario(int hora, int minuto, int segundo){
        if(hora < 0) hora = 24 + hora;
        if(minuto < 0) minuto = 60 + minuto;
        if(segundo < 0) segundo = 60 + segundo;
        segundos = hora * 3600 + minuto * 60 + segundo;
        if(segundos >= (24 * 60 * 60)) segundos %= (24 * 60 * 60);
    }
    
    public String fornecaHorario(){
        int segundo = segundos % 60;
        int minuto = (segundos / 60) % 60;
        int hora = (segundos / 3600) % 24;
        return Integer.toString(hora) + ":" + Integer.toString(minuto) + ":" + Integer.toString(segundo);
    }
    
    public void tictac(){
        segundos++;
        if(segundos >= (24 * 60 * 60)) segundos = 0;
    }
    
    public int fornecaSegundos(){
        return segundos;
    }
}