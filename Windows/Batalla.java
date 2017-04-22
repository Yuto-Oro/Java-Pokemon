package Windows;

import Principal.Persona;
import Principal.Pokemon;
import static Windows.Personajes.personaje;
import java.awt.Image;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Batalla extends javax.swing.JFrame 
{
    Pokemon home;
    Pokemon rival;
    
    public Batalla(Persona personaje, Pokemon home2, Pokemon rival2)
    {
        initComponents();
        home = home2;
        rival = rival2;
        lblPokemonHome.setText(home.nombre);
        
        normalHome.setEnabled(false);
        especialHome.setEnabled(false);
        usarHpHome.setEnabled(false);
        usarMpHome.setEnabled(false);
        TerminarHome.setEnabled(false);
        
        normalRival.setEnabled(false);
        especialRival.setEnabled(false);
        usarMpRival.setEnabled(false);
        usarHpRival.setEnabled(false);
        TerminarRival.setEnabled(false);
        
        ImageIcon imagen;
        Icon icono; 
        
        //Imagenes
        imagen = new ImageIcon(getClass().getResource("/Imagenes/CampoBatallaOscuro.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(lblBatallaCampo.getWidth(), lblBatallaCampo.getHeight(), Image.SCALE_DEFAULT));
        lblBatallaCampo.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/" + home.nombre + ".png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(lblBatallaPokemonHome.getWidth(), lblBatallaPokemonHome.getHeight(), Image.SCALE_DEFAULT));
        lblBatallaPokemonHome.setIcon(icono);
        lblBatallaHome.setText(home.nombre);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/" + rival.nombre + ".png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(lblBatallaPokemonRival.getWidth(), lblBatallaPokemonRival.getHeight(), Image.SCALE_DEFAULT));
        lblBatallaPokemonRival.setIcon(icono);
        lblBatallaRival.setText(rival.nombre);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Corazon.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(lblCorazonHome.getWidth(), lblCorazonHome.getHeight(), Image.SCALE_DEFAULT));
        lblCorazonHome.setIcon(icono);  
        lblCorazonRival.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Energia.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(lblEnergiaHome.getWidth(), lblEnergiaHome.getHeight(), Image.SCALE_DEFAULT));
        lblEnergiaHome.setIcon(icono);
        lblEnergiaRival.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/PocionRoja.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(lblHPotHome.getWidth(), lblHPotHome.getHeight(), Image.SCALE_DEFAULT));
        lblHPotHome.setIcon(icono);
        lblHPotRival.setIcon(icono);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/PocionAmarilla.png"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(lblMPotHome.getWidth(), lblMPotHome.getHeight(), Image.SCALE_DEFAULT));
        lblMPotHome.setIcon(icono);
        lblMPotRival.setIcon(icono);
        
        lblHPHome.setText(Integer.toString(home.vida));
        lblHPRival.setText(Integer.toString(rival.vida));
        
        lblMpHome.setText(Integer.toString(home.energia));
        lblMpRival.setText(Integer.toString(rival.energia));
        
        lblHpPotionHome .setText(Integer.toString(home.hPotions));
        lblHpPotionRival.setText(Integer.toString(rival.hPotions));
        
        lblMpPotionHome .setText(Integer.toString(home.mPotions));
        lblMpPotionRival.setText(Integer.toString(rival.mPotions));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPokemonHome = new javax.swing.JLabel();
        pnlBatalla = new javax.swing.JPanel();
        pnlBatallaSuperior = new javax.swing.JPanel();
        lblBatallaPokemonRival = new javax.swing.JLabel();
        lblBatallaRival = new javax.swing.JLabel();
        lblEnergiaRival = new javax.swing.JLabel();
        lblHPotRival = new javax.swing.JLabel();
        lblCorazonRival = new javax.swing.JLabel();
        lblMPotRival = new javax.swing.JLabel();
        lblMpPotionRival = new javax.swing.JLabel();
        lblHpPotionRival = new javax.swing.JLabel();
        lblHPRival = new javax.swing.JLabel();
        lblMpRival = new javax.swing.JLabel();
        turno = new javax.swing.JLabel();
        IniciarRival = new javax.swing.JButton();
        TerminarRival = new javax.swing.JButton();
        usarHpRival = new javax.swing.JButton();
        usarMpRival = new javax.swing.JButton();
        normalRival = new javax.swing.JButton();
        especialRival = new javax.swing.JButton();
        ataqueActual = new javax.swing.JLabel();
        pnlBatallaInferior = new javax.swing.JPanel();
        lblBatallaPokemonHome = new javax.swing.JLabel();
        lblEnergiaHome = new javax.swing.JLabel();
        lblCorazonHome = new javax.swing.JLabel();
        lblMPotHome = new javax.swing.JLabel();
        lblHPotHome = new javax.swing.JLabel();
        lblBatallaHome = new javax.swing.JLabel();
        lblMpHome = new javax.swing.JLabel();
        lblHPHome = new javax.swing.JLabel();
        lblHpPotionHome = new javax.swing.JLabel();
        lblMpPotionHome = new javax.swing.JLabel();
        TerminarHome = new javax.swing.JButton();
        IniciarHome = new javax.swing.JButton();
        especialHome = new javax.swing.JButton();
        usarHpHome = new javax.swing.JButton();
        usarMpHome = new javax.swing.JButton();
        normalHome = new javax.swing.JButton();
        lblBatallaCampo = new javax.swing.JLabel();

        lblPokemonHome.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBatalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBatallaSuperior.setOpaque(false);

        lblBatallaRival.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        lblBatallaRival.setForeground(new java.awt.Color(255, 255, 255));
        lblBatallaRival.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBatallaRival.setText("Rival");

        lblEnergiaRival.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnergiaRival.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Energia.png"))); // NOI18N

        lblCorazonRival.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorazonRival.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/corazon.png"))); // NOI18N

        lblMpPotionRival.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblMpPotionRival.setForeground(new java.awt.Color(255, 255, 255));

        lblHpPotionRival.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblHpPotionRival.setForeground(new java.awt.Color(255, 255, 255));

        lblHPRival.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblHPRival.setForeground(new java.awt.Color(255, 255, 255));

        lblMpRival.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblMpRival.setForeground(new java.awt.Color(255, 255, 255));

        turno.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        turno.setForeground(new java.awt.Color(255, 255, 255));
        turno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turno.setText("Turno de: ");

        IniciarRival.setText("Iniciar");
        IniciarRival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarRivalActionPerformed(evt);
            }
        });

        TerminarRival.setText("Terminar turno");
        TerminarRival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarRivalActionPerformed(evt);
            }
        });

        usarHpRival.setText("Usar HP");
        usarHpRival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usarHpRivalActionPerformed(evt);
            }
        });

        usarMpRival.setText("Usar MP");
        usarMpRival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usarMpRivalActionPerformed(evt);
            }
        });

        normalRival.setText("Ataque Normal");
        normalRival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalRivalActionPerformed(evt);
            }
        });

        especialRival.setText("Ataque Especial");
        especialRival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialRivalActionPerformed(evt);
            }
        });

        ataqueActual.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        ataqueActual.setForeground(new java.awt.Color(255, 255, 255));
        ataqueActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlBatallaSuperiorLayout = new javax.swing.GroupLayout(pnlBatallaSuperior);
        pnlBatallaSuperior.setLayout(pnlBatallaSuperiorLayout);
        pnlBatallaSuperiorLayout.setHorizontalGroup(
            pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBatallaSuperiorLayout.createSequentialGroup()
                .addGroup(pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBatallaSuperiorLayout.createSequentialGroup()
                        .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlBatallaSuperiorLayout.createSequentialGroup()
                        .addGroup(pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBatallaSuperiorLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(especialRival, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usarHpRival, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usarMpRival, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(normalRival, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlBatallaSuperiorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ataqueActual, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TerminarRival, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IniciarRival, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGroup(pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHPRival, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(lblMpRival, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHpPotionRival, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMpPotionRival, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorazonRival, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMPotRival, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnergiaRival, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHPotRival, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBatallaRival, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBatallaPokemonRival, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlBatallaSuperiorLayout.setVerticalGroup(
            pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBatallaSuperiorLayout.createSequentialGroup()
                .addGroup(pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBatallaSuperiorLayout.createSequentialGroup()
                        .addComponent(lblBatallaPokemonRival, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(lblBatallaRival))
                    .addGroup(pnlBatallaSuperiorLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHPRival, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCorazonRival, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnergiaRival, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMpRival, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHPotRival, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHpPotionRival, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMpPotionRival, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMPotRival, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlBatallaSuperiorLayout.createSequentialGroup()
                .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBatallaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBatallaSuperiorLayout.createSequentialGroup()
                        .addComponent(IniciarRival, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TerminarRival, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(109, Short.MAX_VALUE))
                    .addGroup(pnlBatallaSuperiorLayout.createSequentialGroup()
                        .addComponent(ataqueActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(normalRival)
                        .addGap(18, 18, 18)
                        .addComponent(especialRival)
                        .addGap(18, 18, 18)
                        .addComponent(usarHpRival)
                        .addGap(18, 18, 18)
                        .addComponent(usarMpRival)
                        .addGap(19, 19, 19))))
        );

        pnlBatalla.add(pnlBatallaSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 250));

        pnlBatallaInferior.setOpaque(false);

        lblEnergiaHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnergiaHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Energia.png"))); // NOI18N

        lblCorazonHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorazonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/corazon.png"))); // NOI18N

        lblBatallaHome.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        lblBatallaHome.setForeground(new java.awt.Color(255, 255, 255));
        lblBatallaHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBatallaHome.setText("Home");

        lblMpHome.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblMpHome.setForeground(new java.awt.Color(255, 255, 255));

        lblHPHome.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblHPHome.setForeground(new java.awt.Color(255, 255, 255));

        lblHpPotionHome.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblHpPotionHome.setForeground(new java.awt.Color(255, 255, 255));

        lblMpPotionHome.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblMpPotionHome.setForeground(new java.awt.Color(255, 255, 255));

        TerminarHome.setText("Terminar turno");
        TerminarHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarHomeActionPerformed(evt);
            }
        });

        IniciarHome.setText("Iniciar");
        IniciarHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarHomeActionPerformed(evt);
            }
        });

        especialHome.setText("Ataque Especial");
        especialHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialHomeActionPerformed(evt);
            }
        });

        usarHpHome.setText("Usar HP");
        usarHpHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usarHpHomeActionPerformed(evt);
            }
        });

        usarMpHome.setText("Usar MP");
        usarMpHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usarMpHomeActionPerformed(evt);
            }
        });

        normalHome.setText("Ataque Normal");
        normalHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBatallaInferiorLayout = new javax.swing.GroupLayout(pnlBatallaInferior);
        pnlBatallaInferior.setLayout(pnlBatallaInferiorLayout);
        pnlBatallaInferiorLayout.setHorizontalGroup(
            pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBatallaInferiorLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBatallaInferiorLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(lblBatallaHome, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBatallaInferiorLayout.createSequentialGroup()
                        .addComponent(lblBatallaPokemonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlBatallaInferiorLayout.createSequentialGroup()
                        .addComponent(lblCorazonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblHPHome, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBatallaInferiorLayout.createSequentialGroup()
                        .addGroup(pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHPotHome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMPotHome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHpPotionHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMpPotionHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlBatallaInferiorLayout.createSequentialGroup()
                        .addComponent(lblEnergiaHome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMpHome, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TerminarHome, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IniciarHome, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(especialHome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usarHpHome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usarMpHome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(normalHome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        pnlBatallaInferiorLayout.setVerticalGroup(
            pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBatallaInferiorLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlBatallaInferiorLayout.createSequentialGroup()
                        .addComponent(lblBatallaHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBatallaPokemonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBatallaInferiorLayout.createSequentialGroup()
                            .addGroup(pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlBatallaInferiorLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(IniciarHome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(TerminarHome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBatallaInferiorLayout.createSequentialGroup()
                                    .addGroup(pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblCorazonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblHPHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(20, 20, 20)
                                    .addGroup(pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEnergiaHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMpHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblHPotHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblHpPotionHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(13, 13, 13)
                            .addGroup(pnlBatallaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMPotHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMpPotionHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBatallaInferiorLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(normalHome)
                            .addGap(18, 18, 18)
                            .addComponent(especialHome)
                            .addGap(18, 18, 18)
                            .addComponent(usarHpHome)
                            .addGap(18, 18, 18)
                            .addComponent(usarMpHome))))
                .addGap(26, 26, 26))
        );

        pnlBatalla.add(pnlBatallaInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 990, 270));

        lblBatallaCampo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBatallaCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CampoBatallaOscuro.png"))); // NOI18N
        pnlBatalla.add(lblBatallaCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 510));

        getContentPane().add(pnlBatalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TerminarHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarHomeActionPerformed
        activaRival(true);
        activaHome(false);
        turno.setText("Turno de " + rival.nombre);
    }//GEN-LAST:event_TerminarHomeActionPerformed

    private void IniciarHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarHomeActionPerformed
        IniciarRival.setVisible(false);
        activaHome(true);
        activaRival(false);
        IniciarHome.setVisible(false);
        turno.setText("Turno de " + home.nombre);
    }//GEN-LAST:event_IniciarHomeActionPerformed

    private void IniciarRivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarRivalActionPerformed
        IniciarHome.setVisible(false);
        activaRival(true);
        activaHome(false);
        IniciarRival.setVisible(false);
        turno.setText("Turno de " + rival.nombre);
        
    }//GEN-LAST:event_IniciarRivalActionPerformed

    private void TerminarRivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarRivalActionPerformed
        activaHome(true);
        activaRival(false);
        turno.setText("Turno de " + home.nombre);
    }//GEN-LAST:event_TerminarRivalActionPerformed

    private void usarMpHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usarMpHomeActionPerformed
        usarMpHome.setEnabled(false);        
        //Para las pociones
        int pociones = Integer.parseInt(lblMpPotionHome.getText());
        if (pociones >= 1)
        {
            int energiaActual = Integer.parseInt(lblMpHome.getText());
            energiaActual += home.usarMP();
            lblMpHome.setText(Integer.toString(energiaActual));
            pociones --;
            lblMpPotionHome.setText(Integer.toString(pociones));
        }
        else
        {
        lblMpPotionHome.setText(Integer.toString(pociones));
        JOptionPane.showMessageDialog(null, "Ya no tienes pociones de energia!!");
        }
    }//GEN-LAST:event_usarMpHomeActionPerformed

    private void usarMpRivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usarMpRivalActionPerformed
        usarMpRival.setEnabled(false);
        //Para las pociones
        int pociones = Integer.parseInt(lblMpPotionRival.getText());
        if (pociones >= 1)
        {
            int energiaActual = Integer.parseInt(lblMpRival.getText());
            energiaActual += rival.usarMP();
            lblMpRival.setText(Integer.toString(energiaActual));
            pociones --;
            lblMpPotionRival.setText(Integer.toString(pociones));
        }
        else
        {
        lblMpPotionRival.setText(Integer.toString(pociones));
        JOptionPane.showMessageDialog(null, "Ya no tienes pociones de energia!!");
        }
    }//GEN-LAST:event_usarMpRivalActionPerformed

    private void normalHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalHomeActionPerformed
        normalHome.setEnabled(false);
        especialHome.setEnabled(false);
        ataqueActual.setText(home.nombre + " usó " + home.normalAtack);
        int vidaRival = Integer.parseInt(lblHPRival.getText());
        if (vidaRival <= 0)
        {
            JOptionPane.showMessageDialog(null, home.nombre + " ha ganado la batalla!!");
            lblHPRival.setText("0");
            personaje.batallasGanadas++;
            personaje.experiencia += 200;
            Perfil.ejecutar(2,personaje);
        }
        else
        {
        vidaRival -= home.ataqueNormal();
        lblHPRival.setText(Integer.toString(vidaRival));
        }
    }//GEN-LAST:event_normalHomeActionPerformed

    private void normalRivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalRivalActionPerformed
        normalRival.setEnabled(false);
        especialRival.setEnabled(false);
        ataqueActual.setText(rival.nombre + " usó " + rival.normalAtack);
        int vidaHome = Integer.parseInt(lblHPHome.getText());
        if (vidaHome <= 0)
        {
            JOptionPane.showMessageDialog(null, rival.nombre + " ha ganado la batalla!!");
            lblHPRival.setText("0");
            personaje.batallasPerdidas++;
            personaje.experiencia += 100;
            Perfil.ejecutar(2,personaje);
        }
        else
        {
        vidaHome -= rival.ataqueNormal();
        lblHPHome.setText(Integer.toString(vidaHome));
        }
    }//GEN-LAST:event_normalRivalActionPerformed

    private void especialHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialHomeActionPerformed
        normalHome.setEnabled(false);
        especialHome.setEnabled(false);
        ataqueActual.setText(home.nombre + " usó " + home.especialAtack);
        int vidaRival = Integer.parseInt(lblHPRival.getText());
        if (vidaRival <= 0)
        {
            JOptionPane.showMessageDialog(null, home.nombre + " ha ganado la batalla!!");
            lblHPRival.setText("0");
            personaje.batallasGanadas++;
            personaje.experiencia += 200;
            Perfil.ejecutar(2,personaje);
        }
        else
        {
        vidaRival -= home.ataqueEspecial();
        lblHPRival.setText(Integer.toString(vidaRival));
        }
    }//GEN-LAST:event_especialHomeActionPerformed

    private void especialRivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialRivalActionPerformed
        normalRival.setEnabled(false);
        especialRival.setEnabled(false);
        ataqueActual.setText(rival.nombre + " usó " + rival.especialAtack);
        int vidaHome = Integer.parseInt(lblHPHome.getText());
        if (vidaHome <= 0)
        {
            JOptionPane.showMessageDialog(null, rival.nombre + " ha ganado la batalla!!");
            lblHPRival.setText("0");
            personaje.batallasPerdidas++;
            personaje.experiencia -= 100;
            Perfil.ejecutar(2,personaje);
        }
        else
        {
        vidaHome -= rival.ataqueEspecial();
        lblHPHome.setText(Integer.toString(vidaHome));
        }
    }//GEN-LAST:event_especialRivalActionPerformed

    private void usarHpHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usarHpHomeActionPerformed
        usarHpHome.setEnabled(false);
        //Para las pociones
        int pociones = Integer.parseInt(lblHpPotionHome.getText());
        if (pociones >= 1)
        {
            int vidaActual = Integer.parseInt(lblHPHome.getText());
            vidaActual += rival.usarHP();
            lblHPHome.setText(Integer.toString(vidaActual));
            pociones --;
            lblHpPotionHome.setText(Integer.toString(pociones));
        }
        else
        {
        lblHpPotionHome.setText(Integer.toString(pociones));
        JOptionPane.showMessageDialog(null, "Ya no tienes pociones de vida!!");
        }
    }//GEN-LAST:event_usarHpHomeActionPerformed

    private void usarHpRivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usarHpRivalActionPerformed
        usarHpRival.setEnabled(false);
        //Para las pociones
        int pociones = Integer.parseInt(lblHpPotionRival.getText());
        if (pociones >= 1)
        {
            int vidaActual = Integer.parseInt(lblHPRival.getText());
            vidaActual += rival.usarHP();
            lblHPRival.setText(Integer.toString(vidaActual));
            pociones --;
            lblHpPotionRival.setText(Integer.toString(pociones));
        }
        else
        {
        lblHpPotionRival.setText(Integer.toString(pociones));
        JOptionPane.showMessageDialog(null, "Ya no tienes pociones de vida!!");
        }
    }//GEN-LAST:event_usarHpRivalActionPerformed

    public void activaRival(Boolean opcion)
    {
    TerminarRival.setEnabled(opcion);
    normalRival.setEnabled(opcion);
    especialRival.setEnabled(opcion);
    usarHpRival.setEnabled(opcion);
    usarMpRival.setEnabled(opcion);
    }
    
    public void activaHome(Boolean opcion)
    {
        TerminarHome.setEnabled(opcion);
        normalHome.setEnabled(opcion);
        especialHome.setEnabled(opcion);
        usarHpHome.setEnabled(opcion);
        usarMpHome.setEnabled(opcion);
    }
    
    public static void ejecutar(Persona personaje, Pokemon home, Pokemon rival)
    {
        Batalla batalla = new Batalla(personaje, home, rival);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                batalla.setVisible(true);
                batalla.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                batalla.setLocationRelativeTo(null);
                try 
                {
                // Se obtiene un Clip de sonido
                Clip sonido = AudioSystem.getClip();
                // Se carga con un fichero wav
                sonido.open(AudioSystem.getAudioInputStream(new File("./PokeBattle.wav")));
                // Comienza la reproducción
                sonido.start();
                } catch (Exception e) 
                {
                    System.out.println("" + e);
                }
                ///
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IniciarHome;
    private javax.swing.JButton IniciarRival;
    private javax.swing.JButton TerminarHome;
    private javax.swing.JButton TerminarRival;
    private javax.swing.JLabel ataqueActual;
    private javax.swing.JButton especialHome;
    private javax.swing.JButton especialRival;
    private javax.swing.JLabel lblBatallaCampo;
    private javax.swing.JLabel lblBatallaHome;
    private javax.swing.JLabel lblBatallaPokemonHome;
    private javax.swing.JLabel lblBatallaPokemonRival;
    private javax.swing.JLabel lblBatallaRival;
    private javax.swing.JLabel lblCorazonHome;
    private javax.swing.JLabel lblCorazonRival;
    private javax.swing.JLabel lblEnergiaHome;
    private javax.swing.JLabel lblEnergiaRival;
    private javax.swing.JLabel lblHPHome;
    private javax.swing.JLabel lblHPRival;
    private javax.swing.JLabel lblHPotHome;
    private javax.swing.JLabel lblHPotRival;
    private javax.swing.JLabel lblHpPotionHome;
    private javax.swing.JLabel lblHpPotionRival;
    private javax.swing.JLabel lblMPotHome;
    private javax.swing.JLabel lblMPotRival;
    private javax.swing.JLabel lblMpHome;
    private javax.swing.JLabel lblMpPotionHome;
    private javax.swing.JLabel lblMpPotionRival;
    private javax.swing.JLabel lblMpRival;
    private javax.swing.JLabel lblPokemonHome;
    private javax.swing.JButton normalHome;
    private javax.swing.JButton normalRival;
    private javax.swing.JPanel pnlBatalla;
    private javax.swing.JPanel pnlBatallaInferior;
    private javax.swing.JPanel pnlBatallaSuperior;
    private javax.swing.JLabel turno;
    private javax.swing.JButton usarHpHome;
    private javax.swing.JButton usarHpRival;
    private javax.swing.JButton usarMpHome;
    private javax.swing.JButton usarMpRival;
    // End of variables declaration//GEN-END:variables
}
