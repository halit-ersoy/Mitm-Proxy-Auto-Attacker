package com.ses.auto_mitm_proxy.ui;

import java.awt.Container;
import model.CommandExec;
import model.FileOperations;
import viewmodel.UiConfig;

public class UI1 extends javax.swing.JFrame {
    
    UiConfig conf = new UiConfig();

    public UI1() {
        initComponents();
        networkInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        url_attack_redirect_all_urls_checkbox = new javax.swing.JCheckBox();
        url_attack_source_url_1_textfield = new javax.swing.JTextField();
        url_attack_source_url_2_textfield = new javax.swing.JTextField();
        url_attack_source_url_3_textfield = new javax.swing.JTextField();
        url_attack_source_url_4_textfield = new javax.swing.JTextField();
        url_attack_source_url_5_textfield = new javax.swing.JTextField();
        url_attack_source_url_6_textfield = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        url_attack_redirect_url_1_textfield = new javax.swing.JTextField();
        url_attack_redirect_url_2_textfield = new javax.swing.JTextField();
        url_attack_redirect_url_3_textfield = new javax.swing.JTextField();
        url_attack_redirect_url_4_textfield = new javax.swing.JTextField();
        url_attack_redirect_url_5_textfield = new javax.swing.JTextField();
        url_attack_redirect_url_6_textfield = new javax.swing.JTextField();
        url_attack_redirect_all_urls_textfield = new javax.swing.JTextField();
        url_attack_enable_redirect_url_1_checkbox = new javax.swing.JCheckBox();
        url_attack_enable_redirect_url_2_checkbox = new javax.swing.JCheckBox();
        url_attack_enable_redirect_url_3_checkbox = new javax.swing.JCheckBox();
        url_attack_enable_redirect_url_4_checkbox = new javax.swing.JCheckBox();
        url_attack_enable_redirect_url_5_checkbox = new javax.swing.JCheckBox();
        url_attack_enable_redirect_url_6_checkbox = new javax.swing.JCheckBox();
        url_attack_start_stop_attack_button = new javax.swing.JToggleButton();
        url_attack_select_all_ip_addresses_button = new javax.swing.JButton();
        url_attack_select_file_path_button = new javax.swing.JButton();
        url_attack_ssl_certificates_textfield = new javax.swing.JTextField();
        url_attack_ip_address_range_textfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        file_attack_enable_url_1_checkbox = new javax.swing.JCheckBox();
        file_attack_enable_file_url_1_textfield = new javax.swing.JTextField();
        file_attack_enable_file_url_2_textfield = new javax.swing.JTextField();
        file_attack_enable_url_2_checkbox = new javax.swing.JCheckBox();
        file_attack_enable_file_url_3_textfield = new javax.swing.JTextField();
        file_attack_enable_url_3_checkbox = new javax.swing.JCheckBox();
        file_attack_enable_file_url_4_textfield = new javax.swing.JTextField();
        file_attack_enable_url_4_checkbox = new javax.swing.JCheckBox();
        file_attack_enable_file_url_5_textfield = new javax.swing.JTextField();
        file_attack_nable_url_5_checkbox = new javax.swing.JCheckBox();
        file_attack_enable_file_url_6_textfield = new javax.swing.JTextField();
        file_attack_enable_url_6_checkbox = new javax.swing.JCheckBox();
        file_attack_start_stop_attack_button = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        file_attack_ip_address_range_textfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        file_attack_ssl_certificates_textfield = new javax.swing.JTextField();
        file_attack_select_file_path_button = new javax.swing.JButton();
        file_attack_select_all_ip_addresses_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        scan_ip_address_textarea1 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        local_ip_address_textfield1 = new javax.swing.JTextField();
        gateway_ip_address_textfield1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        network_interface_textfield1 = new javax.swing.JTextField();
        number_of_packages_textfield1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        subnet_mask_textfield1 = new javax.swing.JTextField();
        file_attack_start_stop_attack_button1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        scan_ip_address_textarea = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        local_ip_address_textfield = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        gateway_ip_address_textfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        network_interface_textfield = new javax.swing.JTextField();
        number_of_packages_textfield = new javax.swing.JTextField();
        scan_ip_address_button = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        subnet_mask_textfield = new javax.swing.JTextField();
        refresh_button = new javax.swing.JButton();
        root_pass_checkbox = new javax.swing.JCheckBox();
        root_pass_textfield = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1024, 639));

        url_attack_redirect_all_urls_checkbox.setText("Redirect All URLs");
        url_attack_redirect_all_urls_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url_attack_redirect_all_urls_checkboxActionPerformed(evt);
            }
        });

        url_attack_source_url_1_textfield.setEnabled(false);

        url_attack_source_url_2_textfield.setEnabled(false);

        url_attack_source_url_3_textfield.setEnabled(false);

        url_attack_source_url_4_textfield.setEnabled(false);

        url_attack_source_url_5_textfield.setEnabled(false);

        url_attack_source_url_6_textfield.setEnabled(false);

        jLabel14.setText("=");

        jLabel15.setText("=");

        jLabel16.setText("=");

        jLabel17.setText("=");

        jLabel18.setText("=");

        jLabel19.setText("=");

        url_attack_redirect_url_1_textfield.setEnabled(false);

        url_attack_redirect_url_2_textfield.setEnabled(false);

        url_attack_redirect_url_3_textfield.setEnabled(false);

        url_attack_redirect_url_4_textfield.setEnabled(false);

        url_attack_redirect_url_5_textfield.setEnabled(false);

        url_attack_redirect_url_6_textfield.setEnabled(false);

        url_attack_redirect_all_urls_textfield.setEnabled(false);

        url_attack_enable_redirect_url_1_checkbox.setText("Enable Redirect URL 1");
        url_attack_enable_redirect_url_1_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url_attack_enable_redirect_url_1_checkboxActionPerformed(evt);
            }
        });

        url_attack_enable_redirect_url_2_checkbox.setText("Enable Redirect URL 2");
        url_attack_enable_redirect_url_2_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url_attack_enable_redirect_url_2_checkboxActionPerformed(evt);
            }
        });

        url_attack_enable_redirect_url_3_checkbox.setText("Enable Redirect URL 3");
        url_attack_enable_redirect_url_3_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url_attack_enable_redirect_url_3_checkboxActionPerformed(evt);
            }
        });

        url_attack_enable_redirect_url_4_checkbox.setText("Enable Redirect URL 4");
        url_attack_enable_redirect_url_4_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url_attack_enable_redirect_url_4_checkboxActionPerformed(evt);
            }
        });

        url_attack_enable_redirect_url_5_checkbox.setText("Enable Redirect URL 5");
        url_attack_enable_redirect_url_5_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url_attack_enable_redirect_url_5_checkboxActionPerformed(evt);
            }
        });

        url_attack_enable_redirect_url_6_checkbox.setText("Enable Redirect URL 6");
        url_attack_enable_redirect_url_6_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url_attack_enable_redirect_url_6_checkboxActionPerformed(evt);
            }
        });

        url_attack_start_stop_attack_button.setText("Start attack");
        url_attack_start_stop_attack_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url_attack_start_stop_attack_buttonActionPerformed(evt);
            }
        });

        url_attack_select_all_ip_addresses_button.setText("Select all IP addresses");
        url_attack_select_all_ip_addresses_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url_attack_select_all_ip_addresses_buttonActionPerformed(evt);
            }
        });

        url_attack_select_file_path_button.setText("Select file path");
        url_attack_select_file_path_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url_attack_select_file_path_buttonActionPerformed(evt);
            }
        });

        url_attack_ssl_certificates_textfield.setText("resources/certificates/default_cert.pem");

        jLabel3.setText("SSL certificates");

        jLabel4.setText("IP address range");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(url_attack_redirect_all_urls_checkbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(url_attack_redirect_all_urls_textfield))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(url_attack_enable_redirect_url_1_checkbox)
                            .addComponent(url_attack_enable_redirect_url_2_checkbox)
                            .addComponent(url_attack_enable_redirect_url_3_checkbox)
                            .addComponent(url_attack_enable_redirect_url_4_checkbox)
                            .addComponent(url_attack_enable_redirect_url_5_checkbox)
                            .addComponent(url_attack_enable_redirect_url_6_checkbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(url_attack_source_url_5_textfield)
                            .addComponent(url_attack_source_url_4_textfield, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(url_attack_source_url_3_textfield, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(url_attack_source_url_2_textfield, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(url_attack_source_url_1_textfield, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(url_attack_source_url_6_textfield))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(url_attack_redirect_url_6_textfield))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(url_attack_redirect_url_1_textfield))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(url_attack_redirect_url_2_textfield))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(url_attack_redirect_url_3_textfield))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(url_attack_redirect_url_4_textfield))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(url_attack_redirect_url_5_textfield))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(url_attack_ip_address_range_textfield)
                            .addComponent(url_attack_ssl_certificates_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(url_attack_select_all_ip_addresses_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(url_attack_start_stop_attack_button))
                            .addComponent(url_attack_select_file_path_button))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(url_attack_redirect_all_urls_checkbox)
                    .addComponent(url_attack_redirect_all_urls_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(url_attack_source_url_1_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(url_attack_enable_redirect_url_1_checkbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(url_attack_source_url_2_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(url_attack_enable_redirect_url_2_checkbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(url_attack_source_url_3_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(url_attack_enable_redirect_url_3_checkbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(url_attack_source_url_4_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(url_attack_enable_redirect_url_4_checkbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(url_attack_source_url_5_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(url_attack_enable_redirect_url_5_checkbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(url_attack_source_url_6_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(url_attack_enable_redirect_url_6_checkbox)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(url_attack_redirect_url_1_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(url_attack_redirect_url_2_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(url_attack_redirect_url_3_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(url_attack_redirect_url_4_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(url_attack_redirect_url_5_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(url_attack_redirect_url_6_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(url_attack_ssl_certificates_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(url_attack_select_file_path_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(url_attack_start_stop_attack_button)
                    .addComponent(jLabel4)
                    .addComponent(url_attack_ip_address_range_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(url_attack_select_all_ip_addresses_button))
                .addContainerGap())
        );

        jTabbedPane1.addTab("URL Attack", jPanel4);

        file_attack_enable_url_1_checkbox.setText("Enable File URL 1");
        file_attack_enable_url_1_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_attack_enable_url_1_checkboxActionPerformed(evt);
            }
        });

        file_attack_enable_file_url_1_textfield.setEnabled(false);

        file_attack_enable_file_url_2_textfield.setEnabled(false);

        file_attack_enable_url_2_checkbox.setText("Enable File URL 2");
        file_attack_enable_url_2_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_attack_enable_url_2_checkboxActionPerformed(evt);
            }
        });

        file_attack_enable_file_url_3_textfield.setEnabled(false);

        file_attack_enable_url_3_checkbox.setText("Enable File URL 3");
        file_attack_enable_url_3_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_attack_enable_url_3_checkboxActionPerformed(evt);
            }
        });

        file_attack_enable_file_url_4_textfield.setEnabled(false);

        file_attack_enable_url_4_checkbox.setText("Enable File URL 4");
        file_attack_enable_url_4_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_attack_enable_url_4_checkboxActionPerformed(evt);
            }
        });

        file_attack_enable_file_url_5_textfield.setEnabled(false);

        file_attack_nable_url_5_checkbox.setText("Enable File URL 5");
        file_attack_nable_url_5_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_attack_nable_url_5_checkboxActionPerformed(evt);
            }
        });

        file_attack_enable_file_url_6_textfield.setEnabled(false);

        file_attack_enable_url_6_checkbox.setText("Enable File URL 6");
        file_attack_enable_url_6_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_attack_enable_url_6_checkboxActionPerformed(evt);
            }
        });

        file_attack_start_stop_attack_button.setText("Start attack");
        file_attack_start_stop_attack_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_attack_start_stop_attack_buttonActionPerformed(evt);
            }
        });

        jLabel1.setText("IP address range");

        jLabel2.setText("SSL certificates");

        file_attack_ssl_certificates_textfield.setText("resources/certificates/default_cert.pem");

        file_attack_select_file_path_button.setText("Select file path");
        file_attack_select_file_path_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_attack_select_file_path_buttonActionPerformed(evt);
            }
        });

        file_attack_select_all_ip_addresses_button.setText("Select all IP addresses");
        file_attack_select_all_ip_addresses_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_attack_select_all_ip_addresses_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(file_attack_ip_address_range_textfield)
                            .addComponent(file_attack_ssl_certificates_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(file_attack_select_all_ip_addresses_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(file_attack_start_stop_attack_button))
                            .addComponent(file_attack_select_file_path_button)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(file_attack_enable_url_4_checkbox)
                            .addComponent(file_attack_nable_url_5_checkbox)
                            .addComponent(file_attack_enable_url_3_checkbox)
                            .addComponent(file_attack_enable_url_2_checkbox)
                            .addComponent(file_attack_enable_url_1_checkbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(file_attack_enable_file_url_4_textfield, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(file_attack_enable_file_url_3_textfield)
                            .addComponent(file_attack_enable_file_url_2_textfield)
                            .addComponent(file_attack_enable_file_url_5_textfield)
                            .addComponent(file_attack_enable_file_url_1_textfield)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(file_attack_enable_url_6_checkbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(file_attack_enable_file_url_6_textfield)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(file_attack_enable_url_1_checkbox)
                    .addComponent(file_attack_enable_file_url_1_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(file_attack_enable_url_2_checkbox)
                    .addComponent(file_attack_enable_file_url_2_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(file_attack_enable_url_3_checkbox)
                    .addComponent(file_attack_enable_file_url_3_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(file_attack_enable_url_4_checkbox)
                    .addComponent(file_attack_enable_file_url_4_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(file_attack_nable_url_5_checkbox)
                    .addComponent(file_attack_enable_file_url_5_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(file_attack_enable_url_6_checkbox)
                    .addComponent(file_attack_enable_file_url_6_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(file_attack_ssl_certificates_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(file_attack_select_file_path_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(file_attack_start_stop_attack_button)
                    .addComponent(jLabel1)
                    .addComponent(file_attack_ip_address_range_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(file_attack_select_all_ip_addresses_button))
                .addContainerGap())
        );

        jTabbedPane1.addTab("File Attack", jPanel1);

        scan_ip_address_textarea1.setColumns(20);
        scan_ip_address_textarea1.setRows(5);
        scan_ip_address_textarea1.setText("Scan IP address output");
        scan_ip_address_textarea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane4.setViewportView(scan_ip_address_textarea1);

        jLabel13.setText("<html>Published URL<br>(http-https)</html>");

        jLabel7.setText("Network interface");

        jLabel21.setText("Number of packages");

        number_of_packages_textfield1.setText("10");

        jLabel22.setText("Subnetnet mask");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(number_of_packages_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(network_interface_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(local_ip_address_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gateway_ip_address_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subnet_mask_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(local_ip_address_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gateway_ip_address_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(network_interface_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(subnet_mask_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(number_of_packages_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        file_attack_start_stop_attack_button1.setText("Start server");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(file_attack_start_stop_attack_button1))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                        .addComponent(file_attack_start_stop_attack_button1))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Server", jPanel3);

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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Packet Listener", jPanel2);

        scan_ip_address_textarea.setColumns(20);
        scan_ip_address_textarea.setRows(5);
        scan_ip_address_textarea.setText("Scan IP address output");
        scan_ip_address_textarea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane3.setViewportView(scan_ip_address_textarea);

        jLabel9.setText("Local ip address");

        jLabel10.setText("Gateway ip address");

        jLabel6.setText("Network interface");

        jLabel11.setText("Number of packages");

        number_of_packages_textfield.setText("10");

        scan_ip_address_button.setText("Scan IP address");
        scan_ip_address_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scan_ip_address_buttonActionPerformed(evt);
            }
        });

        jLabel12.setText("Subnetnet mask");

        refresh_button.setText("Refresh");
        refresh_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gateway_ip_address_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(local_ip_address_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(number_of_packages_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(network_interface_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(scan_ip_address_button, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subnet_mask_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(refresh_button, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(local_ip_address_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(gateway_ip_address_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(network_interface_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(subnet_mask_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(number_of_packages_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refresh_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scan_ip_address_button))
        );

        root_pass_checkbox.setText("Run with root");
        root_pass_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                root_pass_checkboxActionPerformed(evt);
            }
        });

        root_pass_textfield.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(root_pass_checkbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(root_pass_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                        .addGap(223, 223, 223))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(root_pass_checkbox)
                    .addComponent(root_pass_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Settings and Options", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void file_attack_start_stop_attack_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_attack_start_stop_attack_buttonActionPerformed
        
        String rootPass = root_pass_textfield.getText();
        String ipAddressRange = file_attack_ip_address_range_textfield.getText();
        String gatewayIpAddress = gateway_ip_address_textfield.getText();
        String subnetMask = subnet_mask_textfield.getText();
        String networkInterface = network_interface_textfield.getText();
        String numberOfPackages = number_of_packages_textfield.getText();
        String localIpAddress = local_ip_address_textfield.getText();
        String sslCertificates = file_attack_ssl_certificates_textfield.getText();

        String[] urls = {
            file_attack_enable_file_url_1_textfield.getText(),
            file_attack_enable_file_url_2_textfield.getText(),
            file_attack_enable_file_url_3_textfield.getText(),
            file_attack_enable_file_url_4_textfield.getText(),
            file_attack_enable_file_url_5_textfield.getText(),
            file_attack_enable_file_url_6_textfield.getText()
        };

        Boolean[] urlsEnabled = {
            file_attack_enable_url_1_checkbox.isSelected(),
            file_attack_enable_url_2_checkbox.isSelected(),
            file_attack_enable_url_3_checkbox.isSelected(),
            file_attack_enable_url_4_checkbox.isSelected(),
            file_attack_nable_url_5_checkbox.isSelected(),
            file_attack_enable_url_6_checkbox.isSelected()
        };

        Container[] cont = {
            file_attack_ip_address_range_textfield,
            file_attack_ssl_certificates_textfield,
            file_attack_select_all_ip_addresses_button,
            file_attack_select_file_path_button,
            root_pass_checkbox,
            root_pass_textfield,
            file_attack_enable_url_1_checkbox,
            file_attack_enable_file_url_1_textfield,
            file_attack_enable_url_2_checkbox,
            file_attack_enable_file_url_2_textfield,
            file_attack_enable_url_3_checkbox,
            file_attack_enable_file_url_3_textfield,
            file_attack_enable_url_4_checkbox,
            file_attack_enable_file_url_4_textfield,
            file_attack_nable_url_5_checkbox,
            file_attack_enable_file_url_5_textfield,
            file_attack_enable_url_6_checkbox,
            file_attack_enable_file_url_6_textfield
        };

        String[] elementString = {
            ipAddressRange,
            gatewayIpAddress,
            subnetMask,
            networkInterface,
            numberOfPackages,
            localIpAddress
        };

        String mitmString = "python3 resources/py/mitm.py -t " + ipAddressRange + " -r " + gatewayIpAddress;
        String fileChangerString = "resources/command/mitmdump -s resources/py/file_changer.py";

        if (!sslCertificates.isEmpty()) {
            fileChangerString = "resources/command/mitmdump --certs " + sslCertificates + " -s resources/py/file_changer.py";
        }

        CommandExec mitmExec = new CommandExec(rootPass, mitmString);
        CommandExec fileChangerExec = new CommandExec(rootPass, fileChangerString);

        if (file_attack_start_stop_attack_button.isSelected()) {
            if (conf.startFileControl(urls, urlsEnabled, elementString)) {
                conf.startVisible(cont, false);
                conf.writeFileArgs(urls, "resources/urls/file_args.json");
                mitmExec.start();
                fileChangerExec.start();
            } else {
                file_attack_start_stop_attack_button.setSelected(false);
            }
        } else {
            mitmExec.stopExec("resources/py/mitm.py");
            mitmExec.stopExec("resources/command/mitmdump");
            conf.startVisible(cont, true);
        }
        
    }//GEN-LAST:event_file_attack_start_stop_attack_buttonActionPerformed

    private void file_attack_enable_url_1_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_attack_enable_url_1_checkboxActionPerformed
        Container[] cont = {file_attack_enable_file_url_1_textfield};
        conf.visibleChanger(file_attack_enable_url_1_checkbox, cont, true);
    }//GEN-LAST:event_file_attack_enable_url_1_checkboxActionPerformed

    private void file_attack_enable_url_2_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_attack_enable_url_2_checkboxActionPerformed
        Container[] cont = {file_attack_enable_file_url_2_textfield};
        conf.visibleChanger(file_attack_enable_url_2_checkbox, cont, true);
    }//GEN-LAST:event_file_attack_enable_url_2_checkboxActionPerformed

    private void file_attack_enable_url_3_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_attack_enable_url_3_checkboxActionPerformed
        Container[] cont = {file_attack_enable_file_url_3_textfield};
        conf.visibleChanger(file_attack_enable_url_3_checkbox, cont, true);
    }//GEN-LAST:event_file_attack_enable_url_3_checkboxActionPerformed

    private void file_attack_enable_url_4_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_attack_enable_url_4_checkboxActionPerformed
        Container[] cont = {file_attack_enable_file_url_4_textfield};
        conf.visibleChanger(file_attack_enable_url_4_checkbox, cont, true);
    }//GEN-LAST:event_file_attack_enable_url_4_checkboxActionPerformed

    private void file_attack_nable_url_5_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_attack_nable_url_5_checkboxActionPerformed
        Container[] cont = {file_attack_enable_file_url_5_textfield};
        conf.visibleChanger(file_attack_nable_url_5_checkbox, cont, true);
    }//GEN-LAST:event_file_attack_nable_url_5_checkboxActionPerformed

    private void file_attack_enable_url_6_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_attack_enable_url_6_checkboxActionPerformed
        Container[] cont = {file_attack_enable_file_url_6_textfield};
        conf.visibleChanger(file_attack_enable_url_6_checkbox, cont, true);
    }//GEN-LAST:event_file_attack_enable_url_6_checkboxActionPerformed

    private void file_attack_select_file_path_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_attack_select_file_path_buttonActionPerformed
        String path = new FileOperations().fileChooser();
        file_attack_ssl_certificates_textfield.setText(path);
    }//GEN-LAST:event_file_attack_select_file_path_buttonActionPerformed

    private void file_attack_select_all_ip_addresses_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_attack_select_all_ip_addresses_buttonActionPerformed
        String ipAddresses = scan_ip_address_textarea.getText();
        String extIP = conf.extractIPAddresses(ipAddresses);
        file_attack_ip_address_range_textfield.setText("");
        file_attack_ip_address_range_textfield.setText(extIP);
    }//GEN-LAST:event_file_attack_select_all_ip_addresses_buttonActionPerformed

    private void scan_ip_address_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scan_ip_address_buttonActionPerformed
        
        scan_ip_address_textarea.setText("Scanning...");

        String rootPass = root_pass_textfield.getText();
        String subnetMask = subnet_mask_textfield.getText();
        String networkInterface = network_interface_textfield.getText();
        String numberOfPackages = number_of_packages_textfield.getText();
        String localIpAddress = local_ip_address_textfield.getText();

        int maskNumber = conf.subnetMaskCalculation(subnetMask);

        String command = "python3 resources/py/ip_scan.py -i " + networkInterface + " -c " + numberOfPackages + " -r " + localIpAddress + "/" + maskNumber;
        CommandExec exec = new CommandExec(rootPass, command);

        exec.setDataListener((String output) -> scan_ip_address_textarea.append(output + "\n"));
        exec.start();
        
    }//GEN-LAST:event_scan_ip_address_buttonActionPerformed

    private void refresh_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_buttonActionPerformed
        networkInfo();
    }//GEN-LAST:event_refresh_buttonActionPerformed

    private void root_pass_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_root_pass_checkboxActionPerformed
        root_pass_textfield.setText("");
        Container[] cont = {root_pass_textfield};
        conf.visibleChanger(root_pass_checkbox, cont, true);
    }//GEN-LAST:event_root_pass_checkboxActionPerformed

    private void url_attack_start_stop_attack_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url_attack_start_stop_attack_buttonActionPerformed
        
        String rootPass = root_pass_textfield.getText();
        String sslCertificates = url_attack_ssl_certificates_textfield.getText();
        String ipAddressRange = url_attack_ip_address_range_textfield.getText();
        String gatewayIpAddress = gateway_ip_address_textfield.getText();
        String subnetMask = subnet_mask_textfield.getText();
        String networkInterface = network_interface_textfield.getText();
        String localIpAddress = local_ip_address_textfield.getText();
        String redirect_all_url = url_attack_redirect_all_urls_textfield.getText();
        Boolean redirect_all_urls_bool = url_attack_redirect_all_urls_checkbox.isSelected();

        String[] sourceUrls = {
            url_attack_source_url_1_textfield.getText(),
            url_attack_source_url_2_textfield.getText(),
            url_attack_source_url_3_textfield.getText(),
            url_attack_source_url_4_textfield.getText(),
            url_attack_source_url_5_textfield.getText(),
            url_attack_source_url_6_textfield.getText()
        };

        String[] redirectUrls = {
            url_attack_redirect_url_1_textfield.getText(),
            url_attack_redirect_url_2_textfield.getText(),
            url_attack_redirect_url_3_textfield.getText(),
            url_attack_redirect_url_4_textfield.getText(),
            url_attack_redirect_url_5_textfield.getText(),
            url_attack_redirect_url_6_textfield.getText()
        };

        Boolean[] enableRedirect = {
            url_attack_enable_redirect_url_1_checkbox.isSelected(),
            url_attack_enable_redirect_url_2_checkbox.isSelected(),
            url_attack_enable_redirect_url_3_checkbox.isSelected(),
            url_attack_enable_redirect_url_4_checkbox.isSelected(),
            url_attack_enable_redirect_url_5_checkbox.isSelected(),
            url_attack_enable_redirect_url_6_checkbox.isSelected()
        };

        String[] urls = {
            sourceUrls[0] + ",," + redirectUrls[0], 
            sourceUrls[1] + ",," + redirectUrls[1], 
            sourceUrls[2] + ",," + redirectUrls[2], 
            sourceUrls[3] + ",," + redirectUrls[3], 
            sourceUrls[4] + ",," + redirectUrls[4], 
            sourceUrls[5] + ",," + redirectUrls[5]
        };

        String[] elementString = {
            ipAddressRange,
            gatewayIpAddress,
            subnetMask,
            networkInterface,
            localIpAddress
        };

        if (!conf.startUrlControl(elementString, redirect_all_urls_bool, redirect_all_url, enableRedirect, sourceUrls, redirectUrls)) {
            url_attack_start_stop_attack_button.setSelected(false);
            return;
        }

        String mitmString = "python3 resources/py/mitm.py -t " + ipAddressRange + " -r " + gatewayIpAddress;
        String urlChangerString = "resources/command/mitmdump -s resources/py/url_changer.py";

        if (!sslCertificates.isEmpty()) {
            urlChangerString = "resources/command/mitmdump --certs " + sslCertificates + " -s resources/py/url_changer.py";
        }

        CommandExec mitmExec = new CommandExec(rootPass, mitmString);
        CommandExec urlChangerExec = new CommandExec(rootPass, urlChangerString);

        if (url_attack_start_stop_attack_button.isSelected()) {
            conf.writeUrlArgs(urls, "resources/urls/url_args.json", redirect_all_urls_bool, redirect_all_url);
            mitmExec.start();
            urlChangerExec.start();
        } else {
            mitmExec.stopExec("resources/py/mitm.py");
            mitmExec.stopExec("resources/command/mitmdump");
        }
        
    }//GEN-LAST:event_url_attack_start_stop_attack_buttonActionPerformed

    private void url_attack_select_all_ip_addresses_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url_attack_select_all_ip_addresses_buttonActionPerformed
        String ipAddresses = scan_ip_address_textarea.getText();
        String extIP = conf.extractIPAddresses(ipAddresses);
        url_attack_ip_address_range_textfield.setText("");
        url_attack_ip_address_range_textfield.setText(extIP);
    }//GEN-LAST:event_url_attack_select_all_ip_addresses_buttonActionPerformed

    private void url_attack_select_file_path_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url_attack_select_file_path_buttonActionPerformed
        String path = new FileOperations().fileChooser();
        url_attack_ssl_certificates_textfield.setText(path);
    }//GEN-LAST:event_url_attack_select_file_path_buttonActionPerformed

    private void url_attack_redirect_all_urls_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url_attack_redirect_all_urls_checkboxActionPerformed
        
        Container[] contMulti = {
            url_attack_enable_redirect_url_1_checkbox,
            url_attack_source_url_1_textfield,
            url_attack_redirect_url_1_textfield,
            url_attack_enable_redirect_url_2_checkbox,
            url_attack_source_url_2_textfield,
            url_attack_redirect_url_2_textfield,
            url_attack_enable_redirect_url_3_checkbox,
            url_attack_source_url_3_textfield,
            url_attack_redirect_url_3_textfield,
            url_attack_enable_redirect_url_4_checkbox,
            url_attack_source_url_4_textfield,
            url_attack_redirect_url_4_textfield,
            url_attack_enable_redirect_url_5_checkbox,
            url_attack_source_url_5_textfield,
            url_attack_redirect_url_5_textfield,
            url_attack_enable_redirect_url_6_checkbox,
            url_attack_source_url_6_textfield,
            url_attack_redirect_url_6_textfield,
        };
        Container[] contSingle = {url_attack_redirect_all_urls_textfield};
        
        conf.visibleChanger(url_attack_redirect_all_urls_checkbox, contMulti, false);
        conf.visibleChanger(url_attack_redirect_all_urls_checkbox, contSingle, true);
        
    }//GEN-LAST:event_url_attack_redirect_all_urls_checkboxActionPerformed

    private void url_attack_enable_redirect_url_1_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url_attack_enable_redirect_url_1_checkboxActionPerformed
        Container[] cont = {url_attack_source_url_1_textfield, url_attack_redirect_url_1_textfield};
        conf.visibleChanger(url_attack_enable_redirect_url_1_checkbox, cont, true);
    }//GEN-LAST:event_url_attack_enable_redirect_url_1_checkboxActionPerformed

    private void url_attack_enable_redirect_url_2_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url_attack_enable_redirect_url_2_checkboxActionPerformed
        Container[] cont = {url_attack_source_url_2_textfield, url_attack_redirect_url_2_textfield};
        conf.visibleChanger(url_attack_enable_redirect_url_2_checkbox, cont, true);
    }//GEN-LAST:event_url_attack_enable_redirect_url_2_checkboxActionPerformed

    private void url_attack_enable_redirect_url_3_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url_attack_enable_redirect_url_3_checkboxActionPerformed
        Container[] cont = {url_attack_source_url_3_textfield, url_attack_redirect_url_3_textfield};
        conf.visibleChanger(url_attack_enable_redirect_url_3_checkbox, cont, true);
    }//GEN-LAST:event_url_attack_enable_redirect_url_3_checkboxActionPerformed

    private void url_attack_enable_redirect_url_4_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url_attack_enable_redirect_url_4_checkboxActionPerformed
        Container[] cont = {url_attack_source_url_4_textfield, url_attack_redirect_url_4_textfield};
        conf.visibleChanger(url_attack_enable_redirect_url_4_checkbox, cont, true);
    }//GEN-LAST:event_url_attack_enable_redirect_url_4_checkboxActionPerformed

    private void url_attack_enable_redirect_url_5_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url_attack_enable_redirect_url_5_checkboxActionPerformed
        Container[] cont = {url_attack_source_url_5_textfield, url_attack_redirect_url_5_textfield};
        conf.visibleChanger(url_attack_enable_redirect_url_5_checkbox, cont, true);
    }//GEN-LAST:event_url_attack_enable_redirect_url_5_checkboxActionPerformed

    private void url_attack_enable_redirect_url_6_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url_attack_enable_redirect_url_6_checkboxActionPerformed
        Container[] cont = {url_attack_source_url_6_textfield, url_attack_redirect_url_6_textfield};
        conf.visibleChanger(url_attack_enable_redirect_url_6_checkbox, cont, true);
    }//GEN-LAST:event_url_attack_enable_redirect_url_6_checkboxActionPerformed

    private void networkInfo() {
        String rootPass = root_pass_textfield.getText();
        CommandExec exec = new CommandExec(rootPass, "python3 resources/py/network_info.py");

        exec.setDataListener((String output) -> {
            String[] outputArray = output.split(",");
            gateway_ip_address_textfield.setText(outputArray[0]);
            local_ip_address_textfield.setText(outputArray[1]);
            subnet_mask_textfield.setText(outputArray[2]);
            network_interface_textfield.setText(outputArray[3]);
        });

        exec.start();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField file_attack_enable_file_url_1_textfield;
    private javax.swing.JTextField file_attack_enable_file_url_2_textfield;
    private javax.swing.JTextField file_attack_enable_file_url_3_textfield;
    private javax.swing.JTextField file_attack_enable_file_url_4_textfield;
    private javax.swing.JTextField file_attack_enable_file_url_5_textfield;
    private javax.swing.JTextField file_attack_enable_file_url_6_textfield;
    private javax.swing.JCheckBox file_attack_enable_url_1_checkbox;
    private javax.swing.JCheckBox file_attack_enable_url_2_checkbox;
    private javax.swing.JCheckBox file_attack_enable_url_3_checkbox;
    private javax.swing.JCheckBox file_attack_enable_url_4_checkbox;
    private javax.swing.JCheckBox file_attack_enable_url_6_checkbox;
    private javax.swing.JTextField file_attack_ip_address_range_textfield;
    private javax.swing.JCheckBox file_attack_nable_url_5_checkbox;
    private javax.swing.JButton file_attack_select_all_ip_addresses_button;
    private javax.swing.JButton file_attack_select_file_path_button;
    private javax.swing.JTextField file_attack_ssl_certificates_textfield;
    private javax.swing.JToggleButton file_attack_start_stop_attack_button;
    private javax.swing.JToggleButton file_attack_start_stop_attack_button1;
    private javax.swing.JTextField gateway_ip_address_textfield;
    private javax.swing.JTextField gateway_ip_address_textfield1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField local_ip_address_textfield;
    private javax.swing.JTextField local_ip_address_textfield1;
    private javax.swing.JTextField network_interface_textfield;
    private javax.swing.JTextField network_interface_textfield1;
    private javax.swing.JTextField number_of_packages_textfield;
    private javax.swing.JTextField number_of_packages_textfield1;
    private javax.swing.JButton refresh_button;
    private javax.swing.JCheckBox root_pass_checkbox;
    private javax.swing.JPasswordField root_pass_textfield;
    private javax.swing.JButton scan_ip_address_button;
    private javax.swing.JTextArea scan_ip_address_textarea;
    private javax.swing.JTextArea scan_ip_address_textarea1;
    private javax.swing.JTextField subnet_mask_textfield;
    private javax.swing.JTextField subnet_mask_textfield1;
    private javax.swing.JCheckBox url_attack_enable_redirect_url_1_checkbox;
    private javax.swing.JCheckBox url_attack_enable_redirect_url_2_checkbox;
    private javax.swing.JCheckBox url_attack_enable_redirect_url_3_checkbox;
    private javax.swing.JCheckBox url_attack_enable_redirect_url_4_checkbox;
    private javax.swing.JCheckBox url_attack_enable_redirect_url_5_checkbox;
    private javax.swing.JCheckBox url_attack_enable_redirect_url_6_checkbox;
    private javax.swing.JTextField url_attack_ip_address_range_textfield;
    private javax.swing.JCheckBox url_attack_redirect_all_urls_checkbox;
    private javax.swing.JTextField url_attack_redirect_all_urls_textfield;
    private javax.swing.JTextField url_attack_redirect_url_1_textfield;
    private javax.swing.JTextField url_attack_redirect_url_2_textfield;
    private javax.swing.JTextField url_attack_redirect_url_3_textfield;
    private javax.swing.JTextField url_attack_redirect_url_4_textfield;
    private javax.swing.JTextField url_attack_redirect_url_5_textfield;
    private javax.swing.JTextField url_attack_redirect_url_6_textfield;
    private javax.swing.JButton url_attack_select_all_ip_addresses_button;
    private javax.swing.JButton url_attack_select_file_path_button;
    private javax.swing.JTextField url_attack_source_url_1_textfield;
    private javax.swing.JTextField url_attack_source_url_2_textfield;
    private javax.swing.JTextField url_attack_source_url_3_textfield;
    private javax.swing.JTextField url_attack_source_url_4_textfield;
    private javax.swing.JTextField url_attack_source_url_5_textfield;
    private javax.swing.JTextField url_attack_source_url_6_textfield;
    private javax.swing.JTextField url_attack_ssl_certificates_textfield;
    private javax.swing.JToggleButton url_attack_start_stop_attack_button;
    // End of variables declaration//GEN-END:variables
}
