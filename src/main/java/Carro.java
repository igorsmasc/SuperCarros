public class Carro {
    private Boolean ligado;
    private Integer velocidadeAtual;
    private String dono;

    public void acelerar() {
        this.velocidadeAtual += 10;
    }

    public void ligarCarro() {
        this.ligado = false;
    }

    public void desligarCarro() {
        this.ligado = false;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
