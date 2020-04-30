package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable {

    @FXML
    private TableView<Kullanýcý> tablo1;

    @FXML
    private TableColumn<Kullanýcý, Integer> tc_id;

    @FXML
    private TableColumn<Kullanýcý,String> tc_user;

    @FXML
    private TableColumn<Kullanýcý,String> tc_pass;

    @FXML
    private Button btnekle;

    @FXML
    private TextField txt_id;

    @FXML
    private TextField txt_user;

    @FXML
    private TextField txt_pass;
    private   ObservableList<Kullanýcý> veriler;
    @FXML
  public  void ekleveri(ActionEvent event) {
  	veriler=FXCollections.observableArrayList();
    	veriler.add(new Kullanýcý(Integer.parseInt(txt_id.getText()),txt_user.getText(),
    	 txt_pass.getText()));
    	tablo1.getItems().addAll(veriler);
    	txt_id.setText("");
    	txt_pass.setText("");
    	txt_user.setText("");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		tablo1.setPlaceholder(new Label("merhaba"));
		 tc_id.setCellValueFactory(new PropertyValueFactory<> ("id"));
		 tc_user.setCellValueFactory(new PropertyValueFactory<> ("username"));
		 tc_pass.setCellValueFactory(new PropertyValueFactory<> ("password"));
		
	}

}
