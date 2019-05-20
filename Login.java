
package luigi.s_supermercado.modelo;


public class Login {
    private String usuario;
    private String senha;

    public Login(String login, String senha) {
        this.usuario = login;
        this.senha = senha;
    }

    public Login() {
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    

    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
     @Override
    public String toString() {
    return "tb_usuario [ login: " + usuario + " senha: " + senha + "]";
    }
}
