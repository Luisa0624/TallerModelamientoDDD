package Usuario.Event;

import Usuario.Values.DatosUsuario;
import co.com.sofka.domain.generic.DomainEvent;

public class UsuarioRegistrado extends DomainEvent {

    private final DatosUsuario datosUsuario;

    public UsuarioRegistrado(DatosUsuario datosUsuario) {
        super("bolsadeempleo.Usuario.UsuarioRegistrado");
        this.datosUsuario=datosUsuario;
    }

    public DatosUsuario getDatosUsuario() {
        return datosUsuario;
    }
}
