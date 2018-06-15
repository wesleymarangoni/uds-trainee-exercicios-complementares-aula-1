import java.util.Scanner;

public class NumeroPositivoOuNegativo {
    public static void main(String[] args){
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Verifica Se Numero é Positivo ou negativo");
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        System.out.println(verificaNumeroPositivoOuNegativo(numero));
    }
    public static String verificaNumeroPositivoOuNegativo(int numero){
        String resultadoPositivoOuNegativo = "Numero negativo";

        if (numero >= 0){
            resultadoPositivoOuNegativo ="Numero Positivo";
        }  
        return (resultadoPositivoOuNegativo);
    }
}
