package br.com.is.empty;

public class Paciente {

    private int codigo;
    private String nm_paciente;
    private String data_nasc;
    private String mae;
    private int spp;
    private int registro;

    // Metodos ----------------------------------
    public Paciente() {
    }

    public Paciente(int codigo, String nm_paciente, String data_nasc, String mae, int spp, int registro) {
        this.codigo = codigo;
        this.nm_paciente = nm_paciente;
        this.data_nasc = data_nasc;
        this.mae = mae;
        this.spp = spp;
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Pacientes{" + "codigo=" + codigo + ", nm_paciente=" + nm_paciente + ", data_nasc=" + data_nasc + ", mae=" + mae + ", spp=" + spp + ", registro=" + registro + '}';
    }

    // Getters e Setters -------------------------------------------------------
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNm_paciente() {
        return nm_paciente;
    }

    public void setNm_paciente(String nm_paciente) {
        this.nm_paciente = nm_paciente;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public int getSpp() {
        return spp;
    }

    public void setSpp(int spp) {
        this.spp = spp;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

}
