package mx.com.android.apptwo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import mx.com.android.apptwo.Dao.TemasDAO;
import mx.com.android.apptwo.entity.Temas;
import mx.com.android.apptwo.service.ITemasService;

public class TemasService implements ITemasService {
	
	@Autowired
	private TemasDAO temasDAO;

	@Override
	public List<Temas> listaTemas() {		
		return (List<Temas>) temasDAO.findAll();
	}

	@Override
	public Optional<Temas> listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Temas p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Temas p) {
		// TODO Auto-generated method stub

	}

}
