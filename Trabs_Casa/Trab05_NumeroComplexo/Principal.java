/************************************************************************************/
/* Instituicao: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informatica e Estatistica                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 05                                                                                          */
/* Descricao: Software para manipular numeros complexos                                    */
/*                                                                                                                           */

public class Principal{
    public static void main(String[] args){ 
        NumeroComplexo num = new NumeroComplexo(2,3);
        NumeroComplexo outro = new NumeroComplexo(-8,1);
        
        
        System.out.println("String (num) = " + num);
        System.out.println("String (outro) = " + outro);
        System.out.println("Real = " + num.informeReal());
        System.out.println("Imaginaria = " + num.informeImaginaria());
        System.out.println("Conjugado = " + num.informeConjugado());
        System.out.println("Soma = " + num.some(outro));
        System.out.println("Subtraia = " + num.subtraia(outro));
        System.out.println("Multiplique = " + num.multiplique(outro));
        System.out.println("Divida = " + num.divida(outro));
        System.out.println("Modulo = " + num.informeModulo());
        System.out.println("Eh igual = " + num.eIgual(outro));
        
    }
    
    
}