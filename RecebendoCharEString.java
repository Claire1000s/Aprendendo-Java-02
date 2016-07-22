package recebendocharestring;
import java.util.Scanner;

public class RecebendoCharEString
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        char inicial;
        String nome;
        
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        
        System.out.print("Digite a inicial do seu nome: ");
        inicial = entrada.nextLine().charAt(0);
        
        System.out.printf("Seu nome é %s.\n", nome);
        System.out.printf("A inicial do seu nome é %c.\n\n", inicial);
    }
}