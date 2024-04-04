
package co.com.cliente;

/**
 * @author Didier Virguez
 * Interface que contiene los metodos de negocio
 */
public interface IClienteService {
    
    Cliente getClienteInfo(String tipoDocumento, String numeroDocumento);
    
}
