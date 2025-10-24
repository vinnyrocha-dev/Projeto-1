/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.domain;

import java.util.Objects;

/**
 *
 * @author Viny
 */
public class Cliente {
    
    private String nome;
    private String cpf;
    private String tel;
    private String end;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

   public Cliente(String nome, String cpf, String tel, String end, String numero, String cidade, String estado, String cep) {
    this.nome = nome;
    this.cpf = cpf != null ? cpf.trim() : "";
    this.tel = tel != null ? tel.trim() : "";
    this.end = end != null ? end.trim() : "";
    this.numero = numero != null ? numero.trim() : "";
    this.cidade = cidade != null ? cidade.trim() : "";
    this.estado = estado != null ? estado.trim() : "";
    this.cep = cep != null ? cep.trim() : "";
}
   
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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
    
    
    public String getcep(){
        return cep;
    }
   
    public void setcep(String cep){
        this.cep = cep;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
   public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", cep=" + cep + ", numero=" + numero + ", endereco=" + end + '}';
    }

    //    @Override
//    public int compareTo(Cliente cliente) {
//        return Long.compare(this.cpf, cliente.getCpf());
//    }

    public Object getCep() {
    return cep;  
    }

    public void setCep(String cep) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setEndereco(String endereco) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}