
import java.awt.Color;
import java.awt.image.ColorModel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ainiguez
 */
public class MainWin extends javax.swing.JFrame {

    /**
     * Creates new form MainWin
     */
    public MainWin() {
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

        rbSeleccion = new javax.swing.ButtonGroup();
        Ventana = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        comentarios = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        caracter = new javax.swing.JLabel();
        MenuEmergente = new javax.swing.JPopupMenu();
        jitmColor = new javax.swing.JMenuItem();
        ventanaEditorPane = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaPagina = new javax.swing.JEditorPane();
        url = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        Panel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        btMasculino = new javax.swing.JRadioButton();
        btFemenino = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        Panel3 = new javax.swing.JPanel();
        seleccionEstado = new javax.swing.JComboBox<>();
        btComentarios = new javax.swing.JButton();
        btEditorPane = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itmGuardar = new javax.swing.JMenuItem();
        itmLimpiar = new javax.swing.JMenuItem();

        Ventana.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Ventana.setTitle("Hola");
        Ventana.setAlwaysOnTop(true);
        Ventana.setBounds(new java.awt.Rectangle(1, 1, 1, 1));
        Ventana.setModal(true);
        Ventana.setUndecorated(true);
        Ventana.setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Comentarios"));

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        comentarios.setColumns(20);
        comentarios.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comentarios.setLineWrap(true);
        comentarios.setRows(5);
        comentarios.setWrapStyleWord(true);
        comentarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comentariosKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(comentarios);

        jLabel1.setText("Caractéres:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caracter, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(caracter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        javax.swing.GroupLayout VentanaLayout = new javax.swing.GroupLayout(Ventana.getContentPane());
        Ventana.getContentPane().setLayout(VentanaLayout);
        VentanaLayout.setHorizontalGroup(
            VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        VentanaLayout.setVerticalGroup(
            VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuEmergente.setLabel("Selecciona el color de la interface");

        jitmColor.setText("Cambiar color de interface");
        jitmColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jitmColorActionPerformed(evt);
            }
        });
        MenuEmergente.add(jitmColor);

        ventanaEditorPane.setTitle("PaginaWeb");
        ventanaEditorPane.setAlwaysOnTop(true);
        ventanaEditorPane.setModal(true);

        areaPagina.setEditable(false);
        areaPagina.setContentType("text/html"); // NOI18N
        jScrollPane2.setViewportView(areaPagina);

        url.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventanaEditorPaneLayout = new javax.swing.GroupLayout(ventanaEditorPane.getContentPane());
        ventanaEditorPane.getContentPane().setLayout(ventanaEditorPaneLayout);
        ventanaEditorPaneLayout.setHorizontalGroup(
            ventanaEditorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaEditorPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaEditorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(ventanaEditorPaneLayout.createSequentialGroup()
                        .addComponent(url)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ventanaEditorPaneLayout.setVerticalGroup(
            ventanaEditorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaEditorPaneLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ventanaEditorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Ventana(evt);
            }
        });

        Panel1.setComponentPopupMenu(MenuEmergente);

        Panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Género", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        Panel2.setLayout(new java.awt.GridLayout(0, 1));

        rbSeleccion.add(btMasculino);
        btMasculino.setMnemonic('1');
        btMasculino.setText("Masculino");
        Panel2.add(btMasculino);

        rbSeleccion.add(btFemenino);
        btFemenino.setMnemonic('2');
        btFemenino.setText("Femenino");
        Panel2.add(btFemenino);

        jToggleButton1.setText("Seleccionar género");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        Panel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Estado"));

        seleccionEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jalisco", "Monterrey", "México", "Baja California Sur" }));
        seleccionEstado.setSelectedIndex(-1);
        seleccionEstado.setToolTipText("");
        seleccionEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seleccionEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addComponent(seleccionEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btComentarios.setText("Agregar comentarios");
        btComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComentariosActionPerformed(evt);
            }
        });

        btEditorPane.setText("Panel de edición");
        btEditorPane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditorPaneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btComentarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEditorPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btComentarios)
                .addGap(18, 18, 18)
                .addComponent(btEditorPane)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuArchivo.setText("Archivo");
        menuArchivo.setToolTipText("");

        itmGuardar.setText("Guardar");
        itmGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmGuardarActionPerformed(evt);
            }
        });
        menuArchivo.add(itmGuardar);

        itmLimpiar.setText("Limpiar formulario");
        itmLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLimpiarActionPerformed(evt);
            }
        });
        menuArchivo.add(itmLimpiar);

        menuBar.add(menuArchivo);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Ventana(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Ventana
        Panel2.setVisible(false);
    }//GEN-LAST:event_Ventana

    private void btComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComentariosActionPerformed
        Ventana.setSize(332,250);
        Ventana.setLocationRelativeTo(this);
        Ventana.setVisible(true);
    
    }//GEN-LAST:event_btComentariosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Ventana.dispose();
               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void itmLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLimpiarActionPerformed
        JOptionPane.showMessageDialog(this, "Se ha limpiado la información de la ventana");
        rbSeleccion.clearSelection();
        seleccionEstado.setSelectedIndex(-1);
        comentarios.setText("");
        caracter.setText("");
    }//GEN-LAST:event_itmLimpiarActionPerformed

    private void itmGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmGuardarActionPerformed
        if(rbSeleccion.getSelection()!=null && seleccionEstado.getSelectedIndex()!=-1){
            String genero = null;
            if(btMasculino.isSelected())
                genero = "Masculino";
            else if (btFemenino.isSelected())
                genero = "Femenino";
            
            String estado = String.valueOf(seleccionEstado.getSelectedItem());
            JOptionPane.showMessageDialog(this, "Se guardo la siguiente informacion;\nSexo: "+genero+"\nEstado: "+estado);
        }
        
    }//GEN-LAST:event_itmGuardarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if(jToggleButton1.isSelected()){
            Panel2.setVisible(true);
        } else {
            Panel2.setVisible(false);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void comentariosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comentariosKeyTyped
        caracter.setText(String.valueOf(comentarios.getText().length()));
        if(comentarios.getText().length()==30){
            evt.consume();
        }
    }//GEN-LAST:event_comentariosKeyTyped

    private void btEditorPaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditorPaneActionPerformed
        ventanaEditorPane.setSize(1020,800);
        ventanaEditorPane.setLocationRelativeTo(this);
        ventanaEditorPane.setVisible(true);
       
    }//GEN-LAST:event_btEditorPaneActionPerformed

    private void urlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlActionPerformed
        leerDireccion();
       
    }//GEN-LAST:event_urlActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        leerDireccion();
        //Pez
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void seleccionEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionEstadoActionPerformed

    private void jitmColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jitmColorActionPerformed
        Color color = JColorChooser.showDialog(this, "Cambiar color de interface", Color.yellow);
        Panel1.setBackground(color);
            
    }//GEN-LAST:event_jitmColorActionPerformed

    public void leerDireccion(){
        try {
            if(url.getText().startsWith("http://"))
                areaPagina.setPage(url.getText());
            else 
                areaPagina.setPage("http://"+url.getText());
            
        } catch (IOException ex) {
            Logger.getLogger(MainWin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu MenuEmergente;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JDialog Ventana;
    private javax.swing.JEditorPane areaPagina;
    private javax.swing.JButton btComentarios;
    private javax.swing.JButton btEditorPane;
    private javax.swing.JRadioButton btFemenino;
    private javax.swing.JRadioButton btMasculino;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel caracter;
    private javax.swing.JTextArea comentarios;
    private javax.swing.JMenuItem itmGuardar;
    private javax.swing.JMenuItem itmLimpiar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenuItem jitmColor;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.ButtonGroup rbSeleccion;
    private javax.swing.JComboBox<String> seleccionEstado;
    private javax.swing.JTextField url;
    private javax.swing.JDialog ventanaEditorPane;
    // End of variables declaration//GEN-END:variables
}
