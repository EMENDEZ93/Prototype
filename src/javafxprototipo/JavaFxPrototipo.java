
package javafxprototipo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/*
 * @author Edwin Mendez
 */

public class JavaFxPrototipo extends Application {
    
Button T = new Button("Tab");
Button T1 = new Button("Tab1");
Button T2 = new Button("Tab2");

Tab tab;
Tab tab1;
Tab tab2;



    @Override
    public void start(Stage Stage) {
    
        TabPane TPane = new TabPane();
        Group Pane = new Group();
        
        tab = new Tab();
        tab.setText("Tab 1");
        tab.setClosable(false);
        tab.setText("Tab");
        HBox hbox = new HBox();
        hbox.getChildren().add(new Label("Tab"));
        hbox.setAlignment(Pos.CENTER);
        tab.setContent(hbox);
        
        
        
        tab1 = new Tab();
        tab1.setText("Tab 1");
        tab1.setClosable(false);        
        HBox hbox1 = new HBox();
        hbox1.getChildren().add(new Label("Tab 1"));
        hbox1.setAlignment(Pos.CENTER);
        tab1.setContent(hbox1);
        
        
        tab2 = new Tab();
        tab2.setText("Tab 2");
        tab2.setClosable(false);  
        HBox hbox2 = new HBox();
        hbox2.getChildren().add(new Label("Tab 2"));
        hbox2.setAlignment(Pos.CENTER);
        tab2.setContent(hbox2);
        
        
         ToolBar toolBar = new ToolBar(
           T,
           T1,
           T2
         );
         
         toolBar.setPrefSize(300,0);
        T1.setOnAction(  event  ->  t( event ) );

         
        TPane.getTabs().addAll(tab,tab1,tab2);
        TPane.setPrefSize(300,250);
        Pane.getChildren().addAll(TPane,toolBar);

        Scene scene = new Scene(Pane, 300, 250);        
        Stage.setTitle("Prototype");
        Stage.setScene(scene);
        Stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void t(ActionEvent event) {
        System.out.println("dez");
    }
    
}
