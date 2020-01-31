/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinfui.interfaz;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pinfui.dto.LabelDTO;
import pinfui.dto.TipoVentana;
import pinfui.entidades.Usuario;

/**
 * Plantilla para las ventanas de diferentes roles
 * @author ITCOM
 */
public class PantallaMedico extends PlantillaPantallas {    
    
	/**
	 * Creates new form PantallaUsuario
	 * @param usuario Usuario logeado
	 */
    public PantallaMedico(Usuario usuario) {
        super(usuario);
    	initComponents();
        myInitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVentana = new javax.swing.JPanel();
        panelBarraIzquierda = new javax.swing.JPanel();
        panelUsuario = new javax.swing.JPanel();
        labelNombreUser = new javax.swing.JLabel();
        iconSalir = new javax.swing.JLabel();
        panelOtrasVentanas = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        panelMenuInicio = new javax.swing.JPanel();
        labelMenuInicio = new javax.swing.JLabel();
        panelMenuPacientes = new javax.swing.JPanel();
        labelMenuPacientes = new javax.swing.JLabel();
        panelMenuMensajeria = new javax.swing.JPanel();
        labelMenuMensajeria = new javax.swing.JLabel();
        iconCorreo = new javax.swing.JLabel();
        panelDatosVentana = new javax.swing.JPanel();
        panelInicio = new javax.swing.JPanel();
        jWelcome = new javax.swing.JButton();
        panelVentanaPacientes = new javax.swing.JPanel();
        panelVentanaMensajeria = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla medico");

        panelVentana.setBackground(new java.awt.Color(255, 255, 255));

        panelBarraIzquierda.setBackground(new java.awt.Color(0, 153, 255));

        panelUsuario.setBackground(new java.awt.Color(0, 153, 255));

        labelNombreUser.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        labelNombreUser.setText("nombreUsuario");
        labelNombreUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        iconSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/cerrar-sesion.png"))); // NOI18N
        iconSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNombreUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(iconSalir)
                .addContainerGap())
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconSalir)
                    .addComponent(labelNombreUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelOtrasVentanas.setBackground(new java.awt.Color(0, 153, 255));

        panelMenuInicio.setBackground(new java.awt.Color(0, 153, 255));
        panelMenuInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelMenuInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelMenuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMenuInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMenuInicioMouseExited(evt);
            }
        });

        labelMenuInicio.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        labelMenuInicio.setText("Inicio");

        javax.swing.GroupLayout panelMenuInicioLayout = new javax.swing.GroupLayout(panelMenuInicio);
        panelMenuInicio.setLayout(panelMenuInicioLayout);
        panelMenuInicioLayout.setHorizontalGroup(
            panelMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMenuInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMenuInicioLayout.setVerticalGroup(
            panelMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMenuInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenuPacientes.setBackground(new java.awt.Color(0, 153, 255));
        panelMenuPacientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelMenuPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelMenuPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuPacientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMenuPacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMenuPacientesMouseExited(evt);
            }
        });

        labelMenuPacientes.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        labelMenuPacientes.setText("Pacientes");
        labelMenuPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelMenuPacientesLayout = new javax.swing.GroupLayout(panelMenuPacientes);
        panelMenuPacientes.setLayout(panelMenuPacientesLayout);
        panelMenuPacientesLayout.setHorizontalGroup(
            panelMenuPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMenuPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMenuPacientesLayout.setVerticalGroup(
            panelMenuPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMenuPacientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenuMensajeria.setBackground(new java.awt.Color(0, 153, 255));
        panelMenuMensajeria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelMenuMensajeria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelMenuMensajeria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuMensajeriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMenuMensajeriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMenuMensajeriaMouseExited(evt);
            }
        });

        labelMenuMensajeria.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        labelMenuMensajeria.setText("Mensajería");

        iconCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/correo.png"))); // NOI18N
        iconCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelMenuMensajeriaLayout = new javax.swing.GroupLayout(panelMenuMensajeria);
        panelMenuMensajeria.setLayout(panelMenuMensajeriaLayout);
        panelMenuMensajeriaLayout.setHorizontalGroup(
            panelMenuMensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuMensajeriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMenuMensajeria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(iconCorreo)
                .addContainerGap())
        );
        panelMenuMensajeriaLayout.setVerticalGroup(
            panelMenuMensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuMensajeriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuMensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconCorreo)
                    .addComponent(labelMenuMensajeria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelOtrasVentanasLayout = new javax.swing.GroupLayout(panelOtrasVentanas);
        panelOtrasVentanas.setLayout(panelOtrasVentanasLayout);
        panelOtrasVentanasLayout.setHorizontalGroup(
            panelOtrasVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMenuMensajeria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMenuInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelOtrasVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
        );
        panelOtrasVentanasLayout.setVerticalGroup(
            panelOtrasVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOtrasVentanasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenuInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMenuPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMenuMensajeria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelOtrasVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelOtrasVentanasLayout.createSequentialGroup()
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 342, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelBarraIzquierdaLayout = new javax.swing.GroupLayout(panelBarraIzquierda);
        panelBarraIzquierda.setLayout(panelBarraIzquierdaLayout);
        panelBarraIzquierdaLayout.setHorizontalGroup(
            panelBarraIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelOtrasVentanas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBarraIzquierdaLayout.setVerticalGroup(
            panelBarraIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraIzquierdaLayout.createSequentialGroup()
                .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOtrasVentanas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatosVentana.setBackground(new java.awt.Color(255, 255, 255));

        panelInicio.setBackground(new java.awt.Color(255, 255, 255));

        jWelcome.setBackground(new java.awt.Color(255, 255, 255));
        jWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/bienvenido.png"))); // NOI18N
        jWelcome.setBorderPainted(false);
        jWelcome.setContentAreaFilled(false);
        jWelcome.setFocusPainted(false);
        jWelcome.setOpaque(false);
        jWelcome.setBorder(null);

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );

        panelVentanaPacientes.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelVentanaPacientesLayout = new javax.swing.GroupLayout(panelVentanaPacientes);
        panelVentanaPacientes.setLayout(panelVentanaPacientesLayout);
        panelVentanaPacientesLayout.setHorizontalGroup(
            panelVentanaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        panelVentanaPacientesLayout.setVerticalGroup(
            panelVentanaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        panelVentanaMensajeria.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout panelVentanaMensajeriaLayout = new javax.swing.GroupLayout(panelVentanaMensajeria);
        panelVentanaMensajeria.setLayout(panelVentanaMensajeriaLayout);
        panelVentanaMensajeriaLayout.setHorizontalGroup(
            panelVentanaMensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        panelVentanaMensajeriaLayout.setVerticalGroup(
            panelVentanaMensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelDatosVentanaLayout = new javax.swing.GroupLayout(panelDatosVentana);
        panelDatosVentana.setLayout(panelDatosVentanaLayout);
        panelDatosVentanaLayout.setHorizontalGroup(
            panelDatosVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosVentanaLayout.createSequentialGroup()
                .addComponent(panelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelDatosVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDatosVentanaLayout.createSequentialGroup()
                    .addComponent(panelVentanaPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelDatosVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDatosVentanaLayout.createSequentialGroup()
                    .addComponent(panelVentanaMensajeria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelDatosVentanaLayout.setVerticalGroup(
            panelDatosVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelDatosVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelVentanaPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelDatosVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelVentanaMensajeria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelVentanaLayout = new javax.swing.GroupLayout(panelVentana);
        panelVentana.setLayout(panelVentanaLayout);
        panelVentanaLayout.setHorizontalGroup(
            panelVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentanaLayout.createSequentialGroup()
                .addComponent(panelBarraIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatosVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelVentanaLayout.setVerticalGroup(
            panelVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarraIzquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDatosVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelMenuPacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuPacientesMouseEntered
        panelMenuPacientes.setBackground(new java.awt.Color(0, 102, 204));
        panelMenuPacientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_panelMenuPacientesMouseEntered

    private void panelMenuPacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuPacientesMouseExited
        panelMenuPacientes.setBackground(new java.awt.Color(0, 153, 255));
        panelMenuPacientes.setBorder(null);
    }//GEN-LAST:event_panelMenuPacientesMouseExited

    private void panelMenuMensajeriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuMensajeriaMouseEntered
        panelMenuMensajeria.setBackground(new java.awt.Color(0, 102, 204));
        panelMenuMensajeria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_panelMenuMensajeriaMouseEntered

    private void panelMenuMensajeriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuMensajeriaMouseExited
        panelMenuMensajeria.setBackground(new java.awt.Color(0, 153, 255));
        panelMenuMensajeria.setBorder(null);
    }//GEN-LAST:event_panelMenuMensajeriaMouseExited

    private void iconSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconSalirMouseClicked
    	PInfUI.abrirVentana(null, this, TipoVentana.LOGIN);
    }//GEN-LAST:event_iconSalirMouseClicked

    private void panelMenuPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuPacientesMouseClicked
        panelInicio.setVisible(false);
        panelVentanaMensajeria.setVisible(false);      
        panelVentanaPacientes.setVisible(true);
        
        
        panelVentanaPacientes.setLayout(new java.awt.BorderLayout());
        panelVentanaPacientes.removeAll();
        panelVentanaPacientes.add(new JPanelFiltro(null, this.usuario, false, true));
        panelVentanaPacientes.revalidate();        
    }//GEN-LAST:event_panelMenuPacientesMouseClicked

    private void panelMenuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuInicioMouseClicked
        panelInicio.setVisible(true);
        panelVentanaPacientes.setVisible(false);
        panelVentanaMensajeria.setVisible(false);
    }//GEN-LAST:event_panelMenuInicioMouseClicked

    private void panelMenuInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuInicioMouseEntered
        panelMenuInicio.setBackground(new java.awt.Color(0, 102, 204));
        panelMenuInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_panelMenuInicioMouseEntered

    private void panelMenuInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuInicioMouseExited
        panelMenuInicio.setBackground(new java.awt.Color(0, 153, 255));
        panelMenuInicio.setBorder(null);
    }//GEN-LAST:event_panelMenuInicioMouseExited

    private void panelMenuMensajeriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuMensajeriaMouseClicked
        panelInicio.setVisible(false);
        panelVentanaPacientes.setVisible(false);
        panelVentanaMensajeria.setVisible(true);
        
        panelVentanaMensajeria.setLayout(new java.awt.BorderLayout());
        panelVentanaMensajeria.removeAll();
        panelVentanaMensajeria.add(new JPanelMensajeria(this.usuario));
        panelVentanaMensajeria.revalidate();
        panelVentanaMensajeria.repaint();
    }//GEN-LAST:event_panelMenuMensajeriaMouseClicked

    //metodo para añadir los cambios que queramos nosotros por codigo
    private void myInitComponents(){
        panelMenuInicio.setBorder(null);
        panelMenuPacientes.setBorder(null);
        panelMenuMensajeria.setBorder(null);
        terminarHiloCorreo = false;
        
        //cambiar size de las letras 
        labelNombreUser.setText(usuario.getNombre());
        listaLabels.add(new LabelDTO(labelNombreUser,null, labelNombreUser.getFont().getSize()));
        
        listaLabels.add(new LabelDTO(labelMenuMensajeria, "menuMensajeria", labelMenuMensajeria.getFont().getSize()));
        listaLabels.add(new LabelDTO(labelMenuInicio, "tituloInicio", labelMenuInicio.getFont().getSize()));
        listaLabels.add(new LabelDTO(labelMenuPacientes, "menuRitmoCardiaco", labelMenuPacientes.getFont().getSize()));
        
        
        crearHiloCambioIconCorreo(iconCorreo);
        //Handler de salida de la ventana
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);        
        this.addWindowListener(new WindowAdapter() {
            
            @Override
            public void windowClosing(WindowEvent e) {
                int choose = JOptionPane.showConfirmDialog(null,
                        "Seguro que quiere cerrar el programa ?",
                        "Salida", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (choose == JOptionPane.YES_OPTION) {
                    System.exit(0);
                    //PInfUI.abrirVentana(null, null, TipoVentana.LOGIN);
                    System.out.println("close");
                  
                } else {
                    System.out.println("do nothing");
                }
            }
        });
    }
    
    public void cambiarFuentes(){
        for(LabelDTO label : listaLabels){
            label.getLabel().setFont(cambiarSize(label.getLabel().getFont().getStyle(), label.getSize(), PInfUI.getSizeFuente()));
        }
        
//        List<javax.swing.JButton> listaBotones = new ArrayList<javax.swing.JButton>();
//        listaBotones.add(jButton);
//        
//        for(javax.swing.JButton boton : listaBotones){
//            boton.setFont(cambiarSize(boton.getFont().getSize(), 10));
//        }
    }    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconCorreo;
    private javax.swing.JLabel iconSalir;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jWelcome;
    private javax.swing.JLabel labelMenuInicio;
    private javax.swing.JLabel labelMenuMensajeria;
    private javax.swing.JLabel labelMenuPacientes;
    private javax.swing.JLabel labelNombreUser;
    private javax.swing.JPanel panelBarraIzquierda;
    private javax.swing.JPanel panelDatosVentana;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelMenuInicio;
    private javax.swing.JPanel panelMenuMensajeria;
    private javax.swing.JPanel panelMenuPacientes;
    private javax.swing.JPanel panelOtrasVentanas;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JPanel panelVentana;
    private javax.swing.JPanel panelVentanaMensajeria;
    private javax.swing.JPanel panelVentanaPacientes;
    // End of variables declaration//GEN-END:variables
}