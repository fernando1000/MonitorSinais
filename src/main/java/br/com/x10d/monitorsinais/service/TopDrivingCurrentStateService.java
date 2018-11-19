package br.com.x10d.monitorsinais.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.x10d.monitorsinais.model.DriverCustom;
import br.com.x10d.monitorsinais.model.TopDrivingCurrentStateCustom;
import br.com.x10d.monitorsinais.repository.DriverRepository;
import br.com.x10d.monitorsinais.repository.TopDrivingCurrentStateRepository;

@Service
public class TopDrivingCurrentStateService {
	
	@Autowired
	private TopDrivingCurrentStateRepository topDrivingCurrentStateRepository;
	
	public Iterable<TopDrivingCurrentStateCustom> devolveTodos(){
	
		return topDrivingCurrentStateRepository.findAll();
	}
	
	public void salvar(TopDrivingCurrentStateCustom topDrivingCurrentState){
		
		topDrivingCurrentStateRepository.save(topDrivingCurrentState);
	}

}
