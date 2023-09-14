/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Actividad;
import logica.Controlador;
import logica.DTActividad;
import logica.SalidaTuristica;
/**
 *
 * @author Pc
 */
public class ListaActividadPorDepto extends javax.swing.JInternalFrame {
    Controlador control = Controlador.getInstance();
    /**
     * Creates new form AltaDeSalidaTuristica
     */
    public ListaActividadPorDepto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbDepto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaActividades = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnagregarSalida = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Lista de Actividades por Departamento");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Departamento:");

        cmbDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDeptoActionPerformed(evt);
            }
        });

        jLabel6.setText("Seleccione departamento y actividad turistica al cual desea agregar una Salida Turistica:");

        tablaActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaActividades);

        jLabel8.setText("Actividades Turisticas del Departamento:");

        btnagregarSalida.setText("Agregar Salida");
        btnagregarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarSalidaActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(cmbDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnagregarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregarSalida)
                    .addComponent(btncancelar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
         cmbDepto.removeAllItems();
        // Llamar a obtenerNombresDepartamentos para obtener la lista de nombres de departamentos y llenar el cmboBoxDep
         List<String> nombresDepartamentos = control.llenarCmboBoxDep();
        // Llenar el JComboBox con los nombres de los departamentos
         for (String nombre : nombresDepartamentos) {
             cmbDepto.addItem(nombre);
          }
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmbDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDeptoActionPerformed
        // Cargar tabla a partir de comboBox Departamento.
        if (cmbDepto.getSelectedIndex()>=0){
            //cargo la tabla
            //System.out.println(cmbDepto.getSelectedItem().toString());
            cargarTablaActividadesPorDepto(cmbDepto.getSelectedItem().toString()); 
        
        }
      
        
        
    }//GEN-LAST:event_cmbDeptoActionPerformed

    private void btnagregarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarSalidaActionPerformed
        //guardo el depto seleccionado de la Salida Turistica
        String deptoSeleccionado = cmbDepto.getSelectedItem().toString();
        
        //consigo y guardo el nombre de la actividad de la Salida Turistica
        if (tablaActividades.getRowCount()>0){
            if (tablaActividades.getSelectedRow()!=-1){ 
                //consigo el nombre de la Actividad seleccionado en la tabla
                String nombreActividad = String.valueOf(tablaActividades.getValueAt(tablaActividades.getSelectedRow(),0));
                System.out.println("llegue aca");
                //me traigo la actividad (esta mal)
                //Actividad consultado = control.ConsultaActividadTuristica(nombreActividad);
                
                AltaDeSalidaTuristica verAltaDeSalidaTuristica = new AltaDeSalidaTuristica(deptoSeleccionado, nombreActividad);  
                getParent().add(verAltaDeSalidaTuristica);
                verAltaDeSalidaTuristica.show();
                
                } else {mostrsarMensaje("No seleccionó ninguna Actividad", "Error", "Error al alta Salida Turistica");}
        
        }else {mostrsarMensaje("No hay Actividades para agregar Salida", "Error", "Error al alta Salida Turistica");}
        
        
        
        
        
        
        
        

    }//GEN-LAST:event_btnagregarSalidaActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregarSalida;
    private javax.swing.JButton btncancelar;
    private javax.swing.JComboBox<String> cmbDepto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaActividades;
    // End of variables declaration//GEN-END:variables

   public void cargarTablaActividadesPorDepto(String nombreDepto) {
        DefaultTableModel tabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Hacer que todas las celdas no sean editables
                return false;
            }
        };
        
        //establecemos los nombres de las columnas
        String titulos[] = {"Nombre", "Descripcion", "Duración", "Costo", "Ciudad", "F. Alta", "Proveedor"};
        tabla.setColumnIdentifiers(titulos);
        
        // Me traigo la lista de actividades del depto
        ArrayList<DTActividad> listaActividad = control.encontraActividadDepartamento(nombreDepto);
        // Llenar la tabla con la lista de actividades
        for (DTActividad actividad : listaActividad) {
            Object[] fila = {actividad.getNombre(), actividad.getCiudad(), actividad.getCosto(), actividad.getDescripcion(), actividad.getDuracion(),
                    actividad.getfAlta(), actividad.getNombreProveedor()}; // Ajusta esto según las propiedades de DTActividad

            tabla.addRow(fila);
        }
        
        tablaActividades.setModel(tabla);
    }
   
   
   
public void mostrsarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if (tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    
    }   
}


