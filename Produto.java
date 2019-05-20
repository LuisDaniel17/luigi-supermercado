
package luigi.s_supermercado.modelo;


public class Produto {
   private long id_produto;
   private String descricao;
   private double qtddisponivel;
   private String lote;
   private String dtvalidade ;
   private String dtfabricacao ;
   private double preco_custo;
   private double valor_lucro;
   private double valor_total;

    public Produto() {
    }

    public Produto(String descricao, double qtddisponivel, String lote, String dtvalidade, String dtfabricacao, double preco_custo, double valor_lucro, double valor_total) {
        this.descricao = descricao;
        this.qtddisponivel = qtddisponivel;
        this.lote = lote;
        this.dtvalidade = dtvalidade;
        this.dtfabricacao = dtfabricacao;
        this.preco_custo = preco_custo;
        this.valor_lucro = valor_lucro;
        this.valor_total = valor_total;
    }

    public Produto(long id_produto, String descricao, double qtddisponivel, String lote, String dtvalidade, String dtfabricacao, double preco_custo, double valor_lucro, double valor_total) {
        this.id_produto = id_produto;
        this.descricao = descricao;
        this.qtddisponivel = qtddisponivel;
        this.lote = lote;
        this.dtvalidade = dtvalidade;
        this.dtfabricacao = dtfabricacao;
        this.preco_custo = preco_custo;
        this.valor_lucro = valor_lucro;
        this.valor_total = valor_total;
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

    public double getQtddisponivel() {
        return qtddisponivel;
    }

    public void setQtddisponivel(double qtddisponivel) {
        this.qtddisponivel = qtddisponivel;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getDtvalidade() {
        return dtvalidade;
    }

    public void setDtvalidade(String dtvalidade) {
        this.dtvalidade = dtvalidade;
    }

    public String getDtfabricacao() {
        return dtfabricacao;
    }

    public void setDtfabricacao(String dtfabricacao) {
        this.dtfabricacao = dtfabricacao;
    }

    public double getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(double preco_custo) {
        this.preco_custo = preco_custo;
    }

    public double getValor_lucro() {
        return valor_lucro;
    }

    public void setValor_lucro(double valor_lucro) {
        this.valor_lucro = valor_lucro;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    

     @Override
    public String toString() {
    return "tb_produtos [ id_produto: " + id_produto + " descricao: " + descricao + " qtddisponivel: " + qtddisponivel + " dtvalidade : " + dtvalidade + " dtfabricacao: " + dtfabricacao + " lote: " + lote + " preco_custo: " + preco_custo + " valor_lucro: " + valor_lucro + " valor_total " + valor_total + "]";
}
    
}
