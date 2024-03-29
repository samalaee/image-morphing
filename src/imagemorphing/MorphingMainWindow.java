/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MorphingMainWindow.java
 *
 * Created on 15-ago-2011, 12:52:09
 */
package imagemorphing;

import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author Samuel
 */
public class MorphingMainWindow extends JFrame {
    
    private static final String MESH_EXT = "msh";
    
    /** Creates new form MorphingMainWindow */
    public MorphingMainWindow() {
        initComponents();
        sourcePanel.setDestinationPanel(destinationPanel);
//   PApplet.main(new String[] { "movie2" });
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sourcePanel = new imagemorphing.ImagePanel();
        setSourcePanel = new javax.swing.JButton();
        loadSourcePanelImage = new javax.swing.JButton();
        loadSourcePanelImage1 = new javax.swing.JButton();
        destinationPanel = new imagemorphing.EditMeshPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuNew = new javax.swing.JMenuItem();
        menuExport = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuFunctions = new javax.swing.JMenuItem();
        menuCredits = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Le Morphing");
        setResizable(false);

        sourcePanel.setMaximumSize(new java.awt.Dimension(500, 500));
        sourcePanel.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout sourcePanelLayout = new javax.swing.GroupLayout(sourcePanel);
        sourcePanel.setLayout(sourcePanelLayout);
        sourcePanelLayout.setHorizontalGroup(
            sourcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );
        sourcePanelLayout.setVerticalGroup(
            sourcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        setSourcePanel.setText("Morph");
        setSourcePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setSourcePanelActionPerformed(evt);
            }
        });

        loadSourcePanelImage.setText("Load Image");
        loadSourcePanelImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadSourcePanelImageActionPerformed(evt);
            }
        });

        loadSourcePanelImage1.setText("Load Image");
        loadSourcePanelImage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadSourcePanelImage1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout destinationPanelLayout = new javax.swing.GroupLayout(destinationPanel);
        destinationPanel.setLayout(destinationPanelLayout);
        destinationPanelLayout.setHorizontalGroup(
            destinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );
        destinationPanelLayout.setVerticalGroup(
            destinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenu1MouseReleased(evt);
            }
        });

        menuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuNew.setText("New");
        menuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewActionPerformed(evt);
            }
        });
        jMenu1.add(menuNew);

        menuExport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuExport.setText("Export");
        menuExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExportActionPerformed(evt);
            }
        });
        jMenu1.add(menuExport);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Mesh");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Export Mesh");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Import Mesh");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Help");

        menuFunctions.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuFunctions.setText("Functions");
        menuFunctions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFunctionsActionPerformed(evt);
            }
        });
        jMenu2.add(menuFunctions);

        menuCredits.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menuCredits.setText("Credits");
        menuCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCreditsActionPerformed(evt);
            }
        });
        jMenu2.add(menuCredits);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sourcePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(destinationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loadSourcePanelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(setSourcePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(loadSourcePanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sourcePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadSourcePanelImage)
                    .addComponent(loadSourcePanelImage1)
                    .addComponent(setSourcePanel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void setSourcePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setSourcePanelActionPerformed
    //VideoExporter.exportVideo(null, "laprueba");
    SingleAnimationForm bToA = new SingleAnimationForm(
        destinationPanel.getSourceBuffer(),
        destinationPanel.getTriangulation(),
        sourcePanel.getTriangulation());
    bToA.setTitle("Destination to Origin shape tween");
    SingleAnimationForm aToB = new SingleAnimationForm(
        sourcePanel.getSourceBuffer(),
        sourcePanel.getTriangulation(),
        destinationPanel.getTriangulation());
    aToB.setTitle("Origin to Destination shape tween");
    ComplexAnimationForm fAToB = new ComplexAnimationForm(
        sourcePanel.getSourceBuffer(),
        sourcePanel.getTriangulation(),
        destinationPanel.getSourceBuffer(),
        destinationPanel.getTriangulation());
    fAToB.setTitle("Origin to Destination full morph");
}//GEN-LAST:event_setSourcePanelActionPerformed
private void loadSourcePanelImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadSourcePanelImageActionPerformed
    loadSourceImage();
}//GEN-LAST:event_loadSourcePanelImageActionPerformed
private void loadSourcePanelImage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadSourcePanelImage1ActionPerformed
    loadDestinationImage();
}//GEN-LAST:event_loadSourcePanelImage1ActionPerformed
private void jMenu1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseReleased
// TODO add your handling code here:
    
}//GEN-LAST:event_jMenu1MouseReleased

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    loadMesh();
    sourcePanel.repaint();
    destinationPanel.repaint();
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void menuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewActionPerformed
    sourcePanel.resetPanel();
    destinationPanel.resetPanel();
    sourcePanel.setDestinationPanel(destinationPanel);
}//GEN-LAST:event_menuNewActionPerformed

private void menuExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExportActionPerformed
    /*VideoExporter ve = new VideoExporter(
            sourcePanel.getSourceBuffer(),
            sourcePanel.getTriangulation(),
            destinationPanel.getSourceBuffer(),
            destinationPanel.getTriangulation());
    ve.export();*/
}//GEN-LAST:event_menuExportActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    saveMesh();
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void menuFunctionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFunctionsActionPerformed
    HelpForm hf = new HelpForm();
}//GEN-LAST:event_menuFunctionsActionPerformed

private void menuCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCreditsActionPerformed
    JOptionPane.showMessageDialog(this, 
            "Constructed by Samuel Chavez (cha07351@uvg.edu.gt) under " +
            "GNU GPL v2 Code License. August 2011.", 
            "Credits",
            JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_menuCreditsActionPerformed
private void saveMesh(){
    JFileChooser chooser = new JFileChooser("Select mesh filename:");
    MeshFileFilter filter = new MeshFileFilter();
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(this);
    if(returnVal == JFileChooser.APPROVE_OPTION){
        String fname = chooser.getSelectedFile().getAbsolutePath();
        MeshFileIO.saveMesh(
                sourcePanel.getTriangulation(), 
             destinationPanel.getTriangulation(), 
             fname + "." + MESH_EXT);
    }
}
private void loadMesh(){
    JFileChooser chooser = new JFileChooser("Select mesh filename:");
    MeshFileFilter filter = new MeshFileFilter();
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(this);
    if(returnVal == JFileChooser.APPROVE_OPTION){
        String fname = chooser.getSelectedFile().getAbsolutePath();
        Triangulation[] read = MeshFileIO.loadMesh(fname);
        if(read != null){
            sourcePanel.setTriangulation(read[0]);
            destinationPanel.setTriangulation(read[1]);
        }
        else
            System.out.println("Invalid mesh file.");
                  
    }
}
private void loadSourceImage(){
    JFileChooser chooser = new JFileChooser();
    ImageFileFilter filter = new ImageFileFilter();
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(this);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
       sourcePanel.loadImage(chooser.getSelectedFile().getAbsolutePath());
    }
}
private void loadDestinationImage(){
    JFileChooser chooser = new JFileChooser();
    ImageFileFilter filter = new ImageFileFilter();
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(this);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
       destinationPanel.loadImage(chooser.getSelectedFile().getAbsolutePath());
    }
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
            java.util.logging.Logger.getLogger(MorphingMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MorphingMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MorphingMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MorphingMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MorphingMainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private imagemorphing.EditMeshPanel destinationPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton loadSourcePanelImage;
    private javax.swing.JButton loadSourcePanelImage1;
    private javax.swing.JMenuItem menuCredits;
    private javax.swing.JMenuItem menuExport;
    private javax.swing.JMenuItem menuFunctions;
    private javax.swing.JMenuItem menuNew;
    private javax.swing.JButton setSourcePanel;
    private imagemorphing.ImagePanel sourcePanel;
    // End of variables declaration//GEN-END:variables
}
