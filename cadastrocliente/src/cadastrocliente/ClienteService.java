/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastrocliente;

/**
 *
 * @author rf3020
 */
public class ClienteService {
    
    private ClienteDAO clienteDAO ;

    public ClienteService() {
        clienteDAO = new ClienteDAO();
    }
        
    public void salvar(Cliente cliente) throws ServiceException{
        
        if(cliente.getNome().isEmpty()){
            throw  new ServiceException("Campo nome é obrigatório!");
        }
        
        if(cliente.getFone().isEmpty()){
            throw  new ServiceException("Campo fone é obrigatório!");
        }
        
        clienteDAO.salvar(cliente);
        
    }

    public void excluir(Integer id) {
        clienteDAO.excluir(id);
    }
}
