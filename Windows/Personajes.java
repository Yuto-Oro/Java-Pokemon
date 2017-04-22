package Windows;

import Principal.Charizard;
import Principal.Giratina;
import Principal.Pikachu;
import Principal.MegaRayquaza;
import Principal.Mewtwo;
import Principal.PrimalGroudon;
import Principal.Xerneas;
import Principal.Talonflame;
import Principal.Persona;
import Principal.Pokemon;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Personajes extends javax.swing.JFrame 
{

    static Persona personaje;
    Pokemon home;
    Pokemon rival;
    
    public Personajes()
    {
        initComponents();
        ajustarIconos();
    }
    
    private void ajustarIconos()
    {
        ImageIcon imagen;
        Icon icono; 
        //Imagenes
        imagen = new ImageIcon(getClass().getResource("/Imagenes/FondoPersonajes.jpg"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(lblFondoPersonajes.getWidth(), lblFondoPersonajes.getHeight(), Image.SCALE_DEFAULT));
        lblFondoPersonajes.setIcon(icono);
        lblPersonajesNombre.setText(personaje.nickname);
        
        //BOTONES
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Pikachu.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(pikachu.getWidth(), pikachu.getHeight(), Image.SCALE_DEFAULT));
        pikachu.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Xerneas.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(xerneas.getWidth(), xerneas.getHeight(), Image.SCALE_DEFAULT));
        xerneas.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/PrimalGroudon.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(primalgroudon.getWidth(), primalgroudon.getHeight(), Image.SCALE_DEFAULT));
        primalgroudon.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Charizard.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(charizard.getWidth(), charizard.getHeight(), Image.SCALE_DEFAULT));
        charizard.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Talonflame.jpg"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(talonflame.getWidth(), talonflame.getHeight(), Image.SCALE_DEFAULT));
        talonflame.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Mewtwo.jpg"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(mewtwo.getWidth(), mewtwo.getHeight(), Image.SCALE_DEFAULT));
        mewtwo.setIcon(icono); 
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/MegaRayquaza.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(megarayquaza.getWidth(), megarayquaza.getHeight(), Image.SCALE_DEFAULT));
        megarayquaza.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Giratina.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(giratina.getWidth(), giratina.getHeight(), Image.SCALE_DEFAULT));
        giratina.setIcon(icono);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondoPersonajes = new javax.swing.JPanel();
        pnlPersonajesSUperior = new javax.swing.JPanel();
        lblTituloBatalla = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pikachu = new javax.swing.JButton();
        xerneas = new javax.swing.JButton();
        primalgroudon = new javax.swing.JButton();
        charizard = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        talonflame = new javax.swing.JButton();
        mewtwo = new javax.swing.JButton();
        megarayquaza = new javax.swing.JButton();
        giratina = new javax.swing.JButton();
        lblPersonajesContrincante = new javax.swing.JLabel();
        lblPersonajesNombre = new javax.swing.JLabel();
        btnPelear = new javax.swing.JButton();
        lblPersonajesNombre1 = new javax.swing.JLabel();
        lblFondoPersonajes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondoPersonajes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPersonajesSUperior.setOpaque(false);

        lblTituloBatalla.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblTituloBatalla.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloBatalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloBatalla.setText("Personajes");

        javax.swing.GroupLayout pnlPersonajesSUperiorLayout = new javax.swing.GroupLayout(pnlPersonajesSUperior);
        pnlPersonajesSUperior.setLayout(pnlPersonajesSUperiorLayout);
        pnlPersonajesSUperiorLayout.setHorizontalGroup(
            pnlPersonajesSUperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPersonajesSUperiorLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(lblTituloBatalla, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        pnlPersonajesSUperiorLayout.setVerticalGroup(
            pnlPersonajesSUperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonajesSUperiorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTituloBatalla, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlFondoPersonajes.add(pnlPersonajesSUperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(2, 4, 20, 20));

        pikachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pikachu.png"))); // NOI18N
        pikachu.setBorderPainted(false);
        pikachu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pikachuMouseClicked(evt);
            }
        });
        pikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pikachuActionPerformed(evt);
            }
        });
        jPanel5.add(pikachu);

        xerneas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Xerneas.png"))); // NOI18N
        xerneas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xerneasMouseClicked(evt);
            }
        });
        xerneas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xerneasActionPerformed(evt);
            }
        });
        jPanel5.add(xerneas);

        primalgroudon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PrimalGroudon.png"))); // NOI18N
        primalgroudon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primalgroudonMouseClicked(evt);
            }
        });
        jPanel5.add(primalgroudon);

        charizard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                charizardMouseClicked(evt);
            }
        });
        jPanel5.add(charizard);

        pnlFondoPersonajes.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 190));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(2, 4, 20, 20));

        talonflame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Talonflame.jpg"))); // NOI18N
        talonflame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                talonflameMouseClicked(evt);
            }
        });
        jPanel6.add(talonflame);

        mewtwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mewtwo.jpg"))); // NOI18N
        mewtwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mewtwoMouseClicked(evt);
            }
        });
        jPanel6.add(mewtwo);

        megarayquaza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                megarayquazaMouseClicked(evt);
            }
        });
        megarayquaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                megarayquazaActionPerformed(evt);
            }
        });
        jPanel6.add(megarayquaza);

        giratina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                giratinaMouseClicked(evt);
            }
        });
        jPanel6.add(giratina);

        pnlFondoPersonajes.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 250, 190));

        lblPersonajesContrincante.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblPersonajesContrincante.setForeground(new java.awt.Color(255, 255, 255));
        lblPersonajesContrincante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlFondoPersonajes.add(lblPersonajesContrincante, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 210, 30));

        lblPersonajesNombre.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblPersonajesNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblPersonajesNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlFondoPersonajes.add(lblPersonajesNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 30));

        btnPelear.setText("PELEA!!!");
        btnPelear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelearActionPerformed(evt);
            }
        });
        pnlFondoPersonajes.add(btnPelear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 170, 50));

        lblPersonajesNombre1.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblPersonajesNombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblPersonajesNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPersonajesNombre1.setText("VS");
        pnlFondoPersonajes.add(lblPersonajesNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 100, 30));

        lblFondoPersonajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFondoPersonajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPersonajes.jpg"))); // NOI18N
        pnlFondoPersonajes.add(lblFondoPersonajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, 528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xerneasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xerneasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xerneasActionPerformed

    private void megarayquazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_megarayquazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_megarayquazaActionPerformed

    private void btnPelearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelearActionPerformed
        Batalla.ejecutar(personaje, home, rival);
        Clip sonidoHome;
        try {
            sonidoHome = AudioSystem.getClip();
            sonidoHome.stop();
        } catch (LineUnavailableException ex) {}
    }//GEN-LAST:event_btnPelearActionPerformed

    private void pikachuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pikachuActionPerformed
        
    }//GEN-LAST:event_pikachuActionPerformed

    private void pikachuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pikachuMouseClicked
        if (evt.isMetaDown())
        {
            rival = new Pikachu();
            lblPersonajesContrincante.setText(rival.nombre);
        }
        else
        {
            home = new Pikachu();
            lblPersonajesNombre.setText(home.nombre);
        }
    }//GEN-LAST:event_pikachuMouseClicked

    private void charizardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_charizardMouseClicked
        if (evt.isMetaDown())
        {
            rival = new Charizard();
            lblPersonajesContrincante.setText(rival.nombre);
        }
        else
        {
            home = new Charizard();
            lblPersonajesNombre.setText(home.nombre);
        }
    }//GEN-LAST:event_charizardMouseClicked

    private void megarayquazaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_megarayquazaMouseClicked
        if(evt.isMetaDown())
        {
            rival = new MegaRayquaza();
            lblPersonajesContrincante.setText(rival.nombre);
        }
        else
        {
            home = new MegaRayquaza();
            lblPersonajesNombre.setText(home.nombre);
        }
    }//GEN-LAST:event_megarayquazaMouseClicked

    private void giratinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giratinaMouseClicked
        if(evt.isMetaDown())
        {
            rival = new Giratina();
            lblPersonajesContrincante.setText(rival.nombre);
        }
        else
        {
            home = new Giratina();
            lblPersonajesNombre.setText(home.nombre);
        }
    }//GEN-LAST:event_giratinaMouseClicked

    private void mewtwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mewtwoMouseClicked
        if(evt.isMetaDown())
        {
            rival = new Mewtwo();
            lblPersonajesContrincante.setText(rival.nombre);
        }
        else
        {
            home = new Mewtwo();
            lblPersonajesNombre.setText(home.nombre);
        }
    }//GEN-LAST:event_mewtwoMouseClicked

    private void talonflameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_talonflameMouseClicked
         if(evt.isMetaDown())
        {
            rival = new Talonflame();
            lblPersonajesContrincante.setText(rival.nombre);
        }
        else
        {
            home = new Talonflame();
            lblPersonajesNombre.setText(home.nombre);
        }
    }//GEN-LAST:event_talonflameMouseClicked

    private void xerneasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xerneasMouseClicked
        if(evt.isMetaDown())
        {
            rival = new Xerneas();
            lblPersonajesContrincante.setText(rival.nombre);
        }
        else
        {
            home = new Xerneas();
            lblPersonajesNombre.setText(home.nombre);
        }
    }//GEN-LAST:event_xerneasMouseClicked

    private void primalgroudonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primalgroudonMouseClicked
         if(evt.isMetaDown())
        {
            rival = new PrimalGroudon();
            lblPersonajesContrincante.setText(rival.nombre);
        }
        else
        {
            home = new PrimalGroudon();
            lblPersonajesNombre.setText(home.nombre);
        }
    }//GEN-LAST:event_primalgroudonMouseClicked

    public static void ejecutar(Persona personaje2)
    {
        personaje = personaje2;
        Personajes personajes = new Personajes();
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                personajes.setVisible(true);
                personajes.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                personajes.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPelear;
    private javax.swing.JButton charizard;
    private javax.swing.JButton giratina;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblFondoPersonajes;
    private javax.swing.JLabel lblPersonajesContrincante;
    private javax.swing.JLabel lblPersonajesNombre;
    private javax.swing.JLabel lblPersonajesNombre1;
    private javax.swing.JLabel lblTituloBatalla;
    private javax.swing.JButton megarayquaza;
    private javax.swing.JButton mewtwo;
    private javax.swing.JButton pikachu;
    private javax.swing.JPanel pnlFondoPersonajes;
    private javax.swing.JPanel pnlPersonajesSUperior;
    private javax.swing.JButton primalgroudon;
    private javax.swing.JButton talonflame;
    private javax.swing.JButton xerneas;
    // End of variables declaration//GEN-END:variables
}
