
package luigi.s_supermercado.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import luigi.s_supermercado.modelo.Caixa;
import luigi.s_supermercado.modelo.Funcionario;
import luigi.s_supermercado.modelo.Login;
import luigi.s_supermercado.modelo.Produto;







public class  SupermercadoDao {
    
    

    
     
    
      public void adicionarf (Funcionario f) throws Exception{
        String sql = "INSERT INTO tb_funcionario (id_funcionario, nome, logradouro, numero, bairro, cidade, complemento, cep, estado, telefone, celular, cpf, rg, setor, salario, email, sexo, datadenascimento, cargo) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        String connectionString = "jdbc:postgresql://localhost:5432/SupermercadoL";
        String usuario = "luigi";
        String senha = "yoshi";
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(connectionString, usuario, senha);
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, f.getId_funcionario());
        statement.setString(2, f.getNome());
        statement.setString(3, f.getLogradouro());
        statement.setString(4, f.getNumero());
        statement.setString(5, f.getBairro());
        statement.setString(6, f.getCidade());
        statement.setString(7, f.getComplemento());
        statement.setString(8, f.getCep());
        statement.setString(9, f.getEstado());
        statement.setString(10, f.getTelefone());
        statement.setString(11, f.getCelular());
        statement.setString(12, f.getCpf());
        statement.setString(13, f.getRg());
        statement.setString(14, f.getSetor());
        statement.setDouble(15, f.getSalario());
        statement.setString(16, f.getEmail());
        statement.setString(17, f.getSexo());
        statement.setString(18, f.getDatadenascimento());
        statement.setString(19, f.getCargo());
        statement.execute();
        statement.close();
        connection.close();
    }
      
          public void removerf(Funcionario f) throws Exception{
        String sql = "DELETE FROM tb_funcionario WHERE id_funcionario = ? ;";
        String connectionString = "jdbc:postgresql://localhost:5432/SupermercadoL";
        String usuario = "luigi";
        String senha = "yoshi";
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(connectionString, usuario, senha);
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, f.getId_funcionario());
        statement.executeUpdate();
        statement.close();
        connection.close();
    }
          
        public void atualizarf(Funcionario f) throws Exception{
        String sql = "UPDATE  tb_funcionario SET nome=?, logradouro=?, numero=?, bairro=?, cidade=?, complemento=?, cep=?, estado=?, telefone=?, celular=?, cpf=?, rg=?, setor=?, salario=?, email=?, sexo=?, datadenascimento=?, cargo=? WHERE id_funcionario = ?;";
        String connectionString = "jdbc:postgresql://localhost:5432/SupermercadoL";
        String usuario = "luigi";
        String senha = "yoshi";
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(connectionString, usuario, senha);
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, f.getNome());
        statement.setString(2, f.getLogradouro());
        statement.setString(3, f.getNumero());
        statement.setString(4, f.getBairro());
        statement.setString(5, f.getCidade());
        statement.setString(6, f.getComplemento());
        statement.setString(7, f.getCep());
        statement.setString(8, f.getEstado());
        statement.setString(9, f.getTelefone());
        statement.setString(10, f.getCelular());
        statement.setString(11, f.getCpf());
        statement.setString(12, f.getRg());
        statement.setString(13, f.getSetor());
        statement.setDouble(14, f.getSalario());
        statement.setString(15, f.getEmail());
        statement.setString(16, f.getSexo());
        statement.setString(17, f.getDatadenascimento());
        statement.setString(18, f.getCargo());
        statement.setLong(19, 20);
        statement.execute();
        statement.close();
        connection.close();
        
        }
        

        
        public Funcionario buscarf(int idFuncionario) throws Exception{ 
            Funcionario f = new Funcionario();	
            String sql = "SELECT * FROM tb_funcionario WHERE id_funcionario = ?  ;" ;
            String connectionString = "jdbc:postgresql://localhost:5432/SupermercadoL";
            String usuario = "luigi";
            String senha = "yoshi";
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(connectionString, usuario, senha); 
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, idFuncionario);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
            f.setId_funcionario(resultSet.getLong("id_funcionario"));
            f.setNome(resultSet.getString("nome"));
            f.setLogradouro(resultSet.getString("logradouro"));
            f.setNumero(resultSet.getString("numero"));
            f.setBairro(resultSet.getString("bairro"));
            f.setCidade(resultSet.getString("cidade"));
            f.setComplemento(resultSet.getString("complemento"));
            f.setCep(resultSet.getString("cep"));
            f.setEstado(resultSet.getString("estado"));
            f.setTelefone(resultSet.getString("telefone"));
            f.setCelular(resultSet.getString("celular"));
            f.setCpf(resultSet.getString("cpf"));
            f.setRg(resultSet.getString("rg"));
            f.setSetor(resultSet.getString("setor"));
            f.setSalario(resultSet.getDouble("salario"));
            f.setEmail(resultSet.getString("email"));
            f.setSexo(resultSet.getString("sexo"));
            f.setDatadenascimento(resultSet.getString("datadenascimento"));
            f.setCargo(resultSet.getString("cargo"));
            }
        statement.close();
        connection.close();
        return f;

    }
    
          public void adicionarp (Produto p) throws Exception{
        String sql = "INSERT INTO tb_produtos (id_produto, descricao, qtddisponivel, dtvalidade, dtfabricacao, lote, preco_custo, valor_lucro, valor_total) VALUES(?,?,?,?,?,?,?,?,?);";
        String connectionString = "jdbc:postgresql://localhost:5432/SupermercadoL";
        String usuario = "luigi";
        String senha = "yoshi";
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(connectionString, usuario, senha);
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, p.getId_produto());
        statement.setString(2, p.getDescricao());
        statement.setDouble(3, p.getQtddisponivel());
        statement.setString(4, p.getDtvalidade());
        statement.setString(5, p.getDtfabricacao());
        statement.setString(6, p.getLote());
        statement.setDouble(7, p.getPreco_custo());
        statement.setDouble(8, p.getValor_lucro());
        statement.setDouble(9, p.getValor_total());
        statement.execute();
        statement.close();
        connection.close();
    }

     public Produto buscarp(Produto p) throws Exception{     
        String sql = "SELECT id_produto, descricao, qtddisponivel, dtvalidade, dtfabricacao, lote, preco_custo, valor_lucro, valor_total FROM tb_produtos;";
        String connectionString = "jdbc:postgresql://localhost:5432/SupermercadoL";
        String usuario = "luigi";
        String senha = "yoshi";
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(connectionString, usuario, senha);
        PreparedStatement statement = connection.prepareStatement(sql);        
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.isFirst()){
            p.setId_produto(resultSet.getLong("id_produto"));
            p.setDescricao(resultSet.getString("descricao"));
            p.setQtddisponivel(resultSet.getDouble("qtddisponivel"));
            p.setDtvalidade(resultSet.getString("dtvalidade"));
            p.setDtfabricacao(resultSet.getString("dtfabricacao"));
            p.setLote(resultSet.getString("lote"));
            p.setPreco_custo(resultSet.getDouble("preco_custo"));
            p.setValor_lucro(resultSet.getDouble("valor_lucro"));
            p.setValor_total(resultSet.getDouble("valor_total"));
           
            
            
        }
        statement.close();
        connection.close();
        return p;
    }      
          
          public void removerp(Produto p) throws Exception{
        String sql = "DELETE FROM tb_produtos WHERE id_produto = ? ;";
        String connectionString = "jdbc:postgresql://localhost:5432/SupermercadoL";
        String usuario = "luigi";
        String senha = "yoshi";
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(connectionString, usuario, senha);
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, p.getId_produto());
        statement.executeUpdate();
        statement.close();
        connection.close();
    }
          
        public void adicionarl (Login l) throws Exception{
        String sql = "INSERT INTO tb_usuario (login, senha) VALUES(?,?);";
        String connectionString = "jdbc:postgresql://localhost:5432/SupermercadoL";
        String usuario = "luigi";
        String senha = "yoshi";
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(connectionString, usuario, senha);
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, l.getUsuario());
        statement.setString(2, l.getSenha());

        statement.execute();
        statement.close();
        connection.close();
    }
    

             public Produto buscarProdutoCaixa(Produto p) throws Exception{     
        String sql = "SELECT id_produto, descricao, qtddisponivel, dtvalidade, dtfabricacao, lote, preco_custo, valor_lucro, valor_total FROM tb_produtos;";
        String connectionString = "jdbc:postgresql://localhost:5432/SupermercadoL";
        String usuario = "luigi";
        String senha = "yoshi";
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(connectionString, usuario, senha);
        PreparedStatement statement = connection.prepareStatement(sql);        
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()){
            p.setId_produto(resultSet.getLong("id_produto"));
            p.setDescricao(resultSet.getString("descricao"));
            p.setValor_total(resultSet.getDouble("valor_total"));
           
            
            
        }
        statement.close();
        connection.close();
        return p;
    }    
             
        public Funcionario buscarFuncionarioCaixa(Funcionario f) throws Exception{     
        String sql = "SELECT id_funcionario, nome, logradouro, numero, bairro, cidade, complemento, cep, estado, telefone, celular, cpf, rg, setor, salario, email, sexo, datadenascimento, cargo FROM tb_funcionario;";
        String connectionString = "jdbc:postgresql://localhost:5432/SupermercadoL";
        String usuario = "luigi";
        String senha = "yoshi";
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(connectionString, usuario, senha);
        PreparedStatement statement = connection.prepareStatement(sql);        
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()){
            f.setId_funcionario(resultSet.getLong("id_funcionario"));
            f.setNome(resultSet.getString("nome"));
                    }
        statement.close();
        connection.close();
        return f;
        }
        
         public Caixa adicionarv(Caixa c)throws Exception{
       String sql = "INSERT INTO tb_caixa (id_venda,id_produto, descricao_produto, id_funcionario,nome_funcionario , preco_produto, total_compra, pagamento, troco) VALUES(?,?,?,?,?,?,?,?,?);";
        String connectionString = "jdbc:postgresql://localhost:5432/SupermercadoL";
        String usuario = "luigi";
        String senha = "yoshi";
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(connectionString, usuario, senha);
        PreparedStatement statement = connection.prepareStatement(sql);
          statement.setLong(1,c.getId_venda());
          statement.setLong(2,c.getId_produto());
          statement.setString(3,c.getDesc_prod());
          statement.setLong(4,c.getId_funcionario());
          statement.setString(5, c.getNomeDoFuncionario());
          statement.setDouble(6, c.getTotalCompra());
          statement.setDouble(7, c.getPagamento());
          statement.setDouble(8, c.getPreco_produto());
          statement.setDouble(9, c.getTroco());
        
        
        statement.execute();
        statement.close();
        connection.close();
        return c;
   }
                   public void removerv(Caixa c) throws Exception{
        String sql = "DELETE FROM tb_caixa WHERE id_venda = ? ;";
        String connectionString = "jdbc:postgresql://localhost:5432/SupermercadoL";
        String usuario = "luigi";
        String senha = "yoshi";
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(connectionString, usuario, senha);
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, c.getId_venda());
        statement.executeUpdate();
        statement.close();
        connection.close();
    }


    }




    