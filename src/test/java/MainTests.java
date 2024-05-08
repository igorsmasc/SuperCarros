import org.junit.Assert;
import org.junit.Test;

public class MainTests {

    // TestEngine -> DiscoverTest

    @Test
    public void testeDeveLigarCorretamente() {
        // Teste 01 - Validar se o carro liga corretamente
        // Given
        Carro carro = new Carro();
        // When
        carro.ligarCarro();
        // Then
        Assert.assertTrue(carro.getLigado());
    }

    @Test
    public void testeTodoIniciaDesligado() {

    }
}
