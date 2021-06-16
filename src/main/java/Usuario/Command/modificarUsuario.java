package Usuario.Command;

import Usuario.Values.DatosUsuario;

public class modificarUsuario {

    public DatosUsuario getDatos() {
        return datos;
    }

    private final DatosUsuario datos;

    public modificarUsuario(DatosUsuario datos) {
        this.datos = datos;
    }

}
