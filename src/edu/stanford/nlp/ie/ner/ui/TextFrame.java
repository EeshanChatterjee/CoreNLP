package edu.stanford.nlp.ie.ner.ui;

import javax.swing.*;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * A simple frame that displays text, and allows the user to save it to a file.
 *
 * @author Huy Nguyen
 */
public class TextFrame extends javax.swing.JFrame {
  /**
   * 
   */
  private static final long serialVersionUID = 490366623220471559L;
  JFileChooser jfc;

  /**
   * Creates new form TextFrame
   */
  public TextFrame(JFileChooser jfc) {
    this.jfc = jfc;
    initComponents();
  }

  public void setText(String text) {
    textPane.setText(text);
    textPane.setCaretPosition(0);
  }

  /**
   * This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents()//GEN-BEGIN:initComponents
  {
    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    textPane = new javax.swing.JTextPane();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    saveItem = new javax.swing.JMenuItem();
    jSeparator1 = new javax.swing.JSeparator();
    exitItem = new javax.swing.JMenuItem();

    setTitle("Processed text");
    addWindowListener(new java.awt.event.WindowAdapter() {
      @Override
      public void windowClosing(java.awt.event.WindowEvent evt) {
        setVisible(false);
      }
    });

    jPanel1.setLayout(new java.awt.BorderLayout());

    jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
    jScrollPane1.setViewportView(textPane);

    jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    jMenu1.setMnemonic('f');
    jMenu1.setText("File");
    saveItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
    saveItem.setMnemonic('s');
    saveItem.setText("Save");
    saveItem.setToolTipText("Save this document.");
    saveItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        saveItemActionPerformed(evt);
      }
    });

    jMenu1.add(saveItem);
    jMenu1.add(jSeparator1);
    exitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
    exitItem.setMnemonic('x');
    exitItem.setText("Exit");
    exitItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitItemActionPerformed(evt);
      }
    });

    jMenu1.add(exitItem);
    jMenuBar1.add(jMenu1);
    setJMenuBar(jMenuBar1);

    pack();
  }//GEN-END:initComponents

  private void exitItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_exitItemActionPerformed
  {//GEN-HEADEREND:event_exitItemActionPerformed
    setVisible(false);
  }//GEN-LAST:event_exitItemActionPerformed

  private void saveItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveItemActionPerformed
  {//GEN-HEADEREND:event_saveItemActionPerformed
    int ret = jfc.showSaveDialog(this);
    if (ret == JFileChooser.APPROVE_OPTION) {
      try {
        BufferedWriter bw = new BufferedWriter(new FileWriter(jfc.getSelectedFile()));
        bw.write(textPane.getText());
        bw.close();
      } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error saving file", "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }//GEN-LAST:event_saveItemActionPerformed

  /**
   * Exit the Application
   */
  private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
    System.exit(0);
  }//GEN-LAST:event_exitForm

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    new TextFrame(new JFileChooser()).setVisible(true);
  }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JMenuItem saveItem;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextPane textPane;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenuItem exitItem;
  private javax.swing.JMenuBar jMenuBar1;
  // End of variables declaration//GEN-END:variables

}