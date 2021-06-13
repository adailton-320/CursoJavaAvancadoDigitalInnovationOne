package Consume;

import java.util.function.Consumer;

public class exempConsume {
    public static void main (String[] args){
        Consumer<String> imprimir= frase-> System.out.println(frase);
        imprimir.accept("Hello Word");
    }
}
