package org.bedu.Telsis.Inventario.exceptiion;

public class ProvedorNotFoundException extends RuntimeException {
    public ProvedorNotFoundException(long id){
        super("El provedor no existe","ERR_PROV_NOT_FOUND", id);
    }
}
