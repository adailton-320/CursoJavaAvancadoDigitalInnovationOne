package Suplier;

import java.util.function.Supplier;

public class ExemSuplidores {
    public static void main (String[] args){
        Supplier<Pessoa> instanciaPessoa= () -> new Pessoa();
        System.out.println(instanciaPessoa.get());
    }
}

class Pessoa{
    private String nome;
    private Integer telefone;

    public Pessoa(){
        nome= "Jr";
        telefone = 996430209;

    }

    public String toString(){
        return String.format("Nome: %s, Telefone: %d " , nome, telefone);
    }



}

