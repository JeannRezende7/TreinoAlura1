import java.util.Scanner;

public class While {

    public void ExemploWhile (Integer contador) {
        if (contador == null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um contador, ele irá contar até 10");
            contador = sc.nextInt();
        }
        while(contador < 10) {
            System.out.println("Exemplo WHILE "+contador);
            contador++;
        }
    }
}
