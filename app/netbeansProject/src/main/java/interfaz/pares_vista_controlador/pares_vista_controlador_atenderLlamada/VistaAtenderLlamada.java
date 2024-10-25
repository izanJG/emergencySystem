/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz.pares_vista_controlador.pares_vista_controlador_atenderLlamada;

/**
 *
 * @author victo
 */
public class VistaAtenderLlamada extends javax.swing.JFrame {

    private final ControladorVistaAtenderLlamada miControlador;
    /**
     * Creates new form VistaAtenderLlamada
     */
    public VistaAtenderLlamada() {
        initComponents();
        miControlador = new ControladorVistaAtenderLlamada(this);
        PanelRegistrar.setVisible(false);
        PanelDescripcion.setVisible(false);
        PanelConsejos.setVisible(false);
    }
    
    public void setErrorRegistrar(String text){
        ErrorRegistrar.setText(text);
    }
    
    public void mostrarIntroducirDatos(){
        PanelRegistrar.setVisible(true);
    }
    
    public void mostrarIntroducirEmergencia(){
        PanelDescripcion.setVisible(true);
    }
    
    public void mostrarIntroducirConsejo(){
        PanelConsejos.setVisible(true);
    }
    
    public String getTelefono(){
        return Telefono.getText();
    }
    
    public String getComunicante(){
        return NombreComunicante.getText();
    }
    
    public String getPoliza(){
        return NumeroPoliza.getText();
    }
    
    public String getNombre(){
        return Nombre.getText();
    }
    
    public String getApellidos(){
        return Apellidos.getText();
    }
    
    public String getSexo(){
        return (String) Sexo.getSelectedItem();
    }
    
    public String getDia(){
        return (String) Dia.getSelectedItem();
    }
    
    public String getMes(){
        return (String) Mes.getSelectedItem();
    }
    
    public String getAno(){
        return (String) Ano.getSelectedItem();
    }
    
    public String getDescripcion(){
        return Descripcion.getText();
    }
    
    public boolean getIsCritica(){
        return Critica.isSelected();
    }
    
    public String getConsejo(){
        return Consejos.getText();
    }
    
    public String getResultado(){
        return Resultado.getText();
    }
    
    public boolean getIsIntervencion(){
        return Intervencion.isSelected();
    }
    
    public boolean getIsResulta(){
        return Resuelta.isSelected();
    }
    
    public void desactivarCampos(){
        ConfirmarRegistrar.disable();
    }
    
    public void desactivarDescripcion(){
        ConfirmarDescripcion.disable();
    }
    
    public void nuevaLlamada(){
        PanelRegistrar.setVisible(false);
        PanelDescripcion.setVisible(false);
        PanelConsejos.setVisible(false);
        Telefono.setText("");
        NombreComunicante.setText("");
        NumeroPoliza.setText("");
        Nombre.setText("");
        Apellidos.setText("");
        Descripcion.setText("");
        Consejos.setText("");
        Resultado.setText("");
    }
    
    public void nuevoConsejo(){
        Consejos.setText("");
        Resultado.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atenderLlamada = new javax.swing.JLabel();
        registrarLlamada = new javax.swing.JButton();
        PanelRegistrar = new javax.swing.JPanel();
        TelefonoL = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        NombreComunicanteL = new javax.swing.JLabel();
        NombreComunicante = new javax.swing.JTextField();
        NumeroPolizaL = new javax.swing.JLabel();
        NumeroPoliza = new javax.swing.JTextField();
        NombreL = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JLabel();
        Apellidos = new javax.swing.JTextField();
        SexoL = new javax.swing.JLabel();
        fechaNacimiento = new javax.swing.JLabel();
        Sexo = new javax.swing.JComboBox<>();
        Dia = new javax.swing.JComboBox<>();
        Mes = new javax.swing.JComboBox<>();
        Ano = new javax.swing.JComboBox<>();
        ConfirmarRegistrar = new javax.swing.JButton();
        PanelDescripcion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        DescripcionL = new javax.swing.JLabel();
        Critica = new javax.swing.JCheckBox();
        ConfirmarDescripcion = new javax.swing.JButton();
        PanelConsejos = new javax.swing.JPanel();
        consejos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Consejos = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        Intervencion = new javax.swing.JCheckBox();
        Resuelta = new javax.swing.JCheckBox();
        ConfirmarConsejos = new javax.swing.JButton();
        ErrorRegistrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atenderLlamada.setText("ATENDER LLAMADA");

        registrarLlamada.setText("Registrar Llamada");
        registrarLlamada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarLlamadaActionPerformed(evt);
            }
        });

        TelefonoL.setText("Nº telefono origen:");

        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
            }
        });

        NombreComunicanteL.setText("Nombre comuni:");

        NombreComunicante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreComunicanteActionPerformed(evt);
            }
        });

        NumeroPolizaL.setText("Nº poliza:");

        NumeroPoliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroPolizaActionPerformed(evt);
            }
        });

        NombreL.setText("Nombre");

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        apellidos.setText("Apellidos");

        Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidosActionPerformed(evt);
            }
        });

        SexoL.setText("Sexo");

        fechaNacimiento.setText("Fecha Nacimiento");

        Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H", "M" }));
        Sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexoActionPerformed(evt);
            }
        });

        Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaActionPerformed(evt);
            }
        });

        Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesActionPerformed(evt);
            }
        });

        Ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));

        ConfirmarRegistrar.setText("Confirmar");
        ConfirmarRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRegistrarLayout = new javax.swing.GroupLayout(PanelRegistrar);
        PanelRegistrar.setLayout(PanelRegistrarLayout);
        PanelRegistrarLayout.setHorizontalGroup(
            PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegistrarLayout.createSequentialGroup()
                        .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreComunicanteL)
                            .addComponent(TelefonoL))
                        .addGap(18, 18, 18)
                        .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Telefono)
                            .addComponent(NombreComunicante)))
                    .addGroup(PanelRegistrarLayout.createSequentialGroup()
                        .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreL)
                            .addComponent(NumeroPolizaL)
                            .addComponent(apellidos)
                            .addComponent(SexoL))
                        .addGap(18, 18, 18)
                        .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Apellidos)
                            .addComponent(NumeroPoliza)
                            .addComponent(Nombre)))
                    .addGroup(PanelRegistrarLayout.createSequentialGroup()
                        .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelRegistrarLayout.createSequentialGroup()
                                .addComponent(fechaNacimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ConfirmarRegistrar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelRegistrarLayout.setVerticalGroup(
            PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoL)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreComunicanteL)
                    .addComponent(NombreComunicante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroPolizaL)
                    .addComponent(NumeroPoliza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreL)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidos)
                    .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SexoL)
                    .addComponent(Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaNacimiento)
                    .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConfirmarRegistrar))
        );

        Descripcion.setColumns(20);
        Descripcion.setRows(5);
        jScrollPane1.setViewportView(Descripcion);

        DescripcionL.setText("Descripcion:");

        Critica.setText("Critica");
        Critica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriticaActionPerformed(evt);
            }
        });

        ConfirmarDescripcion.setText("Confirmar Descripcion");
        ConfirmarDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarDescripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDescripcionLayout = new javax.swing.GroupLayout(PanelDescripcion);
        PanelDescripcion.setLayout(PanelDescripcionLayout);
        PanelDescripcionLayout.setHorizontalGroup(
            PanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDescripcionLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(PanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescripcionL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(PanelDescripcionLayout.createSequentialGroup()
                            .addComponent(Critica)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConfirmarDescripcion))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        PanelDescripcionLayout.setVerticalGroup(
            PanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDescripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DescripcionL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(PanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Critica)
                    .addComponent(ConfirmarDescripcion))
                .addGap(26, 26, 26))
        );

        consejos.setText("Consejo");

        Consejos.setColumns(20);
        Consejos.setRows(5);
        jScrollPane2.setViewportView(Consejos);

        jLabel2.setText("Resultado");

        Resultado.setColumns(20);
        Resultado.setRows(5);
        jScrollPane3.setViewportView(Resultado);

        Intervencion.setText("Intervencion Op");
        Intervencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntervencionActionPerformed(evt);
            }
        });

        Resuelta.setText("LLamada resuelta");
        Resuelta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResueltaActionPerformed(evt);
            }
        });

        ConfirmarConsejos.setText("Confirmar");
        ConfirmarConsejos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarConsejosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelConsejosLayout = new javax.swing.GroupLayout(PanelConsejos);
        PanelConsejos.setLayout(PanelConsejosLayout);
        PanelConsejosLayout.setHorizontalGroup(
            PanelConsejosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsejosLayout.createSequentialGroup()
                .addGroup(PanelConsejosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConsejosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(consejos))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelConsejosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(PanelConsejosLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(PanelConsejosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelConsejosLayout.createSequentialGroup()
                                .addComponent(Intervencion)
                                .addGap(58, 58, 58)
                                .addComponent(ConfirmarConsejos))
                            .addComponent(Resuelta))))
                .addGap(0, 72, Short.MAX_VALUE))
        );
        PanelConsejosLayout.setVerticalGroup(
            PanelConsejosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConsejosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelConsejosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelConsejosLayout.createSequentialGroup()
                        .addComponent(consejos)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(PanelConsejosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(PanelConsejosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelConsejosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelConsejosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Intervencion)
                                    .addComponent(ConfirmarConsejos))
                                .addGap(23, 23, 23)
                                .addComponent(Resuelta)
                                .addGap(33, 33, 33))
                            .addGroup(PanelConsejosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3)
                                .addContainerGap())))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelConsejos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(registrarLlamada, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PanelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PanelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(ErrorRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(atenderLlamada, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atenderLlamada, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrarLlamada)
                    .addComponent(ErrorRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(PanelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(PanelConsejos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarLlamadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarLlamadaActionPerformed
        miControlador.procesarEventoRegistrarLlamada();
    }//GEN-LAST:event_registrarLlamadaActionPerformed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoActionPerformed

    private void NombreComunicanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreComunicanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreComunicanteActionPerformed

    private void NumeroPolizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroPolizaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroPolizaActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidosActionPerformed

    private void SexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexoActionPerformed

    private void MesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MesActionPerformed

    private void DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaActionPerformed

    private void ConfirmarRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarRegistrarActionPerformed
        miControlador.procesarEventoConfirmarCampos();
    }//GEN-LAST:event_ConfirmarRegistrarActionPerformed

    private void CriticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CriticaActionPerformed

    private void ConfirmarDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarDescripcionActionPerformed
        miControlador.procesarEventoDescripcion();
    }//GEN-LAST:event_ConfirmarDescripcionActionPerformed

    private void IntervencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntervencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IntervencionActionPerformed

    private void ResueltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResueltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResueltaActionPerformed

    private void ConfirmarConsejosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarConsejosActionPerformed
        miControlador.procesarEventoConsejo();
    }//GEN-LAST:event_ConfirmarConsejosActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAtenderLlamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAtenderLlamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAtenderLlamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAtenderLlamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAtenderLlamada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ano;
    private javax.swing.JTextField Apellidos;
    private javax.swing.JButton ConfirmarConsejos;
    private javax.swing.JButton ConfirmarDescripcion;
    private javax.swing.JButton ConfirmarRegistrar;
    private javax.swing.JTextArea Consejos;
    private javax.swing.JCheckBox Critica;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JLabel DescripcionL;
    private javax.swing.JComboBox<String> Dia;
    private javax.swing.JLabel ErrorRegistrar;
    private javax.swing.JCheckBox Intervencion;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreComunicante;
    private javax.swing.JLabel NombreComunicanteL;
    private javax.swing.JLabel NombreL;
    private javax.swing.JTextField NumeroPoliza;
    private javax.swing.JLabel NumeroPolizaL;
    private javax.swing.JPanel PanelConsejos;
    private javax.swing.JPanel PanelDescripcion;
    private javax.swing.JPanel PanelRegistrar;
    private javax.swing.JCheckBox Resuelta;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JComboBox<String> Sexo;
    private javax.swing.JLabel SexoL;
    private javax.swing.JTextField Telefono;
    private javax.swing.JLabel TelefonoL;
    private javax.swing.JLabel apellidos;
    private javax.swing.JLabel atenderLlamada;
    private javax.swing.JLabel consejos;
    private javax.swing.JLabel fechaNacimiento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton registrarLlamada;
    // End of variables declaration//GEN-END:variables
}
