package Servicio;

import Servicio.Event.ServicioCreado;
import Servicio.Event.ServicioModificado;
import Servicio.Values.NombreCategoria;
import Servicio.Values.ServicioID;
import Servicio.Values.SubservicioID;
import Usuario.UsuarioChange;
import Usuario.Values.UsuarioID;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Servicio extends AggregateEvent<ServicioID> {

    protected NombreCategoria categoria;
    protected Set<SubServicio> subservicios;

    public Servicio(ServicioID entityId, NombreCategoria categoria) {
        super(entityId);
        appendChange(new ServicioCreado(categoria)).apply();
    }

    private Servicio(ServicioID entityId){
        super(entityId);
        subscribe(new ServicioChange(this));
    }

    public void modificarServicio(NombreCategoria categoria){
        appendChange(new ServicioModificado(categoria)).apply();
    }


    public NombreCategoria getCategoria() {
        return categoria;
    }

    public Set<SubServicio> getSubservicios() {
        return subservicios;
    }


}
