package com.itb.inf2an.pizzariayasmin.model.entity;

public class Telefone {
    private Long id;
    private String ddd;
    private String numero;
    private boolean codStatus;
    private Usuario usuario;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDdd() {
        return ddd;
    }
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public boolean isCodStatus() {
        return codStatus;
    }
    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}
