import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // define a localidade dos Estados Unidos, logo troca a virgula pelo ponto (variavel z)
        Scanner sc = new Scanner(System.in);

    String x;
    x = sc.next();   //.next(); = para ler uma palavra(texto sem espaco)
    System.out.println("Voce digitou: " +x);
    int y;
    y = sc.nextInt();  //.nextInt(); = para ler numeros inteiros
    System.out.println("Voce digitou: " +y);
    double z;
    z = sc.nextDouble();  //.nextDouble(); = para ler numeros com pontos flutuantes
    System.out.println("Voce digitou: " +z);
    char c;
    c = sc.next().charAt(0);  //.next().charAt(0); = para ler um caractere
        System.out.println("Voce digitou: " +c); // faz somente a leitura da primeira letra
        String l;
        int m;
        double n;
        l = sc.next();
        m = sc.nextInt();
        n = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);      //digitar todos os dados na mesma linha

        sc.close();

    }
}