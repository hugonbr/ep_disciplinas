/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.da.velha;

//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo Nathan
 */
public class TelaJogo extends javax.swing.JFrame {

    /**
     * Creates new form TelaJogo
     */
    
    //Armazena se é a vez do 1 ou do 2
        int jogadorDaVez = 1;
        
        //String nome1;
        
        public int todosOsbotoesClicados = 0;
        
        public int c1 = 0, c2 = 0, c3 = 0, l1 = 0, l2 = 0, l3 = 0, d1 = 0, d2 = 0;
            
    public TelaJogo(String nomeJogador1, String nomeJogador2) {
        initComponents();
        
        jLabelNomeJog1.setText("Jogador1: "+nomeJogador1);
        //nome1 = nomeJogador1;
        jLabelNomeJog2.setText("Jogador2: "+nomeJogador2);
    }

    private TelaJogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNomeJog1 = new javax.swing.JLabel();
        jLabelNomeJog2 = new javax.swing.JLabel();
        jLabelJogVez = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_Reset = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton11.setFont(new java.awt.Font("Algerian", 0, 80)); // NOI18N
        jButton11.setText("1");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Algerian", 0, 80)); // NOI18N
        jButton33.setText("9");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Algerian", 0, 80)); // NOI18N
        jButton32.setText("8");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Algerian", 0, 80)); // NOI18N
        jButton31.setText("7");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Algerian", 0, 80)); // NOI18N
        jButton13.setText("3");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Algerian", 0, 80)); // NOI18N
        jButton12.setText("2");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Algerian", 0, 80)); // NOI18N
        jButton21.setText("4");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Algerian", 0, 80)); // NOI18N
        jButton22.setText("5");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Algerian", 0, 80)); // NOI18N
        jButton23.setText("6");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
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
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setText("Jogo da Velha");

        jLabelNomeJog1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNomeJog1.setText("Jogador1:");

        jLabelNomeJog2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNomeJog2.setText("Jogador2:");

        jLabelJogVez.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelJogVez.setText("Vez do Jogador 1 (X)");

        jMenu1.setText("Jogo");

        jMenuItem_Reset.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_Reset.setText("Resetar");
        jMenuItem_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ResetActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Reset);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Novo Jogo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        jMenuItem2.setText("Sobre");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTitulo)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeJog1)
                            .addComponent(jLabelNomeJog2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelJogVez)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNomeJog1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNomeJog2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelJogVez)
                        .addGap(23, 23, 23))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(rootPane, "Jogo da Velha by: Hugo Nathan");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        
        
        
        todosOsbotoesClicados++;
        
        if (jogadorDaVez == 1) {
            
            jButton11.setText("X");
            jogadorDaVez = 2;
            jLabelJogVez.setText("Vez do Jogador 2 (O)");
            //jButton11.setEnabled(false);
            
            l1++; c1++; d1++;
        }
        
        else {
        
            jButton11.setText("O");
            jogadorDaVez = 1;
            jLabelJogVez.setText("Vez do Jogador 1 (X)");
            
            l1--; c1--; d1--;
        }
        
        switch (verificaFimdeJogo()) {
            case "Jogador 1 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(X) - "+ jLabelNomeJog1.getText() + " , ganhou");
                break;
            case "Jogador 2 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(O) - "+ jLabelNomeJog2.getText() + " , ganhou");
                break;
                
            case "Deu empate":
                JOptionPane.showMessageDialog(rootPane, "Deu empate");
        }
        
        jButton11.setEnabled(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        
        
        
        todosOsbotoesClicados++;
                
        if (jogadorDaVez == 1) {
            
            jButton12.setText("X");
            jogadorDaVez = 2;
            jLabelJogVez.setText("Vez do Jogador 2 (O)");
            //jButton1.setEnabled(false);
            
            l1++; c2++;
        }
        
        else {
        
            jButton12.setText("O");
            jogadorDaVez = 1;
            jLabelJogVez.setText("Vez do Jogador 1 (X)");
            
            l1--; c2--;
        }
        
        switch (verificaFimdeJogo()) {
            case "Jogador 1 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(X) - "+ jLabelNomeJog1.getText() + " , ganhou");
                break;
            case "Jogador 2 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(O) - "+ jLabelNomeJog2.getText() + " , ganhou");
                break;
                
            case "Deu empate":
                JOptionPane.showMessageDialog(rootPane, "Deu empate");
        }
        
        jButton12.setEnabled(false);

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        
        
        
        todosOsbotoesClicados++;
                
        if (jogadorDaVez == 1) {
            
            jButton13.setText("X");
            jogadorDaVez = 2;
            jLabelJogVez.setText("Vez do Jogador 2 (O)");
            //jButton1.setEnabled(false);
            
            l1++; c3++; d2++;
        }
        
        else {
        
            jButton13.setText("O");
            jogadorDaVez = 1;
            jLabelJogVez.setText("Vez do Jogador 1 (X)");
            
            l1--; c3--; d2--;
        }
        
        switch (verificaFimdeJogo()) {
            case "Jogador 1 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(X) - "+ jLabelNomeJog1.getText() + " , ganhou");
                break;
            case "Jogador 2 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(O) - "+ jLabelNomeJog2.getText() + " , ganhou");
                break;
                
            case "Deu empate":
                JOptionPane.showMessageDialog(rootPane, "Deu empate");
        }
        
        jButton13.setEnabled(false);

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        
        
        
        todosOsbotoesClicados++;
                
        if (jogadorDaVez == 1) {
            
            jButton21.setText("X");
            jogadorDaVez = 2;
            jLabelJogVez.setText("Vez do Jogador 2 (O)");
            //jButton1.setEnabled(false);
            
            l2++; c1++;
        }
        
        else {
        
            jButton21.setText("O");
            jogadorDaVez = 1;
            jLabelJogVez.setText("Vez do Jogador 1 (X)");
            
            l2--; c1--;
        }
        
        switch (verificaFimdeJogo()) {
            case "Jogador 1 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(X) - "+ jLabelNomeJog1.getText() + " , ganhou");
                break;
            case "Jogador 2 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(O) - "+ jLabelNomeJog2.getText() + " , ganhou");
                break;
                
            case "Deu empate":
                JOptionPane.showMessageDialog(rootPane, "Deu empate");
        }
        
        jButton21.setEnabled(false);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        
        
        
        
        todosOsbotoesClicados++;
        
        if (jogadorDaVez == 1) {
            
            jButton22.setText("X");
            jogadorDaVez = 2;
            jLabelJogVez.setText("Vez do Jogador 2 (O)");
            //jButton1.setEnabled(false);
            
            l2++; c2++; d1++; d2++;
        }
        
        else {
        
            jButton22.setText("O");
            jogadorDaVez = 1;
            jLabelJogVez.setText("Vez do Jogador 1 (X)");
            
            l2--; c2--; d1--; d2--;
        }
        
        switch (verificaFimdeJogo()) {
            case "Jogador 1 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(X) - "+ jLabelNomeJog1.getText() + " , ganhou");
                break;
            case "Jogador 2 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(O) - "+ jLabelNomeJog2.getText() + " , ganhou");
                break;
                
            case "Deu empate":
                JOptionPane.showMessageDialog(rootPane, "Deu empate");
        }
        
        jButton22.setEnabled(false);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        
        
        
        todosOsbotoesClicados++;
        
        if (jogadorDaVez == 1) {
            
            jButton23.setText("X");
            jogadorDaVez = 2;
            jLabelJogVez.setText("Vez do Jogador 2 (O)");
            //jButton1.setEnabled(false);
            
            l2++; c3++;
        }
        
        else {
        
            jButton23.setText("O");
            jogadorDaVez = 1;
            jLabelJogVez.setText("Vez do Jogador 1 (X)");
            
            l2--; c3--;
        }
        
        switch (verificaFimdeJogo()) {
            case "Jogador 1 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(X) - "+ jLabelNomeJog1.getText() + " , ganhou");
                break;
            case "Jogador 2 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(O) - "+ jLabelNomeJog2.getText() + " , ganhou");
                break;
                
            case "Deu empate":
                JOptionPane.showMessageDialog(rootPane, "Deu empate");
        }
        
        jButton23.setEnabled(false);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        
        
        
        todosOsbotoesClicados++;
        
        if (jogadorDaVez == 1) {
            
            jButton31.setText("X");
            jogadorDaVez = 2;
            jLabelJogVez.setText("Vez do Jogador 2 (O)");
            //jButton1.setEnabled(false);
            
            l3++; c1++; d2++;
        }
        
        else {
        
            jButton31.setText("O");
            jogadorDaVez = 1;
            jLabelJogVez.setText("Vez do Jogador 1 (X)");
            
            l3--; c1--; d2--;
        }
        
        switch (verificaFimdeJogo()) {
            case "Jogador 1 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(X) - "+ jLabelNomeJog1.getText() + " , ganhou");
                break;
            case "Jogador 2 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(O) - "+ jLabelNomeJog2.getText() + " , ganhou");
                break;
                
            case "Deu empate":
                JOptionPane.showMessageDialog(rootPane, "Deu empate");
        }
        
        jButton31.setEnabled(false);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        
        
        
        todosOsbotoesClicados++;
        
        if (jogadorDaVez == 1) {
            
            jButton32.setText("X");
            jogadorDaVez = 2;
            jLabelJogVez.setText("Vez do Jogador 2 (O)");
            //jButton1.setEnabled(false);
            
            l3++; c2++;
        }
        
        else {
        
            jButton32.setText("O");
            jogadorDaVez = 1;
            jLabelJogVez.setText("Vez do Jogador 1 (X)");
            
            l3--; c2--;
        }
        
        switch (verificaFimdeJogo()) {
            case "Jogador 1 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(X) - "+ jLabelNomeJog1.getText() + " , ganhou");
                break;
            case "Jogador 2 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(O) - "+ jLabelNomeJog2.getText() + " , ganhou");
                break;
                
            case "Deu empate":
                JOptionPane.showMessageDialog(rootPane, "Deu empate");
        }
        
        jButton32.setEnabled(false);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        
        
        
        todosOsbotoesClicados++;
        
        if (jogadorDaVez == 1) {
            
            jButton33.setText("X");
            jogadorDaVez = 2;
            jLabelJogVez.setText("Vez do Jogador 2 (O)");
            //jButton1.setEnabled(false);
            
            l3++; c3++; d1++;
        }
        
        else {
        
            jButton33.setText("O");
            jogadorDaVez = 1;
            jLabelJogVez.setText("Vez do Jogador 1 (X)");
            
            l3--; c3--; d1--;
        }
        
        switch (verificaFimdeJogo()) {
            case "Jogador 1 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(X) - "+ jLabelNomeJog1.getText() + " , ganhou");
                break;
            case "Jogador 2 ganhou":
                JOptionPane.showMessageDialog(rootPane, "(O) - "+ jLabelNomeJog2.getText() + " , ganhou");
                break;
                
            case "Deu empate":
                JOptionPane.showMessageDialog(rootPane, "Deu empate");
        }
        
        jButton33.setEnabled(false);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jMenuItem_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ResetActionPerformed
        // TODO add your handling code here:
        
        reset();
    }//GEN-LAST:event_jMenuItem_ResetActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        
        TelaJogadores NovoJogo = new TelaJogadores();
        NovoJogo.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public void reset () {
        
        jogadorDaVez = 1;
        
        modEstadoBotoes(true);
        
        jLabelJogVez.setText("Vez do Jogador 1 (X)");
        
        todosOsbotoesClicados = 0;
        
        c1 = 0; c2 = 0; c3 = 0; l1 = 0; l2 = 0; l3 = 0; d1 = 0; d2 = 0;
        
        jButton11.setText("1");
        jButton12.setText("2");
        jButton13.setText("3");
        jButton21.setText("4");
        jButton22.setText("5");
        jButton23.setText("6");
        jButton31.setText("7");
        jButton32.setText("8");
        jButton33.setText("9");
    }
    
    public void modEstadoBotoes (boolean estado) {
        
        jButton11.setEnabled(estado);
        jButton12.setEnabled(estado);
        jButton13.setEnabled(estado);
        jButton21.setEnabled(estado);
        jButton22.setEnabled(estado);
        jButton23.setEnabled(estado);
        jButton31.setEnabled(estado);
        jButton32.setEnabled(estado);
        jButton33.setEnabled(estado);
    }
    
    //Criar função para verificar se todas os botões foram clicados
    
    public String verificaFimdeJogo (){
        
        if (l1 == 3 || l2 == 3 || l3 == 3 || c1 == 3 || c2 == 3 || c3 == 3 || d1 == 3 || d2 == 3) {
            
            modEstadoBotoes(false);
            
            jLabelJogVez.setText("Fim De Jogo.");
            
            return "Jogador 1 ganhou";
            //return "" + jLabelNomeJog1.getText() + "ganhou";
        }
        
        if (l1 == -3 || l2 == -3 || l3 == -3 || c1 == -3 || c2 == -3 || c3 == -3 || d1 == -3 || d2 == -3) {
            
            modEstadoBotoes(false);

            jLabelJogVez.setText("Fim De Jogo.");
            
            return "Jogador 2 ganhou";
            //return "" + jLabelNomeJog2.getText() + "ganhou";
        }
        
        if (todosOsbotoesClicados == 9) {
            
            modEstadoBotoes(false);
            
            jLabelJogVez.setText("Fim De Jogo.");
            
            return "Deu empate";
        }
        
        else 
            return "Testando se o jogo ainda não acabou";
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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton11;
    public static javax.swing.JButton jButton12;
    public static javax.swing.JButton jButton13;
    public static javax.swing.JButton jButton21;
    public static javax.swing.JButton jButton22;
    public static javax.swing.JButton jButton23;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    public static javax.swing.JLabel jLabelJogVez;
    private javax.swing.JLabel jLabelNomeJog1;
    private javax.swing.JLabel jLabelNomeJog2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem_Reset;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}