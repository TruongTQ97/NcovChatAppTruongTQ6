/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author TruongTQ6
 */
public class RoomPanel extends javax.swing.JPanel {

    /**
     * Creates new form RoomPanel
     */
    public RoomPanel() {
        initComponents();
    }

    public JLabel getLbRoom1() {
        return lbRoom1;
    }

    
    public JList<String> getOnlineList_rp() {
        return onlineList_rp;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbRoom1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        onlineList_rp = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        lbRoom1.setBackground(new java.awt.Color(51, 255, 0));
        lbRoom1.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        lbRoom1.setForeground(new java.awt.Color(0, 102, 255));
        lbRoom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRoom1.setText("Room 1");
        lbRoom1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24));
        jLabel2.setForeground(new java.awt.Color(0, 219, 0));
        jLabel2.setText("Choose room");


        onlineList_rp.setFont(new java.awt.Font("Tahoma", 0, 14));
        onlineList_rp.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        onlineList_rp.setToolTipText("double-click to send a message");
        jScrollPane1.setViewportView(onlineList_rp);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24));
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Online");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(105, 105, 105)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addComponent(jScrollPane1))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //onlineList_rp = onlineList ở RoomPanel, để phân biệt với onlineList ở ClientPanel
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRoom1;

    private javax.swing.JList<String> onlineList_rp;
    // End of variables declaration//GEN-END:variables
}
