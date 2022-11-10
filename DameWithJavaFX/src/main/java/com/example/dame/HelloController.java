package com.example.dame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;

public class HelloController {

    public GridPane grid;
    public boolean go=true;


    public void avance(ActionEvent actionEvent) {
        int i = 0,j=0;
        Button b=(Button) actionEvent.getSource();
        if(go){
            if(GridPane.getRowIndex(b)==null)i=0;
            else i=GridPane.getRowIndex(b);
            if(GridPane.getColumnIndex(b)==null)j=0;
            else j=GridPane.getColumnIndex(b);
            i--;j++;
            String posi=String.valueOf(i);
            String posj=String.valueOf(j);
            int pos=Integer.valueOf(posi+posj)-1;
            grid.getChildren().get(pos).setVisible(true);
            if(j!=1) grid.getChildren().get(pos-2).setVisible(true);
            go=false;
        }
        else {
            i=i+1;
            if(j==1)j=0;
            String posi=String.valueOf(i);
            String posj=String.valueOf(j);
            int pos=Integer.valueOf(posi+posj);
            grid.getChildren().get(pos).setVisible(false);
            /*if(GridPane.getRowIndex(b)==null)i=0;
            else i=GridPane.getRowIndex(b);
            if(GridPane.getColumnIndex(b)==null)j=0;
            else j=GridPane.getColumnIndex(b);
            posi=String.valueOf(i);
            posj=String.valueOf(j);
            pos=Integer.valueOf(posi+posj)-1;*/

        }
    }
}