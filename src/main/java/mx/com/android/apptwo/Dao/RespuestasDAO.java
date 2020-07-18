package mx.com.android.apptwo.Dao;

import org.springframework.data.repository.CrudRepository;

import mx.com.android.apptwo.entity.Respondidas;
import mx.com.android.apptwo.entity.Respuestas;

public interface RespuestasDAO extends CrudRepository<Respuestas,Integer> {

}
