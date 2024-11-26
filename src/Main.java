import model.Cachorro;
import model.Gato;

public class Main {
    public static void main(String[] args) {

        Gato gato1 = new Gato("Gutim",15);
        gato1.fichaTecnica();
        Gato gato2 = new Gato("Zayon", 15);
        gato2.fichaTecnica();
        gato2.latir();

        Cachorro dog1 = new Cachorro("Tedy", 12);
        dog1.latir();

        System.out.println("Olá Mundo!");
        Perfil p = new Perfil();
        p.setNome("Jeann");
        p.Saudacao();
        Soma s = new Soma();
        s.Somar(10,10);
        Input i = new Input();
        i.lerEscrever();
        For f = new For();
        f.exemploFor();
        While w = new While();
        w.ExemploWhile(null);
        Switch sw = new Switch();
        sw.ExemploSwitch(1);
        FunctionProcedure fp = new FunctionProcedure();
        System.out.println("FunctionProcedure, Return: " + fp.somar(1,2));;
        fp.exibirResultado(10);

    }
}