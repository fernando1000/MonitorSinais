package br.com.x10d.monitorsinais.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.x10d.monitorsinais.model.DriverCustom;

public interface DriverRepository extends CrudRepository<DriverCustom, Long> {
	
}
