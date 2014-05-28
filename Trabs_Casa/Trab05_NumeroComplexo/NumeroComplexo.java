/************************************************************************************/
/* Instituicao: Universidade Federal de Santa Catarina                                          */
/*                    Departamento de Informatica e Estatistica                                      */
/* Turma : 01208A                                                                                                 */
/* Autor: Johnaltan Ivon Neves - johnaltan@gmail.com                                          */
/*                                                                                                                           */
/* Projeto: Trabalho 05                                                                                          */
/* Descricao: Software para manipular numeros complexos                                    */
/*                                                                                                                           */

public class NumeroComplexo{
    private double real;
    private double imaginaria;
    
    public NumeroComplexo(double vReal, double vImaginaria){
        real = vReal;
        imaginaria = vImaginaria;
    }
    
    public double informeReal(){
        return real;
    }
    
    public double informeImaginaria(){
        return imaginaria;
    }
    
    public NumeroComplexo informeConjugado(){
        return new NumeroComplexo(real,0 - imaginaria);
    }
    
    public double informeModulo(){
        return Math.sqrt(real * real + imaginaria * imaginaria);
    }
    
    public NumeroComplexo some(NumeroComplexo outro){
        return new NumeroComplexo(real + outro.real,
                                                        imaginaria + outro.imaginaria);
    }
    
    public NumeroComplexo subtraia(NumeroComplexo outro){
        return new NumeroComplexo(real - outro.real,
                                                        imaginaria - outro.imaginaria);
    }
    
    public NumeroComplexo multiplique(NumeroComplexo outro){
        double realMult = real * outro.real - imaginaria * outro.imaginaria;
        double imaginariaMult = real * outro.imaginaria + imaginaria * outro.real;
        return new NumeroComplexo(realMult ,imaginariaMult);
    }
    
    public NumeroComplexo divida(NumeroComplexo outro){
        NumeroComplexo numerador = this.multiplique(outro.informeConjugado());
        double denomidador = outro.real * outro.real + outro.imaginaria * outro.imaginaria;
        double realDiv = numerador.real / denomidador;
        double imaginariaDiv = numerador.imaginaria / denomidador;
        return new NumeroComplexo(realDiv,imaginariaDiv);
    }
    
    public boolean eIgual(NumeroComplexo outro){
        return ((real == outro.real) && (imaginaria == outro.imaginaria));
    }
    
    public String toString(){
        String retorno = Double.toString(real);
        if(imaginaria >= 0) retorno += "+";
        retorno += Double.toString(imaginaria) + "i";
        return retorno;
    }
    
}