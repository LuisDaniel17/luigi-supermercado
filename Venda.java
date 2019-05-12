
package luigi.s_supermercado.modelo;

public class Venda {
    private long id_venda;
    private double precoProduto;
    private String descricaoProduto;
    private String nomeFuncionario;

    public Venda() {
    }

    public Venda(double precoProduto, String descricaoProduto, String nomeFuncionario) {
        this.precoProduto = precoProduto;
        this.descricaoProduto = descricaoProduto;
        this.nomeFuncionario = nomeFuncionario;
    }

    public Venda(long id_venda, double precoProduto, String descricaoProduto, String nomeFuncionario) {
        this.id_venda = id_venda;
        this.precoProduto = precoProduto;
        this.descricaoProduto = descricaoProduto;
        this.nomeFuncionario = nomeFuncionario;
    }

    public long getId_venda() {
        return id_venda;
    }

    public void setId_venda(long id_venda) {
        this.id_venda = id_venda;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    
    
}
