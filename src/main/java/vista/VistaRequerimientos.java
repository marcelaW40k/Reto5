package vista;

import java.util.ArrayList;

import controlador.ControladorRequerimientos;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;     
import modelo.vo.Requerimiento_3Vo;

import java.awt.event.*;
import javax.swing.*;

public class VistaRequerimientos extends JFrame {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private static JTextArea textArea;

    
    public VistaRequerimientos() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 300, 800, 700);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("RETO 5");
        lblTitulo.setBounds(30, 7, 62, 17);
        contentPane.add(lblTitulo);

        JLabel lblAutor = new JLabel("Marcela Patiño Ardila");
        lblAutor.setBounds(30, 34, 208, 17);
        contentPane.add(lblAutor);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(30, 70, 737, 455);
        contentPane.add(scrollPane);

        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
        
        JButton btnConsulta01 = new JButton("Consulta 01");
        btnConsulta01.addActionListener( new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                requerimiento1();
                
            }
            
        });
        btnConsulta01.setBounds(30, 537, 117, 29);
        contentPane.add(btnConsulta01);

        JButton btnConsulta02 = new JButton("Consulta 02");
        btnConsulta02.addActionListener( new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                requerimiento2();
                
            }
            
        });
        btnConsulta02.setBounds(157, 537, 117, 29);
        contentPane.add(btnConsulta02);

        JButton btnMostrar = new JButton("Mostrar");
        btnMostrar.addActionListener( new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                requerimiento3();
                
            }
            
        });
        btnMostrar.setBounds(284, 537, 117, 29);
        contentPane.add(btnMostrar);

        JButton btnInsertar = new JButton("Insetar");
        btnInsertar.addActionListener( new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                insertar();
                
            }
            
        });
        btnInsertar.setBounds(411, 537, 117, 29);
        contentPane.add(btnInsertar);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener( new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                
            }
        });
        btnLimpiar.setBounds(648, 537, 117, 29);
        contentPane.add(btnLimpiar);
    }
    public static void requerimiento1() {
        try {
              // Su código
            ArrayList<Requerimiento_1Vo> resultado1 = controlador.consultarRequerimiento1();
            String salida = "\n\nId_Lider\tNombre\tPrimer_Apellido\tSalario\n\n";
            for (Requerimiento_1Vo lider : resultado1){
                salida += lider.getIdLider();
                salida += "\t";
                salida += lider.getNombre();
                salida += "\t";
                salida += lider.getPrimerApellido();
                salida += "\t\t";
                salida += lider.getSalario();
                salida += "\n";
            }
            textArea.setText(salida);

        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }
    public static void requerimiento2() {
        try {
            ArrayList<Requerimiento_2Vo> resultado2 = controlador.consultarRequerimiento2();
            String salida = "\n\nId_Proyecto\tNombre_Material\n\n";
            for (Requerimiento_2Vo materiales : resultado2){
                salida += materiales.getIdProyecto();
                salida += "\t";
                salida += materiales.getNombreMaterial();
                salida += "\n";
            }
            textArea.setText(salida);

        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void requerimiento3() {
        try {
            ArrayList<Requerimiento_3Vo> resultado3 = controlador.consultarRequerimiento3();
            String salida = "\n\nId_Lider\tNombre\tPrimer_Apellido\tSegundo_Apellido\tSalario\tCiudad_Residencia\tCargo\tClasificacion\tDocumento_Identidad\tFecha_Nacimiento\n\n";
            for (Requerimiento_3Vo lideres : resultado3){
                salida += lideres.getIdLider();
                salida += "\t";
                salida += lideres.getNombre();
                salida += "\t";
                salida += lideres.getPrimer_Apellido();
                salida += "\t\t";
                salida += lideres.getSegundo_Apellido();
                salida += "\t\t";
                salida += lideres.getSalario();
                salida += "\t";
                salida += lideres.getCiudad_Residencia();
                salida += "\t";
                salida += lideres.getCargo();
                salida += "\t";
                salida += lideres.getClasificacion();
                salida += "\t";
                salida += lideres.getDocumento_Identidad();
                salida += "\t";
                salida += lideres.getFecha_Nacimiento();
                salida += "\n";
            }
            textArea.setText(salida);
            
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            //e.printStackTrace();
        }

    }

    public static void insertar() {
        try {
            boolean insertar = controlador.insertarLideres();
            if (insertar){
                ArrayList<Requerimiento_3Vo> insetar = controlador.consultarRequerimiento3();
                String salida = "\n\nId_Lider\tNombre\tPrimer_Apellido\tSegundo_Apellido\tSalario\tCiudad_Residencia\tCargo\tClasificacion\tDocumento_Identidad\tFecha_Nacimiento\n\n";
                for (Requerimiento_3Vo lideres1 : insetar){
                    salida += lideres1.getIdLider();
                    salida += "\t";
                    salida += lideres1.getNombre();
                    salida += "\t";
                    salida += lideres1.getPrimer_Apellido();
                    salida += "\t\t";
                    salida += lideres1.getSegundo_Apellido();
                    salida += "\t\t";
                    salida += lideres1.getSalario();
                    salida += "\t";
                    salida += lideres1.getCiudad_Residencia();
                    salida += "\t";
                    salida += lideres1.getCargo();
                    salida += "\t";
                    salida += lideres1.getClasificacion();
                    salida += "\t";
                    salida += lideres1.getDocumento_Identidad();
                    salida += "\t";
                    salida += lideres1.getFecha_Nacimiento();
                    salida += "\n";
                }
                textArea.setText(salida);
                
            } 
        }
        catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
                //e.printStackTrace();
        }
        }
        
    }


