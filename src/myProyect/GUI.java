package myProyect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is designed in order to view class ModelClas
 * @author Carlos Andrés Borja - Univalle
 * @version v.1.0.1 date: 07/12/2021
 */
public class GUI extends JFrame {

    //creamos constante de clase
    private static final String MENSAJE_INICIO = "Bienvenido a Geek Out";

    private Header headerProject;
    private JLabel dado1A, dado2A,dado3A,dado4A,dado5A,dado6A,dado7A,dado8A,dado9A, dado10A,dado8I,dado9I, dado10I, dado1U,dado2U,dado3U,dado4U, dado5U, dado6U, dado7U, dado8U, dado9U, dado10U;
    private JButton iniciar, boton1, boton2, boton3, boton4, boton5,boton6, boton7;
    private JPanel panelDadosUtilizados, panelDadosActivados,panelDadosInactivos, panelResultados, panelLanzar;
    private ImageIcon imageDado;
    private JTextArea mensajesSalida, resultadoDados;
    private JSeparator separator;
    private Escucha escucha;
    private ModelClass modelClass;


    public GUI(){
        initGUI();

        //Default JFrame configuration
        this.setTitle("Geek Out Masters");
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initGUI() {
        //Set up JFrame Container's Layout
        //Create Listener Object or Control Object

        escucha = new Escucha();
        modelClass = new ModelClass();

        //Set up JComponents
        headerProject = new Header("Gekk Out Masters", Color.BLACK);
        this.add(headerProject, BorderLayout.NORTH);


        crearPanelDadosActivados();

        crearDadosInactivos();
        crearPanelDadosUtilizados();
        crearBotonLanzar();
        crearPanelResultados();

        separator = new JSeparator();
        separator.setPreferredSize(new Dimension(320, 7));
        separator.setBackground(Color.LIGHT_GRAY);


    }

    public void crearPanelDadosActivados(){

        panelDadosActivados = new JPanel();
        panelDadosActivados.setPreferredSize(new Dimension(400, 340));
        panelDadosActivados.setBorder(BorderFactory.createTitledBorder("Dados Activados"));
//        imageDado = new ImageIcon(getClass().getResource("/recursos/enBlanco 146p.png"));
//        dado1A = new JLabel(imageDado);
//        imageDado = new ImageIcon(getClass().getResource("/recursos/enBlanco 146p.png"));
//        dado2A = new JLabel(imageDado);
//        imageDado = new ImageIcon(getClass().getResource("/recursos/enBlanco 146p.png"));
//        dado3A = new JLabel(imageDado);
//        imageDado = new ImageIcon(getClass().getResource("/recursos/enBlanco 146p.png"));
//        dado4A = new JLabel(imageDado);
//        imageDado = new ImageIcon(getClass().getResource("/recursos/enBlanco 146p.png"));
//        dado5A = new JLabel(imageDado);
//        imageDado = new ImageIcon(getClass().getResource("/recursos/enBlanco 146p.png"));
//        dado6A = new JLabel(imageDado);
//        imageDado = new ImageIcon(getClass().getResource("/recursos/enBlanco 146p.png"));
//        dado7A = new JLabel(imageDado);
//        panelDadosActivados.add(dado1A);
//        panelDadosActivados.add(dado2A);
//        panelDadosActivados.add(dado3A);
//        panelDadosActivados.add(dado4A);
//        panelDadosActivados.add(dado5A);
//        panelDadosActivados.add(dado6A);
//        panelDadosActivados.add(dado7A);
        this.add(panelDadosActivados, BorderLayout.NORTH);

    }

    public void eliminarImagenesBlncasDePanelDadosActivados(){

    }

    public void crearDadosInactivos(){

        //dados inactivos
        panelDadosInactivos = new JPanel();
        panelDadosInactivos.setPreferredSize(new Dimension(370, 180));
        panelDadosInactivos.setBorder(BorderFactory.createTitledBorder("Dados Inactivos"));
        imageDado = new ImageIcon(getClass().getResource("/recursos/enBlanco 50p.png"));
        dado8I = new JLabel(imageDado);
        imageDado = new ImageIcon(getClass().getResource("/recursos/enBlanco 50p.png"));
        dado9I = new JLabel(imageDado);
        imageDado = new ImageIcon(getClass().getResource("/recursos/enBlanco 50p.png"));
        dado10I = new JLabel(imageDado);
        panelDadosInactivos.add(dado8I);
        panelDadosInactivos.add(dado9I);
        panelDadosInactivos.add(dado10I);
        this.add(panelDadosInactivos, BorderLayout.WEST);
    }

    public void crearPanelDadosUtilizados() {

        panelDadosUtilizados = new JPanel();
        panelDadosUtilizados.setPreferredSize(new Dimension(300, 180));
        panelDadosUtilizados.setBorder(BorderFactory.createTitledBorder("Dados Utilizados"));
        imageDado = new ImageIcon(getClass().getResource("/recursos/50 p/1. cara dado 50p.jpg"));
        dado1U = new JLabel(imageDado);
        imageDado = new ImageIcon(getClass().getResource("/recursos/50 p/2. cara dado 50p.jpg"));
        dado2U = new JLabel(imageDado);
        imageDado = new ImageIcon(getClass().getResource("/recursos/50 p/3. cara dado 50p.jpg"));
        dado3U = new JLabel(imageDado);
        imageDado = new ImageIcon(getClass().getResource("/recursos/50 p/4. cara dado 50p.jpg"));
        dado4U = new JLabel(imageDado);
        imageDado = new ImageIcon(getClass().getResource("/recursos/50 p/5. cara dado 50p.jpg"));
        dado5U = new JLabel(imageDado);
        imageDado = new ImageIcon(getClass().getResource("/recursos/50 p/6. cara dado 50p.jpg"));
        dado6U = new JLabel(imageDado);
        imageDado = new ImageIcon(getClass().getResource("/recursos/50 p/5. cara dado 50p.jpg"));
        dado7U = new JLabel(imageDado);
        imageDado = new ImageIcon(getClass().getResource("/recursos/50 p/4. cara dado 50p.jpg"));
        dado8U = new JLabel(imageDado);
        imageDado = new ImageIcon(getClass().getResource("/recursos/50 p/3. cara dado 50p.jpg"));
        dado9U = new JLabel(imageDado);
        imageDado = new ImageIcon(getClass().getResource("/recursos/50 p/2. cara dado 50p.jpg"));
        dado10U = new JLabel(imageDado);
        imageDado = new ImageIcon(getClass().getResource("/recursos/50 p/1. cara dado 50p.jpg"));
        panelDadosUtilizados.add(dado1U);
        panelDadosUtilizados.add(dado2U);
        panelDadosUtilizados.add(dado3U);
        panelDadosUtilizados.add(dado4U);
        panelDadosUtilizados.add(dado5U);
        panelDadosUtilizados.add(dado6U);
        panelDadosUtilizados.add(dado7U);
        panelDadosUtilizados.add(dado8U);
        panelDadosUtilizados.add(dado9U);
        panelDadosUtilizados.add(dado10U);
        this.add(panelDadosUtilizados, BorderLayout.CENTER);

    }
    public void crearBotonLanzar() {

        iniciar = new JButton("Inciar");
        iniciar.addActionListener(escucha);
        panelLanzar = new JPanel();
        panelLanzar.add(iniciar);
        this.add(panelLanzar, BorderLayout.PAGE_END);
        panelDadosActivados.removeAll();
        panelDadosActivados.repaint();

    }

    public void crearPanelResultados(){

        panelResultados = new JPanel();
        panelResultados.setBorder(BorderFactory.createTitledBorder("Puntuación"));
        panelResultados.setPreferredSize(new Dimension(370, 180));
        this.add(panelResultados, BorderLayout.EAST);

    }

    public void meterBotonesActivos(Dado[] reciboCarasBotonesActivos){


        boton1 = new JButton();
        boton1.addActionListener(escucha);
        boton1.setPreferredSize(new Dimension(146,146));
        boton1.setOpaque(true);
        imageDado = new ImageIcon(getClass().getResource("/recursos/"+ reciboCarasBotonesActivos[0].getCara()+". cara dado.jpg"));
        boton1.setIcon(imageDado);
        boton1.setBackground(Color.WHITE);
        panelDadosActivados.add(boton1);

        boton2 = new JButton();
        boton2.addActionListener(escucha);
        boton2.setPreferredSize(new Dimension(146,146));
        boton2.setOpaque(true);
        imageDado = new ImageIcon(getClass().getResource("/recursos/"+ reciboCarasBotonesActivos[1].getCara()+". cara dado.jpg"));
        boton2.setIcon(imageDado);
        boton2.setBackground(Color.WHITE);
        panelDadosActivados.add(boton2);

        boton3 = new JButton();
        boton3.addActionListener(escucha);
        boton3.setPreferredSize(new Dimension(146,146));
        boton3.setOpaque(true);
        imageDado = new ImageIcon(getClass().getResource("/recursos/"+ reciboCarasBotonesActivos[2].getCara()+". cara dado.jpg"));
        boton3.setIcon(imageDado);
        boton3.setBackground(Color.WHITE);
        panelDadosActivados.add(boton3);

        boton4 = new JButton();
        boton4.addActionListener(escucha);
        boton4.setPreferredSize(new Dimension(146,146));
        boton4.setOpaque(true);
        imageDado = new ImageIcon(getClass().getResource("/recursos/"+ reciboCarasBotonesActivos[3].getCara()+". cara dado.jpg"));
        boton4.setIcon(imageDado);
        boton4.setBackground(Color.WHITE);
        panelDadosActivados.add(boton4);

        boton5 = new JButton();
        boton5.addActionListener(escucha);
        boton5.setPreferredSize(new Dimension(146,146));
        boton5.setOpaque(true);
        imageDado = new ImageIcon(getClass().getResource("/recursos/"+ reciboCarasBotonesActivos[4].getCara()+". cara dado.jpg"));
        boton5.setIcon(imageDado);
        boton5.setBackground(Color.WHITE);
        panelDadosActivados.add(boton5);

        boton6 = new JButton();
        boton6.addActionListener(escucha);
        boton6.setPreferredSize(new Dimension(146,146));
        boton6.setOpaque(true);
        imageDado = new ImageIcon(getClass().getResource("/recursos/"+ reciboCarasBotonesActivos[5].getCara()+". cara dado.jpg"));
        boton6.setIcon(imageDado);
        boton6.setBackground(Color.WHITE);
        panelDadosActivados.add(boton6);

        boton7 = new JButton();
        boton7.addActionListener(escucha);
        boton7.setPreferredSize(new Dimension(146,146));
        boton7.setOpaque(true);
        imageDado = new ImageIcon(getClass().getResource("/recursos/"+ reciboCarasBotonesActivos[6].getCara()+". cara dado.jpg"));
        boton7.setIcon(imageDado);
        boton7.setBackground(Color.WHITE);
        panelDadosActivados.add(boton7);


    }


    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            GUI miProjectGUI = new GUI();
        });
    }

    //escuchas
    private class Escucha implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Dado[] array_DadosActivados;
            Dado[] array_DadosInactivos;

            if(e.getSource()==iniciar) {

                iniciar.setEnabled(false);
                modelClass.lanzamientoInicial();
//            modelClass.iniciar_array_dadosActivados();
                array_DadosActivados = modelClass.getDadosActivados();
                //probar cantidad dados activos
                System.out.println("activos: "+array_DadosActivados.length);

                meterBotonesActivos(array_DadosActivados);

                array_DadosInactivos = modelClass.getDadosInactivos();
                //probar cantidad dados inactivos
                System.out.println("inactivos: "+array_DadosInactivos.length);
                for(int i=0; i<array_DadosInactivos.length;i++){
                    System.out.println(array_DadosInactivos[i].getCara()+" su opuest: "+array_DadosInactivos[i].getCaraOpuesta());
                }


                //dados inactivos
                imageDado = new ImageIcon(getClass().getResource("/recursos/" + array_DadosInactivos[0].getCara() + ". cara dado 50p.jpg"));
                dado8I.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/recursos/" + array_DadosInactivos[1].getCara() + ". cara dado 50p.jpg"));
                dado9I.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/recursos/" + array_DadosInactivos[2].getCara() + ". cara dado 50p.jpg"));
                dado10I.setIcon(imageDado);


                panelDadosUtilizados.removeAll();

                revalidate();
                repaint();
            }

            if(e.getSource()==boton1) {
//                array_DadosActivados.length();
////                    if(array_DadosActivados[i].getCara() == 1){
////                        System.out.println("usó meeple");}
//
////
                System.out.println("Boton 1");
            }
//
//            if(e.getSource()==boton2){
//                for(int i=0;i<array_DadosActivados.length;i++){
//                    if(array_DadosActivados[i].getCara() == 2){
//                        System.out.println("usó Cohete");}
//                }
//                // modelClass.determinarJuego();
//                System.out.println("Boton 2");
//            }
//            if(e.getSource()==boton3){
//                for(int i=0;i<array_DadosActivados.length;i++){
//                    if(array_DadosActivados[i].getCara() == 3){
//                        System.out.println("usó superH");}
//                }
//                //modelClass.determinarJuego();
//                System.out.println("Boton 3");
//            }
//            if(e.getSource()==boton4){
//                for(int i=0;i<array_DadosActivados.length;i++){
//                    if(array_DadosActivados[i].getCara() == 4){
//                        System.out.println("usó dragon");}
//                }
//                //modelClass.determinarJuego();
//                System.out.println("Boton 4");
//            }
//            if(e.getSource()==boton5){
//                for(int i=0;i<array_DadosActivados.length;i++){
//                    if(array_DadosActivados[i].getCara() == 5){
//                        System.out.println("usó corazon");}
//                }
//                //modelClass.determinarJuego();
//                System.out.println("Boton 5");
//            }
//            if(e.getSource()==boton6){
//                for(int i=0;i<array_DadosActivados.length;i++){
//                    if(array_DadosActivados[i].getCara() == 6){
//                        System.out.println("usó 42");}
//                }
//                //modelClass.determinarJuego();
//                System.out.println("Boton 6");
//            }
//            if(e.getSource()==boton7){
//                for(int i=0;i<array_DadosActivados.length;i++){
//                    if(array_DadosActivados[i].getCara() == 1){
//                        System.out.println("usó tttmeeple");}
//                }
//                //modelClass.determinarJuego();
//                System.out.println("Boton 7");
//            }
//            revalidate();
//            repaint();

        }





    }
}
//}