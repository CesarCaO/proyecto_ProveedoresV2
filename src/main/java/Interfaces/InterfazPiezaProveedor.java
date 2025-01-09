
package Interfaces;

import Entidades.PiezaProveedor;
import OperacionesCRUD.CRUDpiezaproveedor;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;

public class InterfazPiezaProveedor extends javax.swing.JFrame {

   CRUDpiezaproveedor crud = new CRUDpiezaproveedor();
   boolean update=false;
    public InterfazPiezaProveedor() {
        initComponents();
        createTablePiezaProv();
        createTableProv();
        createTablePieza();
        txtNumeroUpdate.setEnabled(false);
        txtProveedorCreate.setEditable(false);
        txtPiezaCreate.setEditable(false);
        txtProveedorUpdate.setEditable(false);
        txtPiezaUpdate.setEditable(false);
        txtFechaCreate.getDateEditor().setEnabled(false);
        txtFechaUpdate.getDateEditor().setEnabled(false);
        txtProveedorUpdate.setEditable(false);
        txtPiezaUpdate.setEditable(false);
        txtNumeroDelete.setEnabled(false);
        txtPrecioDelete.setEnabled(false);
        txtFechaDelete.setEnabled(false);
        txtProveedorDelete.setEnabled(false);
        txtPiezaDelete.setEnabled(false);
        
    }
    
    public void createTablePiezaProv(){
        tblPieza_proveedor.setModel(crud.listToTMPiezaProv());
    }
    
    public void createTableProv(){
        tblProveedor.setModel(crud.listToTMPProv());
    }
    public void createTablePieza(){
        tblPieza.setModel(crud.listToTMPPieza());
    }
    public void limpiarCampos(){
        txtPrecioCreate.setText("");
        txtFechaCreate.setDate(null);
        txtProveedorCreate.setText("");
        txtPiezaCreate.setText("");
        tblProveedor.clearSelection();
        tblPieza.clearSelection();
        tblPieza_proveedor.clearSelection();
        txtPrecioUpdate.setText("");
        txtFechaUpdate.setDate(null);
        txtProveedorUpdate.setText("");
        txtPiezaUpdate.setText("");
        txtNumeroUpdate.setText("");
         txtNumeroDelete.setText("");
        txtPrecioDelete.setText("");
        txtFechaDelete.setDate(null);
        txtProveedorDelete.setText("");
        txtPiezaDelete.setText("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFechaCreate = new com.toedter.calendar.JDateChooser();
        txtPrecioCreate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtProveedorCreate = new javax.swing.JTextField();
        txtPiezaCreate = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNumeroUpdate = new javax.swing.JTextField();
        txtPrecioUpdate = new javax.swing.JTextField();
        txtFechaUpdate = new com.toedter.calendar.JDateChooser();
        txtProveedorUpdate = new javax.swing.JTextField();
        txtPiezaUpdate = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnCancelarUpdate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtNumeroDelete = new javax.swing.JTextField();
        txtPrecioDelete = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFechaDelete = new com.toedter.calendar.JDateChooser();
        txtProveedorDelete = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPiezaDelete = new javax.swing.JTextField();
        bntCancelarDelete = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPieza_proveedor = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPieza = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Pieza-Proveedor"));

        jLabel2.setText("Fecha");

        txtPrecioCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioCreateActionPerformed(evt);
            }
        });

        jLabel3.setText("Precio");

        jLabel4.setText("Proveedor");

        jLabel5.setText("Pieza");

        txtProveedorCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorCreateActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProveedorCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPiezaCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFechaCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProveedorCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPiezaCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAgregar))
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Create", jPanel1);

        jLabel6.setText("Número de Registro");

        jLabel7.setText("Precio");

        jLabel8.setText("Fecha");

        jLabel9.setText("Proveedor");

        jLabel10.setText("Pieza");

        txtPiezaUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPiezaUpdateActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelarUpdate.setText("Cancelar");
        btnCancelarUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProveedorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPiezaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelarUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumeroUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecioUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtFechaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtProveedorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPiezaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnCancelarUpdate))
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Update", jPanel2);

        jLabel11.setText("Número de Registro");

        jLabel12.setText("Precio");

        jLabel13.setText("Fecha");

        jLabel14.setText("Proveedor");

        jLabel15.setText("Pieza");

        txtPiezaDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPiezaDeleteActionPerformed(evt);
            }
        });

        bntCancelarDelete.setText("Cancelar");
        bntCancelarDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarDeleteActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProveedorDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPiezaDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntCancelarDelete)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNumeroDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPrecioDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtFechaDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtProveedorDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPiezaDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(bntCancelarDelete))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Delete", jPanel3);

        tblPieza_proveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPieza_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPieza_proveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPieza_proveedor);

        tblPieza.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPieza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPiezaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPieza);

        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblProveedor);

        jLabel1.setText("Pieza-Proveedor");

        jLabel16.setText("Proveedor");

        jLabel17.setText("Pieza");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(419, 419, 419))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProveedorCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorCreateActionPerformed

    private void txtPiezaUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPiezaUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPiezaUpdateActionPerformed

    private void txtPiezaDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPiezaDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPiezaDeleteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int idPiezaProveedor=0;
        boolean bandera=false;
        
        if(txtNumeroUpdate.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe elegir un registro para eliminar","ERROR", JOptionPane.ERROR_MESSAGE);
            bandera=true;
        }else
            
        idPiezaProveedor=Integer.parseInt(txtNumeroUpdate.getText());
        
        if (bandera == false) {
            if (JOptionPane.showConfirmDialog(null, "Se eliminará el registro \n  IDENTIFICADOR:" + idPiezaProveedor + "\n ¿Esta seguro de continuar la acción?", "Confirmar Eliminación",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                if (JOptionPane.showConfirmDialog(null, "Esta acción sera permanente, ¿Desea continuar?", "Confirmar Eliminación",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    crud.delete(idPiezaProveedor);
                    createTablePiezaProv();
                    limpiarCampos();

                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtPrecioCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCreateActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        double precio=0.0;
        Date fecha=null;
        String fechaString=null;
        int idProveedor=0,codigo=0;
        boolean bandera=false;
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        
        try{
            
            precio=Double.parseDouble(txtPrecioCreate.getText()); 
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "El precio debe ser un número","ERROR", JOptionPane.ERROR_MESSAGE);
            bandera=true;
        }
        
        if(txtFechaCreate.getDate()==null){
            JOptionPane.showMessageDialog(null, "Hay que seleccionar una fecha","ERROR", JOptionPane.ERROR_MESSAGE);
            bandera=true;
        }else{
            fecha=txtFechaCreate.getDate();
            fechaString=sdf.format(fecha);
        }
        
        if(txtProveedorCreate.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Hay que seleccionar un proveedor","ERROR", JOptionPane.ERROR_MESSAGE);
            bandera=true;
        }else{
            idProveedor=Integer.parseInt(txtProveedorCreate.getText());
        }
        
        if(txtProveedorCreate.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Hay que seleccionar un pieza","ERROR", JOptionPane.ERROR_MESSAGE);
            bandera=true;
        }else{
             codigo=Integer.parseInt(txtPiezaCreate.getText());
        }
        
        if(bandera==false){
            
            if(JOptionPane.showConfirmDialog(null,"Se creación el registro \n  PRECIO:"+precio+
                    ",\n  FECHA: "+fechaString+",\n  NÚMERO DE PROVEEDOR: "+idProveedor+",\n  CÓDIGO DE LA PIEZA: "+codigo+"\n ¿Esta seguro de continuar la acción?","Confirmar Creación", 
                    JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            {
           PiezaProveedor newPiezaProveedor=new PiezaProveedor();
           
           newPiezaProveedor.setPrecio(precio);
           newPiezaProveedor.setFecha(fecha);
           
           crud.save(newPiezaProveedor, idProveedor, codigo);
           createTablePiezaProv();
           limpiarCampos();
            }
           
           
        }
        
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedorMouseClicked
        txtProveedorCreate.setText(tblProveedor.getValueAt(tblProveedor.getSelectedRow(), 0).toString());
        if(update==true){
            txtProveedorUpdate.setText(tblProveedor.getValueAt(tblProveedor.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tblProveedorMouseClicked

    private void tblPiezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPiezaMouseClicked
        txtPiezaCreate.setText(tblPieza.getValueAt(tblPieza.getSelectedRow(), 0).toString());
        if(update==true){
            txtPiezaUpdate.setText(tblPieza.getValueAt(tblPieza.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tblPiezaMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        double precio=0.0;
        Date fecha=null;
        String fechaString=null;
        int idProveedor=0,codigo=0,idPiezaProveedor=0;
        boolean bandera=false;
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        
        if(txtNumeroUpdate.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe elegir un registro para editar","ERROR", JOptionPane.ERROR_MESSAGE);
            bandera=true;
        }else
        idPiezaProveedor=Integer.parseInt(txtNumeroUpdate.getText());
        
        
        try{
            
            precio=Double.parseDouble(txtPrecioUpdate.getText()); 
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "El precio debe ser un número","ERROR", JOptionPane.ERROR_MESSAGE);
            bandera=true;
        }
        
        if(txtFechaUpdate.getDate()==null){
            JOptionPane.showMessageDialog(null, "Hay que seleccionar una fecha","ERROR", JOptionPane.ERROR_MESSAGE);
            bandera=true;
        }else{
            fecha=txtFechaUpdate.getDate();
            fechaString=sdf.format(fecha);
        }
        
        if(txtProveedorUpdate.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Hay que seleccionar un proveedor","ERROR", JOptionPane.ERROR_MESSAGE);
            bandera=true;
        }else{
            idProveedor=Integer.parseInt(txtProveedorUpdate.getText());
        }
        
        if(txtProveedorUpdate.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Hay que seleccionar un pieza","ERROR", JOptionPane.ERROR_MESSAGE);
            bandera=true;
        }else{
             codigo=Integer.parseInt(txtPiezaUpdate.getText());
        }
        
        if (bandera == false) {
             if(JOptionPane.showConfirmDialog(null,"Se actualizará el registro \nIDENTIFICADOR:"+idPiezaProveedor+ "\n  PRECIO:"+precio+
                    ",\n  FECHA: "+fechaString+",\n  NÚMERO DE PROVEEDOR: "+idProveedor+",\n  CÓDIGO DE LA PIEZA: "+codigo+"\n ¿Esta seguro de continuar la acción","Confirmar Actualización", 
                    JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            {
                PiezaProveedor newPiezaProveedor = new PiezaProveedor();

                newPiezaProveedor.setIdPiezaProveedor(idPiezaProveedor);
                newPiezaProveedor.setPrecio(precio);
                newPiezaProveedor.setFecha(fecha);

                crud.update(newPiezaProveedor, idProveedor, codigo);
                createTablePiezaProv();
                limpiarCampos();
            }

        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tblPieza_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPieza_proveedorMouseClicked
        update=true; 
        txtNumeroUpdate.setText(tblPieza_proveedor.getValueAt(tblPieza_proveedor.getSelectedRow(), 0).toString());
        txtPrecioUpdate.setText(tblPieza_proveedor.getValueAt(tblPieza_proveedor.getSelectedRow(), 1).toString());
        txtFechaUpdate.setDate((Date)tblPieza_proveedor.getValueAt(tblPieza_proveedor.getSelectedRow(),2));
        txtProveedorUpdate.setText(tblPieza_proveedor.getValueAt(tblPieza_proveedor.getSelectedRow(), 3).toString());
        txtPiezaUpdate.setText(tblPieza_proveedor.getValueAt(tblPieza_proveedor.getSelectedRow(), 4).toString());
        
        txtNumeroDelete.setText(tblPieza_proveedor.getValueAt(tblPieza_proveedor.getSelectedRow(), 0).toString());
        txtPrecioDelete.setText(tblPieza_proveedor.getValueAt(tblPieza_proveedor.getSelectedRow(), 1).toString());
        txtFechaDelete.setDate((Date)tblPieza_proveedor.getValueAt(tblPieza_proveedor.getSelectedRow(),2));
        txtProveedorDelete.setText(tblPieza_proveedor.getValueAt(tblPieza_proveedor.getSelectedRow(), 3).toString());
        txtPiezaDelete.setText(tblPieza_proveedor.getValueAt(tblPieza_proveedor.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tblPieza_proveedorMouseClicked

    private void btnCancelarUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUpdateActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarUpdateActionPerformed

    private void bntCancelarDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarDeleteActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_bntCancelarDeleteActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazPiezaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPiezaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPiezaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPiezaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPiezaProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelarDelete;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarUpdate;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblPieza;
    private javax.swing.JTable tblPieza_proveedor;
    private javax.swing.JTable tblProveedor;
    private com.toedter.calendar.JDateChooser txtFechaCreate;
    private com.toedter.calendar.JDateChooser txtFechaDelete;
    private com.toedter.calendar.JDateChooser txtFechaUpdate;
    private javax.swing.JTextField txtNumeroDelete;
    private javax.swing.JTextField txtNumeroUpdate;
    private javax.swing.JTextField txtPiezaCreate;
    private javax.swing.JTextField txtPiezaDelete;
    private javax.swing.JTextField txtPiezaUpdate;
    private javax.swing.JTextField txtPrecioCreate;
    private javax.swing.JTextField txtPrecioDelete;
    private javax.swing.JTextField txtPrecioUpdate;
    private javax.swing.JTextField txtProveedorCreate;
    private javax.swing.JTextField txtProveedorDelete;
    private javax.swing.JTextField txtProveedorUpdate;
    // End of variables declaration//GEN-END:variables
}
