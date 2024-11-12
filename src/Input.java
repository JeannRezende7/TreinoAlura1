import java.util.Scanner;


public class Input {
    String leitura;

    public void lerEscrever () {
     Scanner sc = new Scanner(System.in);
     System.out.println("Escreva alguma coisa?");
     leitura = sc.nextLine();
     System.out.println("Voce escreveu : "+leitura);

    }
}
