import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MainFrame implements Initializable{

    @FXML
    private TextField input_txt;

    @FXML
    private Label lex_lbl;

    @FXML
    private TableView<structure> lex_tree;

    @FXML
    private TableColumn<structure, String> name_col; 
    
    @FXML
    private TableColumn<structure, String> val_col;

    ObservableList<structure> lex_list = FXCollections.observableArrayList();

    @FXML
    private Button rst_btn;

    @FXML
    private Label rsu_btn;

    @FXML
    private Button save_tbl_btn;

    @FXML
    private Button save_tree_btn;

    @FXML
    private Label source_code_lbl;

    @FXML
    private Button submit_btn;

    @FXML
    private Label syn_labl;

    @FXML
    private Canvas syn_tree;

    @FXML
    void resetCode(ActionEvent event) {
        // clear input text field, table, and canvas
        input_txt.setText("");
        lex_tree.getItems().clear();
        syn_tree.getGraphicsContext2D().clearRect(0, 0, syn_tree.getWidth(), syn_tree.getHeight());
        rsu_btn.setText("");
    }

    @FXML
    void saveTableBtn(ActionEvent event) {

    }

    @FXML
    void saveTreebtn(ActionEvent event) {

    }

    @FXML
    void submitCode(ActionEvent event) {
        rsu_btn.setText(input_txt.getText());
        // get text from input text field
        String inputs = input_txt.getText();
        String[] tokens = lexical_analyzer.lex_analyze(inputs);
        // ObservableList<structure> lex_list = FXCollections.observableArrayList();
        // lex_list.add(struct);
        for (int i = 0; i < tokens.length; i++) {
            this.lex_list.add(new structure(
                tokens[i],
                tokens[i]
            ));
        }
        lex_tree.setItems(lex_list);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // initialize table
        name_col.setCellValueFactory(new PropertyValueFactory<structure, String>("name"));
        val_col.setCellValueFactory(new PropertyValueFactory<structure, String>("value"));
    }
}
