public enum MetodoPagamento {

    CARTAO_CREDITO(0.10, "pagamento utilizando o metodo de credito"),
    CARTAO_DEBITO(0.10, "pagamento utilizando o metodo de debito"),
    BOLETO(0.05, "pagamento utilizando boleto bancario, pode demorar 1 dia util para identificar o pagamento"),
    PIX(-0.10, "Metodo de pagamento com pix tem 10% de desconto e é identificado na hora");

    private double taxa;
    private String descricao;

    MetodoPagamento(double taxa, String descricao){
        this.descricao = descricao;
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "MetodoPagamento{" +
                "taxa=" + taxa +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
