package Profesional;

import Profesional.Event.*;
import Profesional.Values.*;
import Usuario.Event.UsuarioRegistrado;
import co.com.sofka.domain.generic.EventChange;

public class ProfesionalChange extends EventChange {

    public ProfesionalChange(profesional profesional) {

        apply((ProfesionalModificado event) ->{
            profesional.profesional=event.getProfesional();
        });


    }
}
