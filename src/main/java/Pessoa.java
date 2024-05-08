import java.util.Objects;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Carro carro;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, Integer idade, Carro carro) {
        this.nome = nome;
        this.idade = idade;
        this.carro = carro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(idade, pessoa.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, carro);
    }
}
