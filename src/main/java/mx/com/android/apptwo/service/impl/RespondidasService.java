package mx.com.android.apptwo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.android.apptwo.Dao.RespondidasDAO;
import mx.com.android.apptwo.entity.Respondidas;
import mx.com.android.apptwo.service.IRespondidasService;


@Service
public class RespondidasService implements IRespondidasService {
	
	
	@Autowired
	private RespondidasDAO respondidasDAO;

	@Override
	public List<Respondidas> listaRespondidas() {		
		return (List<Respondidas>) respondidasDAO.findAll();
	}

	@Override
	public Optional<Respondidas> listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Respondidas p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Respondidas p) {
		// TODO Auto-generated method stub

	}

}
