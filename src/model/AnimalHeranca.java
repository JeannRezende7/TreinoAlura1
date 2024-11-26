package model;

public class AnimalHeranca {
    private  String nome;
    private int  idade;


    public AnimalHeranca(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void latir (){
        System.out.println("AUAU");
    }

    public void fichaTecnica (){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }

}
