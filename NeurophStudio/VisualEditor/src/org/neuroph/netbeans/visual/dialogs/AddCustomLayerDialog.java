package org.neuroph.netbeans.visual.dialogs;

import java.util.ArrayList;
import org.neuroph.core.Layer;
import org.neuroph.core.Neuron;
import org.neuroph.core.input.InputFunction;
import org.neuroph.core.transfer.TransferFunction;
import org.neuroph.netbeans.visual.widgets.NeuralNetworkScene;
import org.neuroph.util.NeuronFactory;
import org.neuroph.util.NeuronProperties;
import org.neuroph.util.Neuroph;
import org.openide.util.Exceptions;

/**
 *
 * @author hrza
 */
public class AddCustomLayerDialog extends javax.swing.JDialog {

    NeuralNetworkScene scene;
    int layerIdx;
    /**
     * Creates new form AddCustomLayerDialog
     */
    public AddCustomLayerDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fillCombos();
       
        
    }

    public AddCustomLayerDialog(java.awt.Frame parent, boolean modal, NeuralNetworkScene scene, int layerIdx) {
        super(parent, modal);
        initComponents();
        this.scene = scene;
        fillCombos();
        this.layerIdx = layerIdx;
    }

    public final void fillCombos() {
        ArrayList inputFuncs = Neuroph.getInstance().getInputFunctions();
        javax.swing.DefaultComboBoxModel inputFunctionComboBoxModel = (new javax.swing.DefaultComboBoxModel(inputFuncs.toArray()));
        neuronInputFunctionComboBox.setModel(inputFunctionComboBoxModel);
        
        ArrayList transferFuncs = Neuroph.getInstance().getTransferFunctions();
        javax.swing.DefaultComboBoxModel transferFunctionComboBoxModel = (new javax.swing.DefaultComboBoxModel(transferFuncs.toArray()));
        neuronTransferFunctionComboBox.setModel(transferFunctionComboBoxModel);        

        ArrayList neuronClasses = Neuroph.getInstance().getNeurons();
        javax.swing.DefaultComboBoxModel neuronsComboBoxModel = (new javax.swing.DefaultComboBoxModel(neuronClasses.toArray()));
        neuronTypeComboBox.setModel(neuronsComboBoxModel);     
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
        neuronTypeLabel = new javax.swing.JLabel();
        neuronTypeComboBox = new javax.swing.JComboBox();
        numberOfNeuronsLabel = new javax.swing.JLabel();
        numberOfNeuronsTextField = new javax.swing.JTextField();
        neuronInputF = new javax.swing.JLabel();
        neuronInputFunctionComboBox = new javax.swing.JComboBox();
        neuronTransferFunctionLabel = new javax.swing.JLabel();
        neuronTransferFunctionComboBox = new javax.swing.JComboBox();
        numberOfLayersLabel = new javax.swing.JLabel();
        numberOfLayersTextField = new javax.swing.JTextField();
        createLayersButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(AddCustomLayerDialog.class, "AddCustomLayerDialog.title")); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        neuronTypeLabel.setText(org.openide.util.NbBundle.getMessage(AddCustomLayerDialog.class, "AddCustomLayerDialog.neuronTypeLabel.text")); // NOI18N

        numberOfNeuronsLabel.setText(org.openide.util.NbBundle.getMessage(AddCustomLayerDialog.class, "AddCustomLayerDialog.numberOfNeuronsLabel.text")); // NOI18N

        numberOfNeuronsTextField.setText(org.openide.util.NbBundle.getMessage(AddCustomLayerDialog.class, "AddCustomLayerDialog.numberOfNeuronsTextField.text")); // NOI18N

        neuronInputF.setText(org.openide.util.NbBundle.getMessage(AddCustomLayerDialog.class, "AddCustomLayerDialog.neuronInputF.text")); // NOI18N

        neuronTransferFunctionLabel.setText(org.openide.util.NbBundle.getMessage(AddCustomLayerDialog.class, "AddCustomLayerDialog.neuronTransferFunctionLabel.text")); // NOI18N

        numberOfLayersLabel.setText(org.openide.util.NbBundle.getMessage(AddCustomLayerDialog.class, "AddCustomLayerDialog.numberOfLayersLabel.text")); // NOI18N

        numberOfLayersTextField.setText(org.openide.util.NbBundle.getMessage(AddCustomLayerDialog.class, "AddCustomLayerDialog.numberOfLayersTextField.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neuronTypeLabel)
                            .addComponent(neuronInputF))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neuronInputFunctionComboBox, 0, 137, Short.MAX_VALUE)
                            .addComponent(neuronTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberOfNeuronsLabel)
                            .addComponent(neuronTransferFunctionLabel))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neuronTransferFunctionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numberOfNeuronsTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numberOfLayersLabel)
                        .addGap(56, 56, 56)
                        .addComponent(numberOfLayersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neuronTypeLabel)
                    .addComponent(neuronTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neuronInputF)
                    .addComponent(neuronInputFunctionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neuronTransferFunctionLabel)
                    .addComponent(neuronTransferFunctionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfNeuronsLabel)
                    .addComponent(numberOfNeuronsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfLayersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberOfLayersLabel))
                .addGap(83, 83, 83))
        );

        createLayersButton.setText(org.openide.util.NbBundle.getMessage(AddCustomLayerDialog.class, "AddCustomLayerDialog.createLayersButton.text")); // NOI18N
        createLayersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLayersButtonActionPerformed(evt);
            }
        });

        cancelButton.setText(org.openide.util.NbBundle.getMessage(AddCustomLayerDialog.class, "AddCustomLayerDialog.cancelButton.text")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(createLayersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createLayersButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createLayersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLayersButtonActionPerformed
        try {

            Class<? extends Neuron> someNeuron = ((String) neuronTypeComboBox.getSelectedItem()).equals("Neuron")
                    ? (Class<? extends Neuron>) Class.forName("org.neuroph.core." + (String) neuronTypeComboBox.getSelectedItem())
                    : (Class<? extends Neuron>) Class.forName("org.neuroph.nnet.comp.neuron." + (String) neuronTypeComboBox.getSelectedItem());
            Class<? extends TransferFunction> someTF = (Class<? extends TransferFunction>) Class.forName("org.neuroph.core.transfer." + ((String) neuronTransferFunctionComboBox.getSelectedItem()).trim());
            Class<? extends InputFunction> someIF = (Class<? extends InputFunction>) Class.forName("org.neuroph.core.input." + ((String) neuronInputFunctionComboBox.getSelectedItem()).trim());
            int numberOfNeurons = Integer.valueOf(numberOfNeuronsTextField.getText());
            int numberOfLayers = Integer.valueOf(numberOfLayersTextField.getText());
            
            for (int i = 0; i < numberOfLayers; i++) {
                Layer newLayer = new Layer();
                for (int j = 0; j < numberOfNeurons; j++) {
                    Neuron newNeuron = NeuronFactory.createNeuron(new NeuronProperties(someNeuron, someIF, someTF));
                    newLayer.addNeuron(newNeuron);
                }
               
                scene.getNeuralNetwork().addLayer(layerIdx, newLayer);

                this.dispose();
            }
            scene.refresh();


        } catch (ClassNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_createLayersButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddCustomLayerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomLayerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomLayerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomLayerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddCustomLayerDialog dialog = new AddCustomLayerDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createLayersButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel neuronInputF;
    private javax.swing.JComboBox neuronInputFunctionComboBox;
    private javax.swing.JComboBox neuronTransferFunctionComboBox;
    private javax.swing.JLabel neuronTransferFunctionLabel;
    private javax.swing.JComboBox neuronTypeComboBox;
    private javax.swing.JLabel neuronTypeLabel;
    private javax.swing.JLabel numberOfLayersLabel;
    private javax.swing.JTextField numberOfLayersTextField;
    private javax.swing.JLabel numberOfNeuronsLabel;
    private javax.swing.JTextField numberOfNeuronsTextField;
    // End of variables declaration//GEN-END:variables
}
