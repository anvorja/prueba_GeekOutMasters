package myProyect;

/**
 * @author Carlos Andrés Borja - borja.carlos@correounivalle.edu.co
 *         Deisy Catalina Melo - deisy.melo@correounivalle.edu.co
 * @version @version v.1.0.2 date: 19/01/2022
 */
public class ModelClass {

  private Dado dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
  private int bandera;
  private Dado[] array_dadosActivados;
  private Dado[] array_dadosInactivos;
  private Dado[] array_dadosUtilizados;

  /**
   * Class Constructor
   */
  public ModelClass() {

    dado1 = new Dado();
    dado2 = new Dado();
    dado3 = new Dado();
    dado4 = new Dado();
    dado5 = new Dado();
    dado6 = new Dado();
    dado7 = new Dado();
    dado8 = new Dado();
    dado9 = new Dado();
    dado10 = new Dado();

    array_dadosActivados = new Dado[7];
    iniciar_array_dadosActivados();

    array_dadosInactivos = new Dado[3];
    iniciar_array_dadosInactivos();

    array_dadosUtilizados = new Dado[10];

    bandera = 0;
  }

  public void iniciar_array_dadosActivados() {

    array_dadosActivados[0] = dado1;
    array_dadosActivados[1] = dado2;
    array_dadosActivados[2] = dado3;
    array_dadosActivados[3] = dado4;
    array_dadosActivados[4] = dado5;
    array_dadosActivados[5] = dado6;
    array_dadosActivados[6] = dado7;

    System.out.println("array_dadosActivados");
    for (int i = 0; i < 7; i++) {
      System.out.println(array_dadosActivados[i].getCara() +
              " op: " + array_dadosActivados[i].getCaraOpuesta());
    }
  }

  public void iniciar_array_dadosInactivos() {

    array_dadosInactivos[0] = dado8;
    array_dadosInactivos[1] = dado9;
    array_dadosInactivos[2] = dado10;

    System.out.println("array_dadosInactivos");
    for (int i = 0; i <= 2; i++) {
      System.out.println(array_dadosInactivos[i].getCara() +
              " op: " + array_dadosInactivos[i].getCaraOpuesta());
    }
  }

  public void iniciar_array_dadosUtilizados() {

    System.out.println("array_dadosInactivos");
    for (int i = 0; i <= 2; i++) {
      System.out.println(array_dadosUtilizados[i].getCara() +
              " op: " + array_dadosUtilizados[i].getCaraOpuesta());
    }
  }

//  public void determinarJuego() {
//  }

  public Dado[] getDadosActivados() { return array_dadosActivados; }

  public Dado[] getDadosInactivos() { return array_dadosInactivos; }

  public void validarBotonesAccionados(int n) {

    if (getDadosActivados()[n].getCara() == 1) {
      System.out.println("usó meeple");
    }
    if (getDadosActivados()[n].getCara() == 2) {

      System.out.println("usó nave");
    }
    if (getDadosActivados()[n].getCara() == 3) {
      System.out.println("usó superH");

    }
    if (getDadosActivados()[n].getCara() == 4) {
      System.out.println("usó dragón");
    }
    if (getDadosActivados()[n].getCara() == 5) {
      System.out.println("usó corazón");
    }
    if (getDadosActivados()[n].getCara() == 6) {
      System.out.println("usó 42");
    }
  }
}
