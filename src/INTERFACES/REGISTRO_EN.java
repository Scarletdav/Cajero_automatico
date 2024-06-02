package INTERFACES;

import CODIGOS.Cliente;
import CODIGOS.Cuenta;
import CODIGOS.RegistroArchivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class REGISTRO_EN extends javax.swing.JFrame {

  
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    ArrayList<String> listaTipoCuenta = new ArrayList<String>();
    Cliente cliente;
    Cuenta cuenta; 
    String textoSeleccionado;
    
    private List<Cliente> clientes;
    
    public REGISTRO_EN() {
        initComponents();
        panel_DatosCuenta.setVisible(true);
        choiceTipoMoneda.add("BOLIVIANS");
        choiceTipoMoneda.add("DOLLARS");
        choiceTipoMoneda.add("EUROS");
        
        this.clientes = new ArrayList<>();
        // Cargar datos desde el archivo al iniciar el programa
        listaClientes = RegistroArchivos.cargarDatosDesdeArchivo("RegistroClientes.txt");
        llenarCombosCliente();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jlb_nombre = new javax.swing.JLabel();
        txt_nombreCliente = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jlb_telefono = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        jlb_cedula = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jlb_direccion = new javax.swing.JLabel();
        btn_AgregarCliente = new javax.swing.JButton();
        jlb_SaldoInicial = new javax.swing.JLabel();
        txt_constraseña = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jlb_cliente = new javax.swing.JLabel();
        jcb_cliente = new javax.swing.JComboBox<>();
        jlb_TipoMoneda = new javax.swing.JLabel();
        btn_AgregarCuenta = new javax.swing.JButton();
        btn_TipoCuenta = new javax.swing.JButton();
        jlb_TipoCuenta = new javax.swing.JLabel();
        jcb_TipoCuenta = new javax.swing.JComboBox<>();
        choiceTipoMoneda = new java.awt.Choice();
        jlb_SaldoInicial1 = new javax.swing.JLabel();
        txt_SaldoInicial = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jlb_movCliente = new javax.swing.JLabel();
        jcb_movCliente = new javax.swing.JComboBox<>();
        jlb_movTipoCuneta = new javax.swing.JLabel();
        jcb_movTipoCuenta = new javax.swing.JComboBox<>();
        jlb_movMonto = new javax.swing.JLabel();
        txt_movMontoActual = new javax.swing.JTextField();
        panel_DatosCuenta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlb_TipoCuenta1 = new javax.swing.JLabel();
        jlb_MontoInicial = new javax.swing.JLabel();
        jlb_Direccion = new javax.swing.JLabel();
        jlb_Cedula = new javax.swing.JLabel();
        jlb_Telefono = new javax.swing.JLabel();
        jlb_Nombre = new javax.swing.JLabel();
        btn_OK = new javax.swing.JButton();
        jlb_datosNombre = new javax.swing.JLabel();
        jlb_datosTelefono = new javax.swing.JLabel();
        jlb_datosCedula = new javax.swing.JLabel();
        jlb_datosDireccion = new javax.swing.JLabel();
        jlb_datosNumeroCuenta = new javax.swing.JLabel();
        jlb_datosMontoInicial = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlb_datosTipoCuenta = new javax.swing.JLabel();
        jlb_datosTipoMoneda = new javax.swing.JLabel();
        jlb_contraseña = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NEW CUSTOMER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb_nombre.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jlb_nombre.setText("Name:");
        jPanel3.add(jlb_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 62, 20));
        jPanel3.add(txt_nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 180, -1));
        jPanel3.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 150, -1));

        jlb_telefono.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_telefono.setForeground(new java.awt.Color(255, 255, 255));
        jlb_telefono.setText("Phone  number:");
        jPanel3.add(jlb_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 20));
        jPanel3.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 180, -1));

        jlb_cedula.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_cedula.setForeground(new java.awt.Color(255, 255, 255));
        jlb_cedula.setText("ID Card:");
        jPanel3.add(jlb_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 62, 20));
        jPanel3.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 180, -1));

        jlb_direccion.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_direccion.setForeground(new java.awt.Color(255, 255, 255));
        jlb_direccion.setText("Address:");
        jPanel3.add(jlb_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 62, 20));

        btn_AgregarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_AgregarCliente.setText("ADD CUSTOMER");
        btn_AgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_AgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 140, 40));

        jlb_SaldoInicial.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_SaldoInicial.setForeground(new java.awt.Color(255, 255, 255));
        jlb_SaldoInicial.setText("Password:");
        jPanel3.add(jlb_SaldoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 70, 20));
        jPanel3.add(txt_constraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 160, -1));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NEW ACCOUNT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb_cliente.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_cliente.setForeground(new java.awt.Color(255, 255, 255));
        jlb_cliente.setText("Client:");
        jPanel4.add(jlb_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, -1));

        jPanel4.add(jcb_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 170, -1));

        jlb_TipoMoneda.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_TipoMoneda.setForeground(new java.awt.Color(255, 255, 255));
        jlb_TipoMoneda.setText("Currency Type:");
        jPanel4.add(jlb_TipoMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, -1));

        btn_AgregarCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_AgregarCuenta.setText("ADD ACCOUNT");
        btn_AgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarCuentaActionPerformed(evt);
            }
        });
        jPanel4.add(btn_AgregarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 160, 50));

        btn_TipoCuenta.setText("+");
        btn_TipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TipoCuentaActionPerformed(evt);
            }
        });
        jPanel4.add(btn_TipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 40, -1));

        jlb_TipoCuenta.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_TipoCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jlb_TipoCuenta.setText("Account Type:");
        jPanel4.add(jlb_TipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        jPanel4.add(jcb_TipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 110, -1));
        jPanel4.add(choiceTipoMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, -1));

        jlb_SaldoInicial1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_SaldoInicial1.setForeground(new java.awt.Color(255, 255, 255));
        jlb_SaldoInicial1.setText("Initial Balance:");
        jPanel4.add(jlb_SaldoInicial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 20));
        jPanel4.add(txt_SaldoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 150, -1));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRANSACTIONS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb_movCliente.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_movCliente.setForeground(new java.awt.Color(255, 255, 255));
        jlb_movCliente.setText("Client:");
        jPanel5.add(jlb_movCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        jcb_movCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_movClienteActionPerformed(evt);
            }
        });
        jPanel5.add(jcb_movCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 30));

        jlb_movTipoCuneta.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_movTipoCuneta.setForeground(new java.awt.Color(255, 255, 255));
        jlb_movTipoCuneta.setText("Account type:");
        jPanel5.add(jlb_movTipoCuneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 80, -1));

        jcb_movTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_movTipoCuentaActionPerformed(evt);
            }
        });
        jPanel5.add(jcb_movTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 110, 30));

        jlb_movMonto.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_movMonto.setForeground(new java.awt.Color(255, 255, 255));
        jlb_movMonto.setText("Current Amount:");
        jPanel5.add(jlb_movMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 120, 20));
        jPanel5.add(txt_movMontoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 160, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        jPanel3.getAccessibleContext().setAccessibleName("NEW CUSTOMER");

        panel_DatosCuenta.setBackground(new java.awt.Color(0, 102, 102));
        panel_DatosCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_DatosCuenta.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACCOUNT DETAILS");

        jlb_TipoCuenta1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_TipoCuenta1.setForeground(new java.awt.Color(255, 255, 255));
        jlb_TipoCuenta1.setText("Account Number:");

        jlb_MontoInicial.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_MontoInicial.setForeground(new java.awt.Color(255, 255, 255));
        jlb_MontoInicial.setText("Initial Balance:");

        jlb_Direccion.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_Direccion.setForeground(new java.awt.Color(255, 255, 255));
        jlb_Direccion.setText("Address:");

        jlb_Cedula.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_Cedula.setForeground(new java.awt.Color(255, 255, 255));
        jlb_Cedula.setText("ID Card:");

        jlb_Telefono.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        jlb_Telefono.setText("Phone Number:");

        jlb_Nombre.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jlb_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jlb_Nombre.setText("Name:");

        btn_OK.setText("OK");
        btn_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OKActionPerformed(evt);
            }
        });

        jlb_datosNombre.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        jlb_datosTelefono.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        jlb_datosCedula.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        jlb_datosDireccion.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        jlb_datosMontoInicial.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Account Type:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Currency Type:");

        jlb_contraseña.setText("jLabel4");

        javax.swing.GroupLayout panel_DatosCuentaLayout = new javax.swing.GroupLayout(panel_DatosCuenta);
        panel_DatosCuenta.setLayout(panel_DatosCuentaLayout);
        panel_DatosCuentaLayout.setHorizontalGroup(
            panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DatosCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_DatosCuentaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_DatosCuentaLayout.createSequentialGroup()
                                .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlb_MontoInicial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_DatosCuentaLayout.createSequentialGroup()
                                        .addComponent(btn_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlb_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_DatosCuentaLayout.createSequentialGroup()
                                        .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlb_datosTipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlb_datosTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel_DatosCuentaLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jlb_datosMontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(panel_DatosCuentaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_DatosCuentaLayout.createSequentialGroup()
                                        .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlb_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlb_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlb_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlb_datosDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlb_datosCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlb_datosNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panel_DatosCuentaLayout.createSequentialGroup()
                                        .addComponent(jlb_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlb_datosTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_DatosCuentaLayout.createSequentialGroup()
                                .addComponent(jlb_TipoCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlb_datosNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DatosCuentaLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panel_DatosCuentaLayout.setVerticalGroup(
            panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DatosCuentaLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_datosNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_datosTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_DatosCuentaLayout.createSequentialGroup()
                        .addComponent(jlb_datosCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jlb_datosDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_DatosCuentaLayout.createSequentialGroup()
                        .addComponent(jlb_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlb_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_TipoCuenta1)
                    .addComponent(jlb_datosNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_MontoInicial)
                    .addComponent(jlb_datosMontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_datosTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jlb_datosTipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_DatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_OK)
                    .addComponent(jlb_contraseña))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_DatosCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_DatosCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarClienteActionPerformed
        Cliente cliente = new Cliente();
        cliente.setNombre(txt_nombreCliente.getText());
        cliente.setTelefono(txt_telefono.getText());
        cliente.setCedula(txt_cedula.getText());
        cliente.setDireccion(txt_direccion.getText());
        cliente.setContraseña(txt_constraseña.getText());
        listaClientes.add(cliente);

        RegistroArchivos.guardarClienteEnArchivo(cliente, "RegistroClientes.txt");

        borrarDatosCliente();
        llenarCombosCliente();
    }//GEN-LAST:event_btn_AgregarClienteActionPerformed

    private void btn_AgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarCuentaActionPerformed
        cliente = listaClientes.get(jcb_cliente.getSelectedIndex());
        Cuenta cuenta = new Cuenta();
        // El número de cuenta ya se genera automáticamente en el constructor de Cuenta
        cuenta.setTipoCuenta(listaTipoCuenta.get(jcb_TipoCuenta.getSelectedIndex()));
        textoSeleccionado = choiceTipoMoneda.getSelectedItem();
        cuenta.setTipoMOneda(textoSeleccionado);
        cuenta.setSaldoInicial(Double.parseDouble(txt_SaldoInicial.getText()));
        cuenta.setSaldoActual(Double.parseDouble(txt_SaldoInicial.getText()));
        panel_DatosCuenta.setVisible(true);
        cliente.agregarCuenta(cuenta);

        RegistroArchivos.agregarCuentaAClienteEnArchivo(cliente, cuenta, "RegistroClientes.txt");

        llenarCombosTipoCuenta();
        borrarDatosCuenta();
        resfrescarComboCuenta();
        verDatos();
    }//GEN-LAST:event_btn_AgregarCuentaActionPerformed

    private void btn_TipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TipoCuentaActionPerformed
        String tipoCuenta = JOptionPane.showInputDialog(this, "TIPO CUENTA");
        listaTipoCuenta.add(tipoCuenta);
        llenarCombosTipoCuenta();
    }//GEN-LAST:event_btn_TipoCuentaActionPerformed

    private void jcb_movClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_movClienteActionPerformed
        resfrescarComboCuenta();
        verDatos();
    }//GEN-LAST:event_jcb_movClienteActionPerformed

    private void jcb_movTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_movTipoCuentaActionPerformed
        verDatos();
    }//GEN-LAST:event_jcb_movTipoCuentaActionPerformed

    private void btn_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OKActionPerformed
        panel_DatosCuenta.setVisible(false);
    }//GEN-LAST:event_btn_OKActionPerformed
 public String convertirAMoneda(double cantidad){
        cantidad = Math.round(cantidad*100.0)/100.0;
        DecimalFormat formato = new DecimalFormat("$ #,###.## BS");
        return formato.format(cantidad);
    }
    public void verDatos(){
        
        cliente = listaClientes.get(jcb_movCliente.getSelectedIndex());
        jlb_datosNombre.setText(cliente.getNombre());
        jlb_datosTelefono.setText(cliente.getTelefono());
        jlb_datosCedula.setText(cliente.getCedula());
        jlb_datosDireccion.setText(cliente.getDireccion());
        jlb_contraseña.setText(cliente.getContraseña());
        
        if(cliente.getCuentas().size()>0){
            cuenta = cliente.getCuentas().get(jcb_movTipoCuenta.getSelectedIndex());
            jlb_datosTipoMoneda.setText(cuenta.getTipoMOneda());
            jlb_datosTipoCuenta.setText(cuenta.getTipoCuenta());
            jlb_datosNumeroCuenta.setText(cuenta.getNumeroCuenta());
            jlb_datosMontoInicial.setText(convertirAMoneda(cuenta.getSaldoInicial()));
            txt_movMontoActual.setText(String.valueOf(cuenta.getSaldoActual()));
        }else {
            jlb_datosTipoCuenta.setText("NO TIENE CUENTA");
            jlb_datosNumeroCuenta.setText("NO TIENE CUENTA");
            jlb_datosMontoInicial.setText("NO TIENE CUENTA");
            jlb_datosTipoMoneda.setText("NO TIENE CUENTA");
        }
    }
    public void resfrescarComboCuenta(){
        cliente = listaClientes.get(jcb_movCliente.getSelectedIndex());
        int i = 0;
        ArrayList<String> cuentas = new ArrayList<String>();
        for(Cuenta cuenta : cliente.getCuentas()){
            cuentas.add(cuenta.getTipoCuenta());
        }
        jcb_movTipoCuenta.setModel(new DefaultComboBoxModel(cuentas.toArray()));
    }
    public void llenarCombosTipoCuenta(){
        Object[] tipos = new Object [listaTipoCuenta.size()];
        int i = 0;
        for(String tipoCuenta : listaTipoCuenta){
            tipos[i] = tipoCuenta;
            i++;
        }
        jcb_TipoCuenta.setModel(new DefaultComboBoxModel(tipos));
        jcb_movTipoCuenta.setModel(new DefaultComboBoxModel(tipos));
    }
    
    public void llenarCombosCliente(){
        Object[] clientes = new Object [listaClientes.size()];
        int i = 0;
        for(Cliente cliente : listaClientes){
            clientes[i] = cliente.getNombre();
            i++;
        }
        jcb_cliente.setModel(new DefaultComboBoxModel(clientes));
        jcb_movCliente.setModel(new DefaultComboBoxModel(clientes));
    }
    public void borrarDatosCuenta(){
        jcb_cliente.setSelectedIndex(0);
        jcb_TipoCuenta.setSelectedIndex(0);
    }
    public void borrarDatosCliente(){
        txt_nombreCliente.setText(" ");
        txt_telefono.setText(" ");
        txt_cedula.setText(" ");
        txt_direccion.setText(" ");
        txt_constraseña.setText(" ");
    }
    
    public Cliente buscarClientePorIdentificadorYContraseña(String identificador, String contraseña) {
        for (Cliente cliente : listaClientes) {
            if ((cliente.getNombre().equalsIgnoreCase(identificador) || cliente.getCedula().equalsIgnoreCase(identificador)) && contraseña.equals(cliente.getContraseña())) {
                return cliente;
            }
        }
        return null;
    }
    
    public List<Cliente> getClientes() {
        return listaClientes;
    }

    public Cuenta buscarCuentaPorNumero(String archivo, String numeroCuenta) {
        Cuenta cuentaEncontrada = null;
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String lineaActual;
            boolean clienteEncontrado = false;
            String cedula = "";

            while ((lineaActual = lector.readLine()) != null) {
                lineaActual = lineaActual.trim();
                if (lineaActual.startsWith("Cédula: ")) {
                    cedula = lineaActual.substring(8).trim();
                    clienteEncontrado = true;
                    continue;
                }

                if (clienteEncontrado && lineaActual.equals("Número de Cuenta: " + numeroCuenta)) {
                    cuentaEncontrada = new Cuenta();
                    cuentaEncontrada.setNumeroCuenta(numeroCuenta);
                    cuentaEncontrada.setCedula(cedula);
                    continue;
                }

                if (cuentaEncontrada != null) {
                    if (lineaActual.startsWith("Saldo Actual: ")) {
                        double saldoActual = Double.parseDouble(lineaActual.substring(14).trim());
                        cuentaEncontrada.setSaldoActual(saldoActual);
                        continue;
                    }

                    if (lineaActual.startsWith("Tipo de Moneda: ")) {
                        String tipoMoneda = lineaActual.substring(15).trim();
                        cuentaEncontrada.setTipoMOneda(tipoMoneda);
                    }
                    
                    // Si encontramos un separador, significa que terminamos de leer la cuenta
                    if (lineaActual.equals("=========================================")) {
                        break;
                    }
                }

                // Resetear la bandera de cliente si llegamos al final de sus datos
                if (lineaActual.equals("=========================================")) {
                    clienteEncontrado = false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cuentaEncontrada;
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new REGISTRO_EN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AgregarCliente;
    private javax.swing.JButton btn_AgregarCuenta;
    private javax.swing.JButton btn_OK;
    private javax.swing.JButton btn_TipoCuenta;
    private java.awt.Choice choiceTipoMoneda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox<String> jcb_TipoCuenta;
    private javax.swing.JComboBox<String> jcb_cliente;
    private javax.swing.JComboBox<String> jcb_movCliente;
    private javax.swing.JComboBox<String> jcb_movTipoCuenta;
    private javax.swing.JLabel jlb_Cedula;
    private javax.swing.JLabel jlb_Direccion;
    private javax.swing.JLabel jlb_MontoInicial;
    private javax.swing.JLabel jlb_Nombre;
    private javax.swing.JLabel jlb_SaldoInicial;
    private javax.swing.JLabel jlb_SaldoInicial1;
    private javax.swing.JLabel jlb_Telefono;
    private javax.swing.JLabel jlb_TipoCuenta;
    private javax.swing.JLabel jlb_TipoCuenta1;
    private javax.swing.JLabel jlb_TipoMoneda;
    private javax.swing.JLabel jlb_cedula;
    private javax.swing.JLabel jlb_cliente;
    private javax.swing.JLabel jlb_contraseña;
    private javax.swing.JLabel jlb_datosCedula;
    private javax.swing.JLabel jlb_datosDireccion;
    private javax.swing.JLabel jlb_datosMontoInicial;
    private javax.swing.JLabel jlb_datosNombre;
    private javax.swing.JLabel jlb_datosNumeroCuenta;
    private javax.swing.JLabel jlb_datosTelefono;
    private javax.swing.JLabel jlb_datosTipoCuenta;
    private javax.swing.JLabel jlb_datosTipoMoneda;
    private javax.swing.JLabel jlb_direccion;
    private javax.swing.JLabel jlb_movCliente;
    private javax.swing.JLabel jlb_movMonto;
    private javax.swing.JLabel jlb_movTipoCuneta;
    private javax.swing.JLabel jlb_nombre;
    private javax.swing.JLabel jlb_telefono;
    private javax.swing.JPanel panel_DatosCuenta;
    private javax.swing.JTextField txt_SaldoInicial;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_constraseña;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_movMontoActual;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
