package mx.uv.gamehub.mantenimiento.servicios;

import mx.uv.gamehub.mantenimiento.models.EquipoModel;
import mx.uv.gamehub.mantenimiento.repositorios.IEquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
//notacion service
@Service
public class EquipoServices {

    @Autowired//inyeccion de dependencias
    IEquipoRepository equipoRepository;

    //metodo para obtener todos los ususarios que nos retorna un arreglo del modelo, obteniendo todos los datos
    public ArrayList<EquipoModel> getEquipos(){
        return (ArrayList<EquipoModel>) equipoRepository.findAll();
    }
    //este solo fue creado para pruebas de manera local
    public EquipoModel saveEquipo(EquipoModel equipo){
        return equipoRepository.save(equipo);
    }
    //metodo para llamar datos dependiendo del id que le demos
    public Optional<EquipoModel> getById(Long id){
        return equipoRepository.findById(id);
    }
    //modificar dos atributos dependiendo del identificador que le demos
    public EquipoModel updateById(EquipoModel request, Long id){
        EquipoModel equipo = equipoRepository.findById(id).get();

        equipo.setEstado(request.getEstado());
        equipo.setCondicion(request.getCondicion());
        equipoRepository.save(equipo);
        return equipo;
    }
}
