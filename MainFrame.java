/**
 *
 * MainFrame.java
 *
 * Class {@code MainFrame} berfungsi untuk menampilkan frame utama dan menyusun widgets yang dibutuhkan.
 * Struktur GUI pada file ini disusun menggunakan IDE Netbeans.
 * <br><br>
 * 
 * Untuk keperluan Tugas 1, anda tidak perlu memodifikasi file ini.
 * 
 * @author  Ade Azurat for DPBO 2008 @ Fasilkom UI
 * @author  Ade Azurat modified for DDP2 2023 @ Fasilkom UI
 */
public class MainFrame extends javax.swing.JFrame {
    static MainFrame mainFrame;
    private Informasi info;    
    private Kurakura kurakura;
    private Perintah perintah;
    
    /** Creates new form MainFrame */
    public MainFrame() {        
        info = new Informasi(mainFrame,true);        
        kurakura = new Kurakura();
        initComponents(); 
        kurakura.setSize(canvas.getWidth(), canvas.getHeight());
        kurakura.reset();
        perintah = new Perintah(kurakura,canvas);                
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        labelTugas = new javax.swing.JLabel();
        canvas = new Canvas(kurakura);
        labelInput = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        informasi = new javax.swing.JButton();
        lakukan = new javax.swing.JButton();
        status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kura-kuraku");
        setMinimumSize(new java.awt.Dimension(450, 455));
        setResizable(false);
        getContentPane().setLayout(null);

        labelTitle.setFont(new java.awt.Font("Arial", 0, 18));
        labelTitle.setText("DDP2 SP 2023 - Fasilkom UI");
        getContentPane().add(labelTitle);
        labelTitle.setBounds(110, 30, 260, 22);

        labelTugas.setFont(new java.awt.Font("Arial", 0, 18));
        labelTugas.setText("Kura-kuraku");
        getContentPane().add(labelTugas);
        labelTugas.setBounds(160, 60, 180, 22);

        canvas.setBackground(new java.awt.Color(51, 0, 204));
        canvas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        canvas.setMinimumSize(new java.awt.Dimension(400, 250));
        canvas.setPreferredSize(new java.awt.Dimension(500, 350));
        canvas.setLayout(null);
        getContentPane().add(canvas);
        canvas.setBounds(10, 170, 420, 240);

        labelInput.setFont(new java.awt.Font("Arial", 0, 11));
        labelInput.setText("Perintah Anda:");
        labelInput.setMaximumSize(new java.awt.Dimension(200, 14));
        labelInput.setMinimumSize(new java.awt.Dimension(200, 14));
        getContentPane().add(labelInput);
        labelInput.setBounds(10, 110, 80, 14);

        input.setText("<Tuliskan perintah anda disini>");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputFocusGained(evt);
            }
        });
        getContentPane().add(input);
        input.setBounds(100, 110, 220, 20);

        informasi.setFont(new java.awt.Font("Arial", 0, 11));
        informasi.setText("Informasi");
        informasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informasiActionPerformed(evt);
            }
        });
        getContentPane().add(informasi);
        informasi.setBounds(330, 140, 100, 20);

        lakukan.setFont(new java.awt.Font("Arial", 0, 11));
        lakukan.setText("Lakukan");
        lakukan.setMaximumSize(new java.awt.Dimension(100, 23));
        lakukan.setMinimumSize(new java.awt.Dimension(100, 23));
        lakukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakukanActionPerformed(evt);
            }
        });
        getContentPane().add(lakukan);
        lakukan.setBounds(330, 110, 100, 20);

        status.setFont(new java.awt.Font("Arial", 0, 11));
        status.setLabelFor(input);
        status.setText("  Tuliskan perintah anda untuk memunculkan kurakura. ");
        status.setToolTipText("Reaksi kura-kura");
        status.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(status);
        status.setBounds(10, 140, 310, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lakukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakukanActionPerformed
        inputActionPerformed(evt);
}//GEN-LAST:event_lakukanActionPerformed

    /**
     * @param event - untuk tugas kali ini dapat diabaikan
     */
    private void informasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informasiActionPerformed
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                info.setVisible(true);
            }
        });
}//GEN-LAST:event_informasiActionPerformed
    /**
     * @param event - untuk tugas kali ini dapat diabaikan
     */
    private void inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputFocusGained
        input.setText("");
}//GEN-LAST:event_inputFocusGained
    /**
     * @param event - untuk tugas kali ini dapat diabaikan
     */
    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // lakukan perintah yang diberikan.
        if (!(input.getText().isEmpty()))
            status.setText("  "+ perintah.lakukan(input.getText()));
        else 
            status.setText("  Kura-kura siap menerima perintah.");
}//GEN-LAST:event_inputActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (mainFrame==null) mainFrame = new MainFrame();
                mainFrame.setVisible(true);   
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Canvas canvas;
    private javax.swing.JButton informasi;
    private javax.swing.JTextField input;
    private javax.swing.JLabel labelInput;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTugas;
    private javax.swing.JButton lakukan;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
    
}