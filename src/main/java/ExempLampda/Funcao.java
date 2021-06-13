package ExempLampda;

public class Funcao {

    public static void main(String[] args){
        Funcao1 funcao1= valor-> valor;
      String nick=  funcao1.gerar("Matrix");

      System.out.println("NickName: " + nick);


    }
}

interface Funcao1{
    String gerar(String valor);
}
