
package poofinal;

import java.awt.CardLayout;
import java.util.ArrayList;


public class InterfaceGrafica extends javax.swing.JFrame {

    
    
    public InterfaceGrafica() {
        
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PPainel = new javax.swing.JPanel();
        Principal = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Aluno = new javax.swing.JButton();
        Opções = new javax.swing.JLabel();
        TXT = new javax.swing.JButton();
        Hibernate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Alunos = new javax.swing.JPanel();
        MATRICULA = new javax.swing.JLabel();
        NOME = new javax.swing.JLabel();
        DATA_DE_NASCIMENTO = new javax.swing.JLabel();
        TELEFONE = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        IDADE = new javax.swing.JLabel();
        TEXTO_MATRICULA = new javax.swing.JTextField();
        TEXTO_NOME = new javax.swing.JTextField();
        TEXTO_DATA_DE_NASCIMENTO = new javax.swing.JTextField();
        TEXT_TELEFONE = new javax.swing.JTextField();
        TEXT_CPF = new javax.swing.JTextField();
        TEXTO_IDADE = new javax.swing.JTextField();
        ADICIONAR_ALUNO = new javax.swing.JButton();
        QUANTIDADE_ALUNOS = new javax.swing.JButton();
        PROCURAR_ALUNO = new javax.swing.JButton();
        TEXT_PROCURAR = new javax.swing.JTextField();
        PROCURAR = new javax.swing.JLabel();
        ALUNO_V_E_N = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PPainel.setLayout(new java.awt.CardLayout());

        Titulo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Sistema de Gerenciamento de aluno");

        Aluno.setText("Aluno");
        Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlunoActionPerformed(evt);
            }
        });

        Opções.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opções.setText("OPÇÕES:");

        TXT.setText("Criar .TXT");

        Hibernate.setText("Hibernate");

        jButton3.setText("De .TXT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Opções, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aluno)
                .addGap(18, 18, 18)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Hibernate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Aluno)
                        .addComponent(Opções, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Hibernate))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(TXT)))
                .addGap(76, 76, 76))
        );

        PPainel.add(Principal, "card2");

        MATRICULA.setText("MATRICULA:");

        NOME.setText("NOME:");

        DATA_DE_NASCIMENTO.setText("DATA DE NASCIMENTO:");

        TELEFONE.setText("TELEFONE:");

        CPF.setText("CPF:");

        IDADE.setText("IDADE:");

        TEXTO_MATRICULA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TEXTO_MATRICULA.setText("DIGITE A MATRICULA AQUI");

        TEXTO_NOME.setText("DIGITE O NOME AQUI");

        TEXTO_DATA_DE_NASCIMENTO.setText("DIGITE A DATA DO NASCIMENTO AQUI");
        TEXTO_DATA_DE_NASCIMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXTO_DATA_DE_NASCIMENTOActionPerformed(evt);
            }
        });

        TEXT_TELEFONE.setText("DIGITE O TELEFONE AQUI");

        TEXT_CPF.setText("DIGITE O CPF AQUI");
        TEXT_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXT_CPFActionPerformed(evt);
            }
        });

        TEXTO_IDADE.setText("DIGITE A IDADE AQUI");

        ADICIONAR_ALUNO.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ADICIONAR_ALUNO.setText("ADICIONAR ALUNO");
        ADICIONAR_ALUNO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ADICIONAR_ALUNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADICIONAR_ALUNOActionPerformed(evt);
            }
        });

        QUANTIDADE_ALUNOS.setText("QUANTIDADE DE ALUNOS");

        PROCURAR_ALUNO.setText("PROCURAR ALUNO");
        PROCURAR_ALUNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROCURAR_ALUNOActionPerformed(evt);
            }
        });

        TEXT_PROCURAR.setText("PROCURAR");
        TEXT_PROCURAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXT_PROCURARActionPerformed(evt);
            }
        });

        PROCURAR.setText("PROCURAR:");

        ALUNO_V_E_N.setText("MAIS NOVO/VELHO");
        ALUNO_V_E_N.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ALUNO_V_E_N.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        ALUNO_V_E_N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALUNO_V_E_NActionPerformed(evt);
            }
        });

        jButton1.setText("REMOVER ALUNO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("MATRICULA");

        jLabel1.setText("REMOVER:");

        jButton2.setText("ADICIONAR ALUNO 3º");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AlunosLayout = new javax.swing.GroupLayout(Alunos);
        Alunos.setLayout(AlunosLayout);
        AlunosLayout.setHorizontalGroup(
            AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlunosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlunosLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PROCURAR)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TEXT_PROCURAR, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PROCURAR_ALUNO, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(AlunosLayout.createSequentialGroup()
                        .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AlunosLayout.createSequentialGroup()
                                .addComponent(MATRICULA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TEXTO_MATRICULA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(TELEFONE)
                                .addGap(18, 18, 18)
                                .addComponent(TEXT_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AlunosLayout.createSequentialGroup()
                                .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CPF)
                                    .addComponent(NOME))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AlunosLayout.createSequentialGroup()
                                        .addComponent(TEXTO_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DATA_DE_NASCIMENTO)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TEXTO_DATA_DE_NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AlunosLayout.createSequentialGroup()
                                        .addComponent(TEXT_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(IDADE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TEXTO_IDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(AlunosLayout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(QUANTIDADE_ALUNOS))
                            .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ALUNO_V_E_N, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(AlunosLayout.createSequentialGroup()
                                    .addComponent(ADICIONAR_ALUNO, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        AlunosLayout.setVerticalGroup(
            AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MATRICULA)
                    .addComponent(TEXTO_MATRICULA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TELEFONE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOME)
                    .addComponent(TEXTO_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DATA_DE_NASCIMENTO)
                    .addComponent(TEXTO_DATA_DE_NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPF)
                    .addComponent(TEXT_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDADE)
                    .addComponent(TEXTO_IDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADICIONAR_ALUNO, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ALUNO_V_E_N)
                .addGap(18, 18, 18)
                .addComponent(QUANTIDADE_ALUNOS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TEXT_PROCURAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PROCURAR)
                    .addComponent(PROCURAR_ALUNO))
                .addGap(13, 13, 13))
        );

        PPainel.add(Alunos, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlunoActionPerformed
     CardLayout cl = (CardLayout) PPainel.getLayout();
cl.show(PPainel, "card3");
    }//GEN-LAST:event_AlunoActionPerformed

    private void TEXTO_DATA_DE_NASCIMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXTO_DATA_DE_NASCIMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXTO_DATA_DE_NASCIMENTOActionPerformed

    private void TEXT_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXT_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXT_CPFActionPerformed

    private void ADICIONAR_ALUNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADICIONAR_ALUNOActionPerformed
      
    }
       
       
       
    }//GEN-LAST:event_ADICIONAR_ALUNOActionPerformed

    private void PROCURAR_ALUNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROCURAR_ALUNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PROCURAR_ALUNOActionPerformed

    private void TEXT_PROCURARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXT_PROCURARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXT_PROCURARActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ALUNO_V_E_NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALUNO_V_E_NActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ALUNO_V_E_NActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADICIONAR_ALUNO;
    private javax.swing.JButton ALUNO_V_E_N;
    private javax.swing.JButton Aluno;
    private javax.swing.JPanel Alunos;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel DATA_DE_NASCIMENTO;
    private javax.swing.JButton Hibernate;
    private javax.swing.JLabel IDADE;
    private javax.swing.JLabel MATRICULA;
    private javax.swing.JLabel NOME;
    private javax.swing.JLabel Opções;
    private javax.swing.JPanel PPainel;
    private javax.swing.JLabel PROCURAR;
    private javax.swing.JButton PROCURAR_ALUNO;
    private javax.swing.JPanel Principal;
    private javax.swing.JButton QUANTIDADE_ALUNOS;
    private javax.swing.JLabel TELEFONE;
    private javax.swing.JTextField TEXTO_DATA_DE_NASCIMENTO;
    private javax.swing.JTextField TEXTO_IDADE;
    private javax.swing.JTextField TEXTO_MATRICULA;
    private javax.swing.JTextField TEXTO_NOME;
    private javax.swing.JTextField TEXT_CPF;
    private javax.swing.JTextField TEXT_PROCURAR;
    private javax.swing.JTextField TEXT_TELEFONE;
    private javax.swing.JButton TXT;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
