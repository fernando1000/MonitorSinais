package br.com.x10d.monitorsinais.repository;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.x10d.monitorsinais.model.HistoryEntryCustom;
import br.com.x10d.monitorsinais.model.VehicleCustom;

public interface VehicleRepository extends CrudRepository<VehicleCustom, Long> {
	
	 @Query("SELECT v FROM vehicle v WHERE v.localPlate=:localPlate")
	 List<VehicleCustom> devolveVeiculoPorPlaca(@Param("localPlate") String placa, Pageable pageable);

}
