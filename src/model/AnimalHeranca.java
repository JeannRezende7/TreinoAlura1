package model;

public class AnimalHeranca {
    private  String nome;
    private int  idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public AnimalHeranca(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void latir (){
        System.out.println("AUAU");
    }

    public void fichaTecnica () {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

}
