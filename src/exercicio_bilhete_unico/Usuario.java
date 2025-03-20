package exercicio_bilhete_unico;

public class Usuario {
    String nome;
    long cpf;
    String perfil;

    public Usuario(long cpf, String nome, String perfil){
        this.nome = nome;
        this.cpf = cpf;
        this.perfil = perfil;
    }
}
