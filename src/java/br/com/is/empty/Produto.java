package br.com.is.empty;

public class Produto {

    private int codigo;
    private String nm_produto;

    // Metodos -----------------------------------------------------------------
    public Produto() {
    }

    public Produto(int codigo, String nm_produto) {
        this.codigo = codigo;
        this.nm_produto = nm_produto;
    }

    @Override
    public String toString() {
        return "Produtos{" + "codigo=" + getCodigo() + ", nm_produto=" + getNm_produto() + '}';
    }

    // Getters e Setters -------------------------------------------------------
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNm_produto() {
        return nm_produto;
    }

    public void setNm_produto(String nm_produto) {
        this.nm_produto = nm_produto;
    }

}
