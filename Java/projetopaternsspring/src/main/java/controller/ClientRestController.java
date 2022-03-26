package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import feign.Response;
import model.Cliente;
import service.ClienteService;

@RestController
@RequestMapping("Clientes")
public class ClientRestController {
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<Iterable<Cliente >> buscarTodos(){
		return ResponseEntity.ok(clienteService.buscarTodos());
		
	}

}
