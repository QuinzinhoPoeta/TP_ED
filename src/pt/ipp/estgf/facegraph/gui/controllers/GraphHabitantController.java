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
 * Created by PedroFernandes on 16/01/15.
 */
public class GraphHabitantController extends Pane {

    /**
     * Work done by:
     * Antonio Magalhaes
     * Pedro Fernandes
     */
    private static GraphHabitantController instance;

    /**
     * Get the class instance.
     *
     * @return
     */
    public static GraphHabitantController getInstance() {
        if (instance == null) {
            instance = new GraphHabitantController();
        }
        return instance;
    }

    @FXML
    private ChoiceBox<String> city;
    @FXML
    private Button buttonConfirm;
    @FXML
    private TextArea output;

    //lista com as cidades
    private ObservableList<String> vertices = FXCollections.observableArrayList(Main.getInstance().getGrath().getAllCidades());


    private GraphHabitantController() {
        // loads the view
        FXMLLoader loader = new FXMLLoader(GraphHabitantController.class.getResource("../views/city.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        this.city.setItems(this.vertices);


        buttonConfirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                output.setText(String.valueOf(Main.getGraphInstance().graphoHabitantes(city.getValue())));
            }
        });
    }

}
