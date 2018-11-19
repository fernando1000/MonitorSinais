package br.com.x10d.monitorsinais.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.x10d.monitorsinais.omni.CustomMacroDTO;
import br.com.x10d.monitorsinais.repository.CustomMacroDTORepository;

@Service
public class CustomMacroDTOService {
	
	@Autowired
	private CustomMacroDTORepository customMacroDTORepository;
	
	public Iterable<CustomMacroDTO> devolveTodos(){
		return customMacroDTORepository.findAll();
	}
	
	public void salvar(CustomMacroDTO customMacroDTO){
		customMacroDTORepository.save(customMacroDTO);
	}

}
