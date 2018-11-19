package br.com.x10d.monitorsinais.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.x10d.monitorsinais.model.HistoryEntryCustom;
import br.com.x10d.monitorsinais.repository.HistoryEntryRepository;

@Service
public class HistoryEntryService {
	
	@Autowired
	private HistoryEntryRepository historyEntryRepository;
	
	public Iterable<HistoryEntryCustom> devolveTodos(){
		return historyEntryRepository.findAll();
	}
	
	public void salvar(HistoryEntryCustom historyEntry){
		historyEntryRepository.save(historyEntry);
	}

	public List<HistoryEntryCustom> devolveMaisRecenteHistorico(String placa) {
		return historyEntryRepository.devolveMaisRecenteHistorico(placa, new PageRequest(0, 1));
	}
	public List<HistoryEntryCustom> devolveMaisRecenteHistoricoSeqIdMaiorQAnterior(String placa, Long seqId) {
		return historyEntryRepository.devolveMaisRecenteHistoricoSeqIdMaiorQAnterior(placa, seqId, new PageRequest(0, 1));
	}
	
	public List<HistoryEntryCustom> devolveMaisRecenteHistoricoDeletado(String placa) {
		return historyEntryRepository.devolveMaisRecenteHistoricoDeletado(placa, 666, new PageRequest(0, 1));
	}
	
	public List<HistoryEntryCustom> devolveMaisRecenteHistoricoAtivo(String placa) {
		return historyEntryRepository.devolveMaisRecenteHistoricoAtivo(placa, 666, new PageRequest(0, 1));
	}
	
	
	

	public void deletaPorSeqId(Long seqId){
		historyEntryRepository.deletaPorSeqId(seqId);
	}

	
}
