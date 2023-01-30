package mz.gov.misau.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mz.gov.misau.app.model.Marca;
import mz.gov.misau.app.repository.MarcaRepository;

@Service
public class MarcaService {

	@Autowired
	private MarcaRepository marcaRepository;
	
	public Marca save(Marca marca) {
		
		/*QUALQUER TIPO DE VALIDACAO*/
		return marcaRepository.save(marca);
	}
}
