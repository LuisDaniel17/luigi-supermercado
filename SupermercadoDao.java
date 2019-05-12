
package luigi.s_supermercado.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import luigi.s_supermercado.modelo.Funcionario;


public class SupermercadoDao {
      public void adicionarf (Funcionario f) throws Exception{
        String sql = "INSERT INTO SupermercadoL (id_funcionario, nome, logradouro, numero, bairro, cidade, complemento, cep, estado, telefone, celular, cpf, rg, setor, salario, email, sexo, datadenascimento, cargo) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
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
        String connectionString = "jdbc:postgresql://localhost:5432/agenda";
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
          
              public List<Funcionario> buscarTodosf() throws Exception{
        List<Funcionario> funcionarios = new ArrayList<>();
        String sql = "SELECT id_funcionario, nome, logradouro, numero, bairro, cidade, complemento, cep, estado, telefone, celular, cpf, rg, setor, salario, email, sexo, datadenascimento, cargo FROM tb_funcionario;";
        String connectionString = "jdbc:postgresql://localhost:5432/agenda";
        String usuario = "luigi";
        String senha = "yoshi";
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(connectionString, usuario, senha);
        PreparedStatement statement = connection.prepareStatement(sql);        
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()){
            Funcionario f = new Funcionario();
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
            
           
            funcionarios.add(f);
        }
        statement.close();
        connection.close();
        return funcionarios;
    }
    
    

}
