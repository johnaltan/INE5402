import javax.swing.JOptionPane;

public class Interface {
    public Interface(){}
    
    private double pegueNota(String msg){
        double nota = -1.0;
        while(nota < 0.0 || nota > 10.0){
            String valor = JOptionPane.showInputDialog(msg);
            nota = Double.parseDouble(valor);
            
        }
        return nota;
    }

    
}

























