import model.Cachorro;
import model.Gato;

import java.util.ArrayList;

/**
 * Classe principal para estudo, contendo exemplos de manipulação de objetos, coleções, e controle de fluxo.
 */
public class Main {
    public static void main(String[] args) {

        // ===== Exemplo com objetos Gato =====
        Gato gato1 = new Gato("Gutim", 15);
        gato1.fichaTecnica();

        Gato gato2 = new Gato("Zayon", 15);
        gato2.fichaTecnica();
        gato2.latir();

        ArrayList<Gato> listaGato = new ArrayList<>();
        listaGato.add(gato1);
        listaGato.add(gato2);
        System.out.println(listaGato.get(0).getNome());

        // ===== Exemplo com objeto Cachorro =====
        Cachorro dog1 = new Cachorro("Tedy", 12);
        dog1.latir();

        // ===== Exemplo de saída no console =====
        System.out.println("Olá Mundo!");

        // ===== Exemplo com perfil =====
        Perfil p = new Perfil();
        p.setNome("Jeann");
        p.Saudacao();

        // ===== Exemplo de operação de soma =====
        Soma s = new Soma();
        s.Somar(10, 10);

        // ===== Exemplo de entrada e saída =====
        Input i = new Input();
        i.lerEscrever();

        // ===== Exemplo de estruturas de repetição =====
        For f = new For();
        f.exemploFor();

        While w = new While();
        w.ExemploWhile(null);

        // ===== Exemplo de estrutura condicional (switch) =====
        Switch sw = new Switch();
        sw.ExemploSwitch(1);

        // ===== Exemplo de funções e procedimentos =====
        FunctionProcedure fp = new FunctionProcedure();
        System.out.println("FunctionProcedure, Return: " + fp.somar(1, 2));
        fp.exibirResultado(10);
    }
}
