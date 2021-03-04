package edu.fiuba.algo3.modelo.bloque;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public abstract class BloqueAcoplado {
    public List<IBloque> bloquesAcoplados = new ArrayList<IBloque>();

    public BloqueAcoplado () {}

    public void agregarBloque(IBloque bloque) {
        bloquesAcoplados.add(bloque);
    }

    public void removerBloque(IBloque bloque) {
        bloquesAcoplados.remove(bloque);
    }

    public List<IBloque> getBloques() {
        return bloquesAcoplados;
    }

    public List<VBox> vistasBloques(Stage stage){
        System.out.println(bloquesAcoplados.size());
        List<VBox> boxes = new ArrayList<>();
        bloquesAcoplados.forEach(bloque -> {
            boxes.add(bloque.vista(stage));
        });
        return boxes;
    }
}
