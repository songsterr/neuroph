/*
 * LmsTrainingDialog.java
 *
 * Created on December 24, 2008, 1:14 AM
 */

package org.neuroph.netbeans.main.easyneurons.dialog;

import org.neuroph.netbeans.main.ViewManager;
import org.neuroph.netbeans.main.easyneurons.NeuralNetworkTraining;
import org.neuroph.netbeans.main.easyneurons.errorgraph.GraphFrameTopComponent;
import org.neuroph.nnet.learning.LMS;
import org.neuroph.nnet.learning.MomentumBackpropagation;

/**
 * 
 * @author Zoran Sevarac <sevarac@gmail.com>
 */
public class SupervisedTrainingDialog extends javax.swing.JDialog {
	private static final long serialVersionUID = 1L;
        ViewManager viewManager;
	
	NeuralNetworkTraining trainingController;

	/** Creates new form LmsTrainingDialog */
	public SupervisedTrainingDialog(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	public SupervisedTrainingDialog(java.awt.Frame parent, ViewManager easyNeuronsViewController, boolean modal,
			NeuralNetworkTraining trainingController) {
		super(parent, modal);
		this.trainingController = trainingController;
                this.viewManager=easyNeuronsViewController;
                
		initComponents();
		
		if (this.trainingController.getNetwork().getLearningRule() instanceof MomentumBackpropagation) {
                    momentumLabel.setEnabled(true);
                    momentumtField.setEnabled(true);
		}		
	}



	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        optionsPanel = new javax.swing.JPanel();
        graphCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        trainButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        stoppingCriteriaPanel = new javax.swing.JPanel();
        maxErrorLabel = new javax.swing.JLabel();
        maxErrorField = new javax.swing.JTextField();
        limitIterationsCheckkBox = new javax.swing.JCheckBox();
        maxIterationsField = new javax.swing.JTextField();
        learningParametersPanel = new javax.swing.JPanel();
        learningRateLabel = new javax.swing.JLabel();
        learningRateField = new javax.swing.JTextField();
        momentumLabel = new javax.swing.JLabel();
        momentumtField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(SupervisedTrainingDialog.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setModal(true);
        setName("Form"); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        optionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("optionsPanel.border.title"))); // NOI18N
        optionsPanel.setName("optionsPanel"); // NOI18N

        graphCheckBox.setSelected(true);
        graphCheckBox.setText(resourceMap.getString("graphCheckBox.text")); // NOI18N
        graphCheckBox.setName("graphCheckBox"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graphCheckBox)
                    .addGroup(optionsPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addComponent(graphCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(optionsPanel, gridBagConstraints);

        buttonPanel.setName("buttonPanel"); // NOI18N

        trainButton.setText(resourceMap.getString("trainButton.text")); // NOI18N
        trainButton.setName("trainButton"); // NOI18N
        trainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(trainButton);

        closeButton.setText(resourceMap.getString("closeButton.text")); // NOI18N
        closeButton.setName("closeButton"); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(closeButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(buttonPanel, gridBagConstraints);

        stoppingCriteriaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("stoppingCriteriaPanel.border.title"))); // NOI18N
        stoppingCriteriaPanel.setName("stoppingCriteriaPanel"); // NOI18N
        stoppingCriteriaPanel.setLayout(new java.awt.GridBagLayout());

        maxErrorLabel.setText(resourceMap.getString("maxErrorLabel.text")); // NOI18N
        maxErrorLabel.setName("maxErrorLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        stoppingCriteriaPanel.add(maxErrorLabel, gridBagConstraints);

        maxErrorField.setColumns(8);
        maxErrorField.setText(resourceMap.getString("maxErrorField.text")); // NOI18N
        maxErrorField.setName("maxErrorField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        stoppingCriteriaPanel.add(maxErrorField, gridBagConstraints);

        limitIterationsCheckkBox.setText(resourceMap.getString("limitIterationsCheckkBox.text")); // NOI18N
        limitIterationsCheckkBox.setName("limitIterationsCheckkBox"); // NOI18N
        limitIterationsCheckkBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                limitIterationsCheckkBoxItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        stoppingCriteriaPanel.add(limitIterationsCheckkBox, gridBagConstraints);

        maxIterationsField.setColumns(8);
        maxIterationsField.setEnabled(false);
        maxIterationsField.setName("maxIterationsField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        stoppingCriteriaPanel.add(maxIterationsField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(stoppingCriteriaPanel, gridBagConstraints);

        learningParametersPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("learningParametersPanel.border.title"))); // NOI18N
        learningParametersPanel.setName("learningParametersPanel"); // NOI18N
        learningParametersPanel.setLayout(new java.awt.GridBagLayout());

        learningRateLabel.setText(resourceMap.getString("learningRateLabel.text")); // NOI18N
        learningRateLabel.setName("learningRateLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        learningParametersPanel.add(learningRateLabel, gridBagConstraints);

        learningRateField.setColumns(8);
        learningRateField.setText(resourceMap.getString("learningRateField.text")); // NOI18N
        learningRateField.setName("learningRateField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 80.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        learningParametersPanel.add(learningRateField, gridBagConstraints);

        momentumLabel.setText(resourceMap.getString("momentumLabel.text")); // NOI18N
        momentumLabel.setEnabled(false);
        momentumLabel.setName("momentumLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        learningParametersPanel.add(momentumLabel, gridBagConstraints);

        momentumtField.setColumns(8);
        momentumtField.setText(resourceMap.getString("momentumtField.text")); // NOI18N
        momentumtField.setEnabled(false);
        momentumtField.setName("momentumtField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        learningParametersPanel.add(momentumtField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(learningParametersPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void trainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainButtonActionPerformed
            train();
        }//GEN-LAST:event_trainButtonActionPerformed

        private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
            close();
        }//GEN-LAST:event_closeButtonActionPerformed

	private void limitIterationsCheckkBoxItemStateChanged(
			java.awt.event.ItemEvent evt) {// GEN-FIRST:event_limitIterationsCheckkBoxItemStateChanged
		if (this.maxIterationsField.isEnabled()) {
                                this.maxIterationsField.setEnabled(false);
                            }
		else {
                                this.maxIterationsField.setEnabled(true);
                            }
	}// GEN-LAST:event_limitIterationsCheckkBoxItemStateChanged

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
                    @Override
			public void run() {
				SupervisedTrainingDialog dialog = new SupervisedTrainingDialog(
						new javax.swing.JFrame(), true);
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

	public void close() {
		this.dispose();
	}

	public void train() {
		String learningRateStr = learningRateField.getText().toString();
		String maxErrorStr = maxErrorField.getText().toString();
		String maxIterationsStr = maxIterationsField.getText().toString();
		String momentumStr = momentumtField.getText().toString();

		Double learningRate = new Double(learningRateStr);
		Double maxError = new Double(maxErrorStr);
		Integer maxIterations = new Integer(0);
		Double momentum = new Double(momentumStr);

		if (limitIterationsCheckkBox.isSelected()) {
                   maxIterations = new Integer(maxIterationsStr);
                }

		trainingController.setLmsParams(learningRate, maxError, maxIterations);

		LMS learningRule = (LMS) this.trainingController.getNetwork().getLearningRule();
		 
		if (learningRule instanceof MomentumBackpropagation) {
			((MomentumBackpropagation)learningRule).setMomentum(momentum);
		}
		
                if (graphCheckBox.isSelected()) {
                    GraphFrameTopComponent graphFrame = viewManager.openErrorGraphFrame();
                    graphFrame.observe(learningRule);
                }
                 
                viewManager.openTrainingMonitorWindow(this.trainingController);             

		trainingController.train();

		this.dispose();
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton closeButton;
    private javax.swing.JCheckBox graphCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel learningParametersPanel;
    private javax.swing.JTextField learningRateField;
    private javax.swing.JLabel learningRateLabel;
    private javax.swing.JCheckBox limitIterationsCheckkBox;
    private javax.swing.JTextField maxErrorField;
    private javax.swing.JLabel maxErrorLabel;
    private javax.swing.JTextField maxIterationsField;
    private javax.swing.JLabel momentumLabel;
    private javax.swing.JTextField momentumtField;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JPanel stoppingCriteriaPanel;
    private javax.swing.JButton trainButton;
    // End of variables declaration//GEN-END:variables

}