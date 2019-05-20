
package luigi.s_supermercado.modelo;

public class Caixaa {
    private long id_venda;
    private long id_produto;
    private String descricao_produto;
    private long id_funcionario;
    private String nome_funcionario;
    private double preco_produto;
    private double  total_compra;
    private double pagamento;
    private double troco;
    
    

    public Caixaa() {
    }

    public Caixaa(long id_produto, String descricao_produto, long id_funcionario, String nome_funcionario, double preco_produto, double total_compra, double pagamento, double troco) {
        this.id_produto = id_produto;
        this.descricao_produto = descricao_produto;
        this.id_funcionario = id_funcionario;
        this.nome_funcionario = nome_funcionario;
        this.preco_produto = preco_produto;
        this.total_compra = total_compra;
        this.pagamento = pagamento;
        this.troco = troco;
    }

    public Caixaa(long id_venda, long id_produto, String descricao_produto, long id_funcionario, String nome_funcionario, double preco_produto, double total_compra, double pagamento, double troco) {
        this.id_venda = id_venda;
        this.id_produto = id_produto;
        this.descricao_produto = descricao_produto;
        this.id_funcionario = id_funcionario;
        this.nome_funcionario = nome_funcionario;
        this.preco_produto = preco_produto;
        this.total_compra = total_compra;
        this.pagamento = pagamento;
        this.troco = troco;
    }

    public long getId_venda() {
        return id_venda;
    }

    public void setId_venda(long id_venda) {
        this.id_venda = id_venda;
    }

    public long getId_produto() {
        return id_produto;
    }

    public void setId_produto(long id_produto) {
        this.id_produto = id_produto;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public double getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }

    public double getTotal_compra() {
        return total_compra;
    }

    public void setTotal_compra(double total_compra) {
        this.total_compra = total_compra;
    }

    public double getPagamento() {
        return pagamento;
    }

    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }




    
    
    @Override
    public String toString() {
    return "tb_caixa [ id_venda: " + id_venda + " id_produto: " + id_produto + " descricao_produto: " + descricao_produto + " id_funcionario: " + id_funcionario + " nome_funcionario: " + nome_funcionario + " preco_produto: " + preco_produto + " total_compra: " + total_compra + " pagamento: " + pagamento + " troco: " + troco + "]";
            }
    
    
}

    