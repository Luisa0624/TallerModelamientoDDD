package Usuario;

import Usuario.Event.UsuarioModificado;
import Usuario.Event.UsuarioRegistrado;
import Usuario.Event.citaagendada;
import Usuario.Event.profesionalevaluado;
import co.com.sofka.domain.generic.EventChange;

public class UsuarioChange extends EventChange {

    public UsuarioChange(Usuario usuario) {

        apply((UsuarioRegistrado event) ->{
            usuario.datos=event.getDatosUsuario();
        });

        apply((UsuarioModificado event) ->{
            usuario.datos=event.getDatosUsuario();
        });

       apply((citaagendada event) ->{
           usuario.cita=event.getCita();
       });
    }
}
