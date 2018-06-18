import java.util.Scanner;

public class Main {
    private static int valorAuxiliar;
    public static void main(String[] args) {
        float saldo = 1500;

        menu(saldo,0);

    }

    private static void verificaSaldo(float saldo, float valor) {
        if (saldo < valor){
            System.out.println("Saldo Insuficiente");
            menu(saldo,0);
        }
    }

    public static void motos(float saldo, int escolhaCategoria) {
        System.out.println("         SALDO: " + saldo + " \n " +
                "1 -- MOTO RAPIDA - 500" + " \n " +
                "2 -- MOTO BONITA - 460" + " \n " +
                "3 -- MOTO PEQUENA - 150" + " \n " +
                "4 -- MOTO CONFORTAVEL - 320" + " \n " +
                "5 -- MOTO DE LUXO  - 160" + " \n "
        );
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma MOTOCA");
        escolhaCategoria = 0;
        escolhaCategoria = entrada.nextInt();
        switch(escolhaCategoria){
            case 1:  valorAuxiliar = 500; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 2:  valorAuxiliar = 460; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 3:  valorAuxiliar = 150; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 4:  valorAuxiliar = 320; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 5:  valorAuxiliar = 160; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
        }
    }



    public static void criptomoedas(float saldo, int escolhaCategoria) {
        System.out.println("         SALDO: " + saldo + " \n " +
                "1 -- BITCOIN - 100" + " \n " +
                "2 -- DOGE - 960" + " \n " +
                "3 -- NIOBIO - 350" + " \n " +
                "4 -- LITECOIN - 220" + " \n " +
                "5 -- MONERO  - 360" + " \n "
        );
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha umaa CRIPTO");
        escolhaCategoria = 0;
        escolhaCategoria = entrada.nextInt();
        switch(escolhaCategoria){
            case 1:  valorAuxiliar = 100; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 2:  valorAuxiliar = 960; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 3:  valorAuxiliar = 350; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 4:  valorAuxiliar = 220; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 5:  valorAuxiliar = 360; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);;
        }
    }
    public static void times(float saldo, int escolhaCategoria) {
        System.out.println("         SALDO: " + saldo + " \n " +
                "1 -- SANTOS - 1200" + " \n " +
                "2 -- PALMEIRAS - 260" + " \n " +
                "3 -- PARANÁ - 700" + " \n " +
                "4 -- CORITIBA - 290" + " \n " +
                "5 -- CRUZEIRO  - 300" + " \n "
        );
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma TIME");
        escolhaCategoria = 0;
        escolhaCategoria = entrada.nextInt();
        switch(escolhaCategoria){
            case 1:  valorAuxiliar = 1200; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 2:  valorAuxiliar = 260; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 3:  valorAuxiliar = 700; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 4:  valorAuxiliar = 290; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 5:  valorAuxiliar = 300; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
        }
    }
    public static void selecoes(float saldo, int escolhaCategoria) {
        System.out.println("         SALDO: " + saldo + " \n " +
                "1 -- BRASIL - 100" + " \n " +
                "2 -- ALEMANHA - 460" + " \n " +
                "3 -- SUECIA - 300" + " \n " +
                "4 -- BELGICA - 870" + " \n " +
                "5 -- PORTUGAL  - 400" + " \n "
        );
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma SELEÇAO");
        escolhaCategoria = 0;
        escolhaCategoria = entrada.nextInt();
        switch(escolhaCategoria){
            case 1:  valorAuxiliar = 100; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 2:  valorAuxiliar = 460; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 3:  valorAuxiliar = 300; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 4:  valorAuxiliar = 870; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 5:  valorAuxiliar = 400; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
        }
    }

    public static void carros(float saldo, int escolhaCategoria) {
        System.out.println("         SALDO: " + saldo + " \n " +
                "1 -- CARRO RAPIDO - 200" + " \n " +
                "2 -- CARRO BONITO - 400" + " \n " +
                "3 -- CARRO PEQUENO - 850" + " \n " +
                "4 -- CARRO CONFORTAVEL - 300" + " \n " +
                "5 -- CARRO DE LUXO  - 500" + " \n "
        );
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um CARRO");
        escolhaCategoria = 0;
        escolhaCategoria = entrada.nextInt();
        switch(escolhaCategoria){
            case 1:  valorAuxiliar = 200; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 2:  valorAuxiliar = 400; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 3:  valorAuxiliar = 850; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 4:  valorAuxiliar = 300; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
            case 5:  valorAuxiliar = 500; verificaSaldo(saldo,valorAuxiliar); menu(saldo -= valorAuxiliar, escolhaCategoria);
        }

    }
    private static void menu(float saldo, int escolhaCategoria) {

        System.out.println("         SALDO: " + saldo + " \n " +
                "1 -- CARROS" + "\n" +
                "2 -- MOTOS" + "\n" +
                "3 -- CRIPTOMOEDAS" + "\n" +
                "4 -- TIMES" + "\n" +
                "5 -- SELEÇÕES" + "\n" +
                "0 -- SAIR" + "\n");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecione uma Categoria");
        escolhaCategoria = entrada.nextInt();
        switch (escolhaCategoria) {
            case 0:
                System.exit(0);
            case 1:
                carros(saldo, escolhaCategoria);
            case 2:
                motos(saldo, escolhaCategoria);
            case 3:
                criptomoedas(saldo, escolhaCategoria);
            case 4:
                times(saldo, escolhaCategoria);
            case 5:
                selecoes(saldo, escolhaCategoria);
        }
    }
}

