package com.ses.auto_mitm_proxy.ui;

import model.CommandExec;
import viewmodel.UiConfig;

public class UI1 extends javax.swing.JFrame {
    
    UiConfig conf = new UiConfig();

    public UI1() {
        initComponents();
        
        CommandExec exec = new CommandExec(root_pass_textfield.getText(), "python3 resources/py/network_info.py");
        
        exec.setDataListener((String output) -> {
            String[] outputArray = output.split(",");
            gateway_ip_address_textfield.setText(outputArray[0]);
            local_ip_address_textfield.setText(outputArray[1]);
            subnet_mask_textfield.setText(outputArray[2]);
            network_interface_textfield.setText(outputArray[3]);
        });
        
        exec.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        enable_url_1_checkbox = new javax.swing.JCheckBox();
        enable_url_1_textfield = new javax.swing.JTextField();
        enable_url_2_textfield = new javax.swing.JTextField();
        enable_url_2_checkbox = new javax.swing.JCheckBox();
        enable_url_3_textfield = new javax.swing.JTextField();
        enable_url_3_checkbox = new javax.swing.JCheckBox();
        enable_url_4_textfield = new javax.swing.JTextField();
        enable_url_4_checkbox = new javax.swing.JCheckBox();
        enable_url_5_textfield = new javax.swing.JTextField();
        enable_url_5_checkbox = new javax.swing.JCheckBox();
        enable_url_6_textfield = new javax.swing.JTextField();
        enable_url_6_checkbox = new javax.swing.JCheckBox();
        root_pass_checkbox = new javax.swing.JCheckBox();
        root_pass_textfield = new javax.swing.JPasswordField();
        start_stop_attack_button = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        ip_address_range_textfield = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        local_ip_address_textfield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        gateway_ip_address_textfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        network_interface_textfield = new javax.swing.JTextField();
        number_of_packages_textfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        subnet_mask_textfield = new javax.swing.JTextField();
        refresh_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scan_ip_address_textarea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enable_url_1_checkbox.setText("Enable URL 1");
        enable_url_1_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enable_url_1_checkboxActionPerformed(evt);
            }
        });

        enable_url_1_textfield.setEnabled(false);

        enable_url_2_textfield.setEnabled(false);

        enable_url_2_checkbox.setText("Enable URL 2");
        enable_url_2_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enable_url_2_checkboxActionPerformed(evt);
            }
        });

        enable_url_3_textfield.setEnabled(false);

        enable_url_3_checkbox.setText("Enable URL 3");
        enable_url_3_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enable_url_3_checkboxActionPerformed(evt);
            }
        });

        enable_url_4_textfield.setEnabled(false);

        enable_url_4_checkbox.setText("Enable URL 4");
        enable_url_4_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enable_url_4_checkboxActionPerformed(evt);
            }
        });

        enable_url_5_textfield.setEnabled(false);

        enable_url_5_checkbox.setText("Enable URL 5");
        enable_url_5_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enable_url_5_checkboxActionPerformed(evt);
            }
        });

        enable_url_6_textfield.setEnabled(false);

        enable_url_6_checkbox.setText("Enable URL 6");
        enable_url_6_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enable_url_6_checkboxActionPerformed(evt);
            }
        });

        root_pass_checkbox.setText("Run with root");
        root_pass_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                root_pass_checkboxActionPerformed(evt);
            }
        });

        root_pass_textfield.setEnabled(false);

        start_stop_attack_button.setText("Start attack");
        start_stop_attack_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_stop_attack_buttonActionPerformed(evt);
            }
        });

        jLabel1.setText("IP address range");

        jLabel7.setText("Local ip address");

        jLabel8.setText("Gateway ip address");

        jLabel3.setText("Network interface");

        jLabel4.setText("Number of packages");

        number_of_packages_textfield.setText("10");

        jButton1.setText("Scan IP address");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Subnetnet mask");

        refresh_button.setText("Refresh");
        refresh_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gateway_ip_address_textfield))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(local_ip_address_textfield))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(number_of_packages_textfield))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(network_interface_textfield))
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subnet_mask_textfield))
            .addComponent(refresh_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(local_ip_address_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(gateway_ip_address_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(network_interface_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(subnet_mask_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(number_of_packages_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refresh_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        scan_ip_address_textarea.setColumns(20);
        scan_ip_address_textarea.setRows(5);
        scan_ip_address_textarea.setText("Scan IP address output");
        scan_ip_address_textarea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(scan_ip_address_textarea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ip_address_range_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(root_pass_checkbox))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(root_pass_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(start_stop_attack_button))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enable_url_4_checkbox)
                            .addComponent(enable_url_5_checkbox)
                            .addComponent(enable_url_3_checkbox)
                            .addComponent(enable_url_2_checkbox)
                            .addComponent(enable_url_1_checkbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enable_url_4_textfield, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enable_url_3_textfield)
                            .addComponent(enable_url_2_textfield)
                            .addComponent(enable_url_5_textfield)
                            .addComponent(enable_url_1_textfield)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(enable_url_6_checkbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enable_url_6_textfield)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enable_url_1_checkbox)
                    .addComponent(enable_url_1_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enable_url_2_checkbox)
                    .addComponent(enable_url_2_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enable_url_3_checkbox)
                    .addComponent(enable_url_3_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enable_url_4_checkbox)
                    .addComponent(enable_url_4_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enable_url_5_checkbox)
                    .addComponent(enable_url_5_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enable_url_6_checkbox)
                    .addComponent(enable_url_6_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(root_pass_checkbox)
                    .addComponent(root_pass_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start_stop_attack_button)
                    .addComponent(jLabel1)
                    .addComponent(ip_address_range_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Attack", jPanel1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Packet Listener", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void root_pass_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_root_pass_checkboxActionPerformed
        conf.rootPassConf(root_pass_checkbox, root_pass_textfield);
    }//GEN-LAST:event_root_pass_checkboxActionPerformed

    private void start_stop_attack_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_stop_attack_buttonActionPerformed
        
        CommandExec exec = new CommandExec(root_pass_textfield.getText(), "python3 resources/py/mitm.py -t 10.140.63.50 -r 10.140.63.1");
        
        if(start_stop_attack_button.isSelected()){
            root_pass_checkbox.setEnabled(false);
            root_pass_textfield.setEnabled(false);
            exec.start();
        } else {
            exec.stopExec("resources/py/mitm.py");
            root_pass_checkbox.setEnabled(true);
            root_pass_textfield.setEnabled(true);
        }
        
    }//GEN-LAST:event_start_stop_attack_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        scan_ip_address_textarea.setText("Scaning...");
        
        int maskNumber = conf.subnetMaskCalculation(subnet_mask_textfield.getText());
        
        String command = "python3 resources/py/ip_scan.py -i " + network_interface_textfield.getText() + " -c " + number_of_packages_textfield.getText() + " -r " + local_ip_address_textfield.getText() + "/" + maskNumber;
        CommandExec exec = new CommandExec(root_pass_textfield.getText(), command);
        
        exec.setDataListener((String output) -> {
            scan_ip_address_textarea.append(output + "\n");
        });
        
        exec.start();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refresh_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_buttonActionPerformed
        
        CommandExec exec = new CommandExec(root_pass_textfield.getText(), "python3 resources/py/network_info.py");
        
        exec.setDataListener((String output) -> {
            String[] outputArray = output.split(",");
            gateway_ip_address_textfield.setText(outputArray[0]);
            local_ip_address_textfield.setText(outputArray[1]);
            subnet_mask_textfield.setText(outputArray[2]);
            network_interface_textfield.setText(outputArray[3]);
        });
        
        exec.start();
        
    }//GEN-LAST:event_refresh_buttonActionPerformed

    private void enable_url_1_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enable_url_1_checkboxActionPerformed
        conf.urlConf(enable_url_1_checkbox, enable_url_1_textfield);
    }//GEN-LAST:event_enable_url_1_checkboxActionPerformed

    private void enable_url_2_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enable_url_2_checkboxActionPerformed
        conf.urlConf(enable_url_2_checkbox, enable_url_2_textfield);
    }//GEN-LAST:event_enable_url_2_checkboxActionPerformed

    private void enable_url_3_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enable_url_3_checkboxActionPerformed
        conf.urlConf(enable_url_3_checkbox, enable_url_3_textfield);
    }//GEN-LAST:event_enable_url_3_checkboxActionPerformed

    private void enable_url_4_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enable_url_4_checkboxActionPerformed
        conf.urlConf(enable_url_4_checkbox, enable_url_4_textfield);
    }//GEN-LAST:event_enable_url_4_checkboxActionPerformed

    private void enable_url_5_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enable_url_5_checkboxActionPerformed
        conf.urlConf(enable_url_5_checkbox, enable_url_5_textfield);
    }//GEN-LAST:event_enable_url_5_checkboxActionPerformed

    private void enable_url_6_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enable_url_6_checkboxActionPerformed
        conf.urlConf(enable_url_6_checkbox, enable_url_6_textfield);
    }//GEN-LAST:event_enable_url_6_checkboxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox enable_url_1_checkbox;
    private javax.swing.JTextField enable_url_1_textfield;
    private javax.swing.JCheckBox enable_url_2_checkbox;
    private javax.swing.JTextField enable_url_2_textfield;
    private javax.swing.JCheckBox enable_url_3_checkbox;
    private javax.swing.JTextField enable_url_3_textfield;
    private javax.swing.JCheckBox enable_url_4_checkbox;
    private javax.swing.JTextField enable_url_4_textfield;
    private javax.swing.JCheckBox enable_url_5_checkbox;
    private javax.swing.JTextField enable_url_5_textfield;
    private javax.swing.JCheckBox enable_url_6_checkbox;
    private javax.swing.JTextField enable_url_6_textfield;
    private javax.swing.JTextField gateway_ip_address_textfield;
    private javax.swing.JTextField ip_address_range_textfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField local_ip_address_textfield;
    private javax.swing.JTextField network_interface_textfield;
    private javax.swing.JTextField number_of_packages_textfield;
    private javax.swing.JButton refresh_button;
    private javax.swing.JCheckBox root_pass_checkbox;
    private javax.swing.JPasswordField root_pass_textfield;
    private javax.swing.JTextArea scan_ip_address_textarea;
    private javax.swing.JToggleButton start_stop_attack_button;
    private javax.swing.JTextField subnet_mask_textfield;
    // End of variables declaration//GEN-END:variables
}
