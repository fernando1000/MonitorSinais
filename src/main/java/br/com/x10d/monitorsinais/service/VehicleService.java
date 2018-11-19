package br.com.x10d.monitorsinais.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.x10d.monitorsinais.model.HistoryEntryCustom;
import br.com.x10d.monitorsinais.model.VehicleCustom;
import br.com.x10d.monitorsinais.repository.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	public Iterable<VehicleCustom> devolveTodos(){
		return vehicleRepository.findAll();
	}
	
	public void salvar(VehicleCustom vehicle){
		vehicleRepository.save(vehicle);		
	}
	
	public List<VehicleCustom> devolveVeiculoPorPlaca(String placa) {
		return vehicleRepository.devolveVeiculoPorPlaca(placa, new PageRequest(0, 1));
	}
}
