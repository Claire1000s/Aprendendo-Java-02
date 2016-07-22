package felizanonovo;
import java.io.IOException;

public class FelizAnoNovo
{
    public static void main(String[] args) throws IOException
    {
        int i;
        
        for(i = 10; i >= 0; i--)
        {
            System.out.println(i);
            System.in.read();
        }
        System.out.println("Feliz Ano novo!\n");
    }
}