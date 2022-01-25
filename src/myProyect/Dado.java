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

    public Dado() {
        crearCara();
        setCaraOpuesta();
        setNameFace();
    }

    public void crearCara() {
        Random aleatorio = new Random();
        cara = aleatorio.nextInt(6) + 1;
    }

    public int getCara() { return cara; }

    public int getCaraOpuesta() { return caraOpuesta; }

    public void setCara(int nuevaCara){

        this.cara=nuevaCara;
    }

    public void setCaraOpuesta() {

        switch (cara){

            case 1: caraOpuesta = 2;
                break;
            case 2: caraOpuesta = 1;
                break;
            case 3: caraOpuesta = 4;
                break;
            case 4: caraOpuesta = 3;
                break;
            case 5: caraOpuesta = 6;
                break;
            case 6: caraOpuesta = 5;
        }
    }



    public void setNameFace() {
        switch (cara){

            case 1: caraNombre = "Meeple";
                break;
            case 2: caraNombre = "Nave";
                break;
            case 3: caraNombre = "SuperHeroe";
                break;
            case 4: caraNombre = "Dragon";
                break;
            case 5: caraNombre = "Corazon";
                break;
            case 6: caraNombre = "42";
        }
    }

    public String getNameFace() { return caraNombre; }

}
