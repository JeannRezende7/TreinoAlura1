package model;

public class Gato extends AnimalHeranca {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void latir() {
        System.out.println("Miau");
    }
}
