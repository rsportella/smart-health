package br.com.is.empty;

public class LancamentosPrescricoes {

    private int codigo;

    // Metodos -----------------------------------------------------------------
    public LancamentosPrescricoes() {
    }

    public LancamentosPrescricoes(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "LancamentosPrescricoes{" + "codigo=" + codigo + '}';
    }

    // Getters e Setters -------------------------------------------------------
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
