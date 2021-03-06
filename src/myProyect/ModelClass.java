package myProyect;

import java.util.ArrayList;

/**
 * @author Carlos Andrés Borja - borja.carlos@correounivalle.edu.co
 *         Deisy Catalina Melo - deisy.melo@correounivalle.edu.co
 * @version @version v.1.0.3 date: 26/01/2022
 */
public class ModelClass {

    private Dado dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
    private ArrayList<Dado> arrayList_dadosActivados;
    private ArrayList<Dado> arrayList_dadosInactivos;
    private ArrayList<Dado> arrayList_dadosUtilizados;
    private boolean terminarPartida;
    private int dadosAccionar, numeroDragon, numero42, puntaje;


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

        numero42 = 0;
        numeroDragon = 0;
        dadosAccionar = 0;
        puntaje = 0;
        terminarPartida = false;


    }

    public void iniciar_arrayList_dadosActivados() {

        arrayList_dadosActivados.add(dado1);
        arrayList_dadosActivados.add(dado2);
        arrayList_dadosActivados.add(dado3);
        arrayList_dadosActivados.add(dado4);
        arrayList_dadosActivados.add(dado5);
        arrayList_dadosActivados.add(dado6);
        arrayList_dadosActivados.add(dado7);

    }

    public void iniciar_arrayList_dadosInactivos() {

        arrayList_dadosInactivos.add(dado8);
        arrayList_dadosInactivos.add(dado9);
        arrayList_dadosInactivos.add(dado10);

    }

    public void iniciar_arrayList_dadosUtilizados() {
    }


    public ArrayList<Dado> getDadosActivados() {
        return arrayList_dadosActivados;
    }

    public ArrayList<Dado> getDadosInactivos() {
        return arrayList_dadosInactivos;
    }

    public ArrayList<Dado> getDadosUtilizados() {
        return arrayList_dadosUtilizados;
    }

    public void eliminarElementoDeArrayDadosInactivos() {

        arrayList_dadosInactivos.remove(0);

    }

    public void eliminarElementoDeArrayDadosActivados(int posicionDelButton) {

        arrayList_dadosActivados.remove(posicionDelButton);

    }

    public void meterEnArrayDadosUtilizados(Dado x) {
        arrayList_dadosUtilizados.add(x);
    }

    public void verificarPartida() {
        if (!arrayList_dadosActivados.isEmpty()) {
            for (Dado elementoDeLista : arrayList_dadosActivados) {
                if (elementoDeLista.getCara() == 1 || elementoDeLista.getCara() == 2 || elementoDeLista.getCara() == 3 ||
                        ((elementoDeLista.getCara() == 5) && !arrayList_dadosInactivos.isEmpty())) {
                    dadosAccionar++;
                }
                if (elementoDeLista.getCara() == 4) {
                    numeroDragon++;
                }
            }
        }

        if (dadosAccionar == 0) {
            terminarPartida = true;
        }

        if (arrayList_dadosActivados.size() == 1) {
            if (arrayList_dadosActivados.get(0).getCara() == 1 ||
                    arrayList_dadosActivados.get(0).getCara() == 2 ||
                    arrayList_dadosActivados.get(0).getCara() == 3) {
                terminarPartida = true;
            }
        }

        if (terminarPartida == true) {
            if (numeroDragon > 0) {
                puntaje = 0;
            }

            for (Dado elemento : arrayList_dadosActivados) {
                if (elemento.getCara() == 6) {
                    numero42++;
                    if (numero42 == 1) {
                        puntaje += 1;
                    } else {
                        puntaje += numero42;
                    }
                }
            }
        }

    }

    public void validarBotonesAccionados(int posicionArrayDadosActivados) {
//relacionar boton con su posicion en array_dadosActivados, su cara y el tipo de panel (1:activados)

        switch (getDadosActivados().get(posicionArrayDadosActivados).getCara()) {
            case 1 -> System.out.println("usó meeple");
            case 2 -> System.out.println("usó nave");
            case 3 -> System.out.println("usó superH");
            case 4 -> System.out.println("usó dragón");
            case 5 -> System.out.println("usó corazón");
            case 6 -> System.out.println("usó 42");
        }
    }

    public void accionarBoton(int posicionArrayDadosActivados) {

        switch (arrayList_dadosUtilizados.get(arrayList_dadosUtilizados.size() - 1).getCara()) {
            case 1 -> {
                arrayList_dadosActivados.remove(posicionArrayDadosActivados);
                Dado nuevoDadito = new Dado();
                arrayList_dadosActivados.add(posicionArrayDadosActivados, nuevoDadito);


            }
            case 2 -> meterEnArrayDadosUtilizados(arrayList_dadosActivados.get(posicionArrayDadosActivados));
            case 3 -> {
                arrayList_dadosActivados.get(posicionArrayDadosActivados).setCara(arrayList_dadosActivados.get(posicionArrayDadosActivados).getCaraOpuesta());
                System.out.println("esta es la cara del nuevo dado luego de girar: " + arrayList_dadosActivados.get(posicionArrayDadosActivados).getCara());
                System.out.println("cara opuesta del nuevo dado: " + arrayList_dadosActivados.get(posicionArrayDadosActivados).getCaraOpuesta());
                System.out.println("nombre del dado: " + arrayList_dadosActivados.get(posicionArrayDadosActivados).getNameFace());
            }
            case 5 -> {
                Dado nuevoDado = new Dado();
                arrayList_dadosActivados.add(posicionArrayDadosActivados, nuevoDado);
                eliminarElementoDeArrayDadosInactivos();
                System.out.println("activaste un dado");


                for (Dado arrayList_dadosActivado : arrayList_dadosActivados) {
                    System.out.println(arrayList_dadosActivado.getNameFace());
                }
            }
        }

    }

    //prueba en CONSOLA
    public void ramas(){
        int x=19;
    }
}
//