package co.com.cliente.exception;

/**
 * @author usuario
 * Clase para manejo de excepciones del cliente
 */
public class ClienteNotFoundException extends RuntimeException{

    public ClienteNotFoundException() {
    }

    public ClienteNotFoundException(String message) {
        super(message);
    }
    
}
