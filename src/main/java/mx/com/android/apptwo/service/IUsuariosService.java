package mx.com.android.apptwo.service;

import java.util.List;
import java.util.Optional;

import mx.com.android.apptwo.entity.Usuarios;

public interface IUsuariosService {
	
	public List<Usuarios> listaUsuarios();

	public Optional<Usuarios> listarId(Integer id);

	public int save(Usuarios p);

	public void delete(Usuarios p);
	

}
