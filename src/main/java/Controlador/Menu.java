/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controlador;

import Modelo.Libro;
import java.util.ArrayList;
import javax.swing.SingleSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setModeloLibrosA();
        setModeloLibros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntAgregarL = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnEliminarL = new javax.swing.JButton();
        btnModificarL = new javax.swing.JButton();
        btnBuscarL = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnAgregarP = new javax.swing.JButton();
        btnAgregarL5 = new javax.swing.JButton();
        btnAgregarL6 = new javax.swing.JButton();
        btnAgregarL7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnEliminarP = new javax.swing.JButton();
        btnModificarP = new javax.swing.JButton();
        btnBuscarP = new javax.swing.JButton();
        btnAgregarL8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bntAgregarL.setText("Agregar");
        getContentPane().add(bntAgregarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jButton3.setText("Libros");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, -1));

        btnEliminarL.setText("Eliminar");
        getContentPane().add(btnEliminarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        btnModificarL.setText("Modificar");
        getContentPane().add(btnModificarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        btnBuscarL.setText("Buscar");
        getContentPane().add(btnBuscarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jInternalFrame1.setVisible(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jInternalFrame1);

        jInternalFrame2.setVisible(true);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jInternalFrame2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, 448));

        btnAgregarP.setText("Agregar");
        getContentPane().add(btnAgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        btnAgregarL5.setText("Agregar");
        getContentPane().add(btnAgregarL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        btnAgregarL6.setText("Agregar");
        getContentPane().add(btnAgregarL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        btnAgregarL7.setText("Agregar");
        getContentPane().add(btnAgregarL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        jButton5.setText("LibrosPrestados");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 100, -1));

        btnEliminarP.setText("Eliminar");
        getContentPane().add(btnEliminarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        btnModificarP.setText("Modificar");
        getContentPane().add(btnModificarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        btnBuscarP.setText("Buscar");
        getContentPane().add(btnBuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        btnAgregarL8.setText("Agregar");
        getContentPane().add(btnAgregarL8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton5ActionPerformed

    
     private ArrayList< Libro> listaMantenimientos = new ArrayList<>();
    private DefaultTableModel modeloLibro = new DefaultTableModel();

    public void setModeloLibros() {
        String[] cabecera = {"Nro", "Titulo", "Autor", "ISBN", "páginas", "edición", "editorial ", " lugar", " fecha"};
        modeloLibro.setColumnIdentifiers(cabecera);
        LibroControlador libroControlador = new LibroControlador();
        ArrayList<Object[]> datos = libroControlador.DatosLibros();

        if (datos != null) {
            for (Object[] fila : datos) {
                modeloLibro.addRow(fila);
            }
        }

        jTabbedPane1.setModel((SingleSelectionModel) modeloLibro);
    }

public void mostrarDatosLibros(Libro libro) {
    DefaultTableModel modelo = (DefaultTableModel) jTabbedPane1.getModel();
    Object[] fila = new Object[9];

    fila[0] = modelo.getRowCount() + 1;
    fila[1] = libro.getTitulo();
    fila[2] = libro.getAutor();
    fila[3] = libro.getISBN();
    fila[4] = libro.getPaginas();
    fila[5] = libro.getEdicion();
    fila[6] = libro.getEditorial();
    fila[7] = libro.getLugar();
    fila[8] = libro.getFechaEdicion();
    modelo.addRow(fila);
}

   private ArrayList<Libro> listaLibros = new ArrayList<>();
private DefaultTableModel modeloLibroA = new DefaultTableModel();

public void setModeloLibrosA() {
    String[] cabecera = {"Nro", "Titulo", "Autor", "Cedula"};
    modeloLibroA.setColumnIdentifiers(cabecera);

    LibroControlador libroControlador = new LibroControlador();
    ArrayList<Object[]> datos = libroControlador.DatosLibrosA();

    if (datos != null) {
        for (Object[] fila : datos) {
            modeloLibroA.addRow(fila);
        }
    }

    jTable2.setModel(modeloLibroA);
}

public void mostrarDatosLibrosA(Libro libro) {
    DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
    Object[] fila = new Object[4];

    fila[0] = modelo.getRowCount() + 1;
    fila[1] = libro.getTitulo();
    fila[2] = libro.getAutor();
//    fila[3] = libro.getCedula(); 
    modelo.addRow(fila);
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAgregarL;
    private javax.swing.JButton btnAgregarL5;
    private javax.swing.JButton btnAgregarL6;
    private javax.swing.JButton btnAgregarL7;
    private javax.swing.JButton btnAgregarL8;
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnBuscarL;
    private javax.swing.JButton btnBuscarP;
    private javax.swing.JButton btnEliminarL;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnModificarL;
    private javax.swing.JButton btnModificarP;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
