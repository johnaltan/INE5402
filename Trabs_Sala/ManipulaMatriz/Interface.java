import javax.swing.JOptionPane;

public class Interface{
    public static int[][] pegueMatriz(){
        int lin = Interface.pegueInteiroPositivo("Digite n. de linhas");
        int col = Interface.pegueInteiroPositivo("Digite n. de colunas");
        int[][] mat = new int[lin][col];
        for(int i = 0; i < lin; i++)
            for(int j = 0; j < col; j++)
                mat[i][j] = Interface.pegueInteiro("Digite elemento [" + i + "," + j + "]");
        return mat;
    }
    
    public static int pegueInteiro(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
    
    public static int pegueInteiroPositivo(String msg){
        int valor = -1;
        msg += "\n(Deve ser inteiro positivo)";
        do
            valor = Integer.parseInt(JOptionPane.showInputDialog(msg));
        while(valor <= 0);
        return valor;
    }
    
    public static void mostreMatriz(int[][] a){
        String strMat = "Matriz: \n";
        int j;
        for(int i = 0; i < a.length; i++){
            for(j = 0; j < a[0].length; j++)
                strMat += Integer.toString(a[i][j]) + " ";
            strMat += "\n";
        }
        JOptionPane.showMessageDialog(null,strMat);
    }
    
    public static void mostreMensagem(String msg){
        JOptionPane.showMessageDialog(null,msg);
    }

}