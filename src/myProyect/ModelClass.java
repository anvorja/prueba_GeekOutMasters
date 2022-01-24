package myProyect;

import java.util.Scanner;

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
  private int variableModel;

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


  }

  public Dado[] getDadosActivados() {
    return array_dadosActivados;
  }

  public Dado[] getDadosInactivos() { return array_dadosInactivos; }

  public void eliminarDadoDeArrayDadosInactivos(){

    Dado[] auxDadosInactivos = new Dado[array_dadosInactivos.length-1];
    System.arraycopy(array_dadosInactivos, 1, auxDadosInactivos, 0, array_dadosInactivos.length - 1);
    array_dadosInactivos = auxDadosInactivos;

//    Dado[] auxDadosInactivos = new Dado[array_dadosInactivos.length-1];
//    for(int i=0; i<array_dadosInactivos.length-1; i++){
//      auxDadosInactivos[i]= array_dadosInactivos[i+1];
//    }
//    array_dadosActivados = auxDadosInactivos;

  }

  public void eliminarDadoDeArrayDadosActivados(int dadoSeleccionado){

    Dado[] auxArray = new Dado[array_dadosActivados.length-1];


    for(int i=dadoSeleccionado; i<array_dadosActivados.length-1; i++){
      array_dadosActivados[dadoSeleccionado]=array_dadosActivados[dadoSeleccionado+1];
    }
  }

  public void meterDadoEnArrayDadosUtilizados(int posicion){
    int contador =0;
    array_dadosUtilizados[contador] = array_dadosActivados[posicion];
    contador += 1;
  }

  public void usarDadoInactivo(int posicion){
    array_dadosActivados[posicion] = array_dadosInactivos[0];
    eliminarDadoDeArrayDadosInactivos();
  }

  public void validarBotonesAccionados(int posicionArrayDadosActivados) {

//pediente parámetro del dado seleccionado
    //MEEPLE
    if (array_dadosActivados[posicionArrayDadosActivados].getCara() == 1) {

      meterDadoEnArrayDadosUtilizados(posicionArrayDadosActivados);
      eliminarDadoDeArrayDadosActivados(posicionArrayDadosActivados);//en GUI se debe actualizar esto en los paneles
      Scanner entrada = new Scanner(System.in);//en GUI pedir entrada en un Label y pasarla como parámetro
      System.out.print("cual dado? ");
      int auxCualDado = entrada.nextInt();

      array_dadosActivados[auxCualDado].setCara();



      //prueba en consola
      for(int i = 0; i < array_dadosActivados.length; i++){
        System.out.println(array_dadosActivados[i].getNameFace());
      }
      System.out.println("usó meeple");
    }

    if (array_dadosActivados[posicionArrayDadosActivados].getCara() == 2) {

      System.out.println("usó nave");
    }
    //SUPER HERO
    if (array_dadosActivados[posicionArrayDadosActivados].getCara() == 3) {
      meterDadoEnArrayDadosUtilizados(posicionArrayDadosActivados);
      int caraOpuesta = array_dadosActivados[posicionArrayDadosActivados].getCaraOpuesta();
      array_dadosActivados[posicionArrayDadosActivados].setCaraAlGirarDado(caraOpuesta);

      System.out.println("usó superH");

    }
    if (array_dadosActivados[posicionArrayDadosActivados].getCara() == 4) {

      System.out.println("usó dragón");
    }
    if (array_dadosActivados[posicionArrayDadosActivados].getCara() == 5) {

      meterDadoEnArrayDadosUtilizados(posicionArrayDadosActivados);
      usarDadoInactivo(posicionArrayDadosActivados);
      array_dadosActivados[posicionArrayDadosActivados].setCara();


      System.out.println("Usó corazón");
      //prueba en consola
      System.out.println("ACTIVADOS");
      for(int i = 0; i < array_dadosActivados.length; i++){
        System.out.println(array_dadosActivados[i].getNameFace());
      }
      System.out.println("INACTIVOS");
      for(int i = 0; i < array_dadosInactivos.length; i++){
        System.out.println(array_dadosInactivos[i].getNameFace());
      }
    }


    if (array_dadosActivados[posicionArrayDadosActivados].getCara() == 6) {
      System.out.println("usó 42");
    }
  }
}
