/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import logica.Controlador;
import logica.DTActividad;
import logica.DTImagenPerfil;
import logica.DTProveedor;
import logica.DTSalidaTuristica;
import logica.IControlador;
import logica.ImagenPerfil;

/**
 *
 * @author natil
 */
public class ConsultaUsuarioProveedor extends javax.swing.JInternalFrame {

    private IControlador control;
    /**
     * Creates new form ConsultaUsuarioProveedor2
     */
    public ConsultaUsuarioProveedor(String nickname, IControlador icu) {
        control = icu;
        initComponents();
        cargarDatosProveedor(nickname);
        cargarSalidasDelProveedor(nickname);
        cargarActividadesDelProveedor( nickname);
        mostrarImagenPerfil(nickname);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbActividades = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        btnVerActividad = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cmbSalidas = new javax.swing.JComboBox<>();
        txtApellido = new javax.swing.JTextField();
        btnVerSalida = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNickname = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFNacimiento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADescripcion = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        labelImagen = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Consulta Datos Proveedor");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(null);

        jLabel11.setText("Actividad Turistica:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 380, 140, 21);

        jLabel15.setText("Apellido:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(6, 136, 90, 21);

        getContentPane().add(cmbActividades);
        cmbActividades.setBounds(150, 370, 300, 29);

        jLabel16.setText("Correo electronico:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(6, 170, 150, 21);

        btnVerActividad.setText("Ver");
        btnVerActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActividadActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerActividad);
        btnVerActividad.setBounds(500, 370, 90, 29);

        jLabel17.setText("F. de nacimiento:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(6, 200, 170, 21);

        jLabel12.setText("Saida Turistica:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 420, 120, 21);

        txtNombre.setEditable(false);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(137, 93, 306, 29);

        getContentPane().add(cmbSalidas);
        cmbSalidas.setBounds(150, 410, 300, 29);

        txtApellido.setEditable(false);
        getContentPane().add(txtApellido);
        txtApellido.setBounds(137, 133, 306, 29);

        btnVerSalida.setText("Ver");
        btnVerSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerSalida);
        btnVerSalida.setBounds(500, 410, 90, 29);

        txtCorreo.setEditable(false);
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(153, 167, 290, 29);

        jLabel2.setText("nickname:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 56, 100, 21);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel18.setText("Ofrece:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 350, 50, 21);

        txtNickname.setEditable(false);
        getContentPane().add(txtNickname);
        txtNickname.setBounds(137, 53, 306, 29);

        jLabel19.setText("URL:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(6, 234, 70, 21);

        jLabel13.setText("Descripcion:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(6, 271, 100, 21);

        txtUrl.setEditable(false);
        getContentPane().add(txtUrl);
        txtUrl.setBounds(137, 231, 306, 29);

        jLabel14.setText("Nombre:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(6, 96, 90, 21);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Datos proveedor:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(6, 14, 121, 21);

        txtFNacimiento.setEditable(false);
        getContentPane().add(txtFNacimiento);
        txtFNacimiento.setBounds(153, 197, 290, 29);

        txtADescripcion.setEditable(false);
        txtADescripcion.setColumns(20);
        txtADescripcion.setRows(5);
        jScrollPane1.setViewportView(txtADescripcion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(118, 271, 460, 61);

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 460, 100, 29);

        labelImagen.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(labelImagen);
        labelImagen.setBounds(500, 60, 300, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVerActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActividadActionPerformed
        if(cmbActividades.getSelectedIndex() != -1){
        String nombreActividad = (String) cmbActividades.getSelectedItem();
        
        ConsultaActividadTuristica verConsultaActividadTuristica = new ConsultaActividadTuristica(nombreActividad, control);
        getParent().add(verConsultaActividadTuristica);        
        verConsultaActividadTuristica.show();
        }
    }//GEN-LAST:event_btnVerActividadActionPerformed

    private void btnVerSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSalidaActionPerformed
         if(cmbSalidas.getSelectedIndex() != -1){
        String nombreSalida = (String) cmbSalidas.getSelectedItem();
        
        ConsultaDeSalidaTuristica verConsultaDeSalidaTuristica = new ConsultaDeSalidaTuristica(nombreSalida, control);
        getParent().add(verConsultaDeSalidaTuristica);        
        verConsultaDeSalidaTuristica.show();
         }
    }//GEN-LAST:event_btnVerSalidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerActividad;
    private javax.swing.JButton btnVerSalida;
    private javax.swing.JComboBox<String> cmbActividades;
    private javax.swing.JComboBox<String> cmbSalidas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JTextArea txtADescripcion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFNacimiento;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables

private void cargarDatosProveedor(String nickname){
    DTProveedor t = control.traerDTProveedor(nickname);
    
    txtNickname.setText(t.getNickname());
    txtNombre.setText(t.getNombre());
    txtApellido.setText(t.getApellido());
    txtADescripcion.setText(t.getDescripcion());
    txtUrl.setText(t.getLink());
    txtCorreo.setText(t.getCorreo());
    txtFNacimiento.setText(t.getfNacimiento());
    

}

private void cargarSalidasDelProveedor(String nickname){

    ArrayList<DTSalidaTuristica> listaSalidasDeTurista = control.traerSalidasDelProveedor(nickname);
    
    for (DTSalidaTuristica dt : listaSalidasDeTurista){
        cmbSalidas.addItem(dt.getNombre());
    }       
    
    cmbSalidas.repaint();
}

private void cargarActividadesDelProveedor(String nickname){
    
    ArrayList<DTActividad> listaActividadesDeProveedor = control.traerActividadesDelProveedor(nickname);
        for (DTActividad dt : listaActividadesDeProveedor){
        cmbActividades.addItem(dt.getNombre());
    }  
        
        cmbActividades.repaint();
    
}






public void mostrarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if (tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    
    }


public void mostrarImagenPerfil(String nickname){
    try {
        DTImagenPerfil imagen = control.buscarImagenPorNickname(nickname);

        if (imagen != null) {
            String rutaImagen = imagen.getRuta();
            BufferedImage imagenCargada = ImageIO.read(new File(rutaImagen));
            
            // Escalar la imagen al tamaño de la etiqueta (labelImagen)
            int anchoEtiqueta = labelImagen.getWidth();
            int altoEtiqueta = labelImagen.getHeight();
            Image imagenEscalada = imagenCargada.getScaledInstance(anchoEtiqueta, altoEtiqueta, Image.SCALE_SMOOTH);
            
            ImageIcon imagenPerfil = new ImageIcon(imagenEscalada);

            // Supongamos que 'labelImagen' es el JLabel en el que quieres mostrar la imagen
            labelImagen.setIcon(imagenPerfil);
            labelImagen.setVisible(true);
        } else {
            // Manejar el caso en el que no se encuentra la imagen
            labelImagen.setVisible(false); // Oculta el JLabel si no hay imagen
            JOptionPane.showMessageDialog(null, "No se encontró la imagen de perfil.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (IOException e) {
        e.printStackTrace();
        // Manejar errores al cargar la imagen desde el archivo
        JOptionPane.showMessageDialog(null, "Error al cargar la imagen.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        e.printStackTrace();
        // Manejar otras excepciones generales
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


}
