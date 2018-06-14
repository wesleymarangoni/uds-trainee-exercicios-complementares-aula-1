import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Verifica Se Numero é Par ou Impar");
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        System.out.println(verificaNumeroParouImpar(numero));
    }
    public static String verificaNumeroParouImpar(int numero){
        String ResultadoParOuImpar;
        if(numero % 2 == 0)
            ResultadoParOuImpar ="O numero é par";
        else
            ResultadoParOuImpar = "O numero é impar";
        return(ResultadoParOuImpar);
    }
}
