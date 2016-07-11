
package javafxprototipo;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/*
 * @author Edwin Mendez
 */
public class Metodo {

   
public Metodo() {
}
 
//efecto ingresar
    public void BActionIngresar(ImageView Fondo11) {
    TranslateTransition translateTransition = new TranslateTransition( Duration.millis(1000), Fondo11);
    translateTransition.setFromY(0);
    translateTransition.setToY(-600);
    translateTransition.setCycleCount(1);
    translateTransition.setAutoReverse(false);
    translateTransition.play();
    }

//efecto cerrar sesion
  public void BActionCerrarSesion(ImageView Fondo11) {
    TranslateTransition translateTransition = new TranslateTransition( Duration.millis(1000), Fondo11);
    translateTransition.setFromY(-600);
    translateTransition.setToY(0);
    translateTransition.setCycleCount(1);
    translateTransition.setAutoReverse(false);
   
    TranslateTransition translateTransition2 = new TranslateTransition( Duration.millis(300), Fondo11);
    translateTransition2.setFromY(0);
    translateTransition2.setToY(-70);
    translateTransition2.setCycleCount(1);
    translateTransition2.setAutoReverse(false);
   
    TranslateTransition translateTransition3 = new TranslateTransition( Duration.millis(300), Fondo11);
    translateTransition3.setFromY(-70);
    translateTransition3.setToY(0);
    translateTransition3.setCycleCount(1);
    translateTransition3.setAutoReverse(false);
   
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
    
    TranslateTransition translateTransition6 = new TranslateTransition( Duration.millis(250), Fondo11);
    translateTransition6.setFromY(0);
    translateTransition6.setToY(-15);
    translateTransition6.setCycleCount(1);
    translateTransition6.setAutoReverse(false);
    
    TranslateTransition translateTransition7 = new TranslateTransition( Duration.millis(250), Fondo11);
    translateTransition7.setFromY(-15);
    translateTransition7.setToY(0);
    translateTransition7.setCycleCount(1);
    translateTransition7.setAutoReverse(false);
    
    SequentialTransition sequentialTransition = new SequentialTransition();
    sequentialTransition.getChildren().addAll(
    translateTransition,translateTransition2,translateTransition3,
    translateTransition4,translateTransition5,translateTransition6,translateTransition7);
    sequentialTransition.setCycleCount(1);
    sequentialTransition.setAutoReverse(true);
    sequentialTransition.play();
    
  }    
    
    
    
}
