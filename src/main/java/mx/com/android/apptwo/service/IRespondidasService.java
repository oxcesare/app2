package mx.com.android.apptwo.service;

import java.util.List;
import java.util.Optional;

import mx.com.android.apptwo.entity.Respondidas;

public interface IRespondidasService {

	public List<Respondidas> listaRespondidas();

	public Optional<Respondidas> listarId(Integer id);

	public int save(Respondidas p);

	public void delete(Respondidas p);

}
