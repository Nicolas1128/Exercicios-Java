package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Digite os dados do produto! ");
        System.out.print("Nome: ");
            product.name = sc.nextLine();

        System.out.print("Preço: ");
            product.price = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
            product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + product);
        System.out.println();

        System.out.print("Digite a quantidade de produtos que deseja adicionar no estoque: ");
            int quantity = sc.nextInt();
            product.addProducts(quantity);

        System.out.println();
        System.out.println("Dados atualizados: " + product);
        System.out.println();

        System.out.print("Digite a quantidade de produtos que deseja remover do estoque: ");
            quantity = sc.nextInt();
            product.removeProducts(quantity);

        System.out.println();
        System.out.println("Dados atualizados: " + product);
        sc.close();
    }
}