package mz.gov.misau.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import mz.gov.misau.app.model.Marca;
import mz.gov.misau.app.model.controller.MarcaController;
import mz.gov.misau.app.repository.MarcaRepository;
import mz.gov.misau.app.service.MarcaService;

@SpringBootTest(classes = AppApplication.class)
public class AppApplicationTests {

	@Autowired
	private MarcaRepository marcaRepository;
	
	@Autowired
	private MarcaService marcaService;
	
	@Autowired
	private MarcaController marcaController;
	
	@Test
	public void testeMarca() {
		Marca marca=new Marca();
		marca.setDescricao("ACCER");
	
		marcaController.salvar(marca);
	}

}
