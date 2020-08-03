package mx.com.android.apptwo.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.android.apptwo.entity.Respondidas;
import mx.com.android.apptwo.entity.Respuestas;


@Repository
public interface RespuestasDAO extends CrudRepository<Respuestas,Integer> {

}
