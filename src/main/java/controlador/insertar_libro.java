/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package controlador;
import modelo.*;
import controlador.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alen
 */

    
public class insertar_libro extends javax.swing.JInternalFrame {
 
private ArrayList<Libro> libros = new ArrayList<>();


    /**
     * Creates new form insertar_libro
     */
    public insertar_libro() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtPagina = new javax.swing.JTextField();
        txtEdicion = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtLugar = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JToggleButton();
        btnAgregarAlarray = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnIngresarArrayAlaBase = new javax.swing.JButton();
        eliminar_un_elemento_del_array = new javax.swing.JToggleButton();
        filtro_por_titulo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("titulo Del Libro");

        jLabel2.setText("autor");

        jLabel3.setText("ISBN");

        jLabel4.setText("páginas");

        jLabel5.setText("edición");

        jLabel6.setText("editorial");

        jLabel7.setText("lugar");

        jLabel8.setText("fecha de edición");

        btnLimpiar.setText("limpiar Datos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAgregarAlarray.setText("aniadir al array");
        btnAgregarAlarray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlarrayActionPerformed(evt);
            }
        });

        btnVer.setText("ver array");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnIngresarArrayAlaBase.setText("insertar el array en la base");
        btnIngresarArrayAlaBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarArrayAlaBaseActionPerformed(evt);
            }
        });

        eliminar_un_elemento_del_array.setText("eliminar por pocicion");
        eliminar_un_elemento_del_array.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_un_elemento_del_arrayActionPerformed(evt);
            }
        });

        filtro_por_titulo.setText("Buscar");
        filtro_por_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtro_por_tituloActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdicion)
                            .addComponent(txtISBN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPagina, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLugar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarAlarray)
                            .addComponent(btnIngresarArrayAlaBase)
                            .addComponent(btnVer)
                            .addComponent(filtro_por_titulo)
                            .addComponent(eliminar_un_elemento_del_array)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnIngresarArrayAlaBase))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnAgregarAlarray)
                        .addGap(18, 18, 18)
                        .addComponent(btnVer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(filtro_por_titulo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar_un_elemento_del_array))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
 txtTitulo.setText("");      
    txtAutor.setText("");      
    txtISBN.setText("");       
    txtPagina.setText("");     
    txtEdicion.setText("");    
    txtEditorial.setText("");   
    txtLugar.setText("");       
    txtFecha.setText("");   
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarAlarrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlarrayActionPerformed
 String titulo = txtTitulo.getText().trim();
        String autor = txtAutor.getText().trim();
        String ISBN = txtISBN.getText().trim();
        String paginaStr = txtPagina.getText().trim();
        String edicion = txtEdicion.getText().trim();
        String editorial = txtEditorial.getText().trim();
        String lugar = txtLugar.getText().trim();
        String fecha = txtFecha.getText().trim();

        // Validar que los campos no estén vacíos
        if (titulo.isEmpty() || autor.isEmpty() || ISBN.isEmpty() ||
                paginaStr.isEmpty() || edicion.isEmpty() || editorial.isEmpty() ||
                lugar.isEmpty() || fecha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int pagina;
        try {
            pagina = Integer.parseInt(paginaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El número de páginas debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear un nuevo libro y agregarlo al ArrayList
        Libro libro = new Libro(titulo, autor, ISBN, pagina, edicion, editorial, lugar, fecha);
        libros.add(libro);

        // Ordenar los libros por título
        Collections.sort(libros, Comparator.comparing(Libro::getTitulo));

        // También puedes imprimir los libros en consola para verificar que se estén ordenando correctamente
        for (Libro l : libros) {
            System.out.println(l.getTitulo());
        }
    }//GEN-LAST:event_btnAgregarAlarrayActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
      // Crear el modelo de la tabla
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.setColumnIdentifiers(new Object[]{"Título", "Autor", "ISBN", "Páginas", "Edición", "Editorial", "Lugar", "Fecha"});
    
    // Llenar la tabla con los datos de los libros
    for (Libro libro : libros) {
        tableModel.addRow(new Object[]{libro.getTitulo(), libro.getAutor(), libro.getISBN(),
                libro.getPaginas(), libro.getEdicion(), libro.getEditorial(), libro.getLugar(), libro.getFecha()});
    }
    
    // Asignar el modelo a la jTable1
    jTable1.setModel(tableModel);
       }//GEN-LAST:event_btnVerActionPerformed

    private void btnIngresarArrayAlaBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarArrayAlaBaseActionPerformed
         try {
        // Recorrer la lista de libros y ejecutar el procedimiento almacenado para insertar cada libro
        for (Libro libro : libros) {
            try (Connection con = ConexionMySQL.getConnection();
                 CallableStatement cs = con.prepareCall("{CALL IngresarLibro(?, ?, ?, ?, ?, ?, ?, ?)}")) {
                cs.setString(1, libro.getTitulo());
                cs.setInt(2, Integer.parseInt( libro.getAutor()));
                cs.setString(3, libro.getISBN());
                cs.setInt(4, libro.getPaginas());
                cs.setString(5, libro.getEdicion());
                cs.setString(6, libro.getEditorial());
                cs.setString(7, libro.getLugar());
                cs.setString(8, libro.getFecha());
                cs.execute();
            }
        }
        
        JOptionPane.showMessageDialog(this, "Libros ingresados correctamente a la base de datos", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al insertar libros en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnIngresarArrayAlaBaseActionPerformed

    private void eliminar_un_elemento_del_arrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_un_elemento_del_arrayActionPerformed
    // Pedir al usuario que ingrese la posición a eliminar
    String posicionStr = JOptionPane.showInputDialog(this, "Ingrese la posición del libro a eliminar:", "Eliminar libro", JOptionPane.QUESTION_MESSAGE);

    // Verificar si se ingresó un valor
    if (posicionStr == null || posicionStr.isEmpty()) {
        return; // Si no se ingresó nada, salir del método
    }

    try {
        // Convertir la posición a entero
        int posicion = Integer.parseInt(posicionStr);

        // Verificar si la posición es válida
        if (posicion < 0 || posicion >= libros.size()) {
            JOptionPane.showMessageDialog(this, "Posición inválida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Eliminar el elemento en la posición especificada
        libros.remove(posicion);

        // Reorganizar el array
        Collections.sort(libros, Comparator.comparing(Libro::getTitulo));

        // También puedes imprimir los libros en consola para verificar que se hayan reorganizado correctamente
        for (Libro l : libros) {
            System.out.println(l.getTitulo());
        }

        JOptionPane.showMessageDialog(this, "Libro eliminado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido para la posición", "Error", JOptionPane.ERROR_MESSAGE);
    }



    }//GEN-LAST:event_eliminar_un_elemento_del_arrayActionPerformed

    private void filtro_por_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtro_por_tituloActionPerformed
    // Pedir al usuario que ingrese el título o parte del título a buscar
    String filtro = JOptionPane.showInputDialog(this, "Ingrese el título o parte del título a buscar:", "Filtrar por título", JOptionPane.QUESTION_MESSAGE);

    // Verificar si se ingresó un valor
    if (filtro == null || filtro.isEmpty()) {
        return; // Si no se ingresó nada, salir del método
    }

    // Crear una lista para almacenar los libros que coinciden con el filtro
    ArrayList<Libro> librosFiltrados = new ArrayList<>();

    // Iterar sobre la lista de libros para buscar aquellos que coincidan con el filtro
    for (Libro libro : libros) {
        if (libro.getTitulo().toLowerCase().contains(filtro.toLowerCase())) {
            librosFiltrados.add(libro);
        }
    }

    // Mostrar los libros encontrados en un cuadro de diálogo
    if (librosFiltrados.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se encontraron libros con el título o parte del título ingresado.", "Resultado de búsqueda", JOptionPane.INFORMATION_MESSAGE);
    } else {
        StringBuilder sb = new StringBuilder("Libros encontrados:\n\n");
        for (Libro libro : librosFiltrados) {
            sb.append("- ").append(libro.getTitulo()).append("\n");
        }
        JOptionPane.showMessageDialog(this, sb.toString(), "Resultado de búsqueda", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_filtro_por_tituloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlarray;
    private javax.swing.JButton btnIngresarArrayAlaBase;
    private javax.swing.JToggleButton btnLimpiar;
    private javax.swing.JButton btnVer;
    private javax.swing.JToggleButton eliminar_un_elemento_del_array;
    private javax.swing.JButton filtro_por_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtPagina;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
