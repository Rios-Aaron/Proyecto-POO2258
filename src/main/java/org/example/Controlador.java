package org.example;

import org.example.Modelo.ModeloTabla;
import org.example.Modelo.Volcan;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class Controlador extends MouseAdapter {
    private Ventana view;
    private ModeloTabla modelo;


    public Controlador(Ventana view) {
        this.view = view;
        modelo = new ModeloTabla();
        this.view.getTblVolcan().setModel(modelo);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblVolcan().addMouseListener(this);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getBtnBorrar().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == this.view.getBtnAgregar()) {
            System.out.println("Eventos sobre boton add");
            Volcan volcan = new Volcan();
            ImageIcon iconoEliminado = new ImageIcon("IconoEliminar.png");
            ImageIcon iconoDeAcuerdo= new ImageIcon("IconoDeAcuerdo.png");
            volcan.setNombre(this.view.getTxtNombre().getText());
            volcan.setCantidaddeErupciones(Integer.parseInt(this.view.getTxtErupcionesHistoricas().getText()));
            volcan.setClasificacion(this.view.getTxtClasificacion().getText());
            volcan.setPeriodicidad(Integer.parseInt(this.view.getTxtPeriodiciad().getText()));
            volcan.setUbicacion(this.view.getTxtUbicacionPais().getText());
            volcan.setUrl(this.view.getTxtUrl().getText());
            if (modelo.agregarVolcan(volcan)) {
                JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE,iconoDeAcuerdo);
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos, revise su conexion", "Error al agregar", JOptionPane.ERROR_MESSAGE,iconoEliminado);
            }
            this.view.getTblVolcan().updateUI();
            this.view.limpiar();
        }

        if (e.getSource() == this.view.getBtnCargar()) {
            System.out.println("Evento sobre boton cargar");
            modelo = new ModeloTabla();
            modelo.cargarDatos();
            this.view.getTblVolcan().setModel(modelo);
            this.view.getTblVolcan().updateUI();
        }

        if (e.getSource() == this.view.getTblVolcan()) {
            System.out.println("Eventos sobre tabla add");
            int index = this.view.getTblVolcan().getSelectedRow();
            Volcan tmp = modelo.getEpiAtIndex(index);
            try {
                this.view.getImagenVolacan().setIcon(tmp.getImagen());
                this.view.getImagenVolacan().setText("");
            } catch (MalformedURLException mfue) {
                System.out.println(e.toString());
            }


        }

        if (e.getSource() == this.view.getBtnActualizar()) {

            System.out.println("Eventos sobre btn actualizar");
            int index = this.view.getTblVolcan().getSelectedRow();
            Volcan tmp = modelo.getEpiAtIndex(index);
            ImageIcon iconoIdea= new ImageIcon("IconoIdea.png");
            tmp.setNombre(this.view.getAtxtNombre().getText());
            tmp.setCantidaddeErupciones((Integer.parseInt(this.view.getAtxtErupcionesHistoricas().getText())));
            tmp.setClasificacion(this.view.getAtxtClasificacion().getText());
            tmp.setPeriodicidad((Integer.parseInt(this.view.getAtxtPeriodicidad().getText())));
            tmp.setUbicacion(this.view.getAtxtUbicacionPais().getText());
            tmp.setUrl(this.view.getAtxtUrl().getText());
            if (modelo.actualizarVolcan(tmp)) {
                JOptionPane.showMessageDialog(view, "Datos actualizados", "Actualizacion", JOptionPane.INFORMATION_MESSAGE,iconoIdea);

            }
            this.view.getTblVolcan().updateUI();
            this.view.limpiar2();
        }

        if (e.getSource() == this.view.getBtnBorrar()) {
            System.out.println("Eventos sobre btn Borrar");
            int index = this.view.getTblVolcan().getSelectedRow();
            Volcan tmp =  modelo.getEpiAtIndex(index);
            String id = String.valueOf(tmp.getID());
            ImageIcon iconoBasura= new ImageIcon("IconoBasura.png");
            ImageIcon iconoEliminado = new ImageIcon("IconoEliminar.png");
            ImageIcon iconoDeAcuerdo= new ImageIcon("IconoDeAcuerdo.png");
            int resultado = JOptionPane.showConfirmDialog(view,"Seguro que quieres eliminar?", "Eliminar", JOptionPane.WARNING_MESSAGE, 1, iconoBasura);
            if (resultado == JOptionPane.YES_NO_OPTION){
                if (modelo.eliminarVolcan(id)){
                    JOptionPane.showMessageDialog(view,"Se ha eliminado el elemento seleccionado", "Eliminar",JOptionPane.INFORMATION_MESSAGE,iconoDeAcuerdo);
                }
            }else {
                JOptionPane.showMessageDialog(view, "No se ha eliminado", "Eliminacion cancelada", JOptionPane.INFORMATION_MESSAGE, iconoEliminado);
            }
            this.view.getTblVolcan().updateUI();
            this.view.limpiar2();
        }
    }

}
