package Currency_Converter;


public class CurrencyConverter extends javax.swing.JFrame {
double US_Dollar = 1.31;
double Bangladeshi_Taka = 109.133;

double Brazilian_Real = 6.65;
double Canadian_Dollar = 1.67;

double Indonesian_Rupiah = 18488.9;
double Indian_Rupee = 96.16;

double Pakistani_Rupee = 209.287;



String[] currencyUnits = {
"Units",
"US Dollar",
"Bangladeshi taka",

"Brazilian Real",
"Canadian Dollar",
"Indonesian Rupiah",
"Indian Rupee",

"Paskistani Rupee"

};
  
    public CurrencyConverter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstCountry = new javax.swing.JComboBox<>();
        secondCountry = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        secondCurrencyUnit = new javax.swing.JLabel();
        firstCurrencyUnit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 5));

        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setText("Simple Currency Converter");

        firstCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstCountry.setForeground(new java.awt.Color(51, 51, 255));
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One...", "USA", "Bangladesh", "Brazil", "Canada", "Indonesia", "India", "Pakistan", " ", " " }));
        firstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstCountryItemStateChanged(evt);
            }
        });
        firstCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCountryActionPerformed(evt);
            }
        });

        secondCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        secondCountry.setForeground(new java.awt.Color(255, 153, 51));
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One...", "USA", "Bangladesh", "Brazil", "Canada", "Indonesia", "India", "Pakistan", " " }));
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("Currency I Have");

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 204));
        jLabel3.setText("Currency I want");

        t1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        t2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Convert Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Reset All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 0, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        secondCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        secondCurrencyUnit.setForeground(new java.awt.Color(255, 0, 102));
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("units");

        firstCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstCurrencyUnit.setForeground(new java.awt.Color(255, 51, 51));
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("units");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1)
                    .addComponent(t2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText("");
        t2.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        double amountToChange=Double.parseDouble(t1.getText());
        double amountChanged=0.0;
        double amountInPounds=0.0;
        
      switch(firstCountry.getSelectedItem().toString())
        {
        case "USA": amountInPounds = amountToChange/US_Dollar;break;
        case "Bangladesh":amountInPounds = amountToChange/Bangladeshi_Taka;break;
	
	case "Brazil":amountInPounds = amountToChange/Brazilian_Real;break;
	case "Canada":amountInPounds = amountToChange/Canadian_Dollar;break;
	
	case "Indonesia":amountInPounds = amountToChange/Indonesian_Rupiah;break;
	case "India":amountInPounds = amountToChange/Indian_Rupee;break;
	
	case "Pakistan":amountInPounds = amountToChange/Pakistani_Rupee;break;
	default:amountInPounds = 0.0;
        }

        //amount is Changed in pounds
        
        switch(secondCountry.getSelectedItem().toString())
        {
        case "USA":amountChanged = amountInPounds * US_Dollar;break;
        case "Bangladesh":amountChanged = amountInPounds * Bangladeshi_Taka;break;
	
	case "Brazil":amountChanged = amountInPounds * Brazilian_Real;break;
	case "Canada":amountChanged = amountInPounds * Canadian_Dollar;break;
	
	case "Indonesia":amountChanged = amountInPounds * Indonesian_Rupiah;break;
	case "India":amountChanged = amountInPounds * Indian_Rupee;break;

	case "Pakistan":amountChanged = amountInPounds * Pakistani_Rupee;break;
	default:amountChanged = amountInPounds * 0.0;
        }
        
        String value = String.format("%.2f",amountChanged);
         
        t2.setText(value);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void firstCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstCountryActionPerformed
       
    }//GEN-LAST:event_firstCountryActionPerformed

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstCountryItemStateChanged
        firstCurrencyUnit.setText(currencyUnits[firstCountry.getSelectedIndex()]);
    }//GEN-LAST:event_firstCountryItemStateChanged

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondCountryItemStateChanged
        secondCurrencyUnit.setText(currencyUnits[secondCountry.getSelectedIndex()]);
    }//GEN-LAST:event_secondCountryItemStateChanged

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
