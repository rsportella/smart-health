package br.com.is.empty;

public class FichaAmbInt {

    private int codigo;
    private Paciente paciente;

    // Metodos -----------------------------------------------------------------
    public FichaAmbInt() {
    }

    public FichaAmbInt(int codigo, Paciente paciente) {
        this.codigo = codigo;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "FichaAmbInt{" + "codigo=" + getCodigo() + ", paciente=" + getPaciente() + '}';
    }

    // Getters e Setters -------------------------------------------------------
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
