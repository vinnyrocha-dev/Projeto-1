/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication1.dao;

import java.util.Collection;
import javaapplication1.domain.Cliente;

/**
 *
 * @author Viny
 */
public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);
    
    public void excluir(Long cpf);
    
    public void alterar(Cliente cliente);
    
    public Cliente consultar(String cpf);

    public Collection<Cliente> buscarTodos();

    public void excluir(String cpf);

}