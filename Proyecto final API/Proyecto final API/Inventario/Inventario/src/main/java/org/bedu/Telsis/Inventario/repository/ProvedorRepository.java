package org.bedu.Telsis.Inventario.repository;

import org.bedu.Telsis.Inventario.model.Equipamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.bedu.Telsis.Inventario.model.Provedor;

@Repository
public interface ProvedorRepository extends JpaRepository<Provedor, Long> {
    
}
