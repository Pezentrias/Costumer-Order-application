/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Frame;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.Rendeles;
import model.Szemely;

/**
 *
 * @author user
 */
public class MegrendelesAdatokDialog extends javax.swing.JDialog {

   private boolean mentes;
   private Rendeles megrendeles;
   private Frame parent;
   
    public MegrendelesAdatokDialog(java.awt.Frame parent, List<Szemely> szemelyek, Szemely kivalasztott) {
        super(parent, true);
        initComponents();
        setTitle("Adding New Order");
        setLocationRelativeTo(parent);
        mentes=false;
       /* for (Szemely sz : szemelyek) {
            cbMegrendelo.addItem(sz);
        }*/
       cbMegrendelo.setModel(new  DefaultComboBoxModel(szemelyek.toArray()));
                     cbMegrendelo.setSelectedItem(kivalasztott);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfAr = new javax.swing.JTextField();
        tfMennyiseg = new javax.swing.JTextField();
        cbMegrendelo = new javax.swing.JComboBox();
        checkTeljesitve = new javax.swing.JCheckBox();
        btMegsem = new javax.swing.JButton();
        btMentes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Price:");

        jLabel2.setText("Quantity:");

        jLabel3.setText("Completed:");

        jLabel4.setText("Costumer:");

        btMegsem.setText("Cancel");
        btMegsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMegsemActionPerformed(evt);
            }
        });

        btMentes.setText("Save");
        btMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(tfMennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfAr, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMegrendelo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btMentes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btMegsem)
                                .addGap(59, 59, 59))
                            .addComponent(checkTeljesitve))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btMegsem, btMentes});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbMegrendelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfMennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(checkTeljesitve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMentes)
                    .addComponent(btMegsem))
                .addGap(25, 25, 25))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btMegsem, btMentes});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMegsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMegsemActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btMegsemActionPerformed

    private void btMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMentesActionPerformed
     Szemely m= (Szemely)cbMegrendelo.getSelectedItem();
     try{
        megrendeles= new Rendeles( m.getId(), Integer.parseInt(tfAr.getText()), Integer.parseInt(tfMennyiseg.getText()),
                checkTeljesitve.isSelected() );
          mentes=true;
        setVisible(false);
     }catch(NumberFormatException ex){
         MainWindow.HibaAblak(parent, "For Price and Quantity only add numbers!");
     }
   
    }//GEN-LAST:event_btMentesActionPerformed

    /**
     * @param args the command line arguments
     */

    public boolean isMentes() {
        return mentes;
    }

    /**
     * @param args the command line arguments
     */
    public Rendeles getMegrendeles() {
        return megrendeles;
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMegsem;
    private javax.swing.JButton btMentes;
    private javax.swing.JComboBox cbMegrendelo;
    private javax.swing.JCheckBox checkTeljesitve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfAr;
    private javax.swing.JTextField tfMennyiseg;
    // End of variables declaration//GEN-END:variables
}
