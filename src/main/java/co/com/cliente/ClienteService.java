package co.com.cliente;

import co.com.cliente.exception.ClienteNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Didier Virguez
 * Clase que implementa la logica de negocio
 * para el Cliente
 */
@Service
public class ClienteService implements IClienteService{

    @Override
    public Cliente getClienteInfo(String tipoDocumento, String numeroDocumento) {
        
        //Valida que campos obligatorios y tipo documento
        if(!isValidInput(tipoDocumento, numeroDocumento)){
            throw new IllegalArgumentException("Tipo de documento o numero documento invalido");
        }
        
        //valida que el cliente exista
        if(!isValidCliente(tipoDocumento, numeroDocumento)){
            throw new ClienteNotFoundException("Cliente no encontrado");
        }
        
        //si las validaciones son efectivas retorna la respuesta
        return new Cliente("Julian", "Andres", "Gonzalez", "Perez",
                "313123456", "san fernando 123", "San Fernando");
    }
    
    //Valida datos entrada obligatorios y tipo documento correcto
    private boolean isValidInput(String tipoDocumento, String numeroDocumento){
        return tipoDocumento != null && numeroDocumento != null
                && (tipoDocumento.equals("C") || numeroDocumento.equals("P"));
    }
    
    //Valida que el cliente exista
    private boolean isValidCliente(String tipoDocumento,String numeroDocumento){
        return tipoDocumento.equals("C") && numeroDocumento.equals("23445322");
    }
    
}
