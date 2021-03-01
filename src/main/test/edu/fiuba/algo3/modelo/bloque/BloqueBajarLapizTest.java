package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.lapiz.Lapiz;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class BloqueBajarLapizTest {

    public BloqueBajarLapiz bloqueBajarLapiz = new BloqueBajarLapiz();
    // public Personaje personaje = new Personaje(); Lanza Error personaje no se puede acceder desde este paquete

    @Mock
    private final SectorDibujo sectorDibujo = Mockito.mock(SectorDibujo.class);



    @Test
    void alRealizarLaAccionSeBajaElLapiz() {

    }

}
