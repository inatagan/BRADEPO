package com.inatagan.ex03;

public class GeraPagamento implements IGeraPagamento {
    private double total_horas, valor_hora, pagamento;

    public GeraPagamento(double total_horas, double valor_hora) {
        this.total_horas = total_horas;
        this.valor_hora = valor_hora;
    }

    public double getTotal_horas() {
        return total_horas;
    }

    public void setTotal_horas(double total_horas) {
        this.total_horas = total_horas;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    public double getPagamento() {
        return pagamento;
    }

    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }

    public double calularPagamento(double total_horas, double valor_hora) {
        return pagamento = total_horas * valor_hora;
    }

    @Override
    public void update(double valor_hora, double total_horas) {
        double pagamento = calularPagamento(total_horas, valor_hora);
    }

}
