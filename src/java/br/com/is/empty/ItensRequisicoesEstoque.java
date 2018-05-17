package br.com.is.empty;

public class ItensRequisicoesEstoque {

    private int codigo;
    private FichaAmbInt fia;
    private Produto produto;

    // Metodos -----------------------------------------------------------------
    public ItensRequisicoesEstoque() {
    }

    public ItensRequisicoesEstoque(int codigo, FichaAmbInt fia, Produto produto) {
        this.codigo = codigo;
        this.fia = fia;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItensRequisicoesEstoque{" + "codigo=" + codigo + ", fia=" + fia + ", produto=" + produto + '}';
    }

    // Getters e Setters -------------------------------------------------------
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public FichaAmbInt getFia() {
        return fia;
    }

    public void setFia(FichaAmbInt fia) {
        this.fia = fia;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
