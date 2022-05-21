import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MainFrame {

    @FXML
    private TextField input_txt;

    @FXML
    private Label lex_lbl;

    @FXML
    private TableView<?> lex_tree;

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
    }

}
