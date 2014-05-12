package humanos;

/**
 *
 * @author Gustavo Tarciso
 */
public class Principal {

    public static void main(String[] args) 
    {
       Interface a = new Interface ();
       Pessoa p1 = new Pessoa ("ninguém", 'M', 0 );

       char resp = 'S';
       while (resp=='S')
       {
       a.peguePessoa ();
       resp = a.pecaOutro();
       }
    }
    
}
