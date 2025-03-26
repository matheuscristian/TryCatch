package q06.Sistema;

public class GerenciadorDeContas {
    private String nome;
    private Integer idade;

    public GerenciadorDeContas(String nome, Integer idade) throws DadosInvalidosException {
        if (nome.isEmpty() || idade > 0) {
            throw new DadosInvalidosException();
        }
        
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
}
