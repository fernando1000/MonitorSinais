package br.com.x10d.monitorsinais.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.x10d.monitorsinais.model.DriverCustom;
import br.com.x10d.monitorsinais.repository.DriverRepository;

@Service
public class DriverService {
	
	@Autowired
	private DriverRepository driverRepository;
	
	public Iterable<DriverCustom> devolveTodos(){
		return driverRepository.findAll();
	}
	
	public void salvar(DriverCustom driver){
		driverRepository.save(driver);
	}
}
