package com.hbrepresentacao.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "razaoSocial")
    private String razaoSocial;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "inscricaoEstadual")
    private String inscricaoEstadual;

    @Column(name = "observacao")
    private String observacao;

    @OneToMany(mappedBy = "cliente")
    private List<Contato> contatos;

    @ManyToMany
    @JoinTable(
            name = "empresa_representada_cliente",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "empresa_representada_id")
    )
    private List<EmpresaRepresentada> empresasRepresentadas;

    @OneToMany(mappedBy = "cliente")
    private List<Endereco> enderecos;

    public Cliente() {}

    public Cliente(Long id, String nome, String razaoSocial, String cnpj, String inscricaoEstadual, String observacao, List<Contato> contatos, List<EmpresaRepresentada> empresasRepresentadas, List<Endereco> enderecos) {
        this.id = id;
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.observacao = observacao;
        this.contatos = contatos;
        this.empresasRepresentadas = empresasRepresentadas;
        this.enderecos = enderecos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public List<EmpresaRepresentada> getEmpresasRepresentadas() {
        return empresasRepresentadas;
    }

    public void setEmpresasRepresentadas(List<EmpresaRepresentada> empresasRepresentadas) {
        this.empresasRepresentadas = empresasRepresentadas;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) && Objects.equals(cnpj, cliente.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cnpj);
    }
}
