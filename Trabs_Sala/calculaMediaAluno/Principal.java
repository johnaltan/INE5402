public class Principal{
    public static void main(String[] args){
        Interface aInterface = new Interface();
        Aluno umAluno = aInterface.pegueAluno();
        /*Aluno outroAluno = aInterface.pegueAluno();
        aInterface.mostraMedia(umAluno);
        aInterface.mostraMedia(outroAluno);*/
        int t;
            for (t = 0;t < 5000; t++){
                umAluno = new Aluno(Integer.toString(t),t);
            }
        while (true){
            //try{
            //Thread.sleep(10000);
            //System.out.println(Integer.MAX_VALUE);
            //System.gc();
            //Thread.sleep(10000);
            //System.out.println(Integer.MIN_VALUE);
            //}catch(Exception e){}
        }
    }
}