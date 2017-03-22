/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD3_Feu_Tricolore;

import Outils.Feu;
import Outils.Tools;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Timer;

/**
 *
 * @author florian
 */
public class FeuBritanique extends javax.swing.JFrame {

    /**
     * Creates new form FeuFrancais
     */
    public FeuBritanique() {
        initComponents();

        //Actions sur la fenêtre
        Tools.windowsInit(this);
        this.setResizable(false);
        Tools.setIcone("./src/Icones/Icone_Feu.png", this);

        //Initialisation de la vue
        etat = Etat.Arret;
        presentationArret();
        eteindreToutLesFeu();

        //Set de la couleur des feux
        feuHaut.setCouleur_allume(Color.RED);
        feuMilieu.setCouleur_allume(Color.ORANGE);
        feuBas.setCouleur_allume(Color.GREEN);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bouttonArret = new javax.swing.JButton();
        feuHaut = new Outils.Feu();
        feuMilieu = new Outils.Feu();
        feuBas = new Outils.Feu();
        bouttonMarche = new javax.swing.JButton();
        bouttonPanne = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bouttonArret.setText("Arrêt");
        bouttonArret.setToolTipText("");
        bouttonArret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonArretActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout feuHautLayout = new javax.swing.GroupLayout(feuHaut);
        feuHaut.setLayout(feuHautLayout);
        feuHautLayout.setHorizontalGroup(
            feuHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        feuHautLayout.setVerticalGroup(
            feuHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout feuMilieuLayout = new javax.swing.GroupLayout(feuMilieu);
        feuMilieu.setLayout(feuMilieuLayout);
        feuMilieuLayout.setHorizontalGroup(
            feuMilieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        feuMilieuLayout.setVerticalGroup(
            feuMilieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout feuBasLayout = new javax.swing.GroupLayout(feuBas);
        feuBas.setLayout(feuBasLayout);
        feuBasLayout.setHorizontalGroup(
            feuBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        feuBasLayout.setVerticalGroup(
            feuBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        bouttonMarche.setText("Marche");
        bouttonMarche.setToolTipText("");
        bouttonMarche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonMarcheActionPerformed(evt);
            }
        });

        bouttonPanne.setText("Panne");
        bouttonPanne.setToolTipText("");
        bouttonPanne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonPanneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bouttonArret, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(bouttonMarche, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(bouttonPanne, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(feuHaut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feuMilieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feuBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(feuHaut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(feuMilieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(feuBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(bouttonMarche, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bouttonArret, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bouttonPanne, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    Ci dessous les actions relativesqà la matrice Etat/Evènements
    *******************************************************************************************************************************************************************************************************************************************
     */
    private void bouttonArretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonArretActionPerformed

        switch (etat) {
            case Rouge:
                etat = Etat.Arret;
                presentationArret();
                eteindreToutLesFeu();
                break;
            case Orange:
                etat = Etat.Arret;
                presentationArret();
                eteindreToutLesFeu();
                break;
            case Vert:
                etat = Etat.Arret;
                presentationArret();
                eteindreToutLesFeu();
                break;
            case OrangeAllume:
                etat = Etat.Arret;
                presentationArret();
                eteindreToutLesFeu();
                break;
            case OrangeEtteint:
                etat = Etat.Arret;
                presentationArret();
                eteindreToutLesFeu();
                break;
            case Arret:
                //Interdit
                break;
            case RougeOrange:
                etat = Etat.Arret;
                presentationArret();
                eteindreToutLesFeu();
                break;

        }

    }//GEN-LAST:event_bouttonArretActionPerformed

    private void bouttonMarcheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonMarcheActionPerformed
        switch (etat) {
            case Rouge:
                //Interdit
                break;
            case Orange:
                //Interdit
                break;
            case Vert:
                //Interdit
                break;
            case OrangeAllume:
                etat = Etat.Rouge;
                presentationRouge();
                allumeFeu(feuHaut);
                break;
            case OrangeEtteint:
                etat = Etat.Rouge;
                presentationRouge();
                allumeFeu(feuHaut);
                break;
            case Arret:
                etat = Etat.Rouge;
                presentationRouge();
                allumeFeu(feuHaut);
                break;
            case RougeOrange:
                //Interdit
                break;

        }

    }//GEN-LAST:event_bouttonMarcheActionPerformed

    private void bouttonPanneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonPanneActionPerformed
        switch (etat) {
            case Rouge:
                etat = Etat.OrangeAllume;
                presentationOrangeAllume();
                allumeFeu(feuMilieu);
                break;
            case Orange:
                etat = Etat.OrangeAllume;
                presentationOrangeAllume();
                allumeFeu(feuMilieu);
                break;
            case Vert:
                etat = Etat.OrangeAllume;
                presentationOrangeAllume();
                allumeFeu(feuMilieu);
                break;
            case OrangeAllume:
                //Interdit
                break;
            case OrangeEtteint:
                //Interdit
                break;
            case Arret:
                //Interdit
                break;
            case RougeOrange:
                etat = Etat.OrangeAllume;
                presentationOrangeAllume();
                allumeFeu(feuMilieu);
                break;

        }

    }//GEN-LAST:event_bouttonPanneActionPerformed

    private void tickTimerRouge(ActionEvent e) {
        switch (etat) {
            case Rouge:
                etat = Etat.RougeOrange;
                presentationRougeOrange();
                allumeFeu(feuHaut, feuMilieu);
                break;
            case Orange:
                //Interdit
                break;
            case Vert:
                //Interdit
                break;
            case OrangeAllume:
                //Interdit
                break;
            case OrangeEtteint:
                //Interdit
                break;
            case Arret:
                //Interdit
                break;
            case RougeOrange:
                //Interdit
                break;

        }
    }

    private void tickTimerOrange(ActionEvent e) {
        switch (etat) {
            case Rouge:
                //Interdit
                break;
            case Orange:
                etat = Etat.Rouge;
                presentationRouge();
                allumeFeu(feuHaut);
                break;
            case Vert:
                //Interdit
                break;
            case OrangeAllume:
                //Interdit
                break;
            case OrangeEtteint:
                //Interdit
                break;
            case Arret:
                //Interdit
                break;
            case RougeOrange:
                //Interdit
                break;

        }
    }

    private void tickTimerVert(ActionEvent e) {
        switch (etat) {
            case Rouge:
                //Interdit
                break;
            case Orange:
                //Interdit
                break;
            case Vert:
                etat = Etat.Orange;
                presentationOrange();
                allumeFeu(feuMilieu);
                break;
            case OrangeAllume:
                //Interdit
                break;
            case OrangeEtteint:
                //Interdit
                break;
            case Arret:
                //Interdit
                break;
            case RougeOrange:
                //Interdit
                break;

        }
    }

    private void tickTimerOrangeAllume(ActionEvent e) {
        switch (etat) {
            case Rouge:
                //Interdit
                break;
            case Orange:
                //Interdit
                break;
            case Vert:
                //Interdit
                break;
            case OrangeAllume:
                etat = Etat.OrangeEtteint;
                presentationOrangeEteint();
                eteindreToutLesFeu();
                break;
            case OrangeEtteint:
                //Interdit
                break;
            case Arret:
                //Interdit
                break;
            case RougeOrange:
                //Interdit
                break;

        }
    }

    private void tickTimerOrangeEtteint(ActionEvent e) {
        switch (etat) {
            case Rouge:
                //Interdit
                break;
            case Orange:
                //Interdit
                break;
            case Vert:
                //Interdit
                break;
            case OrangeAllume:
                //Interdit
                break;
            case OrangeEtteint:
                etat = Etat.OrangeAllume;
                presentationOrangeAllume();
                allumeFeu(feuMilieu);
                break;
            case Arret:
                //Interdit
                break;
            case RougeOrange:
                //Interdit
                break;

        }
    }

    private void tickTimerRougeOrange(ActionEvent e) {
        switch (etat) {
            case Rouge:
                //Interdit
                break;
            case Orange:
                //Interdit
                break;
            case Vert:
                //Interdit
                break;
            case OrangeAllume:
                //Interdit
                break;
            case OrangeEtteint:
                //Interdit
                break;
            case Arret:
                //Interdit
                break;
            case RougeOrange:
                etat = Etat.Vert;
                presentationVert();
                allumeFeu(feuBas);
                break;

        }
    }

    /*
    Ci dessous les  présentations coreespondantes
    *******************************************************************************************************************************************************************************************************************************************
     */
    private void presentationArret() {
        //Gestion des bouttons
        Tools.activerBoutton(bouttonMarche);
        Tools.desactiverBoutton(bouttonArret, bouttonPanne);

        //Gestion des timmers
        Tools.desactiverTimers(timer_rouge, timer_orange, timer_vert, timer_orange_allume, timer_orange_eteint, timer_rouge_orange);
    }

    private void presentationRouge() {
        //Gestion des bouttons
        Tools.activerBoutton(bouttonArret, bouttonPanne);
        Tools.desactiverBoutton(bouttonMarche);

        //Gestion des timmers
        Tools.desactiverTimers(timer_orange, timer_vert, timer_orange_allume, timer_orange_eteint, timer_rouge_orange);
        Tools.activerTimers(timer_rouge);
    }

    private void presentationVert() {
        //Gestion des bouttons
        Tools.activerBoutton(bouttonArret, bouttonPanne);
        Tools.desactiverBoutton(bouttonMarche);

        //Gestion des timmers
        Tools.desactiverTimers(timer_rouge, timer_orange, timer_orange_allume, timer_orange_eteint, timer_rouge_orange);
        Tools.activerTimers(timer_vert);
    }

    private void presentationOrange() {
        //Gestion des bouttons
        Tools.activerBoutton(bouttonArret, bouttonPanne);
        Tools.desactiverBoutton(bouttonMarche);

        //Gestion des timmers
        Tools.desactiverTimers(timer_rouge, timer_vert, timer_orange_allume, timer_orange_eteint, timer_rouge_orange);
        Tools.activerTimers(timer_orange);
    }

    private void presentationOrangeAllume() {
        //Gestion des bouttons
        Tools.activerBoutton(bouttonArret, bouttonMarche);
        Tools.desactiverBoutton(bouttonPanne);

        //Gestion des timmers
        Tools.desactiverTimers(timer_rouge, timer_vert, timer_orange, timer_orange_eteint, timer_rouge_orange);
        Tools.activerTimers(timer_orange_allume);
    }

    private void presentationOrangeEteint() {
        //Gestion des bouttons
        Tools.activerBoutton(bouttonArret, bouttonMarche);
        Tools.desactiverBoutton(bouttonPanne);

        //Gestion des timmers
        Tools.desactiverTimers(timer_rouge, timer_vert, timer_orange, timer_orange_allume, timer_rouge_orange);
        Tools.activerTimers(timer_orange_eteint);
    }

    private void presentationRougeOrange() {
        //Gestion des bouttons
        Tools.activerBoutton(bouttonArret, bouttonPanne);
        Tools.desactiverBoutton(bouttonMarche);

        //Gestion des timmers
        Tools.desactiverTimers(timer_rouge, timer_vert, timer_orange, timer_orange_allume, timer_orange_eteint);
        Tools.activerTimers(timer_rouge_orange);
    }

    /*
    Méthodes annexes
     */
    private void eteindreToutLesFeu() {
        feuHaut.eteindre();
        feuMilieu.eteindre();
        feuBas.eteindre();
    }

    private void allumeFeu(Feu... f) {
        eteindreToutLesFeu();
        for (Feu feu : f) {
            feu.allume();
        }

    }

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
            java.util.logging.Logger.getLogger(FeuBritanique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeuBritanique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeuBritanique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeuBritanique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeuBritanique().setVisible(true);
            }
        });
    }

    //Liste des états
    private enum Etat {
        Rouge, Orange, Vert, OrangeAllume, OrangeEtteint, Arret, RougeOrange
    }
    Etat etat;

    //Temps d'attents pour les timmers en ms
    private final int temps_rouge = 2000;
    private final int temps_orange = 1500;
    private final int temps_vert = 3000;
    private final int temps_orange_allume = 500;
    private final int temps_orange_etteint = 500;
    private final int temps_rouge_orange = 1000;

    //Initialisation des timmers
    private final Timer timer_rouge = new Timer(temps_rouge, this::tickTimerRouge);
    private final Timer timer_orange = new Timer(temps_orange, this::tickTimerOrange);
    private final Timer timer_vert = new Timer(temps_vert, this::tickTimerVert);
    private final Timer timer_orange_allume = new Timer(temps_orange_allume, this::tickTimerOrangeAllume);
    private final Timer timer_orange_eteint = new Timer(temps_orange_etteint, this::tickTimerOrangeEtteint);
    private final Timer timer_rouge_orange = new Timer(temps_rouge_orange, this::tickTimerRougeOrange);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bouttonArret;
    private javax.swing.JButton bouttonMarche;
    private javax.swing.JButton bouttonPanne;
    private Outils.Feu feuBas;
    private Outils.Feu feuHaut;
    private Outils.Feu feuMilieu;
    // End of variables declaration//GEN-END:variables
}
