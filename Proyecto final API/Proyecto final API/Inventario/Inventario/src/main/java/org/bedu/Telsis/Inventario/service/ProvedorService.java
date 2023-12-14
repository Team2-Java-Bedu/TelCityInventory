package org.bedu.Telsis.Inventario.service;


import java.util.List;
import java.util.Optional;

import org.bedu.Telsis.Inventario.dto.ProvedorDTO;
import org.bedu.Telsis.Inventario.dto.CreateProvedorDTO;
import org.bedu.Telsis.Inventario.dto.UpdateProvedorDTO;
import org.bedu.Telsis.Inventario.exceptiion.ProvedorNotFoundException;
import org.bedu.Telsis.Inventario.mapper.ProvedorMapper;
import org.bedu.Telsis.Inventario.model.Provedor;
import org.bedu.Telsis.Inventario.repository.ProvedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import main.java.org.bedu.Telsis.Inventario.service;

@Service
public class ProvedorService {
    
    @Autowired
    private ProvedorRepository repository;

    @Autowired
    private ProvedorMapper mapper;

    public List<ProvedorDTO> findAll() {
        return mapper.toDTO(repository.findAll());//Revisar
    }

    public ProvedorDTO save(CreateProvedorDTO data) {
        Provedor entity = repository.save(mapper.toModel(data));
        return mapper.toDTO(entity);
    }

    public void update(long provedorId, UpdateProvedorDTO data) throws ProvedorNotFoundException{
        Optional<Provedor> result = repository.findById(provedorId);

        if(result.isEmpty()){
            throw new ProvedorNotFoundException(provedorId);
        }
        Provedor provedor = result.get();

        mapper.update(provedor, data);
        repository.save(provedor);
    }

    public void deleteById(long id) {
        repository.deleteById(id);

}
}
