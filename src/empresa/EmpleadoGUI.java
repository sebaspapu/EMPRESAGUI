package empresa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @Integrantes:
 * Sebastian Bolaños Morales
 * Jonathan Tobar Escue
 * Andres Eduardo Fajardo
 * Yosimar Reyes Quiceno
 */
public class EmpleadoGUI extends javax.swing.JFrame {

    public EmpleadoGUI() {
        initComponents();
    }
    
    //ArrayList <Empleado> EmpleadosA;

    ArrayList <Empleado> ListaEmpleados = new ArrayList<>();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cedula = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        salario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Empleo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Departamento = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        MostEDepart = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese la cedula:");

        jLabel2.setText("Ingrese el nombre:");

        jLabel3.setText("Ingrese el apellido:");

        jLabel4.setText("Ingrese la edad:");

        jButton1.setText("¡Registrar!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Area.setColumns(20);
        Area.setRows(5);
        jScrollPane1.setViewportView(Area);

        jButton2.setText("¡Mostrar Empleados Registrados!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingrese el salario:");

        jLabel6.setText("¿A que se dedica?:");

        Empleo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auxiliar", "Programador", "Secretaria" }));

        jLabel7.setText("Departamento:");

        Departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventas", "Produccion", "Informatica" }));

        Area2.setColumns(20);
        Area2.setRows(5);
        jScrollPane2.setViewportView(Area2);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setText("Calcular Promedio de Salarios");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Mostar el Salario más Alto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Aquellos que Ganan más que el Promedio");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Mostrar Salario de Empleados Auxiliares");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Mostrar Empleados de acuerdo al Departamento:");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        MostEDepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventas", "Produccion", "Informatica" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                                .addComponent(MostEDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(MostEDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(112, 112, 112)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Departamento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Empleo, javax.swing.GroupLayout.Alignment.LEADING, 0, 183, Short.MAX_VALUE)
                            .addComponent(salario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cedula, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Empleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
//        EmpleadosA = new ArrayList<>();
//        
//        double cedula1 = Double.parseDouble(cedula.getText());
//        String nombre1 = nombre.getText();
//        String apellido1 = apellido.getText();
//        int edad1 = Integer.parseInt(edad.getText());
//        double salario1 = Double.parseDouble(salario.getText());
//        
//        
//        EmpleadosA.add(new Empleado(cedula1,nombre1,apellido1,edad1,salario1));
//        
//        JOptionPane.showMessageDialog(null, "¡EL EMPLEADO FUE REGISTRADO CON EXITO!");
//        
//        cedula.setText("");
//        nombre.setText("");
//        apellido.setText("");
//        edad.setText("");
//        salario.setText("");


          Empleado llenandoEmple = new Empleado();

        double cedula1 = Double.parseDouble(cedula.getText());
        String nombre1 = nombre.getText();        
        String apellido1 = apellido.getText();
        String Empleo1 = String.valueOf(Empleo.getSelectedItem()); //combo box
        int edad1 = Integer.parseInt(edad.getText());
        double salario1 = Double.parseDouble(salario.getText());
        String Departamento1 = String.valueOf(Departamento.getSelectedItem()); //combo box
        
        llenandoEmple.setCedula(cedula1);
        llenandoEmple.setNombre(nombre1);
        llenandoEmple.setApellido(apellido1);
        llenandoEmple.setEdad(edad1);
        llenandoEmple.setSalario(salario1);
        llenandoEmple.setEmpleo(Empleo1);
        llenandoEmple.setDepartamento(Departamento1);
        
        
        ListaEmpleados.add(llenandoEmple);
        
//        for(int i=0; i<ListaEmpleados.size(); i++){
//            
//            System.out.println("Nombre: "+ListaEmpleados.get(i).getNombre()+"\nApellido: "+ListaEmpleados.get(i).getApellido()+"\nEdad: "+
//                    ListaEmpleados.get(i).getEdad()+"\nCedula: "+ListaEmpleados.get(i).getCedula()+"\nSalario: "+ListaEmpleados.get(i).getSalario());
//            
//        }
//        
        
        
        JOptionPane.showMessageDialog(null, "¡EL EMPLEADO FUE REGISTRADO CON EXITO!");
        
        cedula.setText("");
        nombre.setText("");
        apellido.setText("");
        edad.setText("");
        salario.setText("");
                       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void mostrarLista(ArrayList ListaEmple){
                
        for (int i = 0; i < ListaEmple.size(); i++) {
            Area.setText(ListaEmple.toString());
        }
        
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
//        ArrayList<String> arre1 = new ArrayList<>();
//        
//        String [] arreglos = new String[EmpleadosA.size()];
//        
//        for(int i=0; i<EmpleadosA.size(); i++){
//            
//            arreglos[i] = "Nombre: "+EmpleadosA.get(i).getNombre()+"\nApellido: "+EmpleadosA.get(i).getApellido()+"\nEdad: "+
//                    EmpleadosA.get(i).getEdad()+"\nCedula: "+EmpleadosA.get(i).getCedula()+"\nSalario: "+EmpleadosA.get(i).getSalario();
//            
//        }
//        
//        
//        for(int i=0; i<EmpleadosA.size(); i++){
//                                    
//            Area.setText(EmpleadosA.toString());
//                        
//        }
//                
        mostrarLista(ListaEmpleados);
        
    }//GEN-LAST:event_jButton2ActionPerformed

     public double promedioSalariosEm(ArrayList<Empleado> ListaEmple) {
        double promedio;
        double suma = 0;
        Empleado llenandoEmple;
//        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ListaEmple.size(); i++) {
            llenandoEmple = ListaEmple.get(i);
            suma += llenandoEmple.getSalario();
        }

        promedio = suma / ListaEmple.size();

        return promedio;
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                
        double promedio = promedioSalariosEm(ListaEmpleados);
        Area2.setText("El promedio para los salarios de los Empleados Ingresados es: "+
                String.valueOf(promedio));
        System.out.println("El promedio para los salarios de los Empleados Ingresados es: "+
                String.valueOf(promedio));        
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public Empleado mayorSalarioEM(ArrayList<Empleado> ListaEmple) {
        
        Empleado mayorSalario = ListaEmple.get(0);

        for (int i = 0; i < ListaEmple.size(); i++) {
            if (ListaEmple.get(i).getSalario() > mayorSalario.getSalario());
            mayorSalario = ListaEmple.get(i);
        }
        return mayorSalario;
    }
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                
        Empleado llenandoEmple2;
        llenandoEmple2 = mayorSalarioEM(ListaEmpleados);

        Area2.setText("El salario más Alto es de:\n$ " + llenandoEmple2.getSalario() + 
                "\nY quien gana ésta cifra es:\n" + llenandoEmple2.getNombre());
        System.out.println("El salario más Alto es de:\n$ " + llenandoEmple2.getSalario() + 
                "\nY quien gana ésta cifra es:\n" + llenandoEmple2.getNombre());
        
    }//GEN-LAST:event_jButton4ActionPerformed

    
     public ArrayList gananMasDelPromedioEM(ArrayList<Empleado> ListaEmple) {
        double promedio = promedioSalariosEm(ListaEmple);
        ArrayList<Empleado> llenandoEmple = new ArrayList();

        for (int i = 0; i < ListaEmple.size(); i++) {
            if (ListaEmple.get(i).getSalario() > promedio) {
                llenandoEmple.add(ListaEmple.get(i));
            }
        }
        return llenandoEmple;
    }
    
    
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                
        ArrayList<Empleado> llenandoEmple;
        llenandoEmple = gananMasDelPromedioEM(ListaEmpleados);
        for (int i = 0; i < llenandoEmple.size(); i++) {
            Area2.setText("Empleados que ganan mas que el Promedio: \n"+llenandoEmple.toString());
            System.out.println("Empleados que ganan mas que el Promedio: \n"+llenandoEmple.toString());    
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    
     public ArrayList salarioAuxiliaresEM(ArrayList<Empleado> ListaEmple) {
        String Empleo1;
        Empleo1 = "Auxiliar";
        ArrayList<Empleado> llenandoEmple = new ArrayList();

        for (int i = 0; i < ListaEmple.size(); i++) {
            if (ListaEmple.get(i).getEmpleo().equals(Empleo1)) {
                llenandoEmple.add(ListaEmple.get(i));
            }
        }
        return llenandoEmple;
    }
    
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
                
         ArrayList<Empleado> llenandoEmple;
         
        StringBuilder ListEmple = new StringBuilder();
        
        llenandoEmple = salarioAuxiliaresEM(ListaEmpleados);
        
        for (int i = 0; i < llenandoEmple.size(); i++) {
            ListEmple.append(llenandoEmple.get(i).getNombre());
            ListEmple.append("\n$ ");
            ListEmple.append(llenandoEmple.get(i).getSalario());
            ListEmple.append("\n\n");
                
        }
        
        Area2.setText(String.valueOf("Lista de los Salarios de los Empleados que son Auxiliares: \n"+ListEmple));               
        System.out.println("Lista de los Salarios de los Empleados que son Auxiliares:\n"+ListEmple);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    
     public ArrayList mostrarPorDepartamento(ArrayList<Empleado> lista, String departamento) {
        ArrayList<Empleado> aux = new ArrayList();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDepartamento().equals(departamento)) {
                aux.add(lista.get(i));
            }
        }
        return aux;
    }   
        
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
                
        String departamento = String.valueOf(MostEDepart.getSelectedItem());
        
        StringBuilder ListEmple = new StringBuilder();
         
        ArrayList<Empleado> llenandoEmple;
        
        llenandoEmple = mostrarPorDepartamento(ListaEmpleados, departamento);
        
        for (int i = 0; i < llenandoEmple.size(); i++) {
            ListEmple.append(llenandoEmple.get(i).getNombre());
            ListEmple.append("\n");
        }
        Area2.setText("Lista de Empleados del Departamento de "+departamento+" : \n"+String.valueOf(ListEmple));
        System.out.println("Lista de Empleados del Departamento de "+departamento+" : \n"+String.valueOf(ListEmple));
        
    }//GEN-LAST:event_jButton7ActionPerformed

    
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
            java.util.logging.Logger.getLogger(EmpleadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area;
    private javax.swing.JTextArea Area2;
    private javax.swing.JComboBox<String> Departamento;
    private javax.swing.JComboBox<String> Empleo;
    private javax.swing.JComboBox<String> MostEDepart;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField edad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField salario;
    // End of variables declaration//GEN-END:variables
}
