package org.example.Modelo;

import org.example.DataBase.VolcanesDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTabla implements TableModel {
    private ArrayList<Volcan> datos;
    private VolcanesDAO edao;
    public static final int COLS = 7;

    public ModeloTabla() {
        datos = new ArrayList<>();
        edao = new VolcanesDAO();
    }

    public ModeloTabla(ArrayList<Volcan> datos) {
        this.datos = datos;
        edao = new VolcanesDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombreCol = "";
        switch (columnIndex) {
            case 0:
                nombreCol = "ID";
                break;
            case 1:
                nombreCol = "Nombre";
                break;
            case 2:
                nombreCol = "CantidaddeErupciones";
                break;
            case 3:
                nombreCol = "Clasificacion";
                break;
            case 4:
                nombreCol = "Periodicidad";
                break;
            case 5:
                nombreCol = "Ubicacion";
                break;
            case 6:
                nombreCol = "Url";
                break;
            default:
                nombreCol = "";

        }

        return nombreCol;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return int.class;
            case 1:
                return String.class;
            case 2:
                return int.class;
            case 3:
                return String.class;
            case 4:
                return int.class;
            case 5:
                return String.class;
            case 6:
                return String.class;
            default:
                return String.class;

        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Volcan tmp = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getID();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getCantidaddeErupciones();
            case 3:
                return tmp.getClasificacion();
            case 4:
                return tmp.getPeriodicidad();
            case 5:
                return tmp.getUbicacion();
            case 6:
                return tmp.getUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                datos.get(rowIndex).setID((Integer) aValue);
            case 1:
                datos.get(rowIndex).setCantidaddeErupciones((Integer) aValue);
                break;
            case 2:
                datos.get(rowIndex).setPeriodicidad((Integer) aValue);
                break;
            case 3:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setClasificacion((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setUbicacion((String) aValue);
            case 6:
                datos.get(rowIndex).setUrl((String) aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public boolean agregarVolcan(Volcan volcan) {
        boolean resultado = false;
        try {
            if (edao.insertar(volcan)) {
                datos.add(volcan);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }

        return resultado;
    }


    public boolean actualizarVolcan(Volcan volcan) {
        boolean resultado = false;
        try {
            if (edao.update(volcan)) {
                datos.add(volcan);
                resultado = true;
            } else {
                resultado = false;

            }
        } catch (SQLException sqle) {
            System.out.println("Error " + sqle.getMessage());
        }
        return resultado;
    }


    public Volcan getEpiAtIndex(int idx) {
        return datos.get(idx);
    }

    public void cargarDatos() {
        try {
            datos = edao.obtenerTodo();
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }

    }

    public boolean eliminarVolcan(String id) {
        boolean resultado = false;
        try {
            if (edao.delete(id)) {
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println("Error " + sqle.getMessage());
        }
        return resultado;
    }

}