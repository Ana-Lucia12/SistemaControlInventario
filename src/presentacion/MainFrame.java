/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import modelo.Producto;
import java.io.File;
import javax.swing.JFileChooser;
import util.ArchivoUtil;

public class MainFrame extends javax.swing.JFrame {
    private negocio.ProductoNegocio productoNegocio = new negocio.ProductoNegocio();
    private int contadorId = 1;
   
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(900,600);
        inicializarTablaProductos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        grupoTipoProducto = new javax.swing.ButtonGroup();
        toolBarPrincipal = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        TabPrincipal = new javax.swing.JTabbedPane();
        panelRegistro = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblDisponible = new javax.swing.JLabel();
        lblTipoProducto = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();
        chkDisponible = new javax.swing.JCheckBox();
        rdbFisico = new javax.swing.JRadioButton();
        rdbDigital = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnLimpiarRegistro = new javax.swing.JButton();
        btnEditarRegistro = new javax.swing.JButton();
        btnGuardarRegistro = new javax.swing.JButton();
        panelLista = new javax.swing.JPanel();
        lblBuscarLista = new javax.swing.JLabel();
        txtBuscarLista = new javax.swing.JTextField();
        btnBuscarLista = new javax.swing.JButton();
        lblCategoriaLista = new javax.swing.JLabel();
        cmbFiltroCategoria = new javax.swing.JComboBox<>();
        btnFiltrarLista = new javax.swing.JButton();
        lblOrdenarLista = new javax.swing.JLabel();
        cmbOrdenarLista = new javax.swing.JComboBox<>();
        btnOrdenarLista = new javax.swing.JButton();
        btnMostrarTodosLista = new javax.swing.JButton();
        btnEditarSeleccionado = new javax.swing.JButton();
        btnEliminarSeleccionado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        panelEstadisticas = new javax.swing.JPanel();
        lblTituloEstadisticas = new javax.swing.JLabel();
        btnActualizarEstadisticas = new javax.swing.JButton();
        btnVerHistorial = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEstadisticas = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        mnuNuevoProducto = new javax.swing.JMenuItem();
        mnuExportarInventario = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        menuHerramientas = new javax.swing.JMenu();
        mnuOrdenarProductos = new javax.swing.JMenuItem();
        mnuVerEstadisticas = new javax.swing.JMenuItem();
        mnuVerHistorial = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        mnuAcercaSistema = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Control de Inventario");
        setPreferredSize(new java.awt.Dimension(900, 600));

        toolBarPrincipal.setRollover(true);

        btnNuevo.setText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        toolBarPrincipal.add(btnNuevo);

        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        toolBarPrincipal.add(btnGuardar);

        btnEditar.setText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        toolBarPrincipal.add(btnEditar);

        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        toolBarPrincipal.add(btnEliminar);

        btnOrdenar.setText("Ordenar");
        btnOrdenar.setFocusable(false);
        btnOrdenar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOrdenar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        toolBarPrincipal.add(btnOrdenar);

        btnExportar.setText("Exportar");
        btnExportar.setFocusable(false);
        btnExportar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExportar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        toolBarPrincipal.add(btnExportar);

        lblCodigo.setText("Código:");

        lblNombre.setText("Nombre:");

        lblCategoria.setText("Categoría:");

        lblCantidad.setText("Cantidad:");

        lblPrecio.setText("Precio:");

        lblDisponible.setText("Disponible:");

        lblTipoProducto.setText("Tipo de Producto:");

        lblDescripcion.setText("Descripcion:");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Tecnología", "Alimentos", "Limpieza", "Ropa", "Hogar", "Otros" }));

        chkDisponible.setText("Disponible");

        grupoTipoProducto.add(rdbFisico);
        rdbFisico.setText("Físico");

        grupoTipoProducto.add(rdbDigital);
        rdbDigital.setText("Digital");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        btnLimpiarRegistro.setText("Limpiar Campos");
        btnLimpiarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarRegistroActionPerformed(evt);
            }
        });

        btnEditarRegistro.setText("Editar");
        btnEditarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRegistroActionPerformed(evt);
            }
        });

        btnGuardarRegistro.setText("Guardar");
        btnGuardarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDisponible)
                            .addComponent(lblTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcion)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnGuardarRegistro)))
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelRegistroLayout.createSequentialGroup()
                                        .addComponent(rdbFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdbDigital, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(160, 160, 160))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelRegistroLayout.createSequentialGroup()
                                            .addComponent(btnEditarRegistro)
                                            .addGap(46, 46, 46)
                                            .addComponent(btnLimpiarRegistro))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkDisponible))))))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisponible)
                    .addComponent(chkDisponible))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoProducto)
                    .addComponent(rdbFisico)
                    .addComponent(rdbDigital))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addComponent(lblDescripcion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditarRegistro)
                            .addComponent(btnGuardarRegistro)
                            .addComponent(btnLimpiarRegistro))
                        .addGap(0, 70, Short.MAX_VALUE))))
        );

        TabPrincipal.addTab("Registro de productos", panelRegistro);

        lblBuscarLista.setText("Buscar: ");

        btnBuscarLista.setText("Buscar");
        btnBuscarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarListaActionPerformed(evt);
            }
        });

        lblCategoriaLista.setText("Categoría:");

        cmbFiltroCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Tecnología", "Alimentos", "Limpieza", "Ropa", "Hogar", "Otros" }));

        btnFiltrarLista.setText("Filtrar");
        btnFiltrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarListaActionPerformed(evt);
            }
        });

        lblOrdenarLista.setText("Ordenar por:");

        cmbOrdenarLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Nombre", "Precio", "Cantidad" }));

        btnOrdenarLista.setText("Ordenar");
        btnOrdenarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarListaActionPerformed(evt);
            }
        });

        btnMostrarTodosLista.setText("Mostrar todos");
        btnMostrarTodosLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosListaActionPerformed(evt);
            }
        });

        btnEditarSeleccionado.setText("Editar seleccionado");
        btnEditarSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSeleccionadoActionPerformed(evt);
            }
        });

        btnEliminarSeleccionado.setText("Eliminar seleccionado");
        btnEliminarSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSeleccionadoActionPerformed(evt);
            }
        });

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Código", "Nombre", "Categoría", "Cantidad", "Precio", "Disponible"
            }
        ));
        jScrollPane2.setViewportView(tblProductos);

        javax.swing.GroupLayout panelListaLayout = new javax.swing.GroupLayout(panelLista);
        panelLista.setLayout(panelListaLayout);
        panelListaLayout.setHorizontalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelListaLayout.createSequentialGroup()
                        .addComponent(btnMostrarTodosLista, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnEditarSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelListaLayout.createSequentialGroup()
                        .addGroup(panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelListaLayout.createSequentialGroup()
                                    .addComponent(lblBuscarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListaLayout.createSequentialGroup()
                                    .addComponent(lblCategoriaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addComponent(lblOrdenarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cmbFiltroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBuscarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbOrdenarLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarLista)
                            .addComponent(btnFiltrarLista)
                            .addComponent(btnOrdenarLista)))
                    .addGroup(panelListaLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnEliminarSeleccionado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelListaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        panelListaLayout.setVerticalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarLista)
                    .addComponent(txtBuscarLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarLista))
                .addGap(18, 18, 18)
                .addGroup(panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFiltroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarLista)
                    .addComponent(lblCategoriaLista))
                .addGap(18, 18, 18)
                .addGroup(panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrdenarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbOrdenarLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOrdenarLista)))
                .addGap(28, 28, 28)
                .addGroup(panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarTodosLista)
                    .addComponent(btnEditarSeleccionado)
                    .addComponent(btnEliminarSeleccionado))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        TabPrincipal.addTab("Lista de productos", panelLista);

        lblTituloEstadisticas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTituloEstadisticas.setText("Estadísticas del inventario");

        btnActualizarEstadisticas.setText("Actualizar estadísticas");
        btnActualizarEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEstadisticasActionPerformed(evt);
            }
        });

        btnVerHistorial.setText("Ver historial");
        btnVerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHistorialActionPerformed(evt);
            }
        });

        txtEstadisticas.setEditable(false);
        txtEstadisticas.setColumns(40);
        txtEstadisticas.setRows(15);
        jScrollPane3.setViewportView(txtEstadisticas);

        javax.swing.GroupLayout panelEstadisticasLayout = new javax.swing.GroupLayout(panelEstadisticas);
        panelEstadisticas.setLayout(panelEstadisticasLayout);
        panelEstadisticasLayout.setHorizontalGroup(
            panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticasLayout.createSequentialGroup()
                .addGroup(panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstadisticasLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelEstadisticasLayout.createSequentialGroup()
                                .addComponent(btnActualizarEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelEstadisticasLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        panelEstadisticasLayout.setVerticalGroup(
            panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTituloEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarEstadisticas)
                    .addComponent(btnVerHistorial))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        TabPrincipal.addTab("Estadísticas", panelEstadisticas);

        menuArchivo.setText("Archivo");

        mnuNuevoProducto.setText("Nuevo Producto");
        mnuNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNuevoProductoActionPerformed(evt);
            }
        });
        menuArchivo.add(mnuNuevoProducto);

        mnuExportarInventario.setText("Exportar inventario");
        mnuExportarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExportarInventarioActionPerformed(evt);
            }
        });
        menuArchivo.add(mnuExportarInventario);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(mnuSalir);

        jMenuBar2.add(menuArchivo);

        menuHerramientas.setText("Herramientas");

        mnuOrdenarProductos.setText("Ordenar productos");
        mnuOrdenarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOrdenarProductosActionPerformed(evt);
            }
        });
        menuHerramientas.add(mnuOrdenarProductos);

        mnuVerEstadisticas.setText("Ver estadísticas");
        mnuVerEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVerEstadisticasActionPerformed(evt);
            }
        });
        menuHerramientas.add(mnuVerEstadisticas);

        mnuVerHistorial.setText("Ver historial");
        mnuVerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVerHistorialActionPerformed(evt);
            }
        });
        menuHerramientas.add(mnuVerHistorial);

        jMenuBar2.add(menuHerramientas);

        menuAyuda.setText("Ayuda");

        mnuAcercaSistema.setText("Acerca del sistema");
        mnuAcercaSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAcercaSistemaActionPerformed(evt);
            }
        });
        menuAyuda.add(mnuAcercaSistema);

        jMenuBar2.add(menuAyuda);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toolBarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TabPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TabPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void inicializarTablaProductos() {
        
        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
        
        modelo.addColumn("ID");
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Categoría");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Disponible");

        tblProductos.setModel(modelo);
    }
    
    private void cargarTablaProductos(java.util.List<Producto> productos) {
        javax.swing.table.DefaultTableModel modelo =
                (javax.swing.table.DefaultTableModel) tblProductos.getModel();
        
        modelo.setRowCount(0);
        
        for (Producto producto : productos) {
            Object[] fila = {
                    producto.getId(),
                    producto.getCodigo(),
                    producto.getNombre(),
                    producto.getCategoria(),
                    producto.getCantidad(),
                    producto.getPrecio(),
                    producto.isDisponible()
            };
            
            modelo.addRow(fila);
        }          
    }
            
            
    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        int opcion = javax.swing.JOptionPane.showConfirmDialog(
                this,
                "Desea salir del sistema?",
                "Confirmar salida.",
                javax.swing.JOptionPane.YES_NO_OPTION
        );
        
        if (opcion == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuAcercaSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAcercaSistemaActionPerformed
        javax.swing.JOptionPane.showMessageDialog(
            this,
                "Sistema de Control de Inventario\n"
                + "Programacion IV\n"
                + "Universidad Internacional San Isidro Labrador\n"
                + "Profesor José Andrés Jiménez Zamora",
                "Acerca del Sistema",
                javax.swing.JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_mnuAcercaSistemaActionPerformed

    private void mostrarEstadisticas() {
        Producto mayor = productoNegocio.obtenerProductoMayorPrecio();
        Producto menor = productoNegocio.obtenerProductoMenorPrecio();
        
        String texto = "";
        
        texto += "ESTADÍSTICAS DEL INVENTARIO\n";
        texto += "--------------------------------------\n";
        
        texto += "Cantidad total de productos: "
                + productoNegocio.obtenerCantidadTotalProductos() + "\n";
        
        texto += "Cantidad de productos disponibles: "
                + productoNegocio.obtenerCantidadProductosDisponibles() + "\n";

        texto += "Cantidad de productos no disponibles: "
                + productoNegocio.obtenerCantidadProductosNoDisponibles() + "\n";

        texto += "Cantidad de unidades almacenadas: "
                + productoNegocio.obtenerCantidadUnidadesAlmacenadas() + "\n";
        
        if (mayor != null) {
            
            texto += "Producto con mayor precio: "
                    + mayor.getNombre() + " - ₡" + mayor.getPrecio() + "\n";
        } else {
            texto += "Producto con mayor precio: No hay productos registrados\n";
        }
        
        if (menor != null) {
            
            texto += "Producto con menor precio: "
                    + menor.getNombre() + " - ₡" + menor.getPrecio() + "\n";
        } else {
            texto += "Producto con menor precio: No hay productos registrados\n";
        }
        
        texto += "Valor total del inventario: ₡"
                + productoNegocio.calcularValorTotalInventario() + "\n";
        
        texto += "\nCANTIDAD DE PRODUCTOS POR CATEGORÍA\n";
        texto += "--------------------------------------\n";
        
        java.util.Map<String, Integer> conteo = productoNegocio.contarProductosPorCategoria();
        
        if (conteo.isEmpty()) {
            
            texto += "No hay productos registrados.\n";
        }  else {
            for (String categoria : conteo.keySet()) {
                texto += categoria + ": " + conteo.get(categoria) + "\n";
            }
        }
        
        txtEstadisticas.setText(texto);
            
    }
    
    private void exportarInventario() {
        if (productoNegocio.listarProductos().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "No hay productos para exportar."
            );
            return;
        }
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar inventario");
        
        int seleccion = fileChooser.showSaveDialog(this);
        
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            
            try {
                ArchivoUtil.exportarInventario(
                        productoNegocio.listarProductos(),
                        archivo
                );
                
                 productoNegocio.registrarExportacion();
                 
                 javax.swing.JOptionPane.showMessageDialog(
                         this,
                         "Inventario exportado correctamente."
                 );
                 
            } catch (excepciones.ArchivoException e) {
                 javax.swing.JOptionPane.showMessageDialog(
                         this,
                         e.getMessage()
                 );
            }
        }
        
    }
            
    private void btnLimpiarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarRegistroActionPerformed
        limpiarCamposRegistro();
    }//GEN-LAST:event_btnLimpiarRegistroActionPerformed

    private void btnGuardarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegistroActionPerformed
        try {
            String codigo = txtCodigo.getText();
            String nombre = txtNombre.getText();
            String categoria = cmbCategoria.getSelectedItem().toString();
            int cantidad = Integer.parseInt(txtCantidad.getText());
            double precio = Double.parseDouble(txtPrecio.getText());
            boolean disponible = chkDisponible.isSelected();
            String descripcion = txtDescripcion.getText();
            
            String tipoProducto = "";
            
            if (rdbFisico.isSelected()) {
                tipoProducto = "Físico";
            } else if (rdbDigital.isSelected()) {
                tipoProducto = "Digital";
            }
            
            Producto producto = new Producto(
                    contadorId,
                    codigo,
                    nombre,
                    categoria,
                    cantidad,
                    precio,
                    disponible,
                    tipoProducto,
                    descripcion           
            );
            
            productoNegocio.agregarProducto(producto);
            cargarTablaProductos(productoNegocio.listarProductos());
            mostrarEstadisticas();
            
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Producto guardado correctamente."           
            );
            
            contadorId++;
            limpiarCamposRegistro();
            
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "La cantidad y el precio deben ser numéricos."
            );
            
        } catch (excepciones.DatoInvalidoException | excepciones.ProductoDuplicadoException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    e.getMessage()
            );
        }
    }//GEN-LAST:event_btnGuardarRegistroActionPerformed

    private void btnEditarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRegistroActionPerformed
        
        try {
            String codigo = txtCodigo.getText();
            
            Producto productoExistente =  productoNegocio.buscarProductoPorCodigo(codigo);
            
            String nombre = txtNombre.getText();
            String categoria = cmbCategoria.getSelectedItem().toString();
            int cantidad = Integer.parseInt(txtCantidad.getText());
            double precio = Double.parseDouble(txtPrecio.getText());
            boolean disponible = chkDisponible.isSelected();
            String descripcion = txtDescripcion.getText();

            String tipoProducto = "";
            
            if (rdbFisico.isSelected()) {
                tipoProducto = "Físico";
            } else if (rdbDigital.isSelected()) {
                tipoProducto = "Digital";
            }
            
            Producto productoEditado = new Producto(
                    productoExistente.getId(),
                    codigo,
                    nombre,
                    categoria,
                    cantidad,
                    precio,
                    disponible,
                    tipoProducto,
                    descripcion
            );
            
            productoNegocio.editarProducto(productoEditado);
            cargarTablaProductos(productoNegocio.listarProductos());
            mostrarEstadisticas();
            
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Producto editado correctamente."
            );
            
            limpiarCamposRegistro();

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "La cantidad y el precio deben ser numéricos."
            );
            
        } catch (excepciones.DatoInvalidoException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    e.getMessage()
            );
        }
    }//GEN-LAST:event_btnEditarRegistroActionPerformed

    private void btnBuscarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarListaActionPerformed
        try {
            String texto = txtBuscarLista.getText();
            
            java.util.List<Producto> resultados = productoNegocio.buscarProductos(texto);
            
            cargarTablaProductos(resultados);
            
        } catch (excepciones.DatoInvalidoException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    e.getMessage()
            );
        }
    }//GEN-LAST:event_btnBuscarListaActionPerformed

    private void btnMostrarTodosListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosListaActionPerformed
        cargarTablaProductos(productoNegocio.listarProductos());
    }//GEN-LAST:event_btnMostrarTodosListaActionPerformed

    private void btnFiltrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarListaActionPerformed
        try {
            String categoria = cmbFiltroCategoria.getSelectedItem().toString();
            
            if (categoria.equals("Seleccione")) {
                throw new excepciones.DatoInvalidoException("Debe seleccionar una categoría para filtrar.");                                                
            } 
            
            java.util.List<Producto> resultados = productoNegocio.filtrarPorCategoria(categoria);
            
            cargarTablaProductos(resultados);
            
        } catch (excepciones.DatoInvalidoException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    e.getMessage()
            );
        }
    }//GEN-LAST:event_btnFiltrarListaActionPerformed

    private void btnOrdenarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarListaActionPerformed
        String opcion = cmbOrdenarLista.getSelectedItem().toString();
        
        if (opcion.equals("Seleccione")) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Debe seleccionar una opcion para odenar."
            );
            return;
        }
        
        if (opcion.equals("Nombre")) {
            cargarTablaProductos(productoNegocio.ordenarPorNombre());
            
        } else if (opcion.equals("Precio")) {
            cargarTablaProductos(productoNegocio.ordenarPorPrecio());
            
        } else if (opcion.equals("Cantidad")) {
            cargarTablaProductos(productoNegocio.ordenarPorCantidad());
        }
    }//GEN-LAST:event_btnOrdenarListaActionPerformed

    private void btnEliminarSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSeleccionadoActionPerformed
        int fila = tblProductos.getSelectedRow();
        
        if (fila == -1) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Debe seleccionar un producto de la tabla."
            );
            return;
        }
        
        String codigo = tblProductos.getValueAt(fila, 1).toString();
        
        int opcion = javax.swing.JOptionPane.showConfirmDialog(
                this,
                "¿Está segura de eliminar el producto seleccionado?",
                "Confirmar eliminación",
                javax.swing.JOptionPane.YES_NO_OPTION
        );    
        
        if (opcion == javax.swing.JOptionPane.YES_OPTION) {
            try {
                productoNegocio.eliminarProducto(codigo);

                cargarTablaProductos(productoNegocio.listarProductos());
                mostrarEstadisticas();

                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Producto eliminado correctamente."
                );

            } catch (excepciones.DatoInvalidoException e) {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        e.getMessage()
                );
            }
        }
    }//GEN-LAST:event_btnEliminarSeleccionadoActionPerformed

    private void btnEditarSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSeleccionadoActionPerformed
        int fila = tblProductos.getSelectedRow();
        
        if (fila == -1) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Debe seleccionar un producto de la tabla."
            );
            return;
        }
        
        String codigo = tblProductos.getValueAt(fila, 1).toString();
        
        try {
            Producto producto = productoNegocio.buscarProductoPorCodigo(codigo);
            
            txtCodigo.setText(producto.getCodigo());
            txtNombre.setText(producto.getNombre());
            cmbCategoria.setSelectedItem(producto.getCategoria());
            txtCantidad.setText(String.valueOf(producto.getCantidad()));
            txtPrecio.setText(String.valueOf(producto.getPrecio()));
            chkDisponible.setSelected(producto.isDisponible());
            txtDescripcion.setText(producto.getDescripcion());
            
            if (producto.getTipoProducto().equalsIgnoreCase("Físico")) {
                rdbFisico.setSelected(true);
                
            } else if (producto.getTipoProducto().equalsIgnoreCase("Digital")) {
                rdbDigital.setSelected(true);
            }
            TabPrincipal.setSelectedIndex(0);
            
        } catch (excepciones.DatoInvalidoException e) {
            javax.swing.JOptionPane.showMessageDialog(
                        this,
                        e.getMessage()
                );
        }
    }//GEN-LAST:event_btnEditarSeleccionadoActionPerformed

    private void btnActualizarEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEstadisticasActionPerformed
        mostrarEstadisticas();
    }//GEN-LAST:event_btnActualizarEstadisticasActionPerformed

    private void btnVerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHistorialActionPerformed
        
        String texto = "";
        
        if (productoNegocio.obtenerHistorial().isEmpty()) {
            
            texto = "No hay acciones registradas en el historial.";
        } else {
            for (String accion : productoNegocio.obtenerHistorial()) {
                texto += accion + "\n";
            }
        }
        
        javax.swing.JOptionPane.showMessageDialog(
                this,
                texto,
                "Historial de acciones",
                javax.swing.JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_btnVerHistorialActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        btnGuardarRegistro.doClick();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        exportarInventario();
    }//GEN-LAST:event_btnExportarActionPerformed

    private void mnuExportarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExportarInventarioActionPerformed
        exportarInventario();
    }//GEN-LAST:event_mnuExportarInventarioActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCamposRegistro();
        TabPrincipal.setSelectedIndex(0);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnEditarRegistro.doClick();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        TabPrincipal.setSelectedIndex(1);
        btnEliminarSeleccionado.doClick();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        TabPrincipal.setSelectedIndex(1);
        btnOrdenarLista.doClick();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void mnuNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNuevoProductoActionPerformed
        btnNuevo.doClick();
    }//GEN-LAST:event_mnuNuevoProductoActionPerformed

    private void mnuOrdenarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOrdenarProductosActionPerformed
        TabPrincipal.setSelectedIndex(1);
    }//GEN-LAST:event_mnuOrdenarProductosActionPerformed

    private void mnuVerEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVerEstadisticasActionPerformed
        TabPrincipal.setSelectedIndex(2);
        mostrarEstadisticas();
    }//GEN-LAST:event_mnuVerEstadisticasActionPerformed

    private void mnuVerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVerHistorialActionPerformed
        btnVerHistorial.doClick();
    }//GEN-LAST:event_mnuVerHistorialActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    private void limpiarCamposRegistro() {
        txtCodigo.setText("");
        txtNombre.setText("");
        cmbCategoria.setSelectedIndex(0);
        txtCantidad.setText("");
        txtPrecio.setText("");
        chkDisponible.setSelected(false);
        grupoTipoProducto.clearSelection();
        txtDescripcion.setText("");
        txtCodigo.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabPrincipal;
    private javax.swing.JButton btnActualizarEstadisticas;
    private javax.swing.JButton btnBuscarLista;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarRegistro;
    private javax.swing.JButton btnEditarSeleccionado;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarSeleccionado;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnFiltrarLista;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarRegistro;
    private javax.swing.JButton btnLimpiarRegistro;
    private javax.swing.JButton btnMostrarTodosLista;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnOrdenarLista;
    private javax.swing.JButton btnVerHistorial;
    private javax.swing.JCheckBox chkDisponible;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbFiltroCategoria;
    private javax.swing.JComboBox<String> cmbOrdenarLista;
    private javax.swing.ButtonGroup grupoTipoProducto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBuscarLista;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCategoriaLista;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDisponible;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOrdenarLista;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipoProducto;
    private javax.swing.JLabel lblTituloEstadisticas;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuHerramientas;
    private javax.swing.JMenuItem mnuAcercaSistema;
    private javax.swing.JMenuItem mnuExportarInventario;
    private javax.swing.JMenuItem mnuNuevoProducto;
    private javax.swing.JMenuItem mnuOrdenarProductos;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuVerEstadisticas;
    private javax.swing.JMenuItem mnuVerHistorial;
    private javax.swing.JPanel panelEstadisticas;
    private javax.swing.JPanel panelLista;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JRadioButton rdbDigital;
    private javax.swing.JRadioButton rdbFisico;
    private javax.swing.JTable tblProductos;
    private javax.swing.JToolBar toolBarPrincipal;
    private javax.swing.JTextField txtBuscarLista;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtEstadisticas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
