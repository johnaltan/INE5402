import javax.swing.JOptionPane;

public class Interface {
	
	public Interface() {
	}
	
	public double pegueValor(String msg){
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
	public void mostreValor(String msg, double valor){
		JOptionPane.showMessageDialog(null,msg + valor);
	}
	
}