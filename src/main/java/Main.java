public class Main {
    /**
     *
     * Criar um carro com os atributos:
     *  - modelo
     *  - ligado
     *  - velocidadeAtual
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Ligar/Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual
     *
     * Regras:
     * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
     * - Só podemos realizar as ações com o carro ligado
     * - A velocidade máxima do nosso carro é de 100km/h
     * - Não existe velocidade negativa
     * - Acelerar + 10km/h (Aumenta 10)
     * - Frear - 10km/h (Diminui 10)
     *
     */

    public static void main(String[] args) {

        // Gherkin
        // Given (Dado) - When (Quando) - Then (Então)
        testeDeveLigarCorretamente();
        testeDeveDesligarCorretamente();

    }

    public static void testeDeveLigarCorretamente() {
        // Teste 01 - Validar se o carro liga corretamente
        // Given
        Carro carro = new Carro();
        // When
        carro.ligarCarro();
        // Then
        System.out.println("testeDeveLigarCorretamente: " + carro.getLigado());
    }

    public static void testeDeveDesligarCorretamente() {
        // Given
        Carro carro = new Carro();
        carro.ligarCarro();

        // When
        carro.desligarCarro();

        // Then
        System.out.println("testeDeveDesligarCorretamente: " + (carro.getLigado() == false));
    }

    public static void testeDeveAcelerarCorretamete() {
        // Dado
        // carro ligado

        // Quando
        // acelerar

        // Entao
        // velocidade == ?
    }
}
