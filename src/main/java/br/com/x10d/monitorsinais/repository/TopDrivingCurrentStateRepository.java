package br.com.x10d.monitorsinais.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.x10d.monitorsinais.model.TopDrivingCurrentStateCustom;

public interface TopDrivingCurrentStateRepository extends CrudRepository<TopDrivingCurrentStateCustom, Long> {
	
}
