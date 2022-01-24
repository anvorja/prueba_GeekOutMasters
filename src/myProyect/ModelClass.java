package myProyect;

/**
 * @author Carlos Andrés Borja - borja.carlos@correounivalle.edu.co
 *         Deisy Catalina Melo - deisy.melo@correounivalle.edu.co
 * @version @version v.1.0.2 date: 19/01/2022
 */
public class ModelClass {

  private Dado dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
  private int bandera,contador;
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

    contador= 0;
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


  public Dado[] getDadosActivados() { return array_dadosActivados; }

  public Dado[] getDadosInactivos() { return array_dadosInactivos; }

  public Dado[] getArray_dadosUtilizados() { return array_dadosUtilizados; }

    public void eliminarElementoDeArrayDadosInactivos(){

      Dado[] auxDadosInactivos = new Dado[array_dadosInactivos.length-1];
      System.arraycopy(array_dadosInactivos, 1, auxDadosInactivos, 0, array_dadosInactivos.length - 1);
      array_dadosInactivos = auxDadosInactivos;

//    Dado[] auxDadosInactivos = new Dado[array_dadosInactivos.length-1];
//    for(int i=0; i<array_dadosInactivos.length-1; i++){
//      auxDadosInactivos[i]= array_dadosInactivos[i+1];
//    }
//    array_dadosActivados = auxDadosInactivos;

    }

  public void meterEnArrayDadosUtilizados(int posicion){
      array_dadosUtilizados[contador] = array_dadosActivados[posicion];
        contador += 1;
  }


//  public void determinarJuego() {
//  }



  public void validarBotonesAccionados(int n, int m) {

      if (m == 1) {
          switch (getDadosActivados()[n].getCara()) {
              case 1:
                  System.out.println("usó meeple");
                  break;
              case 2:
                  System.out.println("usó nave");
                  break;
              case 3:
                  System.out.println("usó superH");
                  break;
              case 4:
                  System.out.println("usó dragón");
                  break;
              case 5:
                  System.out.println("usó corazón");
                  break;
              case 6:
                  System.out.println("usó 42");
                  break;
          }
      }
      if (m == 2) {

          switch (getDadosInactivos()[n].getCara()) {
              case 1:
                  System.out.println("usó meeple");
                  break;
              case 2:
                  System.out.println("usó nave");
                  break;
              case 3:
                  System.out.println("usó superH");
                  break;
              case 4:
                  System.out.println("usó dragón");
                  break;
              case 5:
                  System.out.println("usó corazón");
                  break;
              case 6:
                  System.out.println("usó 42");
                  break;
          }
      }
  }

  public  void accionarBoton(int posicionArrayDadosActivados){

      switch (array_dadosUtilizados[contador-1].getCara()){
          case 1: array_dadosActivados[posicionArrayDadosActivados]= new Dado();
                  break;
          case 2: meterEnArrayDadosUtilizados(posicionArrayDadosActivados);
              break;
          case 3: array_dadosActivados[posicionArrayDadosActivados].setCara(array_dadosActivados[posicionArrayDadosActivados].getCaraOpuesta());
              break;
          case 5: array_dadosActivados[posicionArrayDadosActivados] = new Dado();
              eliminarElementoDeArrayDadosInactivos();

              System.out.println("activaste un dado");

              //prueba en consola
              for(int i = 0; i < array_dadosActivados.length; i++){
                  System.out.println(array_dadosActivados[i].getNameFace());
              }
              break;

      }

  }
}
