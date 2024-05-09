import org.junit.Assert;
import org.junit.Test;

public class NovosTestesUnitarios {

    @Test
    public void verificarOperacaoMatematica() {
        Assert.assertTrue(2 + 2 == 4);
    }

    @Test
    public void verificarComparacaoString() {
        Assert.assertTrue("texto".equals("texto"));
    }

    @Test
    public void verificarCondicaoFalsa() {
        int numero = 5;
        Assert.assertFalse(numero > 10);
    }

    @Test
    public void verificarComparacaoIncorreta() {
        Assert.assertFalse("um".equals("dois"));
    }

    @Test
    public void objetoDeveSerNulo() {
        Object objeto = null;
        Assert.assertNull(objeto);
    }

    @Test
    public void objetoNaoDeveSerNulo() {
        Object objeto = new Object();
        Assert.assertNotNull(objeto);
    }

    @Test
    public void compararValoresDouble() {
        Assert.assertEquals(10.0, 5.0 + 5.0, 0.0);
    }

    @Test
    public void compararValoresBoolean() {
        boolean verdadeiro = true;
        Assert.assertEquals(verdadeiro, true);
    }

    @Test
    public void compararObjetosCidade() {
        Cidade cidade1 = new Cidade("Rio de Janeiro");
        Cidade cidade2 = new Cidade("Rio de Janeiro");
        Assert.assertEquals(cidade1, cidade2);
    }

    @Test
    public void compararObjetosUsuario() {
        Usuario usuario1 = new Usuario("usuario@exemplo.com");
        Usuario usuario2 = new Usuario("usuario@exemplo.com");
        Assert.assertEquals(usuario1, usuario2);
    }

    @Test
    public void verificarArraysIguais() {
        char[] array1 = {'a', 'b', 'c'};
        char[] array2 = {'a', 'b', 'c'};
        Assert.assertArrayEquals(array1, array2);
    }

    @Test
    public void doisObjetosMesmo() {
        Cidade cidade = new Cidade("São Paulo");
        Cidade mesmaCidade = cidade;
        Assert.assertSame(cidade, mesmaCidade);
    }

    @Test
    public void doisObjetosNaoSaoOMesmo() {
        Cidade cidade1 = new Cidade("Salvador");
        Cidade cidade2 = new Cidade("Salvador");
        Assert.assertNotSame(cidade1, cidade2);
    }

    // Classes auxiliares para testes
    class Cidade {
        private String nome;

        public Cidade(String nome) {
            this.nome = nome;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Cidade cidade = (Cidade) obj;
            return nome != null ? nome.equals(cidade.nome) : cidade.nome == null;
        }
    }

    class Usuario {
        private String email;

        public Usuario(String email) {
            this.email = email;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Usuario usuario = (Usuario) obj;
            return email != null ? email.equals(usuario.email) : usuario.email == null;
        }
    }
}
