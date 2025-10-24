/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.dao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javaapplication1.domain.Cliente;

/**
 *
 * @author Viny
 */
public class ClienteSetDAO implements IClienteDAO {

    private Set<Cliente> set;
    
    public ClienteSetDAO() {
        this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return this.set.add(cliente);
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteEncontrato = null;
        for (Cliente cliente : this.set) {
            if (cliente.getCpf().equals(cpf)) {
                clienteEncontrato = cliente;
                break;
            }
        }
        
        if (clienteEncontrato != null) {
            this.set.remove(clienteEncontrato);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        if (this.set.contains(cliente)) {
            for (Cliente clienteCadastrado : this.set) {
                if (clienteCadastrado.equals(cliente)) {
                    clienteCadastrado.setNome(cliente.getNome());
                    clienteCadastrado.setTel(cliente.getTel());
                    clienteCadastrado.setNumero(cliente.getNumero());
                    clienteCadastrado.setEnd(cliente.getEnd());
                    clienteCadastrado.setCidade(cliente.getCidade());
                    clienteCadastrado.setEstado(cliente.getEstado());
                    break;
                }
            }
        }
    }

       @Override
    public Cliente consultar(String cpf) {
for (Cliente clienteCadastrado : this.set) {
             if (clienteCadastrado.getCpf().equals(cpf)) {
                 return clienteCadastrado;
             }
        }
        return null;    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }

    @Override
    public void excluir(String cpf) {
      Cliente clienteEncontrado = null;
    
    // Procura o cliente com o CPF informado
    for (Cliente c : this.set) {
        if (c.getCpf().equals(cpf)) {
            clienteEncontrado = c;
            break;
        }
    }

    // Remove do Set se encontrado
    if (clienteEncontrado != null) {
        this.set.remove(clienteEncontrado);
    }  
    }

}