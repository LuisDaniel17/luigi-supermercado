
package luigi.s_supermercado.modelo;


public class Produto {
   private long id_produto;
   private String descricao;
   private double qtdEstoque;
   private String lote;
   private String dataFabricacao;
   private String dataValidade;
   private double precodeCusto;
   private double valordoLucro;
   private double valorTotal;

    public Produto() {
    }

    public Produto(String descricao, double qtdEstoque, String lote, String dataFabricacao, String dataValidade, double precodeCusto, double valordoLucro, double valorTotal) {
        this.descricao = descricao;
        this.qtdEstoque = qtdEstoque;
        this.lote = lote;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
        this.precodeCusto = precodeCusto;
        this.valordoLucro = valordoLucro;
        this.valorTotal = valorTotal;
    }

    public Produto(long id_produto, String descricao, double qtdEstoque, String lote, String dataFabricacao, String dataValidade, double precodeCusto, double valordoLucro, double valorTotal) {
        this.id_produto = id_produto;
        this.descricao = descricao;
        this.qtdEstoque = qtdEstoque;
        this.lote = lote;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
        this.precodeCusto = precodeCusto;
        this.valordoLucro = valordoLucro;
        this.valorTotal = valorTotal;
    }

    public long getId_produto() {
        return id_produto;
    }

    public void setId_produto(long id_produto) {
        this.id_produto = id_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(double qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getPrecodeCusto() {
        return precodeCusto;
    }

    public void setPrecodeCusto(double precodeCusto) {
        this.precodeCusto = precodeCusto;
    }

    public double getValordoLucro() {
        return valordoLucro;
    }

    public void setValordoLucro(double valordoLucro) {
        this.valordoLucro = valordoLucro;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
}
