public class DVD extends Item {
    private String descricao;
    private int anoLancamento;

    public DVD(int id, String nome, double preco, String descricao, int anoLancamento) {
        super(id, nome, preco);
        this.descricao = descricao;
        this.anoLancamento = anoLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + " | Nome: " + getNome() + " | Preço: R$ " + getPreco() + " | Descrição: " + descricao + " | Ano de lançamento: " + anoLancamento;
    }
}
