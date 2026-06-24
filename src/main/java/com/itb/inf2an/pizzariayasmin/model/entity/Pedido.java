package com.itb.inf2an.pizzariayasmin.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.itb.inf2an.pizzariayasmin.model.enums.StatusPedido;

public class Pedido {
    private Long id;
    private BigDecimal valorPedido;
    private LocalDateTime dataHoraPedido;
    private StatusPedido statusPedido;
    private boolean codStatus;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public BigDecimal getValorPedido() {
        return valorPedido;
    }
    public void setValorPedido(BigDecimal valorPedido) {
        this.valorPedido = valorPedido;
    }
    public LocalDateTime getDataHoraPedido() {
        return dataHoraPedido;
    }
    public void setDataHoraPedido(LocalDateTime dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }
    public StatusPedido getStatusPedido() {
        return statusPedido;
    }
    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }
    public boolean isCodStatus() {
        return codStatus;
    }
    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }

    
}
