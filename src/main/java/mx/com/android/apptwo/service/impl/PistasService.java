package mx.com.android.apptwo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.android.apptwo.Dao.PistasDAO;
import mx.com.android.apptwo.entity.Pistas;
import mx.com.android.apptwo.service.IPistasService;

@Service
public class PistasService implements IPistasService {
	
	@Autowired
	private PistasDAO pistasDAO;

	@Override
	public List<Pistas> listaPistas() {		
		return (List<Pistas>) pistasDAO.findAll();
	}

	@Override
	public Optional<Pistas> listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Pistas p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Pistas p) {
		// TODO Auto-generated method stub

	}

}
