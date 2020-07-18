package mx.com.android.apptwo.service;

import java.util.List;
import java.util.Optional;

import mx.com.android.apptwo.entity.Estatus;

public interface IEstatusService {
	
	public List<Estatus> listaEstatus();

	public Optional<Estatus> listarId(Integer id);

	public int save(Estatus p);

	public void delete(Estatus p);
	
	

}
