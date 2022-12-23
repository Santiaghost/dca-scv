package com.dca.dca;

import com.dca.dca.controller.AsignaturaController;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DcaApplicationTests {

	@Autowired
	private AsignaturaController controlador;

	@Test
	void apiDevuelveBien() {
		Assert.assertEquals(controlador.pruebaHook(),"Id:2 Nombre:MADS Creditos: 6 ");
	}

}
