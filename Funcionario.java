
package luigi.s_supermercado.modelo;

public class Funcionario {
    private long id_funcionario;
     private String nome;
     private String cep;
     private String datadenascimento;
     private String sexo;
     private String email;
     private String logradouro;
     private String numero;
     private String complemento;
     private String bairro;
     private String celular;
     private String setor;
     private String cidade;
     private String estado;
     private String telefone;
     private String cpf;
     private String rg; 
     private double salario;
     private String cargo;

    public Funcionario() {
    }

    public Funcionario(String nome, String cep, String datadenascimento, String sexo, String email, String logradouro, String numero, String complemento, String bairro, String celular, String setor, String cidade, String estado, String telefone, String cpf, String rg, double salario, String cargo) {
        this.nome = nome;
        this.cep = cep;
        this.datadenascimento = datadenascimento;
        this.sexo = sexo;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.celular = celular;
        this.setor = setor;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Funcionario(long id_funcionario, String nome, String cep, String datadenascimento, String sexo, String email, String logradouro, String numero, String complemento, String bairro, String celular, String setor, String cidade, String estado, String telefone, String cpf, String rg, double salario, String cargo) {
        this.id_funcionario = id_funcionario;
        this.nome = nome;
        this.cep = cep;
        this.datadenascimento = datadenascimento;
        this.sexo = sexo;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.celular = celular;
        this.setor = setor;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
        this.cargo = cargo;
    }

   
    
    

    public long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
      @Override
    public String toString() {
    return "tb_funcionario [ id_funcionario: " + id_funcionario + " nome: " + nome + " logradouro: " + logradouro + " numero: " + numero + " bairro: " + bairro + " cidade: " + cidade + " complemento:" + complemento + " cep: " + cep + " estado: " + estado + " telefone: " + telefone + " celular: " + celular + " cpf: " + cpf + " rg: " + rg + " setor: " + setor + " salario: " + salario + " email: " + email + " sexo: " + sexo + " datadenascimento: " + datadenascimento + " cargo: " + cargo + "]"; 
            
    }
}
