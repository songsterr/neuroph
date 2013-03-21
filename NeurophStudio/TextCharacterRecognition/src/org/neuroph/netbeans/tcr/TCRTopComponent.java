package org.neuroph.netbeans.tcr;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import org.netbeans.api.settings.ConvertAsProperties;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.learning.DataSet;
import org.neuroph.imgrec.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(dtd = "-//org.neuroph.netbeans.tcr//TCR//EN",
autostore = false)
public final class TCRTopComponent extends TopComponent implements LookupListener {

    private static TCRTopComponent instance;
    /** path to the icon used by the component and its open action */
//    static final String ICON_PATH = "SET/PATH/TO/ICON/HERE";
    private static final String PREFERRED_ID = "TCRTopComponent";
    private Font fontText;
    private int imageWidth;
    private ArrayList<String> imageLabels;
    private int imageHeight;
    private Dimension samplingResolution;
    
    private String trainingSetLabel;
    private HashMap <String, BufferedImage> charImageMap;
    
    private int i;
    private JFileChooser fileChooser;
    private String networkLabel;
    
    private Vector<Integer> hiddenLayersNeuronsCount;
    private NeuralNetwork selectedNeuralNetwork;
    
  //  private OcrUtilService ocrUtils;
    private TextRecognitionManager tcrManager;

    private BufferedImage image;
    
    public TCRTopComponent() {
        initComponents();
        setName(NbBundle.getMessage(TCRTopComponent.class, "CTL_TCRTopComponent"));
        setToolTipText(NbBundle.getMessage(TCRTopComponent.class, "HINT_TCRTopComponent"));
//        setIcon(ImageUtilities.loadImage(ICON_PATH, true));
        putClientProperty(TopComponent.PROP_DRAGGING_DISABLED, Boolean.TRUE);
        putClientProperty(TopComponent.PROP_MAXIMIZATION_DISABLED, Boolean.TRUE);
        putClientProperty(TopComponent.PROP_UNDOCKING_DISABLED, Boolean.TRUE);
        
        
        fileChooser = new JFileChooser();
        tcrManager = TextRecognitionManager.getInstance();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textImagePanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        imageLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loadTextImageButton = new javax.swing.JButton();
        recognizeButton = new javax.swing.JButton();
        topPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        testingNetworkField = new javax.swing.JTextField();
        statusLabel = new javax.swing.JLabel();
        recognizedTextPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        recognizedTextArea = new javax.swing.JTextArea();
        saveTextButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        imageLabel.setPreferredSize(new java.awt.Dimension(334, 313));
        jScrollPane4.setViewportView(imageLabel);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(TCRTopComponent.class, "TCRTopComponent.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(loadTextImageButton, org.openide.util.NbBundle.getMessage(TCRTopComponent.class, "TCRTopComponent.loadTextImageButton.text")); // NOI18N
        loadTextImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadTextImageButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(recognizeButton, org.openide.util.NbBundle.getMessage(TCRTopComponent.class, "TCRTopComponent.recognizeButton.text")); // NOI18N
        recognizeButton.setEnabled(false);
        recognizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recognizeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout textImagePanelLayout = new javax.swing.GroupLayout(textImagePanel);
        textImagePanel.setLayout(textImagePanelLayout);
        textImagePanelLayout.setHorizontalGroup(
            textImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textImagePanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(textImagePanelLayout.createSequentialGroup()
                .addGroup(textImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(textImagePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(loadTextImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(recognizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(textImagePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        textImagePanelLayout.setVerticalGroup(
            textImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textImagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(textImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadTextImageButton)
                    .addComponent(recognizeButton))
                .addContainerGap())
        );

        add(textImagePanel, java.awt.BorderLayout.WEST);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(TCRTopComponent.class, "TCRTopComponent.jLabel1.text")); // NOI18N

        testingNetworkField.setEditable(false);
        testingNetworkField.setText(org.openide.util.NbBundle.getMessage(TCRTopComponent.class, "TCRTopComponent.testingNetworkField.text")); // NOI18N

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(testingNetworkField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(testingNetworkField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(topPanel, java.awt.BorderLayout.NORTH);

        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLabel.setPreferredSize(new java.awt.Dimension(34, 14));
        add(statusLabel, java.awt.BorderLayout.SOUTH);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(TCRTopComponent.class, "TCRTopComponent.jLabel10.text")); // NOI18N

        recognizedTextArea.setColumns(60);
        recognizedTextArea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        recognizedTextArea.setRows(30);
        jScrollPane3.setViewportView(recognizedTextArea);

        org.openide.awt.Mnemonics.setLocalizedText(saveTextButton, org.openide.util.NbBundle.getMessage(TCRTopComponent.class, "TCRTopComponent.saveTextButton.text")); // NOI18N
        saveTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout recognizedTextPanelLayout = new javax.swing.GroupLayout(recognizedTextPanel);
        recognizedTextPanel.setLayout(recognizedTextPanelLayout);
        recognizedTextPanelLayout.setHorizontalGroup(
            recognizedTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recognizedTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recognizedTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recognizedTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(saveTextButton)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addContainerGap())
        );
        recognizedTextPanelLayout.setVerticalGroup(
            recognizedTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recognizedTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveTextButton)
                .addGap(10, 10, 10))
        );

        add(recognizedTextPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void loadTextImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadTextImageButtonActionPerformed
        int returnVal = fileChooser.showDialog(null, "Select image with text");
        if (returnVal == JFileChooser.APPROVE_OPTION) {
                image = ImageUtilities.loadAndCleanImage(fileChooser.getSelectedFile());
                tcrManager.setImage(image) ;
                imageLabel.setIcon(new ImageIcon(  image  ));
                recognizeButton.setEnabled(true);            
        }
}//GEN-LAST:event_loadTextImageButtonActionPerformed

    private void recognizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recognizeButtonActionPerformed

        if (tcrManager.getImageWithText() != null) {
            statusLabel.setText("Please wait! Recognizing text...");
            tcrManager.setNeuralNetwork(selectedNeuralNetwork);
            tcrManager.recognizeText(recognizedTextArea);
            statusLabel.setText("");
        } else {
            statusLabel.setText("You have to load image first!!!");
        }
}//GEN-LAST:event_recognizeButtonActionPerformed

    private void saveTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTextButtonActionPerformed
        FCSaveFile fc = new FCSaveFile();
        fc.setParent(this);
        fc.setVisible(true);
    }//GEN-LAST:event_saveTextButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton loadTextImageButton;
    private javax.swing.JButton recognizeButton;
    private javax.swing.JTextArea recognizedTextArea;
    private javax.swing.JPanel recognizedTextPanel;
    private javax.swing.JButton saveTextButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField testingNetworkField;
    private javax.swing.JPanel textImagePanel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
    /**
     * Gets default instance. Do not use directly: reserved for *.settings files only,
     * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
     * To obtain the singleton instance, use {@link #findInstance}.
     */
    public static synchronized TCRTopComponent getDefault() {
        if (instance == null) {
            instance = new TCRTopComponent();
        }
        return instance;
    }

    /**
     * Obtain the TCRTopComponent instance. Never call {@link #getDefault} directly!
     */
    public static synchronized TCRTopComponent findInstance() {
        TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);
        if (win == null) {
            Logger.getLogger(TCRTopComponent.class.getName()).warning(
                    "Cannot find " + PREFERRED_ID + " component. It will not be located properly in the window system.");
            return getDefault();
        }
        if (win instanceof TCRTopComponent) {
            return (TCRTopComponent) win;
        }
        Logger.getLogger(TCRTopComponent.class.getName()).warning(
                "There seem to be multiple components with the '" + PREFERRED_ID
                + "' ID. That is a potential source of errors and unexpected behavior.");
        return getDefault();
    }

    @Override
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_ALWAYS;
    }

    @Override
    public void componentOpened() {
        // set selected network when this window is opened
        neuralNetResultSets = WindowManager.getDefault().findTopComponent("projectTabLogical_tc").getLookup().lookupResult(NeuralNetwork.class);
        // listen to selections in project view
        neuralNetResultSets.addLookupListener(this);
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    Object readProperties(java.util.Properties p) {
        if (instance == null) {
            instance = this;
        }
        instance.readPropertiesImpl(p);
        return instance;
    }

    private void readPropertiesImpl(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

    @Override
    protected String preferredID() {
        return PREFERRED_ID;
    }

    public JTextArea getRecognizedTextArea() {
        return recognizedTextArea;
    }

    public JLabel getjLabel2() {
        return statusLabel;
    }
    
    Lookup.Result<NeuralNetwork> neuralNetResultSets;
    Lookup.Result<DataSet> trainingSetNetResultSets;

    @Override
    public void resultChanged(LookupEvent le) {
        Lookup.Result r = (Lookup.Result) le.getSource();
        Collection c = r.allInstances();
        if (!c.isEmpty()) {
            Object item = c.iterator().next();
            
            if (item instanceof NeuralNetwork) {
                selectedNeuralNetwork = (NeuralNetwork) item;
                testingNetworkField.setText(selectedNeuralNetwork.getLabel());
            }
        }
    }        
}
