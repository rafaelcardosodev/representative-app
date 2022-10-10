package com.hbrepresentacao.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "enderecos")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cep")
    private String cep;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @Column(name = "isEnderecoPrincipal")
    private Boolean isEnderecoPrincipal;

    @ManyToOne()
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne()
    @JoinColumn(name = "empresa_representada_id")
    private EmpresaRepresentada empresaRepresentada;

    public Endereco(){}

    public Endereco(Long id, String logradouro, String bairro, String cep, String cidade, String estado, Boolean isEnderecoPrincipal, Cliente cliente, EmpresaRepresentada empresaRepresentada) {
        this.id = id;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.isEnderecoPrincipal = isEnderecoPrincipal;
        this.cliente = cliente;
        this.empresaRepresentada = empresaRepresentada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getEnderecoPrincipal() {
        return isEnderecoPrincipal;
    }

    public void setEnderecoPrincipal(Boolean enderecoPrincipal) {
        isEnderecoPrincipal = enderecoPrincipal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public EmpresaRepresentada getEmpresaRepresentada() {
        return empresaRepresentada;
    }

    public void setEmpresaRepresentada(EmpresaRepresentada empresaRepresentada) {
        this.empresaRepresentada = empresaRepresentada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(id, endereco.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
