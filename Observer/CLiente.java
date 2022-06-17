public class Cliente implements Observer {

    private String nome;
    private String cadastro;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getcadastro() {
        return this.cadastro;
    }

    public void senha (loja loja) {
        loja.addObserver(this);
    }

    public void update(Observable loja, Object arg1) {
        this.cadastro = this.nome + ", Cadastro Cliente " +loja.toString();
        // System.out.println(this.cadastro);
    }
}
