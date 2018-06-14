import java.util.Scanner;

public class NumeroInteiro {
    public static void main(String[] args){
        float numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Verifica Se Numero é Inteiro");
        System.out.println("Digite um numero: ");
        numero = entrada.nextFloat();
        System.out.println(verificaNumeroInteiro(numero));
    }
    public static String verificaNumeroInteiro(float numero){
        String ResultadoInteiro;
        if ((numero % 1) == 0){
            ResultadoInteiro = "Numero Inteiro";
        }else {
            ResultadoInteiro = "Numero Não é inteiro";
        }
        return(ResultadoInteiro);
    }
}