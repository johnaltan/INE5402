public class Exemplo{
    public static void main(String[] p){
        Interface i = new Interface();
        Relogio r1 = new Relogio();
        //aqui r1 representa um relogio que marca 0:0:0
        Relogio r2 = new Relogio(11,59,59);
        //aqui r2 representa um relogio que marca 11:59:59
        String horario = r2.fornecaHorario();
        //horario = "11:59:59"
        r2.tictac();
        //aqui r2 marca 12:0:0
        Relogio r3 = new Relogio(23,59,59);
        //aqui r3 marca 23:59:59
        r3.tictac();
        r3.tictac();
        //aqui r3 marca 0:0:1
        .
        .
        .
    }

}
