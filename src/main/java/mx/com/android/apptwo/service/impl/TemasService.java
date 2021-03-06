package mx.com.android.apptwo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.android.apptwo.Dao.TemasDAO;
import mx.com.android.apptwo.entity.Temas;
import mx.com.android.apptwo.service.ITemasService;


@Service
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
		Temas tema = temasDAO.save(p);
		int res=0;
		
		if(!tema.equals(null)) {
			res=1;
		}
		
		return 0;
	}

	@Override
	public void delete(Temas p) {
		// TODO Auto-generated method stub

	}

}
