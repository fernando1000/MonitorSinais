package br.com.x10d.monitorsinais.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.x10d.monitorsinais.model.MacroGroupDTOCustom;
import br.com.x10d.monitorsinais.omni.CustomMacroDTO;

public interface CustomMacroDTORepository extends CrudRepository<CustomMacroDTO, Long> {
	
}
