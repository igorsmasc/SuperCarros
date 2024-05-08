import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PraticandoAsserts {

    @Test
    public void praticandoAssertTrue() {
        Boolean condicao = true;
        Assert.assertTrue(condicao);
    }

    @Test
    public void praticandoAssertFalse() {
        Boolean condicao = false;
        Assert.assertFalse(condicao);
    }

    @Test
    public void praticandoAssertNull() {
        String nome = null;
        Assert.assertNull(nome);
    }

    @Test
    public void praticandoAssertNotNull() {
        String nome = "Pedro";
        Assert.assertNotNull(nome);
    }

    @Test
    public void praticandoAssertEquals_primitivos() {
        int a = 1;
        int b = 1;
        Assert.assertEquals(a, b);

        char a1 = 'a';
        char a2 = 'a';

        Assert.assertEquals(a1, a2);

        Assert.assertEquals(Math.PI, 3.141592, 0.000001);
    }

    @Test
    public void praticandoAssertEquals_objetos() {
        Pessoa p1 = new Pessoa("Ana", 22);
        Pessoa p2 = new Pessoa("Ana", 22);

        Assert.assertEquals(p1, p2);

        String s1 = "a";
        String s2 = new String("a");
        Assert.assertEquals(s1, s2);

        // s2.intern()
    }

    @Test
    public void praticandoAssertNotEquals() {
        int a = 1;
        int b = 2;

        Assert.assertNotEquals(a, b);
    }

    @Test
    public void praticandoAssertArrayEquals() {
        int[] a = new int[]{22, 23, 24};
        int[] b = new int[]{22, 23, 24};

        Assert.assertArrayEquals(a, b);
    }

    @Test
    public void assertSame() {
        Pessoa pessoa = new Pessoa("Ana", 22);
        Pessoa pessoa2 = pessoa;

        Assert.assertSame(pessoa, pessoa2);
    }

    @Test
    public void assertNotSame() {
        Pessoa pessoa = new Pessoa("Ana", 22);
        Pessoa pessoa2 = new Pessoa("Ana", 22);

        Assert.assertNotSame(pessoa, pessoa2);
    }

    @Test
    public void assertSame_String() {
        String s1 = "a";
        String s2 = "a";

        Assert.assertSame(s1, s2);
    }

    // assertThat - exception
}
