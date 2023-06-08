package org.example;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JLabel lblId;
    private JLabel lblUbicacionPais;
    private JTextField txtUbicacionPais;
    private JLabel lblUrl;
    private JTextField txtId;
    private JTextField txtUrl;
    private JLabel lblNombre;
    private JLabel lblClasificacion;
    private JLabel lblPeriodicidad;
    private JLabel lblErupcionesHistoricas;
    private JTextField txtNombre;
    private JTextField txtClasificacion;
    private JTextField txtPeriodiciad;
    private JTextField txtErupcionesHistoricas;
    private JButton btnAgregar;
    private JButton btnCargar;
    private GridLayout layout;
    private JTable tblVolcan;
    private JScrollPane scroll;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel imagenVolacan;

    private JLabel AlblId;
    private JLabel AlblUbicacionPais;
    private JTextField AtxtUbicacionPais;
    private JLabel AlblUrl;
    private JTextField AtxtId;
    private JTextField AtxtUrl;
    private JLabel AlblNombre;
    private JLabel AlblClasificacion;
    private JLabel AlblPeriodicidad;
    private JLabel AlblErupcionesHistoricas;
    private JTextField AtxtNombre;
    private JTextField AtxtClasificacion;
    private JTextField AtxtPeriodicidad;
    private JTextField AtxtErupcionesHistoricas;
    private JButton btnActualizar;
    private JButton btnBorrar;

    public Ventana(String s) throws HeadlessException {
        super(s);this.setSize(800,720);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(10, 218, 27, 255));
        lblId = new JLabel("ID:");
        txtId = new JTextField(5);
        txtId.setText("0");
        txtId.setEnabled(false);
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(15);
        lblErupcionesHistoricas = new JLabel("Cantidad de Erupciones:");
        txtErupcionesHistoricas = new JTextField(8);
        lblClasificacion = new JLabel("Clasificacion:");
        txtClasificacion = new JTextField(10);
        lblPeriodicidad = new JLabel("Periodicidad:");
        txtPeriodiciad = new JTextField(12);
        lblUbicacionPais = new JLabel("Ubicacion: ");
        txtUbicacionPais = new JTextField(15);
        lblUrl = new JLabel("URL:");
        txtUrl = new JTextField(40);
        btnAgregar = new JButton("Agregar");

        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblErupcionesHistoricas);
        panel1.add(txtErupcionesHistoricas);
        panel1.add(lblClasificacion);
        panel1.add(txtClasificacion);
        panel1.add(lblPeriodicidad);
        panel1.add(txtPeriodiciad);
        panel1.add(lblUbicacionPais);
        panel1.add(txtUbicacionPais);
        panel1.add(lblUrl);
        panel1.add(txtUrl);
        panel1.add(btnAgregar);

        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(18, 104, 188, 255));
        btnCargar = new JButton("Cargar Datos");
        panel2.add(btnCargar);
        tblVolcan = new JTable();
        scroll = new JScrollPane(tblVolcan);
        panel2.add(scroll);

        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(245, 10, 10, 255));
        imagenVolacan = new JLabel("...");
        panel3.add(imagenVolacan);

        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(234, 230, 32, 255));
        AlblId = new JLabel("ID:");
        AtxtId = new JTextField(5);
        AtxtId.setText("0");
        AtxtId.setEnabled(false);
        AlblNombre = new JLabel("Nombre:");
        AtxtNombre = new JTextField(15);
        AlblErupcionesHistoricas = new JLabel("Cantidad de Erupciones:");
        AtxtErupcionesHistoricas = new JTextField(8);
        AlblClasificacion = new JLabel("Clasificacion:");
        AtxtClasificacion = new JTextField(10);
        AlblPeriodicidad = new JLabel("Periodicicdad:");
        AtxtPeriodicidad = new JTextField(12);
        AlblUbicacionPais = new JLabel("Ubicacion: ");
        AtxtUbicacionPais = new JTextField(15);
        AlblUrl = new JLabel("URL:");
        AtxtUrl = new JTextField(40);
        btnActualizar = new JButton("Actualizar Datos");
        btnBorrar = new JButton("Eliminar");

        panel4.add(AlblId);
        panel4.add(AtxtId);
        panel4.add(AlblNombre);
        panel4.add(AtxtNombre);
        panel4.add(AlblErupcionesHistoricas);
        panel4.add(AtxtErupcionesHistoricas);
        panel4.add(AlblClasificacion);
        panel4.add(AtxtClasificacion);
        panel4.add(AlblPeriodicidad);
        panel4.add(AtxtPeriodicidad);
        panel4.add(AlblUbicacionPais);
        panel4.add(AtxtUbicacionPais);
        panel4.add(AlblUrl);
        panel4.add(AtxtUrl);
        panel4.add(btnActualizar);
        panel4.add(btnBorrar);

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblClasificacion() {
        return lblClasificacion;
    }

    public void setLblClasificacion(JLabel lblClasificacion) {
        this.lblClasificacion = lblClasificacion;
    }

    public JLabel getLblErupcionesHistoricas() {
        return lblErupcionesHistoricas;
    }

    public void setLblErupcionesHistoricas(JLabel lblErupcionesHistoricas) {
        this.lblErupcionesHistoricas = lblErupcionesHistoricas;
    }

    public JLabel getLblPeriodicidad() {
        return lblPeriodicidad;
    }

    public void setLblPeriodicidad(JLabel lblPeriodicidad) {
        this.lblPeriodicidad = lblPeriodicidad;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtClasificacion() {
        return txtClasificacion;
    }

    public void setTxtClasificacion(JTextField txtClasificacion) {
        this.txtClasificacion = txtClasificacion;
    }

    public JTextField getTxtErupcionesHistoricas() {
        return txtErupcionesHistoricas;
    }

    public void setTxtErupcionesHistoricas(JTextField txtErupcionesHistoricas) {
        this.txtErupcionesHistoricas = txtErupcionesHistoricas;
    }

    public JTextField getTxtPeriodiciad() {
        return txtPeriodiciad;
    }

    public void setTxtPeriodiciad(JTextField txtPeriodiciad) {
        this.txtPeriodiciad = txtPeriodiciad;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JTable getTblVolcan() {
        return tblVolcan;
    }

    public void setTblVolcan(JTable tblVolcan) {
        this.tblVolcan = tblVolcan;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JLabel getImagenVolacan() {
        return imagenVolacan;
    }

    public void setImagenVolacan(JLabel imagenVolacan) {
        this.imagenVolacan = imagenVolacan;
    }

    public JLabel getLblUbicacionPais() {
        return lblUbicacionPais;
    }

    public void setLblUbicacionPais(JLabel lblUbicacionPais) {
        this.lblUbicacionPais = lblUbicacionPais;
    }

    public JTextField getTxtUbicacionPais() {
        return txtUbicacionPais;
    }

    public void setTxtUbicacionPais(JTextField txtUbicacionPais) {
        this.txtUbicacionPais = txtUbicacionPais;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JLabel getAlblId() {
        return AlblId;
    }

    public void setAlblId(JLabel alblId) {
        AlblId = alblId;
    }

    public JLabel getAlblUbicacionPais() {
        return AlblUbicacionPais;
    }

    public void setAlblUbicacionPais(JLabel alblUbicacionPais) {
        AlblUbicacionPais = alblUbicacionPais;
    }

    public JTextField getAtxtUbicacionPais() {
        return AtxtUbicacionPais;
    }

    public void setAtxtUbicacionPais(JTextField atxtUbicacionPais) {
        AtxtUbicacionPais = atxtUbicacionPais;
    }

    public JLabel getAlblUrl() {
        return AlblUrl;
    }

    public void setAlblUrl(JLabel alblUrl) {
        AlblUrl = alblUrl;
    }

    public JTextField getAtxtId() {
        return AtxtId;
    }

    public void setAtxtId(JTextField atxtId) {
        AtxtId = atxtId;
    }

    public JTextField getAtxtUrl() {
        return AtxtUrl;
    }

    public void setAtxtUrl(JTextField atxtUrl) {
        AtxtUrl = atxtUrl;
    }

    public JLabel getAlblNombre() {
        return AlblNombre;
    }

    public void setAlblNombre(JLabel alblNombre) {
        AlblNombre = alblNombre;
    }

    public JLabel getAlblClasificacion() {
        return AlblClasificacion;
    }

    public void setAlblClasificacion(JLabel alblClasificacion) {
        AlblClasificacion = alblClasificacion;
    }

    public JLabel getAlblErupcionesHistoricas() {
        return AlblErupcionesHistoricas;
    }

    public void setAlblErupcionesHistoricas(JLabel alblErupcionesHistoricas) {
        AlblErupcionesHistoricas = alblErupcionesHistoricas;
    }

    public JLabel getAlblPeriodicidad() {
        return AlblPeriodicidad;
    }

    public void setAlblPeriodicidad(JLabel alblPeriodicidad) {
        AlblPeriodicidad = alblPeriodicidad;
    }

    public JTextField getAtxtNombre() {
        return AtxtNombre;
    }

    public void setAtxtNombre(JTextField atxtNombre) {
        AtxtNombre = atxtNombre;
    }

    public JTextField getAtxtClasificacion() {
        return AtxtClasificacion;
    }

    public void setAtxtClasificacion(JTextField atxtClasificacion) {
        AtxtClasificacion = atxtClasificacion;
    }

    public JTextField getAtxtErupcionesHistoricas() {
        return AtxtErupcionesHistoricas;
    }
    public void setAtxtErupcionesHistoricas(JTextField atxtErupcionesHistoricas) {
        AtxtErupcionesHistoricas = atxtErupcionesHistoricas;
    }
    public JTextField getAtxtPeriodicidad() {
        return AtxtPeriodicidad;
    }

    public void setAtxtPeriodicidad(JTextField atxtPeriodicidad) {
        AtxtPeriodicidad = atxtPeriodicidad;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public void setBtnBorrar(JButton btnBorrar) {
        this.btnBorrar = btnBorrar;
    }

    public void limpiar (){
        txtNombre.setText("");
        txtErupcionesHistoricas.setText("");
        txtClasificacion.setText("");
        txtPeriodiciad.setText("");
        txtUbicacionPais.setText("");
        txtUrl.setText("");
    }


    public void limpiar2 (){
        AtxtId.setText("");
        AtxtNombre.setText("");
        AtxtErupcionesHistoricas.setText("");
        AtxtClasificacion.setText("");
        AtxtPeriodicidad.setText("");
        AtxtUbicacionPais.setText("");
        AtxtUrl.setText("");
    }

}
