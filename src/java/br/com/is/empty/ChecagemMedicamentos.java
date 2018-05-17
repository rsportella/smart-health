package br.com.is.empty;

public class ChecagemMedicamentos {

    private int codigo;
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
    private Usuario cod_usuario_motivo;
    private boolean devolucao_recusada;
    private LancamentosPrescricoes cod_item_prescricao;
    private ItensRequisicoesEstoque cod_item_requisicao_estoque;

    // Metodos -----------------------------------------------------------------
    public ChecagemMedicamentos() {
    }

    public ChecagemMedicamentos(int codigo, boolean checado, String data_deve_aplicar, String hora_deve_aplicar, String data_checagem, String hora_checagem, Double quantidade, String motivo, boolean devolvido, boolean perdido, boolean inutilizado, String data_motivo, String hora_motivo, Usuario cod_usuario_motivo, boolean devolucao_recusada, LancamentosPrescricoes cod_item_prescricao, ItensRequisicoesEstoque cod_item_requisicao_estoque) {
        this.codigo = codigo;
        this.checado = checado;
        this.data_deve_aplicar = data_deve_aplicar;
        this.hora_deve_aplicar = hora_deve_aplicar;
        this.data_checagem = data_checagem;
        this.hora_checagem = hora_checagem;
        this.quantidade = quantidade;
        this.motivo = motivo;
        this.devolvido = devolvido;
        this.perdido = perdido;
        this.inutilizado = inutilizado;
        this.data_motivo = data_motivo;
        this.hora_motivo = hora_motivo;
        this.cod_usuario_motivo = cod_usuario_motivo;
        this.devolucao_recusada = devolucao_recusada;
        this.cod_item_prescricao = cod_item_prescricao;
        this.cod_item_requisicao_estoque = cod_item_requisicao_estoque;
    }

    @Override
    public String toString() {
        return "ChecagemMedicamentos{" + "codigo=" + codigo + ", checado=" + checado + ", data_deve_aplicar=" + data_deve_aplicar + ", hora_deve_aplicar=" + hora_deve_aplicar + ", data_checagem=" + data_checagem + ", hora_checagem=" + hora_checagem + ", quantidade=" + quantidade + ", motivo=" + motivo + ", devolvido=" + devolvido + ", perdido=" + perdido + ", inutilizado=" + inutilizado + ", data_motivo=" + data_motivo + ", hora_motivo=" + hora_motivo + ", cod_usuario_motivo=" + cod_usuario_motivo + ", devolucao_recusada=" + devolucao_recusada + ", cod_item_prescricao=" + cod_item_prescricao + ", cod_item_requisicao_estoque=" + cod_item_requisicao_estoque + '}';
    }

    // Getters e Setters -------------------------------------------------------
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Usuario getCod_usuario_motivo() {
        return cod_usuario_motivo;
    }

    public void setCod_usuario_motivo(Usuario cod_usuario_motivo) {
        this.cod_usuario_motivo = cod_usuario_motivo;
    }

    public boolean isDevolucao_recusada() {
        return devolucao_recusada;
    }

    public void setDevolucao_recusada(boolean devolucao_recusada) {
        this.devolucao_recusada = devolucao_recusada;
    }

    public LancamentosPrescricoes getCod_item_prescricao() {
        return cod_item_prescricao;
    }

    public void setCod_item_prescricao(LancamentosPrescricoes cod_item_prescricao) {
        this.cod_item_prescricao = cod_item_prescricao;
    }

    public ItensRequisicoesEstoque getCod_item_requisicao_estoque() {
        return cod_item_requisicao_estoque;
    }

    public void setCod_item_requisicao_estoque(ItensRequisicoesEstoque cod_item_requisicao_estoque) {
        this.cod_item_requisicao_estoque = cod_item_requisicao_estoque;
    }

}
