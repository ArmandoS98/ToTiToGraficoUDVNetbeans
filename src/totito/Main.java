package totito;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Main extends javax.swing.JFrame {

    private String jugadorActial = "X";
    private String[] jugadores = new String[10];

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblGanadorX.setVisible(false);
        this.lblGanadorO.setVisible(false);
        turno();
    }

    private void turno() {
        if (jugadorActial.equalsIgnoreCase("X")) {
            jugadorActial = "O";
        } else {
            jugadorActial = "X";
        }

        lblJugadorGUI.setText("Jugador Actual: " + jugadorActial);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        talbero = new javax.swing.JPanel();
        lblGanadorO = new javax.swing.JLabel();
        lblGanadorX = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblReiniciar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblJugadorGUI = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblCounterO = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblCounterX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(48, 63, 159));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TO TI TO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 110));

        talbero.setBackground(new java.awt.Color(255, 255, 255));
        talbero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGanadorO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ganao.png"))); // NOI18N
        talbero.add(lblGanadorO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 280, -1));

        lblGanadorX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ganax.png"))); // NOI18N
        talbero.add(lblGanadorX, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, -1, -1));

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl1MousePressed(evt);
            }
        });
        talbero.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 60, 60));

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl2MousePressed(evt);
            }
        });
        talbero.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 65, 60));

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl3MousePressed(evt);
            }
        });
        talbero.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 58, 60));

        lbl4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl4MousePressed(evt);
            }
        });
        talbero.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 60, 70));

        lbl5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl5MousePressed(evt);
            }
        });
        talbero.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 65, 70));

        lbl6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl6MousePressed(evt);
            }
        });
        talbero.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 58, 70));

        lbl7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl7MousePressed(evt);
            }
        });
        talbero.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 60));

        lbl8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl8MouseReleased(evt);
            }
        });
        talbero.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 65, 60));

        lbl9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl9MousePressed(evt);
            }
        });
        talbero.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 58, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hola.png"))); // NOI18N
        talbero.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel2.add(talbero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 280, 230));

        lblReiniciar.setBackground(new java.awt.Color(48, 63, 159));
        lblReiniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblReiniciar.setText("Reiniciar");
        lblReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblReiniciarMousePressed(evt);
            }
        });
        jPanel2.add(lblReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion Partidas"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Partidas Ganadas");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Jugador Actual"));

        lblJugadorGUI.setText("X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblJugadorGUI)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJugadorGUI)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 190, 60));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("O");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        lblCounterO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCounterO.setText("0");
        jPanel5.add(lblCounterO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 33, 60));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("X");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        lblCounterX.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCounterX.setText("0");
        jPanel7.add(lblCounterX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 33, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 210, 250));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void lbl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MousePressed
        // TODO add your handling code here:
        seleccionado(lbl1);
    }//GEN-LAST:event_lbl1MousePressed

    private void lbl2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MousePressed
        // TODO add your handling code here:
        seleccionado(lbl2);
    }//GEN-LAST:event_lbl2MousePressed

    private void lbl3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MousePressed
        // TODO add your handling code here:
        seleccionado(lbl3);
    }//GEN-LAST:event_lbl3MousePressed

    private void lbl4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MousePressed
        // TODO add your handling code here:
        seleccionado(lbl4);
    }//GEN-LAST:event_lbl4MousePressed

    private void lbl5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MousePressed
        // TODO add your handling code here:
        seleccionado(lbl5);
    }//GEN-LAST:event_lbl5MousePressed

    private void lbl6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MousePressed
        // TODO add your handling code here:
        seleccionado(lbl6);
    }//GEN-LAST:event_lbl6MousePressed

    private void lbl7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MousePressed
        // TODO add your handling code here:
        seleccionado(lbl7);
    }//GEN-LAST:event_lbl7MousePressed

    private void lbl8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseReleased
        // TODO add your handling code here:
        seleccionado(lbl8);
    }//GEN-LAST:event_lbl8MouseReleased

    private void lbl9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MousePressed
        // TODO add your handling code here:
        seleccionado(lbl9);
    }//GEN-LAST:event_lbl9MousePressed

    private void lblReiniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReiniciarMousePressed
        // TODO add your handling code here:
        reinicarJuego();
    }//GEN-LAST:event_lblReiniciarMousePressed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblCounterO;
    private javax.swing.JLabel lblCounterX;
    private javax.swing.JLabel lblGanadorO;
    private javax.swing.JLabel lblGanadorX;
    private javax.swing.JLabel lblJugadorGUI;
    private javax.swing.JLabel lblReiniciar;
    private javax.swing.JPanel talbero;
    // End of variables declaration//GEN-END:variables

    private void seleccionado(JLabel btn) {
        if (btn.getText().isEmpty()) {
            btn.setText(jugadorActial);

            if (hayGanador(jugadorActial)) {
                valores();
            } else {
                if (hayEmpate()) {
                    mensaje("Empate", "Ningun Jugador Gana!.");
                }
            }

            turno();
        } else {
            JOptionPane.showMessageDialog(null, "Posicion no disponible!");
        }

    }

    private boolean hayGanador(String jugadorActial) {
        boolean retorno = false;

        //Verificacion de las X
        if (lbl1.getText().equals(jugadorActial) && lbl2.getText().equals(jugadorActial) && lbl3.getText().equals(jugadorActial)) {
            retorno = true;
        }
        if (lbl4.getText().equals(jugadorActial) && lbl5.getText().equals(jugadorActial) && lbl6.getText().equals(jugadorActial)) {
            retorno = true;
        }
        if (lbl7.getText().equals(jugadorActial) && lbl8.getText().equals(jugadorActial) && lbl9.getText().equals(jugadorActial)) {
            retorno = true;
        }
        if (lbl1.getText().equals(jugadorActial) && lbl4.getText().equals(jugadorActial) && lbl7.getText().equals(jugadorActial)) {
            retorno = true;
        }
        if (lbl2.getText().equals(jugadorActial) && lbl5.getText().equals(jugadorActial) && lbl8.getText().equals(jugadorActial)) {
            retorno = true;
        }
        if (lbl3.getText().equals(jugadorActial) && lbl6.getText().equals(jugadorActial) && lbl9.getText().equals(jugadorActial)) {
            retorno = true;
        }
        if (lbl1.getText().equals(jugadorActial) && lbl5.getText().equals(jugadorActial) && lbl9.getText().equals(jugadorActial)) {
            retorno = true;
        }
        if (lbl3.getText().equals(jugadorActial) && lbl5.getText().equals(jugadorActial) && lbl7.getText().equals(jugadorActial)) {
            retorno = true;
        }

        if (retorno) {

            if (jugadorActial.equalsIgnoreCase("X")) {
                lblGanadorX.setVisible(true);
            } else {
                lblGanadorO.setVisible(true);
            }

        } else if (jugadorActial.equals("X")) {
            retorno = hayGanador("O");
        }
        return retorno;
    }

    private void bloquearVistas(boolean bloquear) {
        System.out.println(jugadorActial);
        /*lbl1.setEnabled(bloquear);
        lbl2.setEnabled(bloquear);
        lbl3.setEnabled(bloquear);
        lbl4.setEnabled(bloquear);
        lbl5.setEnabled(bloquear);
        lbl6.setEnabled(bloquear);
        lbl7.setEnabled(bloquear);
        lbl8.setEnabled(bloquear);
        lbl9.setEnabled(bloquear);*/
    }

    private boolean hayEmpate() {
        boolean value = false;
        JLabel[] read = {lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl8};

        for (int i = 0; i < read.length; i++) {
            if (read[i].getText().isEmpty()) {
                value = false;
                break;
            } else {
                value = true;
            }
        }
        return value;
    }

    private String dato = "";

    private void reinicarJuego() {
        lbl1.setText("");
        lbl2.setText("");
        lbl3.setText("");
        lbl4.setText("");
        lbl5.setText("");
        lbl6.setText("");
        lbl7.setText("");
        lbl8.setText("");
        lbl9.setText("");

        dato += jugadorActial;
        lblGanadorX.setVisible(false);
        lblGanadorO.setVisible(false);

    }

    private void mensaje(String titulo, String contenido) {

        JOptionPane.showMessageDialog(this,
                contenido,
                titulo,
                JOptionPane.INFORMATION_MESSAGE);

        reinicarJuego();
    }

    private int contadorX = 0;
    private int contadorO = 0;

    private void valores() {
        if (jugadorActial.equalsIgnoreCase("X")) {
            contadorX += 1;
            lblCounterX.setText(String.valueOf(contadorX));
        } else {
            contadorO += 1;
            lblCounterO.setText(String.valueOf(contadorO));
        }
    }

}
