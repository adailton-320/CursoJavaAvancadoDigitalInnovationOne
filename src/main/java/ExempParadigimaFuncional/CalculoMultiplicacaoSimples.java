package ExempParadigimaFuncional;

import java.util.function.UnaryOperator;

public class CalculoMultiplicacaoSimples {

    public static void main(String[] args){

        UnaryOperator<Integer> multiplicacao= valor-> valor*3;

        //int valor= 10;

        System.out.println("Valor da Multiplicação é = " + multiplicacao.apply(10));




    }
}
