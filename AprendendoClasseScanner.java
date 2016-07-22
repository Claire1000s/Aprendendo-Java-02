package aprendendoclassescanner;
import java.util.Scanner;
import java.util.Calendar;
        
public class AprendendoClasseScanner
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int idade;
        int anoAtual;
        int anoNascimento;
        
        System.out.print("Qual é a sua idade? ");
        idade = entrada.nextInt();
        
        Calendar calendario = Calendar.getInstance();
        
        anoAtual = calendario.get(Calendar.YEAR);
        anoNascimento = anoAtual - idade;
        
        System.out.printf("Sua idade é " + idade +"!\n");
        System.out.printf("Seu ano de nascimento é " + anoNascimento + "!\n\n");
    }
}