
package co.com.cliente;

import co.com.cliente.exception.ClienteNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Didier Virguez
 * Clase controladora para realizar las operaciones con el cliente
 */
@RestController
@Slf4j
public class ClienteController {
    
    //Inyeccion del servicio para manejo de la logica
    @Autowired
    private IClienteService clienteService;
    
    //Metodo que retorna la informacion del cliente
    @GetMapping("/cliente")
    public ResponseEntity<?> getInfoCliente(@RequestParam String tipoDocumento,
            @RequestParam String numeroDocumento){
        log.info("Iniciando Api Cliente");
        
        try{
            Cliente cliente = clienteService.getClienteInfo(tipoDocumento, numeroDocumento);
            return ResponseEntity.status(HttpStatus.OK).body(cliente);
        }catch(IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }catch(ClienteNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error interno del servidos");
        }
    }
    
}
