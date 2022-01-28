package myProyect;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.*;

/**
 * This class is designed in order to view class ModelClas
 * @author Carlos Andrés Borja - borja.carlos@correounivalle.edu.co
 *         Deisy Catalina Melo - deisy.melo@correounivalle.edu.co
 * @version v.1.0.2 date: 19/01/2022
 */
public class GUI extends JFrame {

    // creamos constante de clase
    private static final String MENSAJE_INICIO = "Bienvenido a Geek Out";

    private Header headerProject;
    private JLabel labelBoton1U,labelBoton2U,labelBoton3U,labelBoton4U,labelBoton5U,labelBoton6U,labelBoton7U,labelBoton8U,labelBoton9U,labelBoton10U, jLabelInicio;
    private JButton comenzarJuego, iniciar, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8,
            boton9, boton10, boton8A, boton9A, boton10A;
    private JPanel panelInicio, panelDadosUtilizados, panelDadosActivados, panelDadosInactivos,
            panelResultados, panelLanzar;
    //auxiliares
    private int opcionPanel, caraBotonUsado, contador, indiceJBoton2, indiceJBoton3, indiceJBoton4, indiceJBoton5,
            indiceJBoton6, indiceJBoton7,indiceJBoton8A,indiceJBoton9A,
            indiceJBoton10A;
    private boolean destruir,flag;
    private ImageIcon imageDado, imagenInicio;
    private JTextArea mensajesSalida, resultadoDados;
    private JSeparator separator;
    private Escucha escucha;
    private ModelClass modelClass;

    public GUI() {
        initGUI();

        // Default JFrame configuration
        this.setTitle("Geek Out Masters");
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initGUI() {
        // Set up JFrame Container's Layout
        // Create Listener Object or Control Object
        escucha = new Escucha();
        modelClass = new ModelClass();

        // Set up JComponents
        crearPanelInicio();

    }

    private void crearPanelInicio() {

        imagenInicio = new ImageIcon(Objects.requireNonNull(getClass().getResource("/recursos/header.jpg")));

        jLabelInicio = new JLabel(imagenInicio);
        panelInicio = new JPanel();
        panelInicio.setPreferredSize(new Dimension(951, 632));
        panelInicio.add(jLabelInicio);
        this.add(panelInicio, BorderLayout.CENTER);
        crearBotonLanzar();

    }

    public void llamarPanelesJuego(){

        this.remove(panelInicio);

        headerProject = new Header("Gekk Out Masters", Color.BLACK);
        this.add(headerProject, BorderLayout.NORTH);

        crearPanelDadosActivados();
        crearDadosInactivos();
        crearPanelDadosUtilizados();
        //crearBotonLanzar();
        crearPanelResultados();

        separator = new JSeparator();
        separator.setPreferredSize(new Dimension(320, 7));
        separator.setBackground(Color.LIGHT_GRAY);
    }

    public void crearPanelDadosActivados() {
        indiceJBoton2 = 1;
        indiceJBoton3 = 2;
        indiceJBoton4 = 3;
        indiceJBoton5 = 4;
        indiceJBoton6 = 5;
        indiceJBoton7 = 6;
        indiceJBoton8A = 7;
        indiceJBoton9A = 8;
        indiceJBoton10A = 9;
        contador=0;

        panelDadosActivados = new JPanel();
        panelDadosActivados.setPreferredSize(new Dimension(400, 400));
        panelDadosActivados.setBorder(
                BorderFactory.createTitledBorder("Dados Activados"));

        this.add(panelDadosActivados, BorderLayout.NORTH);

    }


    public void crearDadosInactivos() {

        // dados inactivos
        panelDadosInactivos = new JPanel();
        panelDadosInactivos.setPreferredSize(new Dimension(300, 180));
        panelDadosInactivos.setBorder(BorderFactory.createTitledBorder("Dados Inactivos"));

        revalidate();
        repaint();

        this.add(panelDadosInactivos, BorderLayout.WEST);

    }

    public void crearPanelDadosUtilizados() {

        panelDadosUtilizados = new JPanel();
        panelDadosUtilizados.setPreferredSize(new Dimension(350, 250));
        panelDadosUtilizados.setBorder(BorderFactory.createTitledBorder("Dados Utilizados"));

        this.add(panelDadosUtilizados, BorderLayout.CENTER);

    }

    public void crearBotonLanzar() {

        iniciar = new JButton("Inciar");
        iniciar.addActionListener(escucha);
        panelLanzar = new JPanel();
        panelLanzar.add(iniciar);
        this.add(panelLanzar, BorderLayout.PAGE_END);
    }

    public void crearPanelResultados() {

        panelResultados = new JPanel();
        panelResultados.setBorder(BorderFactory.createTitledBorder("Puntuación"));
        panelResultados.setPreferredSize(new Dimension(300, 180));

        this.add(panelResultados, BorderLayout.EAST);

    }

    public void meterBotonesActivos(ArrayList<Dado> reciboCarasBotonesActivos) {

        boton1 = new JButton();
        boton1.addActionListener(escucha);
        boton1.setPreferredSize(new Dimension(146, 146));
        boton1.setContentAreaFilled(false);
        boton1.setBorderPainted(false);
        imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                "/recursos/imagenesDeisy/medianas 146/" + reciboCarasBotonesActivos.get(0).getCara() +
                        ". 146x146.png")));
        boton1.setIcon(imageDado);
        panelDadosActivados.add(boton1);

        boton2 = new JButton();
        boton2.addActionListener(escucha);
        boton2.setPreferredSize(new Dimension(146, 146));
        boton2.setContentAreaFilled(false);
        boton2.setBorderPainted(false);
        imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                "/recursos/imagenesDeisy/medianas 146/" + reciboCarasBotonesActivos.get(1).getCara() +
                        ". 146x146.png")));
        boton2.setIcon(imageDado);
        panelDadosActivados.add(boton2);

        boton3 = new JButton();
        boton3.addActionListener(escucha);
        boton3.setPreferredSize(new Dimension(146, 146));
        boton3.setContentAreaFilled(false);
        boton3.setBorderPainted(false);
        imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                "/recursos/imagenesDeisy/medianas 146/" + reciboCarasBotonesActivos.get(2).getCara() +
                        ". 146x146.png")));
        boton3.setIcon(imageDado);
        panelDadosActivados.add(boton3);

        boton4 = new JButton();
        boton4.addActionListener(escucha);
        boton4.setPreferredSize(new Dimension(146, 146));
        boton4.setContentAreaFilled(false);
        boton4.setBorderPainted(false);
        imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                "/recursos/imagenesDeisy/medianas 146/" + reciboCarasBotonesActivos.get(3).getCara() +
                        ". 146x146.png")));
        boton4.setIcon(imageDado);
        panelDadosActivados.add(boton4);

        boton5 = new JButton();
        boton5.addActionListener(escucha);
        boton5.setPreferredSize(new Dimension(146, 146));
        boton5.setContentAreaFilled(false);
        boton5.setBorderPainted(false);
        imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                "/recursos/imagenesDeisy/medianas 146/" + reciboCarasBotonesActivos.get(4).getCara() +
                        ". 146x146.png")));
        boton5.setIcon(imageDado);
        panelDadosActivados.add(boton5);

        boton6 = new JButton();
        boton6.addActionListener(escucha);
        boton6.setPreferredSize(new Dimension(146, 146));
        boton6.setContentAreaFilled(false);
        boton6.setBorderPainted(false);
        imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                "/recursos/imagenesDeisy/medianas 146/" + reciboCarasBotonesActivos.get(5).getCara() +
                        ". 146x146.png")));
        boton6.setIcon(imageDado);
        panelDadosActivados.add(boton6);

        boton7 = new JButton();
        boton7.addActionListener(escucha);
        boton7.setPreferredSize(new Dimension(146, 146));
        boton7.setContentAreaFilled(false);
        boton7.setBorderPainted(false);
        imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                "/recursos/imagenesDeisy/medianas 146/" + reciboCarasBotonesActivos.get(6).getCara() +
                        ". 146x146.png")));
        boton7.setIcon(imageDado);
        panelDadosActivados.add(boton7);

    }

    public void meterDadosInactivos(ArrayList<Dado> reciboCarasBotonesInactivos){

        boton8A = new JButton();
        boton8A.addActionListener(escucha);
        boton8A.setPreferredSize(new Dimension(69, 60));
        boton8A.setContentAreaFilled(false);
        boton8A.setBorderPainted(false);
        imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                "/recursos/imagenesDeisy/pequeñas/" + reciboCarasBotonesInactivos.get(0).getCara() +
                        ".png")));
        boton8A.setIcon(imageDado);

        panelDadosInactivos.add(boton8A);

        boton9A = new JButton();
        boton9A.addActionListener(escucha);
        boton9A.setPreferredSize(new Dimension(69, 60));
        boton9A.setContentAreaFilled(false);
        boton9A.setBorderPainted(false);
        imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                "/recursos/imagenesDeisy/pequeñas/" + reciboCarasBotonesInactivos.get(1).getCara() +
                        ".png")));
        boton9A.setIcon(imageDado);
        panelDadosInactivos.add(boton9A);

        boton10A = new JButton();
        boton10A.addActionListener(escucha);
        boton10A.setPreferredSize(new Dimension(69, 60));
        boton10A.setContentAreaFilled(false);
        boton10A.setBorderPainted(false);
        imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                "/recursos/imagenesDeisy/pequeñas/" + reciboCarasBotonesInactivos.get(2).getCara() +
                        ".png")));
        boton10A.setIcon(imageDado);
        panelDadosInactivos.add(boton10A);


    }


    public void confirmarDestruir(){

        if (((caraBotonUsado == 2) && (destruir == true)) || (destruir == true)){

            destruir=false;
            caraBotonUsado=0;
            System.out.println("se reinicio la cara del boton usado: 0");
        }
        if(caraBotonUsado!=0 && caraBotonUsado!=2 && caraBotonUsado!=5){
            opcionPanel=2;
            System.out.println("te has redirigido a opcionPanel 2");
        }

        else if (caraBotonUsado==2){
            destruir=true;
        }

        if(caraBotonUsado==5){
            if(contador<3){
                contador++;
                activarDadoInactivo();
            }
        }
    }

    public void probarEnConsolaInicio(){
        // probar cantidad dados activados e inactivos
        System.out.println("Iniciando Juego\nactivados: " +
                modelClass.getDadosActivados().size());
        for (int i = 0; i < modelClass.getDadosActivados().size(); i++) {
            System.out.println(
                    modelClass.getDadosActivados().get(i).getCara() + " su opuesta: " +
                            modelClass.getDadosActivados().get(i).getCaraOpuesta());
        }

        System.out.println("inactivos: " +
                modelClass.getDadosInactivos().size());
        for (int i = 0; i < modelClass.getDadosInactivos().size(); i++) {
            System.out.println(
                    modelClass.getDadosInactivos().get(i).getCara() + " su opuesta: " +
                            modelClass.getDadosInactivos().get(i).getCaraOpuesta());
        }
    }
    public void probarEnConsola(){

        /*
         *Prueba por consola
         */
        System.out.println("------------");
        System.out.println("->ACTIVADOS");
        for (int i=0;i<modelClass.getDadosActivados().size();i++) {
            System.out.println(i+": "+modelClass.getDadosActivados().get(i).getNameFace());
        }System.out.println("tamaño activados: "+modelClass.getDadosActivados().size());

        System.out.println("->INACTIVOS");
        for (int i=0;i<modelClass.getDadosInactivos().size();i++) {
            System.out.println(i+": "+modelClass.getDadosInactivos().get(i).getNameFace());
        }System.out.println("tamaño Inactivos: "+modelClass.getDadosInactivos().size());

        System.out.println("->UTILIZADOS");
        for (int i=0;i<modelClass.getDadosUtilizados().size();i++) {
            System.out.println(i+": "+modelClass.getDadosUtilizados().get(i).getNameFace());
        }System.out.println("tamaño utilizados: "+modelClass.getDadosUtilizados().size());
        System.out.println("------------");
    }

    public void activarDadoInactivo(){
        if(contador==1){
            modelClass.accionarBoton(indiceJBoton8A);

            boton8A.setPreferredSize(new Dimension(146, 146));
            System.out.println("actualizó el array de activos");
            imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton8A).getCara() +
                            ". 146x146.png")));
            boton8A.setIcon(imageDado);
            panelDadosActivados.add(boton8A);

            opcionPanel = 1;
            probarEnConsola();
        }
        else if(contador==2){
            modelClass.accionarBoton(indiceJBoton9A);

            boton9A.setPreferredSize(new Dimension(146, 146));
            imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton9A).getCara() +
                            ". 146x146.png")));
            boton9A.setIcon(imageDado);
            panelDadosActivados.add(boton9A);

            opcionPanel = 1;
            probarEnConsola();
        }
        else if(contador==3){
            modelClass.accionarBoton(indiceJBoton10A);

            boton10A.setPreferredSize(new Dimension(146, 146));
            imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton10A).getCara() +
                            ". 146x146.png")));
            boton10A.setIcon(imageDado);
            panelDadosActivados.add(boton10A);

            opcionPanel = 1;
            probarEnConsola();
        }
        System.out.println("has activado un dado");
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> { GUI miProjectGUI = new GUI(); });
    }

    // escuchas
    private class Escucha implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == iniciar) {

                llamarPanelesJuego();
                //inhabilitar boton de inicio
                iniciar.setEnabled(false);
                meterBotonesActivos(modelClass.getDadosActivados());
                probarEnConsolaInicio();
                // dados inactivos
                meterDadosInactivos(modelClass.getDadosInactivos());

                /*opcionPanel
                  si es 1: elegir dado de panel de Dados Activos,
                  si es 2: accionar dado
                 */
                opcionPanel = 1;

                /*requerido para accion de la nave*/
                destruir = false;
                caraBotonUsado=0;
                revalidate();
                repaint();

            }


            switch (opcionPanel) {

                //escoger dado
                case 1 -> {
                    if (e.getSource() == boton1) {

                        if ((destruir) || ((modelClass.getDadosActivados().get(0).getCara() != 4) && (modelClass.getDadosActivados().get(0).getCara() != 6))) {

                            System.out.println("Boton 1");
                            modelClass.validarBotonesAccionados(0);

                            //set ingresar Boton a panel Utilizados
                            imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                    "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados().get(0).getCara() +
                                            ".png")));
                            labelBoton1U= new JLabel(imageDado);
                            panelDadosActivados.remove(boton1);
                            panelDadosUtilizados.add(labelBoton1U);

                            caraBotonUsado = modelClass.getDadosActivados().get(0).getCara();
                            modelClass.meterEnArrayDadosUtilizados(modelClass.getDadosActivados().get(0));
                            modelClass.eliminarElementoDeArrayDadosActivados(0);


                            System.out.println("La cara del boton usado es: " + caraBotonUsado);

                            indiceJBoton2--;
                            indiceJBoton3--;
                            indiceJBoton4--;
                            indiceJBoton5--;
                            indiceJBoton6--;
                            indiceJBoton7--;
                            indiceJBoton8A--;
                            indiceJBoton9A--;
                            indiceJBoton10A--;
                            confirmarDestruir();

                            probarEnConsola();

                        }
                    } else if (e.getSource() == boton2) {
                        if (destruir || modelClass.getDadosActivados().get(indiceJBoton2).getCara() != 4 && modelClass.getDadosActivados().get(indiceJBoton2).getCara() != 6) {

                            System.out.println("Boton 2");
                            modelClass.validarBotonesAccionados(indiceJBoton2);
                            imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                    "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados().get(indiceJBoton2).getCara() +
                                            ".png")));
                            labelBoton2U= new JLabel(imageDado);
                            panelDadosActivados.remove(boton2);
                            panelDadosUtilizados.add(labelBoton2U);


                            caraBotonUsado = modelClass.getDadosActivados().get(indiceJBoton2).getCara();//prueba en consola
                            modelClass.meterEnArrayDadosUtilizados(modelClass.getDadosActivados().get(indiceJBoton2));
                            modelClass.eliminarElementoDeArrayDadosActivados(indiceJBoton2);

                            System.out.println("La cara del boton usado es: " + caraBotonUsado);//prueba en consola

                            indiceJBoton3--;
                            indiceJBoton4--;
                            indiceJBoton5--;
                            indiceJBoton6--;
                            indiceJBoton7--;
                            indiceJBoton8A--;
                            indiceJBoton9A--;
                            indiceJBoton10A--;
                            confirmarDestruir();

                            probarEnConsola();

                        }
                    } else if (e.getSource() == boton3) {
                        if (destruir ||
                                modelClass.getDadosActivados().get(indiceJBoton3).getCara() != 4 && modelClass.getDadosActivados().get(indiceJBoton3).getCara() != 6) {

                            System.out.println("Boton 3");
                            modelClass.validarBotonesAccionados(indiceJBoton3);
                            imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                    "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados().get(indiceJBoton3).getCara() +
                                            ".png")));
                            labelBoton3U= new JLabel(imageDado);
                            panelDadosActivados.remove(boton3);
                            panelDadosUtilizados.add(labelBoton3U);


                            caraBotonUsado = modelClass.getDadosActivados().get(indiceJBoton3).getCara();
                            modelClass.meterEnArrayDadosUtilizados(modelClass.getDadosActivados().get(indiceJBoton3));
                            modelClass.eliminarElementoDeArrayDadosActivados(indiceJBoton3);
                            System.out.println("La cara del boton usado es: " + caraBotonUsado);

                            indiceJBoton4--;
                            indiceJBoton5--;
                            indiceJBoton6--;
                            indiceJBoton7--;
                            indiceJBoton8A--;
                            indiceJBoton9A--;
                            indiceJBoton10A--;
                            confirmarDestruir();

                            probarEnConsola();

                        }
                    } else if (e.getSource() == boton4) {
                        if (destruir ||
                                modelClass.getDadosActivados().get(indiceJBoton4).getCara() != 4 && modelClass.getDadosActivados().get(indiceJBoton4).getCara() != 6) {

                            System.out.println("Boton 4");
                            modelClass.validarBotonesAccionados(indiceJBoton4);
                            imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                    "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados().get(indiceJBoton4).getCara() +
                                            ".png")));
                            labelBoton4U= new JLabel(imageDado);;
                            panelDadosActivados.remove(boton4);
                            panelDadosUtilizados.add(labelBoton4U);


                            caraBotonUsado = modelClass.getDadosActivados().get(indiceJBoton4).getCara();//prueba en consola
                            modelClass.meterEnArrayDadosUtilizados(modelClass.getDadosActivados().get(indiceJBoton4));
                            modelClass.eliminarElementoDeArrayDadosActivados(indiceJBoton4);
                            System.out.println("La cara del boton usado es: " + caraBotonUsado);

                            indiceJBoton5--;
                            indiceJBoton6--;
                            indiceJBoton7--;
                            indiceJBoton8A--;
                            indiceJBoton9A--;
                            indiceJBoton10A--;
                            confirmarDestruir();

                            probarEnConsola();

                        }
                    } else if (e.getSource() == boton5) {
                        if (destruir ||
                                modelClass.getDadosActivados().get(indiceJBoton5).getCara() != 4 && modelClass.getDadosActivados().get(indiceJBoton5).getCara() != 6) {

                            System.out.println("Boton 5");
                            modelClass.validarBotonesAccionados(indiceJBoton5);
                            imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                    "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados().get(indiceJBoton5).getCara() +
                                            ".png")));
                            labelBoton5U= new JLabel(imageDado);
                            panelDadosActivados.remove(boton5);
                            panelDadosUtilizados.add(labelBoton5U);

                            caraBotonUsado = modelClass.getDadosActivados().get(indiceJBoton5).getCara();
                            modelClass.meterEnArrayDadosUtilizados(modelClass.getDadosActivados().get(indiceJBoton5));
                            modelClass.eliminarElementoDeArrayDadosActivados(indiceJBoton5);
                            System.out.println("La cara del boton usado es: " + caraBotonUsado);

                            indiceJBoton6--;
                            indiceJBoton7--;
                            indiceJBoton8A--;
                            indiceJBoton9A--;
                            indiceJBoton10A--;
                            confirmarDestruir();

                            probarEnConsola();

                        }
                    } else if (e.getSource() == boton6) {
                        if (destruir ||
                                modelClass.getDadosActivados().get(indiceJBoton6).getCara() != 4 && modelClass.getDadosActivados().get(indiceJBoton6).getCara() != 6) {

                            System.out.println("Boton 6");
                            modelClass.validarBotonesAccionados(indiceJBoton6);
                            imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                    "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados().get(indiceJBoton6).getCara() +
                                            ".png")));
                            labelBoton6U= new JLabel(imageDado);
                            panelDadosActivados.remove(boton6);
                            panelDadosUtilizados.add(labelBoton6U);


                            caraBotonUsado = modelClass.getDadosActivados().get(indiceJBoton6).getCara();
                            modelClass.meterEnArrayDadosUtilizados(modelClass.getDadosActivados().get(indiceJBoton6));
                            modelClass.eliminarElementoDeArrayDadosActivados(indiceJBoton6);
                            System.out.println("La cara del boton usado es: " + caraBotonUsado);

                            indiceJBoton7--;
                            indiceJBoton8A--;
                            indiceJBoton9A--;
                            indiceJBoton10A--;
                            confirmarDestruir();

                            probarEnConsola();

                        }
                    } else if (e.getSource() == boton7) {
                        if (destruir ||
                                modelClass.getDadosActivados().get(indiceJBoton7).getCara() != 4 && modelClass.getDadosActivados().get(indiceJBoton7).getCara() != 6) {

                            System.out.println("Boton 7");
                            modelClass.validarBotonesAccionados(indiceJBoton7);

                            imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                    "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados().get(indiceJBoton7).getCara() +
                                            ".png")));
                            labelBoton7U= new JLabel(imageDado);
                            panelDadosActivados.remove(boton7);
                            panelDadosUtilizados.add(labelBoton7U);


                            caraBotonUsado = modelClass.getDadosActivados().get(indiceJBoton7).getCara();
                            modelClass.meterEnArrayDadosUtilizados(modelClass.getDadosActivados().get(indiceJBoton7));
                            modelClass.eliminarElementoDeArrayDadosActivados(indiceJBoton7);
                            System.out.println("La cara del boton usado es: " + caraBotonUsado);

                            indiceJBoton8A--;
                            indiceJBoton9A--;
                            indiceJBoton10A--;
                            confirmarDestruir();

                            probarEnConsola();

                        }
                    } else if (e.getSource() == boton8A) {
                        if (destruir ||
                                modelClass.getDadosActivados().get(indiceJBoton8A).getCara() != 4 &&modelClass.getDadosActivados().get(indiceJBoton8A).getCara() != 6) {

                            System.out.println("Boton 8A");
                            modelClass.validarBotonesAccionados(indiceJBoton8A);
                            imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                    "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados().get(indiceJBoton8A).getCara() +
                                            ".png")));
                            labelBoton8U= new JLabel(imageDado);
                            panelDadosActivados.remove(boton8A);
                            panelDadosUtilizados.add(labelBoton8U);

                            caraBotonUsado = modelClass.getDadosActivados().get(indiceJBoton8A).getCara();
                            modelClass.meterEnArrayDadosUtilizados(modelClass.getDadosActivados().get(indiceJBoton8A));
                            modelClass.eliminarElementoDeArrayDadosActivados(indiceJBoton8A);
                            System.out.println("La cara del boton usado es: " + caraBotonUsado);

                            indiceJBoton9A--;
                            indiceJBoton10A--;
                            confirmarDestruir();

                            probarEnConsola();

                        }
                    } else if (e.getSource() == boton9A) {
                        if (destruir ||
                                modelClass.getDadosActivados().get(indiceJBoton9A).getCara() != 4 && modelClass.getDadosActivados().get(indiceJBoton9A).getCara() != 6) {

                            System.out.println("Boton 9A");
                            modelClass.validarBotonesAccionados(indiceJBoton9A);
                            imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                    "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados().get(indiceJBoton9A).getCara() +
                                            ".png")));
                            labelBoton9U= new JLabel(imageDado);
                            panelDadosActivados.remove(boton9A);
                            panelDadosUtilizados.add(labelBoton9U);

                            caraBotonUsado = modelClass.getDadosActivados().get(indiceJBoton9A).getCara();
                            modelClass.meterEnArrayDadosUtilizados(modelClass.getDadosActivados().get(indiceJBoton9A));
                            modelClass.eliminarElementoDeArrayDadosActivados(indiceJBoton9A);
                            System.out.println("La cara del boton usado es: " + caraBotonUsado);

                            indiceJBoton10A--;
                            confirmarDestruir();

                            probarEnConsola();

                        }
                    } else if (e.getSource() == boton10A) {
                        if (destruir ||
                                modelClass.getDadosActivados().get(indiceJBoton10A).getCara() != 4 && modelClass.getDadosActivados().get(indiceJBoton10A).getCara() != 6) {

                            System.out.println("Boton 10A");
                            modelClass.validarBotonesAccionados(indiceJBoton10A);
                            imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                    "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados().get(indiceJBoton10A).getCara() +
                                            ".png")));
                            labelBoton10U= new JLabel(imageDado);
                            panelDadosActivados.remove(boton10A);
                            panelDadosUtilizados.add(labelBoton10U);

                            caraBotonUsado = modelClass.getDadosActivados().get(indiceJBoton10A).getCara();
                            modelClass.meterEnArrayDadosUtilizados(modelClass.getDadosActivados().get(indiceJBoton10A));
                            modelClass.eliminarElementoDeArrayDadosActivados(indiceJBoton10A);
                            System.out.println("La cara del boton usado es: " + caraBotonUsado);
                            confirmarDestruir();

                            probarEnConsola();
                        }
                    }
                    revalidate();
                    repaint();
                }
                case 2 -> {
                    if (e.getSource() == boton1) {

                        switch (caraBotonUsado) {
                            case 1 -> {
                                modelClass.accionarBoton(0);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(0).getCara() +
                                                ". 146x146.png")));
                                boton1.setIcon(imageDado);
                                System.out.println("has relanzado un dado");
                                opcionPanel = 1;

                                probarEnConsola();
                            }
                            case 3 -> {
                                modelClass.accionarBoton(0);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(0).getCara() +
                                                ". 146x146.png")));
                                boton1.setIcon(imageDado);
                                System.out.println("has dado vuelta a un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                        }
                    }
                    if (e.getSource() == boton2) {
                        switch (caraBotonUsado) {
                            case 1 -> {
                                modelClass.accionarBoton(indiceJBoton2);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton2).getCara() +
                                                ". 146x146.png")));
                                boton2.setIcon(imageDado);
                                System.out.println("has relanzado un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                            case 3 -> {
                                modelClass.accionarBoton(indiceJBoton2);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton2).getCara() +
                                                ". 146x146.png")));
                                boton2.setIcon(imageDado);
                                System.out.println("has dado vuelta a un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                        }
                    }
                    if (e.getSource() == boton3) {
                        switch (caraBotonUsado) {

                            case 1 -> {
                                modelClass.accionarBoton(indiceJBoton3);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton3).getCara() +
                                                ". 146x146.png")));
                                boton3.setIcon(imageDado);
                                System.out.println("has relanzado un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                            case 3 -> {
                                modelClass.accionarBoton(indiceJBoton3);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton3).getCara() +
                                                ". 146x146.png")));
                                boton3.setIcon(imageDado);
                                System.out.println("has dado vuelta a un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                        }
                    }
                    if (e.getSource() == boton4) {
                        switch (caraBotonUsado) {
                            case 1 -> {
                                modelClass.accionarBoton(indiceJBoton4);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton4).getCara() +
                                                ". 146x146.png")));
                                boton4.setIcon(imageDado);
                                System.out.println("has relanzado un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                            case 3 -> {
                                modelClass.accionarBoton(indiceJBoton4);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton4).getCara() +
                                                ". 146x146.png")));
                                boton4.setIcon(imageDado);
                                System.out.println("has dado vuelta a un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                        }
                    }
                    if (e.getSource() == boton5) {
                        switch (caraBotonUsado) {
                            case 1 -> {
                                modelClass.accionarBoton(indiceJBoton5);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton5).getCara() +
                                                ". 146x146.png")));
                                boton5.setIcon(imageDado);
                                System.out.println("has relanzado un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                            case 3 -> {
                                modelClass.accionarBoton(indiceJBoton5);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton5).getCara() +
                                                ". 146x146.png")));
                                boton5.setIcon(imageDado);
                                System.out.println("has dado vuelta a un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                        }
                    }
                    if (e.getSource() == boton6) {
                        switch (caraBotonUsado) {
                            case 1 -> {
                                modelClass.accionarBoton(indiceJBoton6);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton6).getCara() +
                                                ". 146x146.png")));
                                boton6.setIcon(imageDado);
                                System.out.println("has relanzado un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                            case 3 -> {
                                modelClass.accionarBoton(indiceJBoton6);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton6).getCara() +
                                                ". 146x146.png")));
                                boton6.setIcon(imageDado);
                                System.out.println("has dado vuelta a un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                        }
                    }
                    if (e.getSource() == boton7) {
                        switch (caraBotonUsado) {
                            case 1 -> {
                                modelClass.accionarBoton(indiceJBoton7);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton7).getCara() +
                                                ". 146x146.png")));
                                boton7.setIcon(imageDado);
                                System.out.println("has relanzado un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                            case 3 -> {
                                modelClass.accionarBoton(indiceJBoton7);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton7).getCara() +
                                                ". 146x146.png")));
                                boton7.setIcon(imageDado);
                                System.out.println("has dado vuelta a un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                        }
                    }
                    if (e.getSource() == boton8A) {
                        switch (caraBotonUsado) {
                            case 1 -> {
                                modelClass.accionarBoton(indiceJBoton8A);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton8A).getCara() +
                                                ". 146x146.png")));
                                boton8A.setIcon(imageDado);
                                System.out.println("has relanzado un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                            case 3 -> {
                                modelClass.accionarBoton(indiceJBoton8A);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton8A).getCara() +
                                                ". 146x146.png")));
                                boton8A.setIcon(imageDado);
                                System.out.println("has dado vuelta a un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                        }
                    }
                    if (e.getSource() == boton9A) {
                        switch (caraBotonUsado) {
                            case 1 -> {
                                modelClass.accionarBoton(indiceJBoton9A);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton9A).getCara() +
                                                ". 146x146.png")));
                                boton9A.setIcon(imageDado);
                                System.out.println("has relanzado un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                            case 3 -> {
                                modelClass.accionarBoton(indiceJBoton9A);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton9A).getCara() +
                                                ". 146x146.png")));
                                boton9A.setIcon(imageDado);
                                System.out.println("has dado vuelta a un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                        }
                    }
                    if (e.getSource() == boton10A) {
                        switch (caraBotonUsado) {
                            case 1 -> {
                                modelClass.accionarBoton(indiceJBoton10A);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton10A).getCara() +
                                                ". 146x146.png")));
                                boton10A.setIcon(imageDado);
                                System.out.println("has relanzado un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                            case 3 -> {
                                modelClass.accionarBoton(indiceJBoton10A);
                                imageDado = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                                        "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados().get(indiceJBoton10A).getCara() +
                                                ". 146x146.png")));
                                boton10A.setIcon(imageDado);
                                System.out.println("has dado vuelta a un dado");
                                opcionPanel = 1;
                                probarEnConsola();
                            }
                        }
                    }
                    revalidate();
                    repaint();
                }

            }

        }

    }
}
