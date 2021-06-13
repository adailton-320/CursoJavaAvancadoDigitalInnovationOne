package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes {
    public static void main(String[] args){



        //LISTA O ARRAY
        String[] arrayCarros= {"gol", "polo, palio", "corsa, jetta"};
        Stream.of(arrayCarros)
              // .forEach(lista-> System.out.println(lista))
                .forEach(System.out::println);



       //PESQUISA O ARRAY
//        String pesquisaArrayCarros= Stream.of(arrayCarros)
//                .filter(busca-> busca.equals("gol"))
//                .collect(Collectors.joining());
//
//        System.out.println("Carro pesquisado "+ pesquisaArrayCarros);
//        System.out.println("Carros cadastrados "+ arrayCarros);





//FILTRA PELA PRIMEIRA LETRA
//        List<String> listCarros= new ArrayList<>();
//        listCarros.add("gol");
//        listCarros.add("palio");
//        listCarros.add("vectra");
//        listCarros.add("punto");
//        listCarros.add("lamborghini");
//
//        listCarros.stream()
//                .filter(carro-> carro.startsWith("g"))
//                .forEach(System.out::println);





    }

    }

