
package com.koshkadm.simplechatserver;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;
import java.net.InetAddress;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // VARIABLE     
    ServerSocket serverSocket;
    Socket clientSocket;
    DataInputStream in;
    DataOutputStream out;
    String log = "";
    boolean working = false;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chat = new javax.swing.JTextArea();
        portLabel = new javax.swing.JLabel();
        ipLabel = new javax.swing.JLabel();
        ip = new javax.swing.JLabel();
        port = new javax.swing.JTextField();
        motdLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        motd = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        startButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        clearChat = new javax.swing.JMenuItem();
        saveChatAs = new javax.swing.JMenu();
        saveChatAsClipboard = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chat.setColumns(20);
        chat.setRows(5);
        jScrollPane1.setViewportView(chat);

        portLabel.setText("Puerto:");

        ipLabel.setText("IP:");

        ip.setText("TO-DO");

        motdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motdLabel.setText("MOTD:");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        motd.setColumns(20);
        motd.setRows(5);
        motd.setText("HOLA MUNDO!!");
        jScrollPane2.setViewportView(motd);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        startButton.setForeground(new java.awt.Color(0, 153, 0));
        startButton.setText("Iniciar servidor");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        logo.setText("LOGO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ipLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(port, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(ip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(startButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(motdLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ipLabel)
                            .addComponent(ip))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(portLabel)
                            .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(motdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jMenu1.setText("Opciones");

        clearChat.setText("Limpiar chat");
        clearChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearChatActionPerformed(evt);
            }
        });
        jMenu1.add(clearChat);

        saveChatAs.setText("Guardar chat como...");

        saveChatAsClipboard.setText("Portapapeles");
        saveChatAsClipboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChatAsClipboardActionPerformed(evt);
            }
        });
        saveChatAs.add(saveChatAsClipboard);

        jMenu1.add(saveChatAs);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void log(String msg){
        log += msg;
        chat.setText(log);
    }
    
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        if(!working){
            port.setForeground(Color.BLACK);
            portLabel.setForeground(Color.BLACK);
            try{
                log("Iniciando servidor...\n");
                serverSocket = new ServerSocket(Integer.parseInt(port.getText()));
                working = true;
                
            }catch(java.net.BindException e){
                log("El puerto \"" + port.getText() + "\" ya esta en uso\n");
                port.setForeground(new java.awt.Color(153,153,0));
                portLabel.setForeground(new java.awt.Color(153,153,0));
            }catch(java.lang.NumberFormatException e){
                log("Se ha introducido un puerto no valido\n");
                port.setForeground(Color.red);
                portLabel.setForeground(Color.red);
            }catch(IOException e){
                e.printStackTrace();
            }
            
            if(working){
                startButton.setText("Apagar servidor");
                startButton.setForeground(Color.red);
                log("Servidor iniciado, puerto \"" + port.getText() + "\"\n");
                log("Esperando al cliente...\n");
                
                Thread waitingPeer = new Thread(new Runnable(){
                    @Override
                    public void run(){
                        try {
                           clientSocket = serverSocket.accept();
                           in = new DataInputStream(clientSocket.getInputStream());
                           out = new DataOutputStream(clientSocket.getOutputStream());
                           log("Cliente conectado!!\n");
                           
                           log("Enviando MOTD al cliente...\n");
                           out.writeUTF("SERVER MOTD >>" + motd.getText() + "\n\n");
                           
                           log("Escuchando al cliente...\n\n");
                           while(working){
                               log(in.readUTF() + "\n");
                           }
                        }catch(java.net.SocketException e){
                            log("Servidor cerrado\n\n");
                        }catch(IOException e){
                            System.out.println("MY ERROR A14");
                            e.printStackTrace();
                        }
                        
                    }
                });
                waitingPeer.start();
            }
            
        }else{
            try{
                startButton.setText("Iniciar servidor");
                startButton.setForeground(new java.awt.Color(0,153,0));
                working = false;
                serverSocket.close();
                clientSocket.close();
            }catch(IOException e){
                e.printStackTrace();
            }catch(java.lang.NullPointerException e){
                //
            }
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void clearChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearChatActionPerformed
        log = "";
        chat.setText("");
    }//GEN-LAST:event_clearChatActionPerformed

    private void saveChatAsClipboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChatAsClipboardActionPerformed
        StringSelection stringSelection = new StringSelection(log);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        JOptionPane.showMessageDialog(null, "Chat copiado al portapapeles");
    }//GEN-LAST:event_saveChatAsClipboardActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea chat;
    private javax.swing.JMenuItem clearChat;
    private javax.swing.JLabel ip;
    private javax.swing.JLabel ipLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextArea motd;
    private javax.swing.JLabel motdLabel;
    private javax.swing.JTextField port;
    private javax.swing.JLabel portLabel;
    private javax.swing.JMenu saveChatAs;
    private javax.swing.JMenuItem saveChatAsClipboard;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
