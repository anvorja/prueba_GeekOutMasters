package myProyect;

import java.util.Random;

/**
 * This class generates a Random value between (1, 6)
 * @author Carlos Andrés Borja - borja.carlos@correounivalle.edu.co
 *         Deisy Catalina Melo - deisy.melo@correounivalle.edu.co
 * @version @version v.1.0.0 date: 19/01/2022
 */
public class Dado {

  private int cara, caraOpuesta;
  private String caraNombre;
  private int variablePrueba;

  public Dado() {
    setCara();
  }

  public void setCara() {

    Random aleatorio = new Random();
    cara = aleatorio.nextInt(6) + 1;
    setCaraOpuesta();
    setNameFace();

  }

  public void setCaraAlGirarDado(int nuevaCara ){
    cara = nuevaCara;
    setCaraOpuesta();
    setNameFace();
  }

  public void setCaraOpuesta() {

    if (cara == 1) {
      caraOpuesta = 2;
    }
    if (cara == 2) {
      caraOpuesta = 1;
    }
    if (cara == 3) {
      caraOpuesta = 4;
    }
    if (cara == 4) {
      caraOpuesta = 3;
    }
    if (cara == 5) {
      caraOpuesta = 6;
    }
    if (cara == 6) {
      caraOpuesta = 5;
    }
  }

  public void setNameFace() {
    if (cara == 1) {
      caraNombre = "Meeple";
    }
    if (cara == 2) {
      caraNombre = "Nave";
    }
    if (cara == 3) {
      caraNombre = "Superheroe";
    }
    if (cara == 4) {
      caraNombre = "Dragon";
    }
    if (cara == 5) {
      caraNombre = "Corazon";
    }
    if (cara == 6) {
      caraNombre = "42";
    }
  }

  public int getCara() { return cara; }

  public int getCaraOpuesta() { return caraOpuesta; }

  public String getNameFace() { return caraNombre; }

}
