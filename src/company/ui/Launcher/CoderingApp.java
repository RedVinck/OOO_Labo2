package company.ui.Launcher;

import company.domain.model.Caesarcijfer;
import company.domain.model.Spiegeling;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class CoderingApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CoderingApp");
        FlowPane root = new FlowPane();
        Scene mainScene = new Scene(root);
        root.setAlignment(Pos.BASELINE_CENTER);
        root.setVgap(5);
        root.setHgap(5);


        Label codeLabeltinput = new Label("Line to (de)code");
        TextField codeTextFieldInput = new TextField();
        Label codeLabeloutput = new Label("Result= ");
        Label codeLabeloutputResult = new Label("Here will be the output");
        Label codeLabelAlgoritmetypes = new Label("Algoritm types");
        ObservableList<String> options =
                FXCollections.observableArrayList(
                        "CaeserCijfer",
                        "Spiegeling"
                );
        final ComboBox codeComboBoxAlgoritmes = new ComboBox(options);
        Button codeBtnDecode = new Button("Decode");
        Button codeBtnCode = new Button("Code");

        root.getChildren().add(codeLabeltinput);
        root.getChildren().add(codeTextFieldInput);
        root.getChildren().add(codeLabeloutput);
        root.getChildren().add(codeLabeloutputResult);
        root.getChildren().add(codeLabelAlgoritmetypes);
        root.getChildren().add(codeComboBoxAlgoritmes);
        root.getChildren().add(codeBtnDecode);
        root.getChildren().add(codeBtnCode);
        codeBtnDecode.setOnAction(new CheckResultCodeHandler(){
            @Override
            public void handle(ActionEvent event) {
                if (codeComboBoxAlgoritmes.equals(String.valueOf("CaeserCijfer"))){
               codeLabeloutputResult.setText(Caesarcijfer.codeDecoderen(codeTextFieldInput.getText()));
                }
                else if (codeComboBoxAlgoritmes.equals(String.valueOf("Spiegelijk"))){
                    codeLabeloutputResult.setText(Spiegeling.codeDecoderen(codeTextFieldInput.getText()));
                }
            }
        });
        codeBtnCode.setOnAction(new CheckResultCodeHandler(){
            @Override
            public void handle(ActionEvent event) {
                if (codeComboBoxAlgoritmes.equals(String.valueOf("CaeserCijfer"))){
                    codeLabeloutputResult.setText(Caesarcijfer.codeCoderen(codeTextFieldInput.getText()));
                }
                else if (codeComboBoxAlgoritmes.equals(String.valueOf("Spiegelijk"))){
                    codeLabeloutputResult.setText(Spiegeling.codeCoderen(codeTextFieldInput.getText()));
                }
            }
        });


        primaryStage.setScene(mainScene);

        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }


}
