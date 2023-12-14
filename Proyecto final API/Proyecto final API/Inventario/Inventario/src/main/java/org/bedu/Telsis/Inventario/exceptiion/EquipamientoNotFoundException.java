package org.bedu.Telsis.Inventario.exceptiion;


public class EquipamientoNotFoundException extends RuntimeException{
    public EquipamientoNotFoundException(long id){

        super("El equipo no existe","ERR_EQUI_NOT_FOUND", id);
    }
}
