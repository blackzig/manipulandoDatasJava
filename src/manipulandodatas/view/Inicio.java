/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.view;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.TimeZone;
import manipulandodatas.util.Datas;

/**
 *
 * @author Michel
 */
public class Inicio extends javax.swing.JFrame {

    Datas datasServico = new Datas();

    public Inicio() {
        initComponents();
        JLZone.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBDataHojeBR = new javax.swing.JButton();
        JBHorario = new javax.swing.JButton();
        JLMensagem = new javax.swing.JLabel();
        JCBZones = new javax.swing.JComboBox<>();
        JLZone = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBDataHojeBR.setText("Data-BR");
        JBDataHojeBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDataHojeBRActionPerformed(evt);
            }
        });

        JBHorario.setText("Horário");
        JBHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBHorarioActionPerformed(evt);
            }
        });

        JLMensagem.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        JLMensagem.setForeground(new java.awt.Color(51, 51, 255));

        JCBZones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCBZonesMouseClicked(evt);
            }
        });
        JCBZones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBZonesActionPerformed(evt);
            }
        });

        JLZone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLZone.setForeground(new java.awt.Color(255, 0, 0));
        JLZone.setText("Horário");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Horário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(JLMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JCBZones, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBDataHojeBR)
                        .addGap(18, 18, 18)
                        .addComponent(JBHorario))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLZone, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBDataHojeBR)
                    .addComponent(JBHorario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JLZone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JCBZones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBDataHojeBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDataHojeBRActionPerformed
        LocalDate ld = LocalDate.now();
        String dataHoje = datasServico.soDataDeHoje(ld);
        JLMensagem.setText(dataHoje);
    }//GEN-LAST:event_JBDataHojeBRActionPerformed

    private void JBHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBHorarioActionPerformed
        LocalTime lt = LocalTime.now();
        String horario = datasServico.soHorarioDeHoje(lt);
        JLMensagem.setText(horario);
    }//GEN-LAST:event_JBHorarioActionPerformed

    private void JCBZonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCBZonesMouseClicked
        Set<String> zi = ZoneId.getAvailableZoneIds();
        zi.stream().forEach((s) -> {
            JCBZones.addItem(s);
        });
    }//GEN-LAST:event_JCBZonesMouseClicked

    private void JCBZonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBZonesActionPerformed
        String zone = JCBZones.getSelectedItem().toString();
        JLZone.setVisible(true);
        JLZone.setText(zone);
        String horario = datasServico.horarioReferenteA(zone);
        JLMensagem.setText(horario);
    }//GEN-LAST:event_JCBZonesActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBDataHojeBR;
    private javax.swing.JButton JBHorario;
    private javax.swing.JComboBox<String> JCBZones;
    private javax.swing.JLabel JLMensagem;
    private javax.swing.JLabel JLZone;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
