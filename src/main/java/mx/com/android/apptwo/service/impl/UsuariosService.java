package mx.com.android.apptwo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.android.apptwo.Dao.UsuariosDAO;
import mx.com.android.apptwo.entity.Usuarios;
import mx.com.android.apptwo.service.IUsuariosService;


@Service
public class UsuariosService implements IUsuariosService {
	
	@Autowired
	private UsuariosDAO usuariosDAO;

	@Override
	public List<Usuarios> listaUsuarios() {		
		return (List<Usuarios>) usuariosDAO.findAll();
	}

	@Override
	public Optional<Usuarios> listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Usuarios p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Usuarios p) {
		// TODO Auto-generated method stub

	}

}
