package Servicio.Command;

import Servicio.Values.NombreCategoria;

public class modificarServicio {

    public NombreCategoria getCategoria() {
        return categoria;
    }

    private final NombreCategoria categoria;


    public modificarServicio(NombreCategoria categoria) {
        this.categoria = categoria;
    }
}
