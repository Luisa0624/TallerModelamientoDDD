package Usuario.Event;

import Usuario.Values.DatosUsuario;
import co.com.sofka.domain.generic.DomainEvent;

public class UsuarioModificado extends DomainEvent {

    private  DatosUsuario datosUsuario;

    public UsuarioModificado(DatosUsuario datos) {
        super("bolsadeempleo.Usuario.UsuarioRegistrado");
        this.datosUsuario=datosUsuario;
    }

    public DatosUsuario getDatosUsuario() {
        return datosUsuario;
    }
}
