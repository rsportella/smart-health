package br.com.is.empty;

public class checagem_medicamentos {

    private int id_checagem;
    private boolean checado;
    private String data_deve_aplicar;
    private String hora_deve_aplicar;
    private String data_checagem;
    private String hora_checagem;
    private Double quantidade;
    private String motivo;
    private boolean devolvido;
    private boolean perdido;
    private boolean inutilizado;
    private String data_motivo;
    private String hora_motivo;
    private int cod_usuario_motivo;
    private boolean devolucao_recusada;
    private int cod_item_prescricao;
    private int cod_item_requisicao_estoque;

    public int getId_checagem() {
        return id_checagem;
    }

    public void setId_checagem(int id_checagem) {
        this.id_checagem = id_checagem;
    }

    public boolean isChecado() {
        return checado;
    }

    public void setChecado(boolean checado) {
        this.checado = checado;
    }

    public String getData_deve_aplicar() {
        return data_deve_aplicar;
    }

    public void setData_deve_aplicar(String data_deve_aplicar) {
        this.data_deve_aplicar = data_deve_aplicar;
    }

    public String getHora_deve_aplicar() {
        return hora_deve_aplicar;
    }

    public void setHora_deve_aplicar(String hora_deve_aplicar) {
        this.hora_deve_aplicar = hora_deve_aplicar;
    }

    public String getData_checagem() {
        return data_checagem;
    }

    public void setData_checagem(String data_checagem) {
        this.data_checagem = data_checagem;
    }

    public String getHora_checagem() {
        return hora_checagem;
    }

    public void setHora_checagem(String hora_checagem) {
        this.hora_checagem = hora_checagem;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public boolean isPerdido() {
        return perdido;
    }

    public void setPerdido(boolean perdido) {
        this.perdido = perdido;
    }

    public boolean isInutilizado() {
        return inutilizado;
    }

    public void setInutilizado(boolean inutilizado) {
        this.inutilizado = inutilizado;
    }

    public String getData_motivo() {
        return data_motivo;
    }

    public void setData_motivo(String data_motivo) {
        this.data_motivo = data_motivo;
    }

    public String getHora_motivo() {
        return hora_motivo;
    }

    public void setHora_motivo(String hora_motivo) {
        this.hora_motivo = hora_motivo;
    }

    public int getCod_usuario_motivo() {
        return cod_usuario_motivo;
    }

    public void setCod_usuario_motivo(int cod_usuario_motivo) {
        this.cod_usuario_motivo = cod_usuario_motivo;
    }

    public boolean isDevolucao_recusada() {
        return devolucao_recusada;
    }

    public void setDevolucao_recusada(boolean devolucao_recusada) {
        this.devolucao_recusada = devolucao_recusada;
    }

    public int getCod_item_prescricao() {
        return cod_item_prescricao;
    }

    public void setCod_item_prescricao(int cod_item_prescricao) {
        this.cod_item_prescricao = cod_item_prescricao;
    }

    public int getCod_item_requisicao_estoque() {
        return cod_item_requisicao_estoque;
    }

    public void setCod_item_requisicao_estoque(int cod_item_requisicao_estoque) {
        this.cod_item_requisicao_estoque = cod_item_requisicao_estoque;
    }

}
