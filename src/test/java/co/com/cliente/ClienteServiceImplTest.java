
package co.com.cliente;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Didier Virguez
 * Clase encargada de realizar las pruebas unitarias para el ClienteService
 */
public class ClienteServiceImplTest {
    
    private ClienteService clienteService;

    @BeforeEach
    public void setUp() {
        clienteService = new ClienteService();
    }

    @Test
    public void testGetClienteInfo_ValidCliente_ReturnsClienteInfo() {
        // Arrange
        String tipoDocumento = "C";
        String numeroDocumento = "23445322";

        // Act
        Cliente clienteInfo = clienteService.getClienteInfo(tipoDocumento, numeroDocumento);

        // Assert
        assertNotNull(clienteInfo);
        assertEquals("Julian", clienteInfo.getPrimerNombre());
        assertEquals("Andres", clienteInfo.getSegundoNombre());
        assertEquals("Gonzalez", clienteInfo.getPrimerApellido());
        assertEquals("Perez", clienteInfo.getSegundoApellido());
        assertEquals("313123456", clienteInfo.getTelefono());
        assertEquals("san fernando 123", clienteInfo.getDireccion());
        assertEquals("San Fernando", clienteInfo.getCiudadResidencia());
    }
}
