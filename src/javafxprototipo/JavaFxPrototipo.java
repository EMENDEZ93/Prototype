
package javafxprototipo;

import java.io.File;
import javafx.animation.Interpolator;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/*
 * @author Edwin Mendez
 */

public class JavaFxPrototipo extends Application {
    
//editable tamaña de la interfaz    
int TamañoX = 800;    
int TamañoY = 600;    

//nodo padre para el scenne    
    Group Pane = new Group();
    
    @Override
    public void start(Stage Stage) {
          
    //nodo padre para los Tab
        TabPane TPane = new TabPane();        
        TPane.setPrefSize(TamañoX,TamañoY);           
        
        
//______________________________________________________________________________
//pestaña 0

    //imagen de fondo para la pestaña    
        ImageView Fondo = new ImageView(new Image(getClass().getResourceAsStream("\\Image\\Rio2.png")));
        Fondo.setFitHeight(TamañoY);
        Fondo.setFitWidth(TamañoX);
        
    
    //creacion de la pestaña    
        Tab tab = new Tab();

    //boton para activar la pestaña    
        Button BottonTab = new Button("Registro");            
        BottonTab.setOnAction( event -> BActionToolBarr(tab,TPane) );

    //pane para personalizar los nodos de cada pestaña    
        Pane PaneTab = new Pane();
        
    //Nodos ha agregar    
        Label n = new Label("Edwin Mendez");
        n.setLayoutX(100);
        n.setLayoutY(200);
        
    //agregar al nodo padre de la pestaña    
        PaneTab.getChildren().addAll(Fondo,n);
        
    //agregar PaneTab a la pestaña 
        tab.setContent(PaneTab);
//______________________________________________________________________________

        



//______________________________________________________________________________
//pestaña 1

    //imagen de fondo para la pestaña    
        ImageView Fondo1 = new ImageView(new Image(getClass().getResourceAsStream("\\Image\\Sport.png")));
        Fondo1.setFitHeight(TamañoY);
        Fondo1.setFitWidth(TamañoX);
        
    
    //creacion de la pestaña    
        Tab tab1 = new Tab();

    //boton para activar la pestaña    
        Button BottonTab1 = new Button("Medallero");            
        BottonTab1.setOnAction( event -> BActionToolBarr(tab1,TPane) );

    //pane para personalizar los nodos de cada pestaña    
        Pane PaneTab1 = new Pane();
        
    //Nodos ha agregar    
        Label n1 = new Label("- Edwin Mendez -");
        n1.setLayoutX(100);
        n1.setLayoutY(200);
        
    //agregar al nodo padre de la pestaña    
        PaneTab1.getChildren().addAll(Fondo1,n1);
        
    //agregar PaneTab a la pestaña 
        tab1.setContent(PaneTab1);
//______________________________________________________________________________





//______________________________________________________________________________
//pestaña 2

    //imagen de fondo para la pestaña    
        ImageView Fondo2 = new ImageView(new Image(getClass().getResourceAsStream("\\Image\\Mapa2.png")));
        Fondo2.setFitHeight(TamañoY);
        Fondo2.setFitWidth(TamañoX);
        
    
    //creacion de la pestaña    
        Tab tab2 = new Tab();

    //boton para activar la pestaña    
        Button BottonTab2 = new Button("SurAmerica");            
        BottonTab2.setOnAction( event -> BActionToolBarr(tab2,TPane) );

    //pane para personalizar los nodos de cada pestaña    
        Pane PaneTab2 = new Pane();
        
    //Nodos ha agregar    
        Label n2 = new Label("* Edwin Mendez *");
        n2.setLayoutX(100);
        n2.setLayoutY(200);
        
    //agregar al nodo padre de la pestaña    
        PaneTab2.getChildren().addAll(Fondo2,n2);
        
    //agregar PaneTab a la pestaña 
        tab2.setContent(PaneTab2);
//______________________________________________________________________________





//______________________________________________________________________________
//pestaña 3

    //imagen de fondo para la pestaña    
        ImageView Fondo3 = new ImageView(new Image(getClass().getResourceAsStream("\\Image\\Anillos.jpg")));
        Fondo3.setFitHeight(TamañoY);
        Fondo3.setFitWidth(TamañoX);
        
    
    //creacion de la pestaña    
        Tab tab3 = new Tab();

    //boton para activar la pestaña    
        Button BottonTab3 = new Button("Destacados");            
        BottonTab3.setOnAction( event -> BActionToolBarr(tab3,TPane) );

    //pane para personalizar los nodos de cada pestaña    
        Pane PaneTab3 = new Pane();
        
    //Nodos ha agregar    
        Label n3 = new Label("X Edwin Mendez X");
        n3.setLayoutX(100);
        n3.setLayoutY(200);
        
    //agregar al nodo padre de la pestaña    
        PaneTab3.getChildren().addAll(Fondo3,n3);
        
    //agregar PaneTab a la pestaña 
        tab3.setContent(PaneTab3);
//______________________________________________________________________________





//______________________________________________________________________________
//pestaña 4

    //imagen de fondo para la pestaña    
        ImageView Fondo4 = new ImageView(new Image(getClass().getResourceAsStream("\\Image\\Colombia.jpg")));
        Fondo4.setFitHeight(TamañoY);
        Fondo4.setFitWidth(TamañoX);
        
    
    //creacion de la pestaña    
        Tab tab4 = new Tab();

    //boton para activar la pestaña    
        Button BottonTab4 = new Button("Historia Colombia");            
        BottonTab4.setOnAction( event -> BActionToolBarr(tab4,TPane) );

    //pane para personalizar los nodos de cada pestaña    
        Pane PaneTab4 = new Pane();
        
    //Nodos ha agregar    
        Label n4 = new Label("XD Edwin Mendez CX");
        n4.setLayoutX(100);
        n4.setLayoutY(200);
        
    //agregar al nodo padre de la pestaña    
        PaneTab4.getChildren().addAll(Fondo4,n4);
        
    //agregar PaneTab a la pestaña 
        tab4.setContent(PaneTab4);
//______________________________________________________________________________





//______________________________________________________________________________
//pestaña 5

    //imagen de fondo para la pestaña    
        ImageView Fondo5 = new ImageView(new Image(getClass().getResourceAsStream("\\Image\\Juegos.png")));
        Fondo5.setFitHeight(TamañoY);
        Fondo5.setFitWidth(TamañoX);
        
    
    //creacion de la pestaña    
        Tab tab5 = new Tab();

    //boton para activar la pestaña    
        Button BottonTab5 = new Button("Colombia 2016");            
        BottonTab5.setOnAction( event -> BActionToolBarr(tab5,TPane) );

    //pane para personalizar los nodos de cada pestaña    
        Pane PaneTab5 = new Pane();
        
    //Nodos ha agregar    
        Label n5 = new Label("<I Edwin Mendez I>");
        n5.setLayoutX(100);
        n5.setLayoutY(200);
        
    //agregar al nodo padre de la pestaña    
        PaneTab5.getChildren().addAll(Fondo5,n5);
        
    //agregar PaneTab a la pestaña 
        tab5.setContent(PaneTab5);
//______________________________________________________________________________





//______________________________________________________________________________
//pestaña 6

    //imagen de fondo para la pestaña    
        ImageView Fondo6 = new ImageView(new Image(getClass().getResourceAsStream("\\Image\\Datos.jpg")));
        Fondo6.setFitHeight(TamañoY);
        Fondo6.setFitWidth(TamañoX);
        
    
    //creacion de la pestaña    
        Tab tab6 = new Tab();

    //boton para activar la pestaña    
        Button BottonTab6 = new Button("Datos");            
        BottonTab6.setOnAction( event -> BActionToolBarr(tab6,TPane) );

    //pane para personalizar los nodos de cada pestaña    
        Pane PaneTab6 = new Pane();
        
    //Nodos ha agregar    
        Label n6 = new Label("<8 Edwin Mendez 8>");
        n6.setLayoutX(100);
        n6.setLayoutY(200);
        
    //agregar al nodo padre de la pestaña    
        PaneTab6.getChildren().addAll(Fondo6,n6);
        
    //agregar PaneTab a la pestaña 
        tab6.setContent(PaneTab6);
//______________________________________________________________________________






//______________________________________________________________________________
//pestaña 7

    //imagen de fondo para la pestaña    
        ImageView Fondo7 = new ImageView(new Image(getClass().getResourceAsStream("\\Image\\Datos1.jpg")));
        Fondo7.setFitHeight(TamañoY);
        Fondo7.setFitWidth(TamañoX);
        
    
    //creacion de la pestaña    
        Tab tab7 = new Tab();

    //boton para activar la pestaña    
        Button BottonTab7 = new Button("Consultar");            
        BottonTab7.setOnAction( event -> BActionToolBarr(tab7,TPane) );

    //pane para personalizar los nodos de cada pestaña    
        Pane PaneTab7 = new Pane();
        
    //Nodos ha agregar    
        Label n7 = new Label("<- Edwin Mendez ->");
        n7.setLayoutX(100);
        n7.setLayoutY(200);
        
    //agregar al nodo padre de la pestaña    
        PaneTab7.getChildren().addAll(Fondo7,n7);
        
    //agregar PaneTab a la pestaña 
        tab7.setContent(PaneTab7);
//______________________________________________________________________________





//______________________________________________________________________________
//pestaña 8

    //imagen de fondo para la pestaña    
        ImageView Fondo8 = new ImageView(new Image(getClass().getResourceAsStream("\\Image\\CrearP.jpg")));
        Fondo8.setFitHeight(TamañoY);
        Fondo8.setFitWidth(TamañoX);
        
    
    //creacion de la pestaña    
        Tab tab8 = new Tab();

    //boton para activar la pestaña    
        Button BottonTab8 = new Button("Crear Pais");            
        BottonTab8.setOnAction( event -> BActionToolBarr(tab8,TPane) );

    //pane para personalizar los nodos de cada pestaña    
        Pane PaneTab8 = new Pane();
        
    //Nodos ha agregar    
        Label n8 = new Label("<- Edwin Mendez ->");
        n8.setLayoutX(100);
        n8.setLayoutY(200);
        
    //agregar al nodo padre de la pestaña    
        PaneTab8.getChildren().addAll(Fondo8,n8);
        
    //agregar PaneTab a la pestaña 
        tab8.setContent(PaneTab8);
//______________________________________________________________________________




//______________________________________________________________________________
//pestaña 9

    //imagen de fondo para la pestaña    
        ImageView Fondo9 = new ImageView(new Image(getClass().getResourceAsStream("\\Image\\Famosos.jpg")));
        Fondo9.setFitHeight(TamañoY);
        Fondo9.setFitWidth(TamañoX);
        
    
    //creacion de la pestaña    
        Tab tab9 = new Tab();

    //boton para activar la pestaña    
        Button BottonTab9 = new Button("Crear Famosos");            
        BottonTab9.setOnAction( event -> BActionToolBarr(tab9,TPane) );

    //pane para personalizar los nodos de cada pestaña    
        Pane PaneTab9 = new Pane();
        
    //Nodos ha agregar    
        Label n9 = new Label("<- Edwin Mendez ->");
        n9.setLayoutX(100);
        n9.setLayoutY(200);
        
    //agregar al nodo padre de la pestaña    
        PaneTab9.getChildren().addAll(Fondo9,n9);
        
    //agregar PaneTab a la pestaña 
        tab9.setContent(PaneTab9);
//______________________________________________________________________________





//______________________________________________________________________________
//pestaña 10

    //imagen de fondo para la pestaña    
        ImageView Fondo10 = new ImageView(new Image(getClass().getResourceAsStream("\\Image\\Col.jpg")));
        Fondo10.setFitHeight(TamañoY);
        Fondo10.setFitWidth(TamañoX);
        
    
    //creacion de la pestaña    
        Tab tab10 = new Tab();

    //boton para activar la pestaña    
        Button BottonTab10 = new Button("Crear Colombiano");            
        BottonTab10.setOnAction( event -> BActionToolBarr(tab10,TPane) );

    //pane para personalizar los nodos de cada pestaña    
        Pane PaneTab10 = new Pane();
        
    //Nodos ha agregar    
        Label n10 = new Label("<- Edwin Mendez ->");
        n10.setLayoutX(100);
        n10.setLayoutY(200);
        
    //agregar al nodo padre de la pestaña    
        PaneTab10.getChildren().addAll(Fondo10,n10);
        
    //agregar PaneTab a la pestaña 
        tab10.setContent(PaneTab10);
//______________________________________________________________________________






//______________________________________________________________________________
//boton de ingresar

    //imagen de fondo para la pestaña    
        ImageView Fondo11 = new ImageView(new Image(getClass().getResourceAsStream("\\Image\\Rio.jpg")));
        Fondo11.setFitHeight(TamañoY);
        Fondo11.setFitWidth(TamañoX);

        Button BIngresar = new Button("- Ingresar -");
        BIngresar.setOnAction( event -> BActionIngresar(Fondo11) );

//______________________________________________________________________________





//______________________________________________________________________________
//Boton cerrar sesion

    //boton para activar la pestaña    
        Button BCerrarSesion = new Button("Cerrar Sesion");            
        BCerrarSesion.setOnAction( event -> BActionCerrarSesion(Fondo11) );
//______________________________________________________________________________


         ToolBar toolBar = new ToolBar(
           BottonTab
           ,BottonTab1
           ,BottonTab2
           ,BottonTab3
           ,BottonTab4
           ,BottonTab5
           ,BottonTab6
           ,BottonTab7
           ,BottonTab8
           ,BottonTab9
           ,BottonTab10
           ,BCerrarSesion
         );         
         toolBar.setPrefSize(TamañoX,0);
        

         
         
         
        Pane.getChildren().addAll(TPane,toolBar,Fondo11,BIngresar);

        Scene scene = new Scene(Pane,TamañoX,TamañoY);        
        Stage.setTitle("Prototype");
        Stage.setScene(scene);
        Stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    private void BActionToolBarr(Tab Pestaña,TabPane TP) {
        TP.getTabs().clear();
        TP.getTabs().addAll(Pestaña);
    }

    private void BActionIngresar(ImageView Fondo11) {
    TranslateTransition translateTransition = new TranslateTransition( Duration.millis(1000), Fondo11);
    translateTransition.setFromY(0);
    translateTransition.setToY(-600);
    translateTransition.setCycleCount(1);
    translateTransition.setAutoReverse(false);
    translateTransition.play();
    }
    
    private void BActionCerrarSesion(ImageView Fondo11) {
    TranslateTransition translateTransition = new TranslateTransition( Duration.millis(1000), Fondo11);
    translateTransition.setFromY(-600);
    translateTransition.setToY(0);
    translateTransition.setCycleCount(1);
    translateTransition.setAutoReverse(false);
   /// translateTransition.play();
   
    TranslateTransition translateTransition2 = new TranslateTransition( Duration.millis(300), Fondo11);
    translateTransition2.setFromY(0);
    translateTransition2.setToY(-70);
    translateTransition2.setCycleCount(1);
    translateTransition2.setAutoReverse(false);
   // translateTransition2.play();
   
    TranslateTransition translateTransition3 = new TranslateTransition( Duration.millis(300), Fondo11);
    translateTransition3.setFromY(-70);
    translateTransition3.setToY(0);
    translateTransition3.setCycleCount(1);
    translateTransition3.setAutoReverse(false);
  //translateTransition.play();
   
    TranslateTransition translateTransition4 = new TranslateTransition( Duration.millis(250), Fondo11);
    translateTransition4.setFromY(0);
    translateTransition4.setToY(-30);
    translateTransition4.setCycleCount(1);
    translateTransition4.setAutoReverse(false);

    TranslateTransition translateTransition5 = new TranslateTransition( Duration.millis(250), Fondo11);
    translateTransition5.setFromY(-30);
    translateTransition5.setToY(0);
    translateTransition5.setCycleCount(1);
    translateTransition5.setAutoReverse(false);
    
    SequentialTransition sequentialTransition = new SequentialTransition();
    sequentialTransition.getChildren().addAll(translateTransition,translateTransition2,translateTransition3,translateTransition4,translateTransition5);
    sequentialTransition.setCycleCount(1);
    sequentialTransition.setAutoReverse(true);
    sequentialTransition.play();
    }
        
    
}
