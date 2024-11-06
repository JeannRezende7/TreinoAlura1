public class Perfil {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void  Saudacao () {
        System.out.println("Olá " + nome);
    }
}
