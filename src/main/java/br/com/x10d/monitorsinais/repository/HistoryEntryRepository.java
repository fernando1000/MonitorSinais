package br.com.x10d.monitorsinais.repository;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import br.com.x10d.monitorsinais.model.HistoryEntryCustom;

public interface HistoryEntryRepository extends CrudRepository<HistoryEntryCustom, Long>{

	 @Query("SELECT h FROM historyEntry h WHERE h.localPlate=:localPlate order by h.localSeqId desc")
	 List<HistoryEntryCustom> devolveMaisRecenteHistorico(@Param("localPlate") String placa, Pageable pageable);
	 
	 @Query("SELECT h FROM historyEntry h WHERE h.localPlate=:localPlate AND h.localSeqId>:localSeqId order by h.localSeqId desc")
	 List<HistoryEntryCustom> devolveMaisRecenteHistoricoSeqIdMaiorQAnterior(@Param("localPlate") String placa, 
			 														   @Param("localSeqId") Long localSeqId,
			 														   Pageable pageable);
	 
	 @Transactional
	 @Modifying
	 @Query("DELETE FROM historyEntry h WHERE h.localSeqId=:localSeqId")
	 void deletaPorSeqId(@Param("localSeqId") Long localSeqId);

	 @Query("SELECT h FROM historyEntry h WHERE h.localPlate=:localPlate AND h.localTType=:deletado order by h.localSeqId desc")
	 List<HistoryEntryCustom> devolveMaisRecenteHistoricoDeletado(@Param("localPlate") String placa,
			 												@Param("deletado") int deletado,
			 												Pageable pageable);
	 
	 @Query("SELECT h FROM historyEntry h WHERE h.localPlate=:localPlate AND h.localTType<>:naoEstaDeletado order by h.localSeqId desc")
	 List<HistoryEntryCustom> devolveMaisRecenteHistoricoAtivo(@Param("localPlate") String placa,
			 											 @Param("naoEstaDeletado") int naoEstaDeletado,
			 												Pageable pageable);
	 

}
