/**
 * 
 */
package me.polles.quinto.tadsshare;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.univel.jshare.comum.Arquivo;
import br.univel.jshare.comum.Cliente;
import br.univel.jshare.comum.IServer;
import br.univel.jshare.comum.TipoFiltro;

/**
 * @author Joao
 *
 */
public class Server implements IServer {
	private List<Cliente> clientes;
	private int proxId;
	private Map<Cliente, List<Arquivo>> arquivos;
	
	public Server(){
		clientes = new ArrayList<Cliente>();
	}

	/* (non-Javadoc)
	 * @see br.univel.jshare.comum.IServer#registrarCliente(br.univel.jshare.comum.Cliente)
	 */
	public void registrarCliente(Cliente cliente) throws RemoteException {
		cliente.setId(proxId);
		proxId++;
		clientes.add(cliente);
	}

	/* (non-Javadoc)
	 * @see br.univel.jshare.comum.IServer#publicarListaArquivos(br.univel.jshare.comum.Cliente, java.util.List)
	 */
	public void publicarListaArquivos(Cliente cliente, List<Arquivo> lista) throws RemoteException {
		arquivos.put(cliente, lista);
	}

	/* (non-Javadoc)
	 * @see br.univel.jshare.comum.IServer#procurarArquivo(java.lang.String, br.univel.jshare.comum.TipoFiltro, java.lang.String)
	 */
	public Map<Cliente, List<Arquivo>> procurarArquivo(String query, TipoFiltro tipoFiltro, String filtro)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.univel.jshare.comum.IServer#baixarArquivo(br.univel.jshare.comum.Cliente, br.univel.jshare.comum.Arquivo)
	 */
	public byte[] baixarArquivo(Cliente cliente, Arquivo arquivo) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.univel.jshare.comum.IServer#desconectar(br.univel.jshare.comum.Cliente)
	 */
	public void desconectar(Cliente cliente) throws RemoteException {
		// TODO Auto-generated method stub

	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
