import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeProduto {
    static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    public static void main(String[] agrs){
        int numero;
        boolean sair = false;
        while (true) {
            Scanner entrada = new Scanner(System.in);
            adicionaLista();
            System.out.println
                    ("-----------------------------------------\n"
                            + "-                  Produtos            -\n"
                            + "-                                      -\n"
                            + "----------------------------------------\n"
                            + "Digite o número do produto: \n");

            numero = entrada.nextInt();
            System.out.println(imprimirCodigo(numero));
        }
    }
    static void adicionaLista(){
        Produto a = new Produto(1,"Sul");
        Produto b = new Produto(2,"Norte");
        Produto c = new Produto(3,"Leste");
        Produto d = new Produto(4,"Oeste");
        Produto e = new Produto(5,"Nordeste");
        Produto f = new Produto(6,"Nordeste");
        Produto g = new Produto(7,"Sudeste");
        Produto h = new Produto(8,"Sudeste");
        Produto i = new Produto(9,"Sudeste");
        Produto j = new Produto(10,"Centro-Oeste");
        Produto k = new Produto(11,"Noroeste");
        listaProdutos.add(a);
        listaProdutos.add(b);
        listaProdutos.add(c);
        listaProdutos.add(d);
        listaProdutos.add(e);
        listaProdutos.add(f);
        listaProdutos.add(g);
        listaProdutos.add(h);
        listaProdutos.add(i);
        listaProdutos.add(j);
        listaProdutos.add(k);
    }
    static Object imprimirCodigo(int numero){
        Object produto = "Produto Internacional";
        for(Produto x : listaProdutos){
            if(x.getCodigo() == numero){
                return (x.getNome());
            }
        }
        return produto;
    }
}
