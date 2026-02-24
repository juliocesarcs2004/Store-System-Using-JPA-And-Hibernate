package br.com.alura.loja.vo;

import java.time.LocalDate;

public class RelatorioDeVendasVo {

    private String nomeProduto;
    private Long quantidadeVendida;
    private LocalDate dataultimaVenda;

    public RelatorioDeVendasVo(String nomeProduto, Long quantidadeVendida, LocalDate dataultimaVenda) {
        this.nomeProduto = nomeProduto;
        this.quantidadeVendida = quantidadeVendida;
        this.dataultimaVenda = dataultimaVenda;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Long getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public LocalDate getDataultimaVenda() {
        return dataultimaVenda;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RelatorioDeVendasVo{");
        sb.append("nomeProduto='").append(nomeProduto).append('\'');
        sb.append(", quantidadeVendida=").append(quantidadeVendida);
        sb.append(", dataultimaVenda=").append(dataultimaVenda);
        sb.append('}');
        return sb.toString();
    }
}
