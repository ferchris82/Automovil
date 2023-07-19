
package com.persistencia;

import com.logica.Automovil;

public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }
    
}
