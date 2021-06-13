package FuncaoAltaOrdem;

public class ExempAltaOrdem {
    public static void main(String[] args){

        Calculo soma= (a , b)-> a+b;
        Calculo subtrair= (a, b)-> a-b;
        Calculo multiplcacao= (a, b)-> a*b;
        Calculo divisao= (a, b)-> a/b;
        Calculo restoDivisao= (a, b)-> a%b;



        System.out.println(executarCalculo(soma, 1, 5));
        System.out.println(executarCalculo(subtrair, 1,5));
        System.out.println(executarCalculo(multiplcacao, 1,5));
        System.out.println(executarCalculo(divisao, 1,5));
        System.out.println(executarCalculo(restoDivisao, 1,5));

    }
    //METODO QUE EXECUTA A ACAO.
    public static int executarCalculo(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }
}
//METODO INTERFACE.
interface Calculo{

    public int calcular(int a, int b );



}