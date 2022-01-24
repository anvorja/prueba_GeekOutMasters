package myProyect;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
  private JLabel dado8I, dado9I, dado10I;
  private JButton iniciar, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8,
    boton9, boton10, boton8A, boton9A, boton10A;
  private JPanel panelInicio, panelDadosUtilizados, panelDadosActivados, panelDadosInactivos,
          panelResultados, panelLanzar;
  //auxiliares
  private int opcionPanel, caraBotonUsado,posicionDadoInactivoEnActivos, posicionDado8A, posicionDado9A,posicionDado10A;
  private boolean destruir,flag;


  private ImageIcon imageDado;
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

  public void crearPanelDadosActivados() {

    panelDadosActivados = new JPanel();
    panelDadosActivados.setPreferredSize(new Dimension(400, 340));
    panelDadosActivados.setBorder(
            BorderFactory.createTitledBorder("Dados Activados"));
    //        imageDado = new
    //        ImageIcon(getClass().getResource("/recursos/enBlanco 146p.png"));
    //        dado1A = new JLabel(imageDado);
    //        imageDado = new
    //        ImageIcon(getClass().getResource("/recursos/enBlanco 146p.png"));
    //        dado2A = new JLabel(imageDado);
    //        imageDado = new
    //        ImageIcon(getClass().getResource("/recursos/enBlanco 146p.png"));
    //        dado3A = new JLabel(imageDado);
    //        imageDado = new
    //        ImageIcon(getClass().getResource("/recursos/enBlanco 146p.png"));
    //        dado4A = new JLabel(imageDado);
    //        imageDado = new
    //        ImageIcon(getClass().getResource("/recursos/enBlanco 146p.png"));
    //        dado5A = new JLabel(imageDado);
    //        imageDado = new
    //        ImageIcon(getClass().getResource("/recursos/enBlanco 146p.png"));
    //        dado6A = new JLabel(imageDado);
    //        imageDado = new
    //        ImageIcon(getClass().getResource("/recursos/enBlanco 146p.png"));
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


  public void crearDadosInactivos() {

    // dados inactivos
    panelDadosInactivos = new JPanel();
    panelDadosInactivos.setPreferredSize(new Dimension(370, 180));
    panelDadosInactivos.setBorder(
            BorderFactory.createTitledBorder("Dados Inactivos"));
    imageDado =
            new ImageIcon(getClass().getResource("/recursos/enBlanco 50p.png"));
    dado8I = new JLabel(imageDado);
    imageDado =
            new ImageIcon(getClass().getResource("/recursos/enBlanco 50p.png"));
    dado9I = new JLabel(imageDado);
    imageDado =
            new ImageIcon(getClass().getResource("/recursos/enBlanco 50p.png"));
    dado10I = new JLabel(imageDado);
    panelDadosInactivos.add(dado8I);
    panelDadosInactivos.add(dado9I);
    panelDadosInactivos.add(dado10I);
    this.add(panelDadosInactivos, BorderLayout.WEST);
  }

  public void crearPanelDadosUtilizados() {

    panelDadosUtilizados = new JPanel();
    panelDadosUtilizados.setPreferredSize(new Dimension(300, 180));
    panelDadosUtilizados.setBorder(
            BorderFactory.createTitledBorder("Dados Utilizados"));
    //        imageDado = new ImageIcon(getClass().getResource("/recursos/50
    //        p/1. cara dado 50p.jpg")); dado1U = new JLabel(imageDado);
    //        imageDado = new ImageIcon(getClass().getResource("/recursos/50
    //        p/2. cara dado 50p.jpg")); dado2U = new JLabel(imageDado);
    //        imageDado = new ImageIcon(getClass().getResource("/recursos/50
    //        p/3. cara dado 50p.jpg")); dado3U = new JLabel(imageDado);
    //        imageDado = new ImageIcon(getClass().getResource("/recursos/50
    //        p/4. cara dado 50p.jpg")); dado4U = new JLabel(imageDado);
    //        imageDado = new ImageIcon(getClass().getResource("/recursos/50
    //        p/5. cara dado 50p.jpg")); dado5U = new JLabel(imageDado);
    //        imageDado = new ImageIcon(getClass().getResource("/recursos/50
    //        p/6. cara dado 50p.jpg")); dado6U = new JLabel(imageDado);
    //        imageDado = new ImageIcon(getClass().getResource("/recursos/50
    //        p/5. cara dado 50p.jpg")); dado7U = new JLabel(imageDado);
    //        imageDado = new ImageIcon(getClass().getResource("/recursos/50
    //        p/4. cara dado 50p.jpg")); dado8U = new JLabel(imageDado);
    //        imageDado = new ImageIcon(getClass().getResource("/recursos/50
    //        p/3. cara dado 50p.jpg")); dado9U = new JLabel(imageDado);
    //        imageDado = new ImageIcon(getClass().getResource("/recursos/50
    //        p/2. cara dado 50p.jpg")); dado10U = new JLabel(imageDado);
    //        imageDado = new ImageIcon(getClass().getResource("/recursos/50
    //        p/1. cara dado 50p.jpg")); panelDadosUtilizados.add(dado1U);
    //        panelDadosUtilizados.add(dado2U);
    //        panelDadosUtilizados.add(dado3U);
    //        panelDadosUtilizados.add(dado4U);
    //        panelDadosUtilizados.add(dado5U);
    //        panelDadosUtilizados.add(dado6U);
    //        panelDadosUtilizados.add(dado7U);
    //        panelDadosUtilizados.add(dado8U);
    //        panelDadosUtilizados.add(dado9U);
    //        panelDadosUtilizados.add(dado10U);
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

  public void crearPanelResultados() {

    panelResultados = new JPanel();
    panelResultados.setBorder(BorderFactory.createTitledBorder("Puntuación"));
    panelResultados.setPreferredSize(new Dimension(370, 180));
    this.add(panelResultados, BorderLayout.EAST);
  }

  public void meterBotonesActivos(Dado[] reciboCarasBotonesActivos) {

      boton1 = new JButton();
      boton1.addActionListener(escucha);
      boton1.setPreferredSize(new Dimension(146, 146));
      boton1.setContentAreaFilled(false);
      boton1.setBorderPainted(false);
      imageDado = new ImageIcon(getClass().getResource(
              "/recursos/imagenesDeisy/medianas 146/" + reciboCarasBotonesActivos[0].getCara() +
                      ". 146x146.png"));
      boton1.setIcon(imageDado);
      panelDadosActivados.add(boton1);

      boton2 = new JButton();
      boton2.addActionListener(escucha);
      boton2.setPreferredSize(new Dimension(146, 146));
      boton2.setContentAreaFilled(false);
      boton2.setBorderPainted(false);
      imageDado = new ImageIcon(getClass().getResource(
              "/recursos/imagenesDeisy/medianas 146/" + reciboCarasBotonesActivos[1].getCara() +
                      ". 146x146.png"));
      boton2.setIcon(imageDado);
      panelDadosActivados.add(boton2);

      boton3 = new JButton();
      boton3.addActionListener(escucha);
      boton3.setPreferredSize(new Dimension(146, 146));
      boton3.setContentAreaFilled(false);
      boton3.setBorderPainted(false);
      imageDado = new ImageIcon(getClass().getResource(
              "/recursos/imagenesDeisy/medianas 146/" + reciboCarasBotonesActivos[2].getCara() +
                      ". 146x146.png"));
      boton3.setIcon(imageDado);
      panelDadosActivados.add(boton3);

      boton4 = new JButton();
      boton4.addActionListener(escucha);
      boton4.setPreferredSize(new Dimension(146, 146));
      boton4.setContentAreaFilled(false);
      boton4.setBorderPainted(false);
      imageDado = new ImageIcon(getClass().getResource(
              "/recursos/imagenesDeisy/medianas 146/" + reciboCarasBotonesActivos[3].getCara() +
                      ". 146x146.png"));
      boton4.setIcon(imageDado);
      panelDadosActivados.add(boton4);

      boton5 = new JButton();
      boton5.addActionListener(escucha);
      boton5.setPreferredSize(new Dimension(146, 146));
      boton5.setContentAreaFilled(false);
      boton5.setBorderPainted(false);
      imageDado = new ImageIcon(getClass().getResource(
              "/recursos/imagenesDeisy/medianas 146/" + reciboCarasBotonesActivos[4].getCara() +
                      ". 146x146.png"));
      boton5.setIcon(imageDado);
      panelDadosActivados.add(boton5);

      boton6 = new JButton();
      boton6.addActionListener(escucha);
      boton6.setPreferredSize(new Dimension(146, 146));
      boton6.setContentAreaFilled(false);
      boton6.setBorderPainted(false);
      imageDado = new ImageIcon(getClass().getResource(
              "/recursos/imagenesDeisy/medianas 146/" + reciboCarasBotonesActivos[5].getCara() +
                      ". 146x146.png"));
      boton6.setIcon(imageDado);
      panelDadosActivados.add(boton6);

      boton7 = new JButton();
      boton7.addActionListener(escucha);
      boton7.setPreferredSize(new Dimension(146, 146));
      boton7.setContentAreaFilled(false);
      boton7.setBorderPainted(false);
      imageDado = new ImageIcon(getClass().getResource(
              "/recursos/imagenesDeisy/medianas 146/" + reciboCarasBotonesActivos[6].getCara() +
                      ". 146x146.png"));
      boton7.setIcon(imageDado);
      panelDadosActivados.add(boton7);

  }

    public void meterDadosInactivos(Dado [] reciboCarasBotonesInactivos){

        boton8A = new JButton();
        boton8A.addActionListener(escucha);
        boton8A.setPreferredSize(new Dimension(69, 60));
        boton8A.setContentAreaFilled(false);
        boton8A.setBorderPainted(false);
        imageDado = new ImageIcon(getClass().getResource(
                "/recursos/imagenesDeisy/pequeñas/" + reciboCarasBotonesInactivos[0].getCara() +
                        ".png"));
        boton8A.setIcon(imageDado);

        panelDadosInactivos.add(boton8A);

        boton9A = new JButton();
        boton9A.addActionListener(escucha);
        boton9A.setPreferredSize(new Dimension(69, 60));
        boton9A.setContentAreaFilled(false);
        boton9A.setBorderPainted(false);
        imageDado = new ImageIcon(getClass().getResource(
                "/recursos/imagenesDeisy/pequeñas/" + reciboCarasBotonesInactivos[1].getCara() +
                        ".png"));
        boton9A.setIcon(imageDado);
        panelDadosInactivos.add(boton9A);

        boton10A = new JButton();
        boton10A.addActionListener(escucha);
        boton10A.setPreferredSize(new Dimension(69, 60));
        boton10A.setContentAreaFilled(false);
        boton10A.setBorderPainted(false);
        imageDado = new ImageIcon(getClass().getResource(
                "/recursos/imagenesDeisy/pequeñas/" + reciboCarasBotonesInactivos[2].getCara() +
                        ".png"));
        boton10A.setIcon(imageDado);
        panelDadosInactivos.add(boton10A);


    }


    public void confirmarDestruir(){

        if (caraBotonUsado==2 && destruir== true || destruir== true){

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
            opcionPanel=3;
        }
    }

  public static void main(String[] args) {
    EventQueue.invokeLater(() -> { GUI miProjectGUI = new GUI(); });
  }

  // escuchas
  private class Escucha implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

      Dado[] array_DadosActivados;
      Dado[] array_DadosInactivos;

      if (e.getSource() == iniciar) {

        iniciar.setEnabled(false);
        // modelClass.lanzamientoInicial();
        //            modelClass.iniciar_array_dadosActivados();
        // array_DadosActivados = modelClass.getDadosActivados();
        // probar cantidad dados activos
        // System.out.println("activos: " + array_DadosActivados.length);

        //crear botones en el panel DadosActivados
        meterBotonesActivos(modelClass.getDadosActivados());

        // probar cantidad dados inactivos
        System.out.println("inactivos: " +
                modelClass.getDadosInactivos().length);
        for (int i = 0; i < modelClass.getDadosInactivos().length; i++) {
          System.out.println(
                  modelClass.getDadosInactivos()[i].getCara() + " su opuest: " +
                          modelClass.getDadosInactivos()[i].getCaraOpuesta());
        }

        // dados inactivos
        panelDadosInactivos.removeAll();
        meterDadosInactivos(modelClass.getDadosInactivos());
        panelDadosUtilizados.removeAll();

        opcionPanel=1; // si es 1: elegir dado de panel de Dados Activos, si es 2: accionar dado, si es 3: adicionar
          // dado inactivo a panel de Dados Activos
        destruir=false; //requerido para accion de la nave
        caraBotonUsado=0;
        revalidate();
        repaint();

      }

      /**  ---------------------------------------------------------------------------------
      //escuha para los botones con su validación
      if (e.getSource() == boton1) {
        modelClass.validarBotonesAccionados(0);
        System.out.println("Boton 1");
      }
      if (e.getSource() == boton2) {
        modelClass.validarBotonesAccionados(1);
        System.out.println("Boton 2");
      }
      if (e.getSource() == boton3) {
        modelClass.validarBotonesAccionados(2);
        System.out.println("Boton 3");
      }
      if (e.getSource() == boton4) {
        modelClass.validarBotonesAccionados(3);
        System.out.println("Boton 4");
      }
      if (e.getSource() == boton5) {
        modelClass.validarBotonesAccionados(4);
        System.out.println("Boton 5");
      }
      if (e.getSource() == boton6) {
        modelClass.validarBotonesAccionados(5);
        System.out.println("Boton 6");
      }
      if (e.getSource() == boton7) {
        modelClass.validarBotonesAccionados(6);
        System.out.println("Boton 7");
      }
      --------------------------------------------------------------------------------*/
        switch (opcionPanel){

            //escoger dado
            case 1:

                if (e.getSource() == boton1) {
                    if(destruir==true||
                            modelClass.getDadosActivados()[0].getCara()!=4 && modelClass.getDadosActivados()[0].getCara()!=6){

                        System.out.println("Boton 1");
                        modelClass.validarBotonesAccionados(0,1);
                        boton1.setPreferredSize(new Dimension(69, 60));
                        imageDado = new ImageIcon(getClass().getResource(
                                "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados()[0].getCara() +
                                        ".png"));
                        boton1.setIcon(imageDado);
                        panelDadosUtilizados.add(boton1);

                        if (modelClass.getDadosInactivos()!=null){
                            posicionDadoInactivoEnActivos=0;
                        }

                        caraBotonUsado= modelClass.getDadosActivados()[0].getCara();
                        modelClass.meterEnArrayDadosUtilizados(0);
                        System.out.println("La cara del boton usado es: "+caraBotonUsado);
                        confirmarDestruir();


                        }
                    }
                else if (e.getSource() == boton2) {
                    if (destruir==true||
                            modelClass.getDadosActivados()[1].getCara() != 4 && modelClass.getDadosActivados()[1].getCara() != 6) {

                        System.out.println("Boton 2");
                        modelClass.validarBotonesAccionados(1,1);
                        boton2.setPreferredSize(new Dimension(69, 60));
                        imageDado = new ImageIcon(getClass().getResource(
                                "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados()[1].getCara() +
                                        ".png"));
                        boton2.setIcon(imageDado);
                        panelDadosUtilizados.add(boton2);

                        if (modelClass.getDadosInactivos()!=null){
                            posicionDadoInactivoEnActivos=1;
                        }

                        caraBotonUsado= modelClass.getDadosActivados()[1].getCara();
                        modelClass.meterEnArrayDadosUtilizados(1);
                        System.out.println("La cara del boton usado es: "+caraBotonUsado);
                        confirmarDestruir();

                    }
                }

                else if (e.getSource() == boton3) {
                    if (destruir==true||
                            modelClass.getDadosActivados()[2].getCara() != 4 && modelClass.getDadosActivados()[2].getCara() != 6) {

                        System.out.println("Boton 3");
                        modelClass.validarBotonesAccionados(2,1);
                        boton3.setPreferredSize(new Dimension(69, 60));
                        imageDado = new ImageIcon(getClass().getResource(
                                "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados()[2].getCara() +
                                        ".png"));
                        boton3.setIcon(imageDado);
                        panelDadosUtilizados.add(boton3);

                        if (modelClass.getDadosInactivos()!=null){
                            posicionDadoInactivoEnActivos=2;
                        }

                        caraBotonUsado= modelClass.getDadosActivados()[2].getCara();
                        modelClass.meterEnArrayDadosUtilizados(2);
                        System.out.println("La cara del boton usado es: "+caraBotonUsado);
                        confirmarDestruir();
                    }
                }
                else if (e.getSource() == boton4) {
                    if(destruir==true||
                            modelClass.getDadosActivados()[3].getCara()!=4 && modelClass.getDadosActivados()[3].getCara()!=6){

                        System.out.println("Boton 4");
                        modelClass.validarBotonesAccionados(3,1);
                        boton4.setPreferredSize(new Dimension(69, 60));
                        imageDado = new ImageIcon(getClass().getResource(
                                "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados()[3].getCara() +
                                        ".png"));
                        boton4.setIcon(imageDado);
                        panelDadosUtilizados.add(boton4);

                        if (modelClass.getDadosInactivos()!=null){
                            posicionDadoInactivoEnActivos=3;
                        }

                        caraBotonUsado= modelClass.getDadosActivados()[3].getCara();
                        modelClass.meterEnArrayDadosUtilizados(3);
                        System.out.println("La cara del boton usado es: "+caraBotonUsado);
                        confirmarDestruir();
                    }
                }
                else if (e.getSource() == boton5) {
                    if(destruir==true||
                            modelClass.getDadosActivados()[4].getCara()!=4 && modelClass.getDadosActivados()[4].getCara()!=6) {

                        System.out.println("Boton 5");
                        modelClass.validarBotonesAccionados(4,1);
                        boton5.setPreferredSize(new Dimension(69, 60));
                        imageDado = new ImageIcon(getClass().getResource(
                                "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados()[4].getCara() +
                                        ".png"));
                        boton5.setIcon(imageDado);
                        panelDadosUtilizados.add(boton5);

                        if (modelClass.getDadosInactivos()!=null){
                            posicionDadoInactivoEnActivos=4;
                        }

                        caraBotonUsado= modelClass.getDadosActivados()[4].getCara();
                        modelClass.meterEnArrayDadosUtilizados(4);
                        System.out.println("La cara del boton usado es: "+caraBotonUsado);
                        confirmarDestruir();

                    }
                }
                else if (e.getSource() == boton6) {
                    if (destruir==true||
                            modelClass.getDadosActivados()[5].getCara() != 4 && modelClass.getDadosActivados()[5].getCara() != 6) {

                        System.out.println("Boton 6");
                        modelClass.validarBotonesAccionados(5,1);
                        boton6.setPreferredSize(new Dimension(69, 60));
                        imageDado = new ImageIcon(getClass().getResource(
                                "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados()[5].getCara() +
                                        ".png"));
                        boton6.setIcon(imageDado);
                        panelDadosUtilizados.add(boton6);

                        if (modelClass.getDadosInactivos()!=null){
                            posicionDadoInactivoEnActivos=5;
                        }

                        caraBotonUsado= modelClass.getDadosActivados()[5].getCara();
                        modelClass.meterEnArrayDadosUtilizados(5);
                        System.out.println("La cara del boton usado es: "+caraBotonUsado);
                        confirmarDestruir();

                    }
                }
                else if (e.getSource() == boton7) {
                    if(destruir==true||
                            modelClass.getDadosActivados()[6].getCara()!=4 && modelClass.getDadosActivados()[6].getCara()!=6){

                        System.out.println("Boton 7");
                        modelClass.validarBotonesAccionados(6,1);

                        boton7.setPreferredSize(new Dimension(69, 60));
                        imageDado = new ImageIcon(getClass().getResource(
                                "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados()[6].getCara() +
                                        ".png"));
                        boton7.setIcon(imageDado);
                        panelDadosUtilizados.add(boton7);

                        if (modelClass.getDadosInactivos()!=null){
                            posicionDadoInactivoEnActivos=6;
                        }

                        caraBotonUsado= modelClass.getDadosActivados()[6].getCara();
                        modelClass.meterEnArrayDadosUtilizados(6);
                        System.out.println("La cara del boton usado es: "+caraBotonUsado);
                        confirmarDestruir();

                    }
                }
                else if (e.getSource() == boton8A) {
                    if(destruir==true||
                            modelClass.getDadosActivados()[posicionDado8A].getCara()!=4 && modelClass.getDadosActivados()[posicionDado8A].getCara()!=6){

                        System.out.println("Boton 8A");
                        modelClass.validarBotonesAccionados(0,2);
                        boton8A.setPreferredSize(new Dimension(69, 60));
                        imageDado = new ImageIcon(getClass().getResource(
                                "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados()[posicionDado8A].getCara() +
                                        ".png"));
                        boton8A.setIcon(imageDado);
                        panelDadosUtilizados.add(boton8A);

                        caraBotonUsado= modelClass.getDadosActivados()[posicionDado8A].getCara();
                        modelClass.meterEnArrayDadosUtilizados(posicionDado8A);
                        System.out.println("La cara del boton usado es: "+caraBotonUsado);
                        confirmarDestruir();

                    }
                }
                else if (e.getSource() == boton9A) {
                    if(destruir==true||
                            modelClass.getDadosActivados()[posicionDado9A].getCara()!=4 && modelClass.getDadosActivados()[posicionDado9A].getCara()!=6){

                        System.out.println("Boton 9A");
                        modelClass.validarBotonesAccionados(1,2);
                        boton9A.setPreferredSize(new Dimension(69, 60));
                        imageDado = new ImageIcon(getClass().getResource(
                                "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados()[posicionDado9A].getCara() +
                                        ".png"));
                        boton9A.setIcon(imageDado);
                        panelDadosUtilizados.add(boton9A);

                        caraBotonUsado= modelClass.getDadosActivados()[posicionDado9A].getCara();
                        modelClass.meterEnArrayDadosUtilizados(posicionDado9A);
                        System.out.println("La cara del boton usado es: "+caraBotonUsado);
                        confirmarDestruir();
                    }
                }
                else if (e.getSource() == boton10A) {
                    if(destruir==true||
                            modelClass.getDadosActivados()[posicionDado10A].getCara()!=4 && modelClass.getDadosInactivos()[posicionDado10A].getCara()!=6){

                        System.out.println("Boton 10A");
                        modelClass.validarBotonesAccionados(2,2);
                        boton10A.setPreferredSize(new Dimension(69, 60));
                        imageDado = new ImageIcon(getClass().getResource(
                                "/recursos/imagenesDeisy/pequeñas/" + modelClass.getDadosActivados()[posicionDado10A].getCara() +
                                        ".png"));
                        boton10A.setIcon(imageDado);
                        panelDadosUtilizados.add(boton10A);

                        caraBotonUsado= modelClass.getDadosActivados()[posicionDado10A].getCara();
                        modelClass.meterEnArrayDadosUtilizados(posicionDado10A);
                        System.out.println("La cara del boton usado es: "+caraBotonUsado);
                        confirmarDestruir();
                    }
                }
                break;

            case 2:
                if (e.getSource() == boton1) {
                    switch (caraBotonUsado){
                        case 1:
                            modelClass.accionarBoton(0);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[0].getCara() +
                                            ". 146x146.png"));
                            boton1.setIcon(imageDado);
                            System.out.println("has relanzado un dado");
                            opcionPanel=1;
                            break;
                        case 3: modelClass.accionarBoton(0);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[0].getCaraOpuesta() +
                                            ". 146x146.png"));
                            boton1.setIcon(imageDado);
                            System.out.println("has dado vuelta a un dado");
                            opcionPanel=1;
                            break;
                    }
                }
                if (e.getSource() == boton2) {
                    switch (caraBotonUsado){
                        case 1:
                            modelClass.accionarBoton(1);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[1].getCara() +
                                            ". 146x146.png"));
                            boton2.setIcon(imageDado);
                            System.out.println("has relanzado un dado");
                            opcionPanel=1;
                            break;
                        case 3: modelClass.accionarBoton(1);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[1].getCara() +
                                            ". 146x146.png"));
                            boton2.setIcon(imageDado);
                            System.out.println("has dado vuelta a un dado");
                            opcionPanel=1;
                            break;
                    }
                }
                if (e.getSource() == boton3) {
                    switch (caraBotonUsado){
                        case 1:
                            modelClass.accionarBoton(2);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[2].getCara() +
                                            ". 146x146.png"));
                            boton3.setIcon(imageDado);
                            System.out.println("has relanzado un dado");
                            opcionPanel=1;
                            break;
                        case 3: modelClass.accionarBoton(2);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[2].getCara() +
                                            ".146x146.png"));
                            boton3.setIcon(imageDado);
                            System.out.println("has dado vuelta a un dado");
                            opcionPanel=1;
                            break;
                    }
                }
                if (e.getSource() == boton4) {
                    switch (caraBotonUsado){
                        case 1:
                            modelClass.accionarBoton(3);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[3].getCara() +
                                            ". 146x146.png"));
                            boton4.setIcon(imageDado);
                            System.out.println("has relanzado un dado");
                            opcionPanel=1;
                            break;
                        case 3: modelClass.accionarBoton(3);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[3].getCara() +
                                            ". 146x146.png"));
                            boton4.setIcon(imageDado);
                            System.out.println("has dado vuelta a un dado");
                            opcionPanel=1;
                            break;
                    }
                }
                if (e.getSource() == boton5) {
                    switch (caraBotonUsado){
                        case 1:
                            modelClass.accionarBoton(4);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[4].getCara() +
                                            ". 146x146.png"));
                            boton5.setIcon(imageDado);
                            System.out.println("has relanzado un dado");
                            opcionPanel=1;
                            break;
                        case 3: modelClass.accionarBoton(4);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[4].getCara() +
                                            ". 146x146.png"));
                            boton5.setIcon(imageDado);
                            System.out.println("has dado vuelta a un dado");
                            opcionPanel=1;
                            break;
                    }
                }
                if (e.getSource() == boton6) {
                    switch (caraBotonUsado){
                        case 1:
                            modelClass.accionarBoton(5);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[5].getCara() +
                                            ". 146x146.png"));
                            boton6.setIcon(imageDado);
                            System.out.println("has relanzado un dado");
                            opcionPanel=1;
                            break;
                        case 3: modelClass.accionarBoton(5);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[5].getCara() +
                                            ". 146x146.png"));
                            boton6.setIcon(imageDado);
                            System.out.println("has dado vuelta a un dado");
                            opcionPanel=1;
                            break;
                    }
                }
                if (e.getSource() == boton7) {
                    switch (caraBotonUsado){
                        case 1:
                            modelClass.accionarBoton(6);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[6].getCara() +
                                            ". 146x146.png"));
                            boton7.setIcon(imageDado);
                            System.out.println("has relanzado un dado");
                            opcionPanel=1;
                            break;
                        case 3: modelClass.accionarBoton(6);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[6].getCara() +
                                            ". 146x146.png"));
                            boton7.setIcon(imageDado);
                            System.out.println("has dado vuelta a un dado");
                            opcionPanel=1;
                            break;
                    }
                }
                if (e.getSource() == boton8A) {
                    switch (caraBotonUsado){
                        case 1:
                            modelClass.accionarBoton(posicionDado8A);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[posicionDado8A].getCara() +
                                            ". 146x146.png"));
                            boton8A.setIcon(imageDado);
                            System.out.println("has relanzado un dado");
                            opcionPanel=1;
                            break;
                        case 3: modelClass.accionarBoton(posicionDado8A);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[posicionDado8A].getCara() +
                                            ". 146x146.png"));
                            boton8A.setIcon(imageDado);
                            System.out.println("has dado vuelta a un dado");
                            opcionPanel=1;
                            break;
                    }
                }
                if (e.getSource() == boton9A) {
                    switch (caraBotonUsado){
                        case 1:
                            modelClass.accionarBoton(posicionDado9A);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[posicionDado9A].getCara() +
                                            ". 146x146.png"));
                            boton9A.setIcon(imageDado);
                            System.out.println("has relanzado un dado");
                            opcionPanel=1;
                            break;
                        case 3: modelClass.accionarBoton(posicionDado9A);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[posicionDado9A].getCara() +
                                            ". 146x146.png"));
                            boton9A.setIcon(imageDado);
                            System.out.println("has dado vuelta a un dado");
                            opcionPanel=1;
                            break;
                    }
                }
                if (e.getSource() == boton10A) {
                    switch (caraBotonUsado){
                        case 1:
                            modelClass.accionarBoton(posicionDado10A);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[posicionDado10A].getCara() +
                                            ". 146x146.png"));
                            boton10A.setIcon(imageDado);
                            System.out.println("has relanzado un dado");
                            opcionPanel=1;
                            break;
                        case 3: modelClass.accionarBoton(posicionDado10A);
                            imageDado = new ImageIcon(getClass().getResource(
                                    "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[posicionDado10A].getCara() +
                                            ". 146x146.png"));
                            boton10A.setIcon(imageDado);
                            System.out.println("has dado vuelta a un dado");
                            opcionPanel=1;
                            break;
                    }
                }
                break;

            case 3:
                if(e.getSource()==boton8A){
                    modelClass.eliminarElementoDeArrayDadosInactivos();
                    modelClass.accionarBoton(posicionDadoInactivoEnActivos);
                    posicionDado8A=posicionDadoInactivoEnActivos;

                    boton8A.setPreferredSize(new Dimension(146, 146));
                    System.out.println("actualizó el array de activos");
                    imageDado = new ImageIcon(getClass().getResource(
                            "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosActivados()[posicionDadoInactivoEnActivos].getCara() +
                                    ". 146x146.png"));
                    boton8A.setIcon(imageDado);
                    panelDadosActivados.add(boton8A);

                    opcionPanel=1;
                }
                if(e.getSource()==boton9A){
                    modelClass.eliminarElementoDeArrayDadosInactivos();
                    modelClass.accionarBoton(posicionDadoInactivoEnActivos);
                    posicionDado9A=posicionDadoInactivoEnActivos;

                    boton9A.setPreferredSize(new Dimension(146, 146));
                    imageDado = new ImageIcon(getClass().getResource(
                            "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosInactivos()[1].getCara() +
                                    ". 146x146.png"));
                    boton9A.setIcon(imageDado);
                    panelDadosActivados.add(boton9A);

                    opcionPanel=1;
                }
                if(e.getSource()==boton10A){
                    modelClass.eliminarElementoDeArrayDadosInactivos();
                    modelClass.accionarBoton(posicionDadoInactivoEnActivos);
                    posicionDado10A=posicionDadoInactivoEnActivos;

                    boton10A.setPreferredSize(new Dimension(146, 146));
                    imageDado = new ImageIcon(getClass().getResource(
                            "/recursos/imagenesDeisy/medianas 146/" + modelClass.getDadosInactivos()[2].getCara() +
                                    ". 146x146.png"));
                    boton10A.setIcon(imageDado);
                    panelDadosActivados.add(boton10A);

                    opcionPanel=1;
                }
                System.out.println("has activado un dado");
                break;

        }

    }

  }

}

