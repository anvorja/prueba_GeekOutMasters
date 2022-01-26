package myProyect;

import java.util.ArrayList;

/**
 * @author Carlos Andrés Borja - borja.carlos@correounivalle.edu.co
 *         Deisy Catalina Melo - deisy.melo@correounivalle.edu.co
 * @version @version v.1.0.2 date: 19/01/2022
 */
public class ModelClass {

    private Dado dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
    private int bandera,contador, indexPosicionActivo;
    private ArrayList <Dado> arrayList_dadosActivados;
    private ArrayList <Dado> arrayList_dadosInactivos;
    private ArrayList <Dado> arrayList_dadosUtilizados;


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

        arrayList_dadosActivados = new ArrayList<>();
        iniciar_arrayList_dadosActivados();

        arrayList_dadosInactivos = new ArrayList<>();
        iniciar_arrayList_dadosInactivos();

        arrayList_dadosUtilizados = new ArrayList<>();
        iniciar_arrayList_dadosUtilizados();

        contador= 0;
        indexPosicionActivo =0;
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


    public ArrayList<Dado> getDadosActivados() {
        return arrayList_dadosActivados;
    }

    public ArrayList<Dado>  getDadosInactivos() { return arrayList_dadosInactivos; }

    public ArrayList<Dado> getArray_dadosUtilizados() { return arrayList_dadosUtilizados; }

    public void eliminarElementoDeArrayDadosInactivos(){

        arrayList_dadosInactivos.remove(0);

    }

    public void meterEnArrayDadosUtilizados(Dado x){

        arrayList_dadosUtilizados.add(x);
    }


    public void validarBotonesAccionados(int posicionArrayDadosActivados, int tipoDePanel) {
//relacionar boton con su posicion en array_dadosActivados, su cara y el tipo de panel (1:activados)
        if (tipoDePanel == 1) {
            switch (getDadosActivados().get(posicionArrayDadosActivados).getCara()) {
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

            switch (getDadosInactivos().get(posicionArrayDadosActivados).getCara()) {
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

        switch (arrayList_dadosUtilizados.get(contador - 1).getCara()) {
            case 1 -> {
                Dado nuevoDadito = new Dado();
                arrayList_dadosActivados.add(posicionArrayDadosActivados,nuevoDadito);
            }
            case 2 -> meterEnArrayDadosUtilizados(arrayList_dadosActivados.get(posicionArrayDadosActivados));
            case 3 -> arrayList_dadosActivados.get(posicionArrayDadosActivados).setCara(arrayList_dadosActivados.get(posicionArrayDadosActivados).getCaraOpuesta());
            case 5 -> {
                Dado nuevoDado = new Dado();
                arrayList_dadosActivados.add(posicionArrayDadosActivados,nuevoDado);
                eliminarElementoDeArrayDadosInactivos();
                System.out.println("activaste un dado");

                //prueba en consola
                for (int i = 0; i < arrayList_dadosActivados.size(); i++) {
                    System.out.println(arrayList_dadosActivados.get(i).getNameFace());
                }
            }
        }

    }


}
//
