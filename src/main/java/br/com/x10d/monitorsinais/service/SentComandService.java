package br.com.x10d.monitorsinais.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.x10d.monitorsinais.omni.SentCommand;
import br.com.x10d.monitorsinais.repository.SentCommandRepository;

@Service
public class SentComandService {
	
	@Autowired
	private SentCommandRepository sentCommandRepository;
	
	public Iterable<SentCommand> devolveTodos(){
		return sentCommandRepository.findAll();
	}
	
	public void salvar(SentCommand sentCommand){
		sentCommandRepository.save(sentCommand);
	}
	
}
