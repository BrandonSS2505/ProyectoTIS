package mx.uv.gamehub.mantenimiento.controllers;


import mx.uv.gamehub.mantenimiento.models.EquipoModel;
import mx.uv.gamehub.mantenimiento.servicios.EquipoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/equipo")//definimos la ruta inicial para ingresar a lo demas
public class EquipoController {

    //aqui definicmos las peticiones y las rutas
    @Autowired
    private EquipoServices equipoServices;

    //ruta que emplea los metodos creados en services
    //llamda de tipo get
    @GetMapping
    public ArrayList<EquipoModel> getEquipo(){
        return this.equipoServices.getEquipos();
    }

    //este solo fue creado para pruebas de manera local
    @PostMapping
    public EquipoModel saveEquipo(@RequestBody EquipoModel equipo){
        return this.equipoServices.saveEquipo(equipo);
    }

    //llamada de tipo get pero solo por identificador que le pasemos
    @GetMapping(path = "/{id}")
    public Optional<EquipoModel> getEquipoById(@PathVariable Long id){
        return this.equipoServices.getById(id);
    }

    //lamda de tipo put para modificar los valores del equipo dependiendo del identificador que le pasemos, es cierto que se puede utilizar post pero se decidio utilizar put ya que solo buscamos la modificacion
    @PutMapping(path = "/{id}")
    public EquipoModel updateEquipoById(@RequestBody EquipoModel request,@PathVariable Long id){
        return this.equipoServices.updateById(request, id);
    }
}
