package mx.com.android.apptwo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import mx.com.android.apptwo.Dao.EstatusDAO;
import mx.com.android.apptwo.entity.Estatus;
import mx.com.android.apptwo.service.IEstatusService;

public class EstatusService implements IEstatusService {

	@Autowired
	private EstatusDAO estatusDAO;

	@Override
	public List<Estatus> listaEstatus() {
		return (List<Estatus>) estatusDAO.findAll();
	}

	@Override
	public Optional<Estatus> listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Estatus p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Estatus p) {
		// TODO Auto-generated method stub

	}

}
