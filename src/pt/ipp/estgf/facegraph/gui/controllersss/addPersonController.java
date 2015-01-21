package pt.ipp.estgf.facegraph.gui.controllersss;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import pt.ipp.estgf.facegraph.entities.Vertice;
import pt.ipp.estgf.facegraph.gui.Teste;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * Work done by:
 * Antonio Magalhaes
 * Pedro Fernandes
 */

class AddPersonController extends Pane {

    /**
     * Class instance.
     */
    private static AddPersonController instance;

    /**
     * Get the class instance.
     *
     * @return
     */
    public static AddPersonController getInstance() {
        if (instance == null) {
            instance = new AddPersonController();
        }
        return instance;
    }

    @FXML
    private TextField personName;
    @FXML
    private TextField personCity;
    @FXML
    private TextArea output;
    @FXML
    private Button buttonConfirm;

    private AddPersonController() {
        // loads the view
        FXMLLoader loader = new FXMLLoader(AddPersonController.class.getResource("../views/addPerson.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


        buttonConfirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Teste.getInstance().getGrath().addVertex(new Vertice(personName.getText(), personCity.getText()));
                output.setText("Foi criada a pessoa");
            }

        });

    }


}