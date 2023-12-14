package org.bedu.Telsis.Inventario.repository;

import org.bedu.Telsis.Inventario.model.Equipamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipamientoRepository extends JpaRepository<Equipamiento, Long> {

}