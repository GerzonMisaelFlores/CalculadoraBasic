/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
/**
 *
 * @author Gerzon Flores / 20201900042
 */
public class FXMLvistaController implements Initializable {
   
    @FXML
    private TextField txt_result;
    
    String op ="";
    long number1;
    long number2;
    
     //Este es el primer todogo.
    public void Number (ActionEvent ae) {
    
        String no =((Button)ae.getSource()).getText();
        txt_result.setText(txt_result.getText()+no);
    }
    
    //Este es el segundo metodo.
    public void Operation (ActionEvent ae) {
    
    String operation =((Button)ae.getSource()).getText();
    if(!operation.equals("=")){
        
        if (!op.equals("")){
         return;
    }
    op=operation;
    number1=Long.parseLong (txt_result.getText());
    txt_result.setText("");
    }else {
    if(op.equals("")){
        return;
    }
    number2 = Long.parseLong (txt_result.getText());
    calculate (number1, number2, op);
    op="";
    }
   } 
    
    //Este es el tercer metodo.
public void calculate (long n1, long n2, String op) {
    
switch (op){
case "+" : txt_result.setText (n1 + n2 + "");break;
case "-" : txt_result.setText (n1 - n2 + "");break;
case "*" : txt_result.setText (n1 * n2 + "");break;
case "/" :
    if (n2 == 0) {
txt_result.setText("0");break;
}
txt_result.setText(n1/n2+ "");break;
}
}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
