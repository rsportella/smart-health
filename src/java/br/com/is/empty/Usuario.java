package br.com.is.empty;

public class Usuario {

    private int codigo;
    private String pswd;
    private String username;

    // Metodos ----------------------------------
    public Usuario() {
    }

    public Usuario(int codigo, String pswd, String username) {
        this.codigo = codigo;
        this.pswd = pswd;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "codigo=" + codigo + ", pswd=" + pswd + ", username=" + username + '}';
    }

    // Getters e Setters -------------------------------------------------------
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
