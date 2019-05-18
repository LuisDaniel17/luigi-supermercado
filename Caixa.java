
package luigi.s_supermercado.modelo;

public class Caixa {
    private long id_venda;
     private long id_produto;
     private String desc_prod;
      private long id_funcionario;
      private String NomeDoFuncionario;
      private double preco_produto;
       private double  totalCompra;
    private double pagamento;
    private double troco;
    
    

    public Caixa() {
    }

    public Caixa(long id_produto, String desc_prod, long id_funcionario, String NomeDoFuncionario, double preco_produto, double totalCompra, double pagamento, double troco) {
        this.id_produto = id_produto;
        this.desc_prod = desc_prod;
        this.id_funcionario = id_funcionario;
        this.NomeDoFuncionario = NomeDoFuncionario;
        this.preco_produto = preco_produto;
        this.totalCompra = totalCompra;
        this.pagamento = pagamento;
        this.troco = troco;
    }

    public Caixa(long id_venda, long id_produto, String desc_prod, long id_funcionario, String NomeDoFuncionario, double preco_produto, double totalCompra, double pagamento, double troco) {
        this.id_venda = id_venda;
        this.id_produto = id_produto;
        this.desc_prod = desc_prod;
        this.id_funcionario = id_funcionario;
        this.NomeDoFuncionario = NomeDoFuncionario;
        this.preco_produto = preco_produto;
        this.totalCompra = totalCompra;
        this.pagamento = pagamento;
        this.troco = troco;
    }

    public double getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }

    public String getDesc_prod() {
        return desc_prod;
    }

    public void setDesc_prod(String desc_prod) {
        this.desc_prod = desc_prod;
    }

    public long getId_produto() {
        return id_produto;
    }

    public void setId_produto(long id_produto) {
        this.id_produto = id_produto;
    }

    public long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNomeDoFuncionario() {
        return NomeDoFuncionario;
    }

    public void setNomeDoFuncionario(String NomeDoFuncionario) {
        this.NomeDoFuncionario = NomeDoFuncionario;
    }
    
    

    public long getId_venda() {
        return id_venda;
    }

    public void setId_venda(long id_venda) {
        this.id_venda = id_venda;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
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
    
    
    
    
    
}

    