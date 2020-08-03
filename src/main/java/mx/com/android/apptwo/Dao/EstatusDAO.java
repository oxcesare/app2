package mx.com.android.apptwo.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.android.apptwo.entity.Estatus;

@Repository
public interface EstatusDAO extends CrudRepository<Estatus, Integer>{

}
