package mx.uv.gamehub.mantenimiento.repositorios;

import mx.uv.gamehub.mantenimiento.models.EquipoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//una clase que permite hacer consultas a una base de datos en este caso utilizamos JPA mandandole el modelo
@Repository
public interface IEquipoRepository extends JpaRepository<EquipoModel, Long> {

}
