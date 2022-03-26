package pacoteprojetofacade;

import subsystem2.CepApi;
import subsystem1.CrmService;

public interface Facade {
	
	public void migrarCliente(String nome, String cep);
		String cidade = CepApi.getInstancia().recuperarCidade();
		String estado = CepApi.getInstancia().recuperarEstado(null);
		
		CrmService.gravarCliente(nome,cep,cidade,estado);
		
		
}
