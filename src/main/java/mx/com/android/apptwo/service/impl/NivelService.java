package mx.com.android.apptwo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import mx.com.android.apptwo.Dao.NIvelDAO;
import mx.com.android.apptwo.entity.Nivel;
import mx.com.android.apptwo.service.INivelService;

public class NivelService implements INivelService {
	

	@Autowired
	private NIvelDAO nivelDAO;

	@Override
	public List<Nivel> listaNivel() {		
		return (List<Nivel>) nivelDAO.findAll();
	}

	@Override
	public Optional<Nivel> listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Nivel p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Nivel p) {
		// TODO Auto-generated method stub

	}

}
