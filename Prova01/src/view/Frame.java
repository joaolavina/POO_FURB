/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Estadia;

/**
 *
 * @author jg_la
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
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

        lb_horaEntrada = new javax.swing.JLabel();
        lb_horaSaida = new javax.swing.JLabel();
        tf_horaEntrada = new javax.swing.JTextField();
        tf_horaSaida = new javax.swing.JTextField();
        cb_finalSemana = new javax.swing.JCheckBox();
        btn_calcularValor = new javax.swing.JButton();
        lb_horas = new javax.swing.JLabel();
        lb_valorEstadia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_horaEntrada.setText("Hora de Entrada:");

        lb_horaSaida.setText("Hora de Saída:");

        tf_horaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_horaEntradaActionPerformed(evt);
            }
        });

        cb_finalSemana.setText("Fim de Semana");
        cb_finalSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_finalSemanaActionPerformed(evt);
            }
        });

        btn_calcularValor.setText("Calcular valor da estadia");
        btn_calcularValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularValorEstadia(evt);
            }
        });

        lb_horas.setText("Quantidade de horas estacionadas:");

        lb_valorEstadia.setText("O valor da estadia é de R$ 0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lb_horaEntrada)
                                    .addGap(40, 40, 40)
                                    .addComponent(tf_horaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lb_horaSaida)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_horaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cb_finalSemana)
                            .addComponent(lb_horas, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_valorEstadia, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btn_calcularValor)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_horaEntrada)
                    .addComponent(tf_horaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_horaSaida)
                    .addComponent(tf_horaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(cb_finalSemana)
                .addGap(36, 36, 36)
                .addComponent(btn_calcularValor)
                .addGap(47, 47, 47)
                .addComponent(lb_horas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_valorEstadia)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_horaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_horaEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_horaEntradaActionPerformed

    private void cb_finalSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_finalSemanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_finalSemanaActionPerformed

    private void calcularValorEstadia(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularValorEstadia
        boolean fimSemana = false;
        if(cb_finalSemana.isSelected()){
            fimSemana = true;
        }
        
        Estadia estadia = new Estadia(Integer.parseInt(tf_horaEntrada.getText()), Integer.parseInt(tf_horaSaida.getText()), fimSemana);
        lb_horas.setText("Quantidade de horas estacionadas: " + estadia.calcularTempoEstadia());
        lb_valorEstadia.setText("O valor da estadia é de R$" + estadia.calcularValorPago());
    }//GEN-LAST:event_calcularValorEstadia

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcularValor;
    private javax.swing.JCheckBox cb_finalSemana;
    private javax.swing.JLabel lb_horaEntrada;
    private javax.swing.JLabel lb_horaSaida;
    private javax.swing.JLabel lb_horas;
    private javax.swing.JLabel lb_valorEstadia;
    private javax.swing.JTextField tf_horaEntrada;
    private javax.swing.JTextField tf_horaSaida;
    // End of variables declaration//GEN-END:variables
}
