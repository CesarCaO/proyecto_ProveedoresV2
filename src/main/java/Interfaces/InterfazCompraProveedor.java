/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Entidades.CompraProveedor;
import OperacionesCRUD.CRUDcompraproveedor;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class InterfazCompraProveedor extends javax.swing.JFrame {

    CRUDcompraproveedor opCrud=new CRUDcompraproveedor();
    boolean banderaUpdate=false;
    public InterfazCompraProveedor() {
        initComponents();
        createTableComProv();
        createTablePiezaProv();
        createTableCompra();
        txtPiezaProveedorCreate.setEditable(false);
        txtCompraCreate.setEditable(false);
        txtNumeroUpdate.setEnabled(false);
        txtCantidadDelete.setEnabled(false);
        txtPiezaProveedorDelete.setEnabled(false);
        txtCompraDelete.setEnabled(false);
        txtNumeroDelete.setEnabled(false);
        txtPiezaProveedorUpdate.setEditable(false);
        txtCompraUpdate.setEditable(false);
    }
    
    public void createTableComProv(){
        tblComProveedor.setModel(opCrud.listToTMCompraProv());
    }
    
    public void createTablePiezaProv(){
       tblPiezaProveedor.setModel(opCrud.listToTMPiezaProv());
    }
    public void createTableCompra(){
        tblCompra.setModel(opCrud.listToTMCompra());
    }

    public void limpiarCampos(){
        tblComProveedor.clearSelection();
        tblPiezaProveedor.clearSelection();
        tblCompra.clearSelection();
        txtCantidadCreate.setText("");
        txtPiezaProveedorCreate.setText("");
        txtCompraCreate.setText("");
        txtCantidadUpdate.setText("");
        txtPiezaProveedorUpdate.setText("");
        txtCompraUpdate.setText("");
        txtNumeroUpdate.setText("");
        txtCantidadDelete.setText("");
        txtPiezaProveedorDelete.setText("");
        txtCompraDelete.setText("");
        txtNumeroDelete.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtCantidadCreate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPiezaProveedorCreate = new javax.swing.JTextField();
        txtCompraCreate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btlAgregar = new javax.swing.JButton();
        bntCancelarCreate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCancelarUpdate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPiezaProveedorUpdate = new javax.swing.JTextField();
        txtCompraUpdate = new javax.swing.JTextField();
        txtCantidadUpdate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNumeroUpdate = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnCancelarDelete = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCantidadDelete = new javax.swing.JTextField();
        txtPiezaProveedorDelete = new javax.swing.JTextField();
        txtCompraDelete = new javax.swing.JTextField();
        txtNumeroDelete = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComProveedor = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPiezaProveedor = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCompra = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Cantidad");

        txtCompraCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompraCreateActionPerformed(evt);
            }
        });

        jLabel3.setText("Pieza Proveedor");

        jLabel4.setText("Compra");

        btlAgregar.setText("Agregar");
        btlAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlAgregarActionPerformed(evt);
            }
        });

        bntCancelarCreate.setText("Cancelar");
        bntCancelarCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 154, Short.MAX_VALUE)
                .addComponent(bntCancelarCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btlAgregar)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(83, 83, 83)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCompraCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPiezaProveedorCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPiezaProveedorCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCompraCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlAgregar)
                    .addComponent(bntCancelarCreate))
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Create", jPanel1);

        btnCancelarUpdate.setText("Cancelar");
        btnCancelarUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUpdateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad");

        jLabel5.setText("Pieza Proveedor");

        jLabel6.setText("Compra");

        txtPiezaProveedorUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPiezaProveedorUpdateActionPerformed(evt);
            }
        });

        jLabel10.setText("Número de Registro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelarUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCompraUpdate)
                        .addGap(106, 106, 106))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPiezaProveedorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNumeroUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPiezaProveedorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCompraUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnCancelarUpdate))
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Update", jPanel2);

        btnCancelarDelete.setText("Cancelar");
        btnCancelarDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDeleteActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel7.setText("Cantidad");

        jLabel8.setText("Pieza Proveedor");

        jLabel9.setText("Compra");

        jLabel11.setText("Numero de registros");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCantidadDelete)
                    .addComponent(txtPiezaProveedorDelete)
                    .addComponent(txtCompraDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 122, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCancelarDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPiezaProveedorDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCompraDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelarDelete))
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Delete", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Compra Proveedor"));

        tblComProveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        tblComProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblComProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblComProveedor);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pieza Proveedor"));

        tblPiezaProveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPiezaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPiezaProveedorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPiezaProveedor);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Compra"));

        tblCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCompraMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblCompra);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCompraCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompraCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompraCreateActionPerformed

    private void btlAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlAgregarActionPerformed
       
        int cantidad=0, idPiezaProveedor=0, idCompra=0;
        boolean bandera=false;
        
        try{
            if(txtCantidadCreate.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe de introducir una cantidad de compra",  "Error", JOptionPane.ERROR_MESSAGE);
                bandera=true;
            }else
                cantidad=Integer.parseInt(txtCantidadCreate.getText());
            
            if(txtPiezaProveedorCreate.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe elegir un registro de Pieza Proveedor",  "Error", JOptionPane.ERROR_MESSAGE);
                bandera=true;
            }else
                idPiezaProveedor=Integer.parseInt(txtPiezaProveedorCreate.getText());
            
            if(txtCompraCreate.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe elegir un registro de Compra",  "Error", JOptionPane.ERROR_MESSAGE);
                bandera=true;
            }else
                idCompra=Integer.parseInt(txtCompraCreate.getText());
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "La cantidad debe ser numerica",  "Error", JOptionPane.ERROR_MESSAGE);
            bandera=true;
        }
        
        if(bandera==false){
            CompraProveedor newCompraProveedor=new CompraProveedor();
            
            newCompraProveedor.setCantidad(cantidad);
            
            opCrud.save(newCompraProveedor, idCompra, idPiezaProveedor);
            createTableComProv();
            limpiarCampos();            
        }
                
    }//GEN-LAST:event_btlAgregarActionPerformed

    private void tblPiezaProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPiezaProveedorMouseClicked
        txtPiezaProveedorCreate.setText(tblPiezaProveedor.getValueAt(tblPiezaProveedor.getSelectedRow(),0).toString());
        
        if(banderaUpdate==true)
           txtPiezaProveedorUpdate.setText(tblPiezaProveedor.getValueAt(tblPiezaProveedor.getSelectedRow(),0).toString()); 
    }//GEN-LAST:event_tblPiezaProveedorMouseClicked

    private void tblCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCompraMouseClicked
        txtCompraCreate.setText(tblCompra.getValueAt(tblCompra.getSelectedRow(),0).toString());
        
        if(banderaUpdate==true)
             txtCompraUpdate.setText(tblCompra.getValueAt(tblCompra.getSelectedRow(),0).toString());
    }//GEN-LAST:event_tblCompraMouseClicked

    private void bntCancelarCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarCreateActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_bntCancelarCreateActionPerformed

    private void txtPiezaProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPiezaProveedorUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPiezaProveedorUpdateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        int ID=0,cantidad=0, idPiezaProveedor=0, idCompra=0;
        boolean bandera=false;
        
        try{
            if(txtNumeroUpdate.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe eligir un registros de Compra Proveedor",  "Error", JOptionPane.ERROR_MESSAGE);
                bandera=true;
            }else
                ID=Integer.parseInt(txtNumeroUpdate.getText());
            
            if(txtCantidadUpdate.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe de introducir una cantidad de compra",  "Error", JOptionPane.ERROR_MESSAGE);
                bandera=true;
            }else
                cantidad=Integer.parseInt(txtCantidadUpdate.getText());
            
            if(txtPiezaProveedorUpdate.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe elegir un registro de Pieza Proveedor",  "Error", JOptionPane.ERROR_MESSAGE);
                bandera=true;
            }else
                idPiezaProveedor=Integer.parseInt(txtPiezaProveedorUpdate.getText());
            
            if(txtCompraUpdate.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe elegir un registro de Compra",  "Error", JOptionPane.ERROR_MESSAGE);
                bandera=true;
            }else
                idCompra=Integer.parseInt(txtCompraUpdate.getText());
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "La cantidad debe ser numerica",  "Error", JOptionPane.ERROR_MESSAGE);
            bandera=true;
        }
        
         if(bandera==false){
            CompraProveedor newCompraProveedor=new CompraProveedor();
            
            newCompraProveedor.setIdCompraProveedor(ID);
            newCompraProveedor.setCantidad(cantidad);
            
            opCrud.update(newCompraProveedor, idCompra, idPiezaProveedor);
            banderaUpdate=false;
            createTableComProv();
            limpiarCampos();            
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblComProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComProveedorMouseClicked
        banderaUpdate=true;
        txtNumeroUpdate.setText(tblComProveedor.getValueAt(tblComProveedor.getSelectedRow(),0).toString());
        txtCantidadUpdate.setText(tblComProveedor.getValueAt(tblComProveedor.getSelectedRow(),1).toString());
        txtPiezaProveedorUpdate.setText(tblComProveedor.getValueAt(tblComProveedor.getSelectedRow(),3).toString());
        txtCompraUpdate.setText(tblComProveedor.getValueAt(tblComProveedor.getSelectedRow(),4).toString());
        
        txtNumeroDelete.setText(tblComProveedor.getValueAt(tblComProveedor.getSelectedRow(),0).toString());
        txtCantidadDelete.setText(tblComProveedor.getValueAt(tblComProveedor.getSelectedRow(),1).toString());
        txtPiezaProveedorDelete.setText(tblComProveedor.getValueAt(tblComProveedor.getSelectedRow(),3).toString());
        txtCompraDelete.setText(tblComProveedor.getValueAt(tblComProveedor.getSelectedRow(),4).toString());
    }//GEN-LAST:event_tblComProveedorMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        boolean bandera=false;
        int idCompraProveedor=0;
        
        if(txtNumeroDelete.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe elegir un registro para eliminar",  "Error", JOptionPane.ERROR_MESSAGE);
            bandera=true; 
        }else
            idCompraProveedor=Integer.parseInt(txtNumeroDelete.getText());
         
         if(bandera==false){
            
            CompraProveedor newCompraProveedor=new CompraProveedor();
            
            newCompraProveedor.setIdCompraProveedor(idCompraProveedor);
          
            opCrud.delete(idCompraProveedor);
           
            createTableComProv();
            limpiarCampos();            
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDeleteActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarDeleteActionPerformed

    private void btnCancelarUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUpdateActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazCompraProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCompraProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCompraProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCompraProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCompraProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelarCreate;
    private javax.swing.JButton btlAgregar;
    private javax.swing.JButton btnCancelarDelete;
    private javax.swing.JButton btnCancelarUpdate;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblComProveedor;
    private javax.swing.JTable tblCompra;
    private javax.swing.JTable tblPiezaProveedor;
    private javax.swing.JTextField txtCantidadCreate;
    private javax.swing.JTextField txtCantidadDelete;
    private javax.swing.JTextField txtCantidadUpdate;
    private javax.swing.JTextField txtCompraCreate;
    private javax.swing.JTextField txtCompraDelete;
    private javax.swing.JTextField txtCompraUpdate;
    private javax.swing.JTextField txtNumeroDelete;
    private javax.swing.JTextField txtNumeroUpdate;
    private javax.swing.JTextField txtPiezaProveedorCreate;
    private javax.swing.JTextField txtPiezaProveedorDelete;
    private javax.swing.JTextField txtPiezaProveedorUpdate;
    // End of variables declaration//GEN-END:variables
}
