package exercicioscannerecalendar;
import java.util.Scanner;
import java.util.Calendar;

public class ExercicioScannerECalendar
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();
        
        int anoAtual, anoNascimento, idade;
        
        System.out.print("Digite o ano do seu nascimento: ");
        anoNascimento = entrada.nextInt();
        
        anoAtual = calendario.get(Calendar.YEAR);
        
        idade = anoAtual - anoNascimento;
        
        System.out.printf("Sua idade é " + idade + "!\n\n");
    }
}