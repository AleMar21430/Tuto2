package com.mycompany.tuto_proyecto2;

/**
 *
 * @author marti
 */
public class Interfaz extends javax.swing.JFrame {

    persona Persona = new persona();
    animal Animal = new animal();
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Boton_Animal = new javax.swing.JButton();
        Boton_Persona = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ENT_INFO = new javax.swing.JTextField();
        ENT_TAMANO = new javax.swing.JTextField();
        ENT_PESO = new javax.swing.JTextField();
        ENT_NOMBRE = new javax.swing.JTextField();
        ENT_OJOS = new javax.swing.JTextField();
        ENT_M_F = new javax.swing.JTextField();
        M_F = new javax.swing.JLabel();
        OJOS = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JLabel();
        PESO = new javax.swing.JLabel();
        TAMANO = new javax.swing.JLabel();
        INFO = new javax.swing.JLabel();
        Mostrar_Animal = new javax.swing.JButton();
        Mostrar_Persona = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dpi / Especie");

        Boton_Animal.setText("Store Animal");
        Boton_Animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AnimalActionPerformed(evt);
            }
        });

        Boton_Persona.setText("Store Persona");
        Boton_Persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_PersonaActionPerformed(evt);
            }
        });

        jLabel2.setText("Tama??o");

        jLabel3.setText("Peso");

        jLabel4.setText("Nombre");

        jLabel5.setText("Color de Ojos");

        jLabel6.setText("Macho/Hembra");

        ENT_INFO.setText("Entrada");

        ENT_TAMANO.setText("Entrada");

        ENT_PESO.setText("Entrada");
        ENT_PESO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENT_PESOActionPerformed(evt);
            }
        });

        ENT_NOMBRE.setText("Entrada");

        ENT_OJOS.setText("Entrada");

        ENT_M_F.setText("Entrada");

        M_F.setText("Macho/Hembra");

        OJOS.setText("Color de Ojos");

        NOMBRE.setText("Nombre");

        PESO.setText("Peso");

        TAMANO.setText("Tama??o");

        INFO.setText("Dpi / Especie");

        Mostrar_Animal.setText("Show Data");
        Mostrar_Animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar_AnimalActionPerformed(evt);
            }
        });

        Mostrar_Persona.setText("Show Data");
        Mostrar_Persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar_PersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ENT_INFO, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ENT_TAMANO, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ENT_PESO, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ENT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ENT_OJOS, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ENT_M_F, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 43, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Mostrar_Animal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Boton_Animal, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Boton_Persona, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 3, Short.MAX_VALUE))
                                    .addComponent(Mostrar_Persona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(INFO, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TAMANO, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PESO, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OJOS, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M_F, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ENT_INFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ENT_TAMANO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ENT_PESO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ENT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(ENT_OJOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(ENT_M_F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(INFO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TAMANO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PESO)
                        .addGap(6, 6, 6)
                        .addComponent(NOMBRE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OJOS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(M_F)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Animal)
                    .addComponent(Boton_Persona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mostrar_Animal)
                    .addComponent(Mostrar_Persona))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_AnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AnimalActionPerformed
        Animal.SetSpecies(ENT_INFO.getText());
        Animal.setTama??o(Integer.parseInt(ENT_TAMANO.getText()));
        Animal.setPeso(Integer.parseInt(ENT_PESO.getText()));
        Animal.setNombre(ENT_NOMBRE.getText());
        Animal.setColor_de_ojos(ENT_OJOS.getText());
        if("M".equals(ENT_M_F.getText())){
            Animal.setMale(true);
        }else{
            Animal.setMale(false);
        }
            
    }//GEN-LAST:event_Boton_AnimalActionPerformed

    private void Boton_PersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_PersonaActionPerformed
        Persona.SetDpi(Integer.parseInt(ENT_INFO.getText()));
        Persona.setTama??o(Integer.parseInt(ENT_TAMANO.getText()));
        Persona.setPeso(Integer.parseInt(ENT_PESO.getText()));
        Persona.setNombre(ENT_NOMBRE.getText());
        Persona.setColor_de_ojos(ENT_OJOS.getText());
        if("M".equals(ENT_M_F.getText())){
            Persona.setMale(true);
        }else{
            Persona.setMale(false);
        }
    }//GEN-LAST:event_Boton_PersonaActionPerformed

    private void Mostrar_AnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar_AnimalActionPerformed
        INFO.setText(Animal.GetSpecies());
        TAMANO.setText(String.valueOf(Animal.getTama??o()));
        PESO.setText(String.valueOf(Animal.getPeso()));
        NOMBRE.setText(Animal.getNombre());
        OJOS.setText(Animal.getColor_de_ojos());
        if(Animal.getMale() == true){
            M_F.setText("M"); 
        }else{
            M_F.setText("F");
        }
    }//GEN-LAST:event_Mostrar_AnimalActionPerformed

    private void ENT_PESOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENT_PESOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ENT_PESOActionPerformed

    private void Mostrar_PersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar_PersonaActionPerformed
        INFO.setText(String.valueOf(Persona.GetDpi()));
        TAMANO.setText(String.valueOf(Persona.getTama??o()));
        PESO.setText(String.valueOf(Persona.getPeso()));
        NOMBRE.setText(Persona.getNombre());
        OJOS.setText(Persona.getColor_de_ojos());
        if(Persona.getMale() == true){
            M_F.setText("M"); 
        }else{
            M_F.setText("F");
        }
    }//GEN-LAST:event_Mostrar_PersonaActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Animal;
    private javax.swing.JButton Boton_Persona;
    private javax.swing.JTextField ENT_INFO;
    private javax.swing.JTextField ENT_M_F;
    private javax.swing.JTextField ENT_NOMBRE;
    private javax.swing.JTextField ENT_OJOS;
    private javax.swing.JTextField ENT_PESO;
    private javax.swing.JTextField ENT_TAMANO;
    private javax.swing.JLabel INFO;
    private javax.swing.JLabel M_F;
    private javax.swing.JButton Mostrar_Animal;
    private javax.swing.JButton Mostrar_Persona;
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JLabel OJOS;
    private javax.swing.JLabel PESO;
    private javax.swing.JLabel TAMANO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
