package myProyect;

import java.util.ArrayList;

/**
 * @author Carlos Andrés Borja - borja.carlos@correounivalle.edu.co
 *         Deisy Catalina Melo - deisy.melo@correounivalle.edu.co
 * @version @version v.1.0.2 date: 19/01/2022
 */
public class ModelClass {

    private Dado dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
    private int bandera,contador;
    private ArrayList <Dado> arrayList_dadosActivados;
    private ArrayList <Dado> arrayList_dadosInactivos;
    private ArrayList <Dado> arrayList_dadosUtilizados;
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

        arrayList_dadosActivados = new ArrayList<Dado>();
        iniciar_arrayList_dadosActivados();

        arrayList_dadosInactivos = new ArrayList<Dado>();
        iniciar_arrayList_dadosInactivos();

        arrayList_dadosUtilizados = new ArrayList<Dado>();
        iniciar_arrayList_dadosUtilizados();

//        array_dadosActivados = new Dado[7];
//        iniciar_array_dadosActivados();
//        array_dadosInactivos = new Dado[3];
//        iniciar_array_dadosInactivos();
//        array_dadosUtilizados = new Dado[10];

        contador= 0;
    }

    public void iniciar_arrayList_dadosActivados(){

        arrayList_dadosActivados.add(dado1);
        arrayList_dadosActivados.add(dado2);
        arrayList_dadosActivados.add(dado3);
        arrayList_dadosActivados.add(dado4);
        arrayList_dadosActivados.add(dado5);
        arrayList_dadosActivados.add(dado6);
        arrayList_dadosActivados.add(dado7);

//        for (int i=0;i<arrayList_dadosActivados.size();i++) {
//
//            System.out.println(arrayList_dadosActivados.get(i).getNameFace());
//        }


    }

    public void iniciar_arrayList_dadosInactivos(){

        arrayList_dadosInactivos.add(dado8);
        arrayList_dadosInactivos.add(dado9);
        arrayList_dadosInactivos.add(dado10);

//        for (int i=0;i<arrayList_dadosActivados.size();i++) {
//
//            System.out.println(arrayList_dadosActivados.get(i).getNameFace());
//        }


    }

    public void iniciar_arrayList_dadosUtilizados(){}


//    public void iniciar_array_dadosActivados() {
//
//        array_dadosActivados[0] = dado1;
//        array_dadosActivados[1] = dado2;
//        array_dadosActivados[2] = dado3;
//        array_dadosActivados[3] = dado4;
//        array_dadosActivados[4] = dado5;
//        array_dadosActivados[5] = dado6;
//        array_dadosActivados[6] = dado7;
//
//        System.out.println("array_dadosActivados");
//        for (int i = 0; i < 7; i++) {
//            System.out.println(array_dadosActivados[i].getCara() +
//                    " op: " + array_dadosActivados[i].getCaraOpuesta());
//        }
//    }

//    public void iniciar_array_dadosInactivos() {
//
//        array_dadosInactivos[0] = dado8;
//        array_dadosInactivos[1] = dado9;
//        array_dadosInactivos[2] = dado10;
//
//        System.out.println("array_dadosInactivos");
//        for (int i = 0; i <= 2; i++) {
//            System.out.println(array_dadosInactivos[i].getCara() +
//                    " op: " + array_dadosInactivos[i].getCaraOpuesta());
//        }
//    }


    public ArrayList<Dado> getDadosActivados() { return arrayList_dadosActivados; }

    public ArrayList<Dado>  getDadosInactivos() { return arrayList_dadosInactivos; }

    public ArrayList<Dado> getArray_dadosUtilizados() { return arrayList_dadosUtilizados; }

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


    public void validarBotonesAccionados(int posicionArrayDadosActivados, int tipoDePanel) {
//relacionar boton con su posicion en array_dadosActivados, su cara y el tipo de panel (1:activados)
        if (tipoDePanel == 1) {
            switch (getDadosActivados()[posicionArrayDadosActivados].getCara()) {
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
        if (tipoDePanel == 2) {

            switch (getDadosInactivos()[posicionArrayDadosActivados].getCara()) {
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

        switch (array_dadosUtilizados[contador - 1].getCara()) {
            case 1 -> array_dadosActivados[posicionArrayDadosActivados] = new Dado();
            case 2 -> meterEnArrayDadosUtilizados(posicionArrayDadosActivados);
            case 3 -> array_dadosActivados[posicionArrayDadosActivados].setCara(array_dadosActivados[posicionArrayDadosActivados].getCaraOpuesta());
            case 5 -> {
                array_dadosActivados[posicionArrayDadosActivados] = new Dado();
                eliminarElementoDeArrayDadosInactivos();
                System.out.println("activaste un dado");

                //prueba en consola
                for (int i = 0; i < array_dadosActivados.length; i++) {
                    System.out.println(array_dadosActivados[i].getNameFace());
                }
            }
        }

    }
}
