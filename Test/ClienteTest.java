class ClienteTest {

    @Test
    void deveNotificarUmCliente() {
       Loja loja = new loja(2021, 1, "Algoritmos", "A");
        Cliente Cliente = new Cliente("Cliente 1");
        aluno.cadastro(loja);
        loja.lancarCadastro();
        assertEquals("Cliente 1, loja: loja cem}", Cliente.getcadastro());
    }
