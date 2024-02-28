package calculator;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Calculator extends javax.swing.JFrame {

    boolean adicao, reducao, divisao, multiplicacao = false;
    int value1, value2, res;
    String path = "C:\\System.files\\File1.txt";

    public Calculator() {
        initComponents();
    }

    public int getValue() {
        return Integer.parseInt(Result.getText());
    }

    public void clear() {
        Result.setText("");
    }

    public void setType(String type) {
        switch (type) {
            case "adicao" -> {
                resetType();
                adicao = true;
                break;
            }
            case "reducao" -> {
                resetType();
                reducao = true;
                break;
            }
            case "multiplicacao" -> {
                resetType();
                multiplicacao = true;
                break;
            }
            case "divisao" -> {
                resetType();
                divisao = true;
                break;
            }
        }
    }

    public void setResult(int res) {
        Result.setText(Integer.toString(res));
    }

    public void resetType() {
        adicao = false;
        reducao = false;
        multiplicacao = false;
        divisao = false;
    }

    public void write(String str) {
        TXTArea.append(str);
    }
    
    public void abrir () {
        FileReader arquivo = null;
        String content = "";
        try {
            arquivo = new FileReader(path);
            Scanner sc = new Scanner(arquivo);
            while(sc.hasNextLine()) {
                content += sc.nextLine()+"\n";
            }
            TXTArea.setText(content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Result = new javax.swing.JTextField();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnIgual1 = new javax.swing.JButton();
        btnIgual2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTArea = new javax.swing.JTextArea();
        BTNAbrir = new javax.swing.JButton();
        BTNSalvar = new javax.swing.JButton();
        BTNClear = new javax.swing.JButton();
        BTNProcurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Result.setBackground(new java.awt.Color(204, 204, 204));
        Result.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Result.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Result.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultActionPerformed(evt);
            }
        });
        jPanel1.add(Result, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 300, 90));

        btn8.setBackground(new java.awt.Color(204, 204, 204));
        btn8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 186, 73, 73));

        btn9.setBackground(new java.awt.Color(204, 204, 204));
        btn9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 186, 73, 73));

        btn3.setBackground(new java.awt.Color(204, 204, 204));
        btn3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 367, 73, 73));

        btn7.setBackground(new java.awt.Color(204, 204, 204));
        btn7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 186, 73, 73));

        btnMenos.setBackground(new java.awt.Color(204, 204, 204));
        btnMenos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMenos.setText("-");
        btnMenos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 276, 73, 73));

        btn6.setBackground(new java.awt.Color(204, 204, 204));
        btn6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 276, 73, 73));

        btn4.setBackground(new java.awt.Color(204, 204, 204));
        btn4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 276, 73, 73));

        btn5.setBackground(new java.awt.Color(204, 204, 204));
        btn5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn5.setText("5");
        btn5.setToolTipText("");
        btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 276, 73, 73));

        btn2.setBackground(new java.awt.Color(204, 204, 204));
        btn2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 367, 73, 73));

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 367, 73, 73));

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton11.setText("1");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 367, 73, 73));

        btnMais.setBackground(new java.awt.Color(204, 204, 204));
        btnMais.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMais.setText("+");
        btnMais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisActionPerformed(evt);
            }
        });
        jPanel1.add(btnMais, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 367, 73, 73));

        btnDiv.setBackground(new java.awt.Color(204, 204, 204));
        btnDiv.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDiv.setText("/");
        btnDiv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        jPanel1.add(btnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 73, 73));

        btnClear.setBackground(new java.awt.Color(204, 204, 204));
        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnClear.setText("C");
        btnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 73, 73));

        btn0.setBackground(new java.awt.Color(204, 204, 204));
        btn0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 458, 73, 73));

        btnX.setBackground(new java.awt.Color(204, 204, 204));
        btnX.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnX.setText("X");
        btnX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        jPanel1.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 186, 73, 73));

        btnIgual1.setBackground(new java.awt.Color(204, 204, 204));
        btnIgual1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIgual1.setText("=");
        btnIgual1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnIgual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgual1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnIgual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 458, 73, 73));

        btnIgual2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIgual2.setText("=");
        btnIgual2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnIgual2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgual2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnIgual2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 458, 73, 73));

        TXTArea.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TXTArea.setLineWrap(true);
        TXTArea.setAlignmentX(1.0F);
        TXTArea.setAlignmentY(1.0F);
        TXTArea.setAutoscrolls(false);
        TXTArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jScrollPane1.setViewportView(TXTArea);

        BTNAbrir.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        BTNAbrir.setText("Abrir");
        BTNAbrir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        BTNAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAbrirActionPerformed(evt);
            }
        });

        BTNSalvar.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        BTNSalvar.setText("Salvar");
        BTNSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        BTNSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSalvarActionPerformed(evt);
            }
        });

        BTNClear.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        BTNClear.setText("Clear");
        BTNClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        BTNClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNClearActionPerformed(evt);
            }
        });

        BTNProcurar.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        BTNProcurar.setText("Procurar");
        BTNProcurar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        BTNProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNProcurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BTNAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BTNSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BTNProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BTNClear, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNClear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        Result.setText(Result.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        Result.setText(Result.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        Result.setText(Result.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisActionPerformed
        //MAIS
        value1 = getValue();
        setType("adicao");
        write(Integer.toString(value1) + "\n+\n");
        clear();
    }//GEN-LAST:event_btnMaisActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        //DIVISÃO
        value1 = getValue();
        setType("divisao");
        write(Integer.toString(value1) + "\n/\n");
        clear();
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        value1 = 0;
        value2 = 0;
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        Result.setText(Result.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        Result.setText(Result.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        Result.setText(Result.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        Result.setText(Result.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        Result.setText(Result.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        Result.setText(Result.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        Result.setText(Result.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        //MULTIPLICAÇÂO
        value1 = getValue();
        setType("multiplicacao");
        write(Integer.toString(value1) + "\n*\n");
        clear();
    }//GEN-LAST:event_btnXActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        //MENOS
        value1 = getValue();
        setType("reducao");
        write(Integer.toString(value1) + "\n-\n");
        clear();
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnIgual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgual1ActionPerformed
        //RESULTADO
        value2 = getValue();
        if (adicao) {
            res = value1 + value2;
        } else if (reducao) {
            res = value1 - value2;
        } else if (multiplicacao) {
            res = value1 * value2;
        } else if (divisao) {
            res = (int) (value1 / value2);
        }
        setResult(res);
        write(Integer.toString(value2) + "\n=\n" + res);
        resetType();
    }//GEN-LAST:event_btnIgual1ActionPerformed

    private void btnIgual2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgual2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIgual2ActionPerformed

    private void BTNSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSalvarActionPerformed
        PrintWriter arquivo = null;

        try {
            arquivo = new PrintWriter(path);
            arquivo.write(TXTArea.getText());
            arquivo.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_BTNSalvarActionPerformed

    private void BTNAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAbrirActionPerformed
        abrir();
    }//GEN-LAST:event_BTNAbrirActionPerformed

    private void BTNClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNClearActionPerformed
        TXTArea.setText("");
        clear();
    }//GEN-LAST:event_BTNClearActionPerformed

    private void BTNProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNProcurarActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.showOpenDialog(this);
        
        File arquivo = fc.getSelectedFile();
        path = arquivo.getPath();
        abrir();
    }//GEN-LAST:event_BTNProcurarActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAbrir;
    private javax.swing.JButton BTNClear;
    private javax.swing.JButton BTNProcurar;
    private javax.swing.JButton BTNSalvar;
    private javax.swing.JTextField Result;
    private javax.swing.JTextArea TXTArea;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnIgual1;
    private javax.swing.JButton btnIgual2;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnX;
    private javax.swing.JButton jButton11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
