package testenumeroparouimpar;
import java.util.Scanner;

public class TesteNumeroParOuImpar
{
    public static void main(String[] args)
    {
       Scanner entrada = new Scanner(System.in);
       int num;
       
       System.out.print("Digite um número: ");
       num = entrada.nextInt();
       
       if(num%2 == 0)
       {
           System.out.printf("O número %d é par!\n\n", num);
       }
       else
       {
           System.out.printf("O número %d é impar!\n\n", num);
       }
    }
}