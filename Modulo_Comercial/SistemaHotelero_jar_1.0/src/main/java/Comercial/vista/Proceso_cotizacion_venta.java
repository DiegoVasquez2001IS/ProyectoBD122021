/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comercial.vista;

import Comercial.datos.ClienteDao;
import Comercial.datos.CobradorDao;
import Comercial.datos.Factura_VentaDao;
import Comercial.datos.VendedorDao;
import Comercial.dominio.Cliente;
import Comercial.dominio.Cobrador;
import Comercial.dominio.Factura_Venta;
import Comercial.dominio.Vendedor;
import java.util.List;

/**
 *
 * @author PERSONAL
 */
public class Proceso_cotizacion_venta extends javax.swing.JInternalFrame {
ClienteDao Cliente= new   ClienteDao  ();
  Cliente Buscar = new  Cliente ();
  VendedorDao vendedor= new   VendedorDao  ();
  Vendedor Buscar1 = new  Vendedor ();
  CobradorDao cobrador= new  CobradorDao  ();
  Cobrador Buscar2 = new  Cobrador ();
    /**
     * Creates new form Proceso_Factura_venta
     */
       
public void llenadoDeCombos() {
        
        List<Cliente> Buscar =  Cliente.select();
        cbox_cliente.addItem("Seleccione un cliente");
        for (int i = 0; i < Buscar.size(); i++) {
            cbox_cliente.addItem(Buscar.get(i).getCodigo_Cliente());
             String valor =  cbox_cliente.getSelectedItem().toString();
   

    }}
public void llenadoDeCombos1() {
        
        List<Vendedor> Buscar1 =  vendedor.select();
        cbox_cliente.addItem("Seleccione un vendedor");
        for (int i = 0; i < Buscar1.size(); i++) {
            cbox_vendedor.addItem(Buscar1.get(i).getCodigo_Vendedor());
             String valor =  cbox_vendedor.getSelectedItem().toString();
   

    }}
public void llenadoDeCombos2() {
        
        List<Cobrador> Buscar1 =  cobrador.select();
        cbox_cliente.addItem("Seleccione un vendedor");
        for (int i = 0; i < Buscar1.size(); i++) {
            cbox_cobrador.addItem(Buscar2.getCodigo_Cobrador());
             String valor =  cbox_vendedor.getSelectedItem().toString();
   

    }}
  
  public Proceso_cotizacion_venta() {
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

        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Txt_contabilidad = new javax.swing.JTextField();
        Txt_fecha = new javax.swing.JTextField();
        Txt_numero = new javax.swing.JTextField();
        cbox_cliente = new javax.swing.JComboBox<>();
        cbox_vendedor = new javax.swing.JComboBox<>();
        cbox_cobrador = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Txt_precio = new javax.swing.JTextField();
        Txt_fecha1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Txt_cantidad = new javax.swing.JTextField();
        Txt_servicio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Txt_impuesto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        FACTURA = new javax.swing.JTable();
        Txt_reservacion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Txt_total = new javax.swing.JTextField();
        Btn_Modificar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        Btn_Agregar = new javax.swing.JButton();
        Btn_reporte = new javax.swing.JButton();
        Btn_Agregar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel21.setText("FACTURA VENTA");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        jLabel18.setText("CODIGO COBRADOR");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel2.setText("NO. FACTURA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jLabel13.setText("CODIGO CLIENTE");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel15.setText("FECHA DE FACTURACION");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel17.setText("CONTABILIDAD");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        jLabel1.setText("FACTURA ENCABECERA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel2.add(Txt_contabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 110, -1));
        jPanel2.add(Txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 110, -1));
        jPanel2.add(Txt_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 110, -1));

        jPanel2.add(cbox_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 110, -1));

        jPanel2.add(cbox_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 110, -1));

        jPanel2.add(cbox_cobrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 110, -1));

        jLabel20.setText("CODIGO VENDEDOR");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel14.setText("NUEMRO DE RESERVCION");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("FACTURA DETALLE");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel12.setText("FECHA");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel10.setText("CANTIDAD");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel8.setText("IMPUESTO");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 10));
        jPanel3.add(Txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 109, 20));
        jPanel3.add(Txt_fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 109, -1));

        jLabel11.setText("SERVICIO");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel3.add(Txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 109, -1));
        jPanel3.add(Txt_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 109, -1));

        jLabel6.setText("PRECIO");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel3.add(Txt_impuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 109, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "FECHA", "RESERVACION", "SERVIO", "catidad", "precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        FACTURA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "FECHA", "SERVIVO", "CANTIDAD"
            }
        ));
        jScrollPane2.setViewportView(FACTURA);

        jLabel16.setText("TOTAL");

        Btn_Modificar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Btn_Modificar.setText("Modificar");
        Btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModificarActionPerformed(evt);
            }
        });

        Btn_Eliminar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Btn_Eliminar.setText("Eliminar");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });

        Btn_Agregar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Btn_Agregar.setText("Guardar");
        Btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AgregarActionPerformed(evt);
            }
        });

        Btn_reporte.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Btn_reporte.setText("Reporte");
        Btn_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_reporteActionPerformed(evt);
            }
        });

        Btn_Agregar1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Btn_Agregar1.setText("AGREGAR");
        Btn_Agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Agregar1ActionPerformed(evt);
            }
        });

        jLabel4.setText("FACTURA PENDIENTE");

        jLabel5.setText("FACTURA EN LINEA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel21))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addGap(34, 34, 34)
                        .addComponent(Txt_reservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(Txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addGap(307, 307, 307)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_Agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(Btn_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Txt_reservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(Txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_Agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModificarActionPerformed
//
//        ClienteDao dao = new ClienteDao();
//
//        Cliente modi = new Cliente();
//
//        modi.setCodigo_Cliente(Txt_codigo.getText());
//        modi.setNombre_Cliente(Txt_nombre.getText());
//        modi.setNit_Cliente(Txt_nit.getText());
//        modi.setDireccion_Cliente(Txt_direccion.getText());
//        modi.setEstatus_Cliente(Txt_estatus.getText());
//        modi.setTelefono_Cliente(Txt_telefono.getText());
//        modi.setSaldo_Cliente(Txt_saldo.getText());
//        modi.setCuenta_Cliente(Txt_cuenta.getText());
//        modi.setEmail_Cliente(Txt_email.getText());
//        dao.update(modi);
//        llenadoDeTablas();
//        limpiar();
        //        BitacoraDao BitacoraDAO = new BitacoraDao();
        //
        //        Bitacora Insertar = new Bitacora();
        //
        //        Insertar.setAccion("Modificar");
        //        Insertar.setId_Usuario(Login.usuarioComercial);
        //        GenerarPermisos permisos = new GenerarPermisos();
        //        MDI_Components mdi_Components = new MDI_Components();
        //        Insertar.setCodigoAplicacion("3001");
        //        Insertar.setModulo("3000");
        //
        //        try {
            //            BitacoraDAO.insert(Insertar);
            //        } catch (UnknownHostException ex) {
            //            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
            //        }
//        JOptionPane.showMessageDialog(null, " La ejecucion  a  sido un exito");

        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ModificarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        //
//        ClienteDao acreedor = new ClienteDao();
//
//        Cliente vendedorAEliminar = new Cliente();
//        vendedorAEliminar.setCodigo_Cliente(Txt_codigo.getText());
//        vendedorAEliminar.setNombre_Cliente(Txt_nombre.getText());
//        vendedorAEliminar.setNit_Cliente(Txt_nit.getText());
//        vendedorAEliminar.setDireccion_Cliente(Txt_direccion.getText());
//        vendedorAEliminar.setEstatus_Cliente(Txt_estatus.getText());
//        vendedorAEliminar.setTelefono_Cliente(Txt_telefono.getText());
//        vendedorAEliminar.setSaldo_Cliente(Txt_saldo.getText());
//        vendedorAEliminar.setCuenta_Cliente(Txt_cuenta.getText());
//        vendedorAEliminar.setEmail_Cliente(Txt_email.getText());
//        acreedor.delete(vendedorAEliminar);
//        llenadoDeTablas();
//        limpiar();
        //        JOptionPane.showMessageDialog(null, "Cliente Eliminado.");
        //        BitacoraDao BitacoraDAO = new BitacoraDao();
        //
        //        Bitacora Insertar = new Bitacora();
        //
        //        Insertar.setAccion("Eliminar");
        //        GenerarPermisos permisos = new GenerarPermisos();
        //        MDI_Components mdi_Components = new MDI_Components();
        //        Insertar.setCodigoAplicacion("3001");
        //        Insertar.setModulo("3000");
        //        Insertar.setId_Usuario(Login.usuarioComercial);
        //        try {
            //            BitacoraDAO.insert(Insertar);
            //        } catch (UnknownHostException ex) {
            //            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
            //        }
//        JOptionPane.showMessageDialog(null, " La ejecuncion a  sido un exito");
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void Btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AgregarActionPerformed

        ////        GenerarPermisos permisos = new GenerarPermisos();
        ////        MDI_Components mdi_Components = new MDI_Components();
        ////
//        ////        String id = "0";
        Factura_VentaDao Factura_VentaDao  = new Factura_VentaDao();

      Factura_Venta AInsertar = new Factura_Venta();
       Factura_Venta AInsertar1 = new Factura_Venta();
        AInsertar.setFecha_emision(Txt_fecha.getText());
        AInsertar.setNo_serie(Txt_numero.getText());
//        AInsertar.setNit_Cliente(Txt_nit.getText());
//        AInsertar.setDireccion_Cliente(Txt_direccion.getText());

//        AInsertar.setTelefono_Cliente(Txt_telefono.getText());
//        AInsertar.setSaldo_Cliente(Txt_saldo.getText());
//        AInsertar.setCuenta_Cliente(Txt_cuenta.getText());
//        AInsertar.setEmail_Cliente(Txt_email.getText());
//        AInsertar.setEstatus_Cliente(Txt_estatus.getText());
//        ClienteDAO.insert(AInsertar);
//
//        llenadoDeTablas();
//        limpiar();
        ////        BitacoraDao BitacoraDAO = new BitacoraDao();
        ////
        ////        Bitacora Insertar = new Bitacora();
        ////        Insertar.setId_Usuario(Login.usuarioComercial);
        ////        Insertar.setAccion("Insertar");
        ////
        ////        Insertar.setCodigoAplicacion("3001");
        ////        Insertar.setModulo("3000");
        ////
        ////        try {
            ////            BitacoraDAO.insert(Insertar);
            ////        } catch (UnknownHostException ex) {
            ////            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
            ////        }
//        JOptionPane.showMessageDialog(null, " La ejecucion  a  sido un exito");
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_AgregarActionPerformed

    private void Btn_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_reporteActionPerformed
        //  Map p = new HashMap();
        //        JasperReport report;
        //        JasperPrint print;
        //
        //        try {
            //            connection = Conexion.getConnection();
            //            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                //                    + "/src/main/java/Comercial/reportes/MantenimientoCliente.jrxml");
            //            print = JasperFillManager.fillReport(report, p, connection);
            //            JasperViewer view = new JasperViewer(print, false);
            //            view.setTitle("cliente ");
            //            view.setVisible(true);
            //
            //        } catch (Exception e) {
            //            e.printStackTrace();
            //        }

        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_reporteActionPerformed

    private void Btn_Agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Agregar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Agregar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Agregar;
    private javax.swing.JButton Btn_Agregar1;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_Modificar;
    private javax.swing.JButton Btn_reporte;
    private javax.swing.JTable FACTURA;
    private javax.swing.JTextField Txt_cantidad;
    private javax.swing.JTextField Txt_contabilidad;
    private javax.swing.JTextField Txt_fecha;
    private javax.swing.JTextField Txt_fecha1;
    private javax.swing.JTextField Txt_impuesto;
    private javax.swing.JTextField Txt_numero;
    private javax.swing.JTextField Txt_precio;
    private javax.swing.JTextField Txt_reservacion;
    private javax.swing.JTextField Txt_servicio;
    private javax.swing.JTextField Txt_total;
    private javax.swing.JComboBox<String> cbox_cliente;
    private javax.swing.JComboBox<String> cbox_cobrador;
    private javax.swing.JComboBox<String> cbox_vendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}