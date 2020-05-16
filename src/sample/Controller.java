package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

    public class  Controller{

        @FXML
        private TextField num1Field;

        @FXML
        private TextField num2Field;

        @FXML
        private TextField resultField;
        private double num1;
        private double num2;
        private double result;
        private Model model = new Model();

        @FXML
        void addClick(ActionEvent event) {
        num1= Integer.parseInt(num1Field.getText());
        num2= Integer.parseInt(num2Field.getText());
        result = model.calculate(num1,num2,'+');
        resultField.setText(String.valueOf(result));
        }

        @FXML
        void divisionClick(ActionEvent event) {

            num1= Integer.parseInt(num1Field.getText());
            num2= Integer.parseInt(num2Field.getText());
            result = model.calculate(num1,num2,'/');
            resultField.setText(String.valueOf(result));
        }

        @FXML
        void multiplicationClick(ActionEvent event) {

            num1= Integer.parseInt(num1Field.getText());
            num2= Integer.parseInt(num2Field.getText());
            result = model.calculate(num1,num2,'*');
            resultField.setText(String.valueOf(result));
        }

        @FXML
        void subtractClick(ActionEvent event) {

            num1= Integer.parseInt(num1Field.getText());
            num2= Integer.parseInt(num2Field.getText());
            result = model.calculate(num1,num2,'-');
            resultField.setText(String.valueOf(result));
        }

    }

