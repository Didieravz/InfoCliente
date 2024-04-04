
package co.com.cliente;

import java.io.Serializable;
import lombok.Data;

/**
 * @author Didier Virguez
 * Entidad que representa los campos del Cliente
 */
@Data
public class Cliente implements Serializable{
    
    private static final long serialVersionUID = 1L;

    public Cliente(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String direccion, String ciudadResidencia) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudadResidencia = ciudadResidencia;
    }
    
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String direccion;
    private String ciudadResidencia;
    
}
