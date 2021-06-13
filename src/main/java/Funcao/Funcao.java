package Funcao;

import java.util.function.Function;

public class Funcao {
    public static void main (String[] args){
        Function<String, String> retornaNome= texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornaNome.apply("adailtoN"));

        Function<String, Integer> converteIntMul= resultado-> Integer.valueOf(resultado)*2;
        System.out.println(converteIntMul.apply("20"));


    }
}
