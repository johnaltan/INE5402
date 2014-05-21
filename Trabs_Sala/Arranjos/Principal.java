public class Principal{
    public static void main (String[] args){
        int [] valores = new int[args.length];
        for(int i = 0; i < args.length;i++)
            valores[i] = Integer.parseInt(args[i]);
        int soma = 0;
        for(int cont = 0; cont < valores.length; cont++)
            soma += valores[cont];
        double media = soma / valores.length;
        int k = 0;
        for(int i = 0; i < valores.length; i++){
            if(valores[i] > media)
                k++;
        }
    }
   // System.out.println("Soma = " + soma + ", Superiores: " + k);
}