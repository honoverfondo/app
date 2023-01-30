package mz.gov.misau.app.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import mz.gov.misau.app.model.Marca;
import mz.gov.misau.app.repository.MarcaRepository;
import mz.gov.misau.app.service.MarcaService;

@Controller
@RequestMapping("/")
public class MarcaController {

	@Autowired
	private MarcaService marcaService;
	
	@PostMapping("/salvarMarca")
	@ResponseStatus(HttpStatus.CREATED)
	public Marca salvar(@RequestBody Marca marca) {
		
		return marcaService.save(marca);
	}
}
