import java.util.Scanner;

public class NumeroPositivoOuNegativo {
    public static void main(String[] args){
        float numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Verifica Se Numero é Positivo ou negativo");
        System.out.println("Digite um numero: ");
        numero = entrada.nextFloat();
        System.out.println(verificaNumeroPositivoOuNegativo(numero));
    }
    public static String verificaNumeroPositivoOuNegativo(float numero){
        String resultadoPositivoOuNegativo;

        if (numero >= 0){
            resultadoPositivoOuNegativo ="Numero Positivo";
        }
        else {
            resultadoPositivoOuNegativo = "Numero negativo";
        }
        return (resultadoPositivoOuNegativo);
    }
}
