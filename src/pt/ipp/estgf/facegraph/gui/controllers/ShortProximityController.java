package pt.ipp.estgf.facegraph.gui.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import pt.ipp.estgf.facegraph.Interfaces.VertexInterface;
import pt.ipp.estgf.facegraph.gui.Main;

import java.io.IOException;

/**
 * Work done by:
 * Antonio Magalhaes
 * Pedro Fernandes
 */
public class ShortProximityController extends Pane {

    /**
     * Classe instance
     */
    private static ShortProximityController instance;

    /**
     * Get the class instance
     */
    public static ShortProximityController getInstance() {
        if (instance == null) {
            instance = new ShortProximityController();
        }

        instance.reset();

        return instance;
    }


    @FXML
    private ChoiceBox<VertexInterface> person1;
    @FXML
    private ChoiceBox<VertexInterface> person2;
    @FXML
    private TextArea output;
    @FXML
    private Button buttonConfirm;

    // lista com todos os vertices
    private ObservableList<VertexInterface> vertices = FXCollections.observableArrayList(Main.getInstance().getGrath().getVertexs());

    private ShortProximityController() {
        // loads the view
        FXMLLoader loader = new FXMLLoader(ShortProximityController.class.getResource("../views/person1And2.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        this.person1.setItems(this.vertices);
        this.person2.setItems(this.vertices);

        buttonConfirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
              output.setText("A distancia maxima entre as duas pessoas é de: " + String.valueOf(Main.getInstance().getGrath().longestPathWeight(person1.getValue(), person2.getValue())));
            }
        });
    }

    private void reset() {
        this.vertices.clear();
        this.vertices.addAll(Main.getGraphInstance().getVertexs());
        this.output.setText("");
    }
}
