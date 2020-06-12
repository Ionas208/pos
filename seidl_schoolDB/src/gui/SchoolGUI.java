/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.DB_Access;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Set;
import beans.Student;
import io.IO_Helper;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 10jon
 */
public class SchoolGUI extends javax.swing.JFrame {

    /**
     * Creates new form SchoolGUI
     */
    private DB_Access dba;
    private boolean connected = false;
    int currentCat = -1;

    public SchoolGUI() {
        initComponents();
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        dba = DB_Access.getInstance();

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
        btConnect = new javax.swing.JButton();
        btImport = new javax.swing.JButton();
        btExport = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbClass = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btNew = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btBegin = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        btForward = new javax.swing.JButton();
        btEnd = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tfCat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfClass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfFirstname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfSurname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfDoB = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        btConnect.setText("Verbinden");
        btConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onConnect(evt);
            }
        });
        jPanel1.add(btConnect);

        btImport.setText("Importieren");
        btImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onImport(evt);
            }
        });
        jPanel1.add(btImport);

        btExport.setText("Exportieren");
        btExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onExport(evt);
            }
        });
        jPanel1.add(btExport);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel8.setLayout(new java.awt.GridLayout(1, 8));

        jLabel2.setText("Klasse:");
        jPanel8.add(jLabel2);

        cbClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onViewClass(evt);
            }
        });
        jPanel8.add(cbClass);
        jPanel8.add(jLabel4);
        jPanel8.add(jLabel12);
        jPanel8.add(jLabel13);
        jPanel8.add(jLabel14);
        jPanel8.add(jLabel11);

        jPanel3.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SchoolDB");
        jPanel3.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.BorderLayout());

        btNew.setText("Neu");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onNew(evt);
            }
        });
        jPanel6.add(btNew, java.awt.BorderLayout.CENTER);

        jPanel7.setLayout(new java.awt.GridLayout(1, 4));

        btBegin.setText("|<");
        btBegin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBegin(evt);
            }
        });
        jPanel7.add(btBegin);

        btBack.setText("<");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBack(evt);
            }
        });
        jPanel7.add(btBack);

        btForward.setText(">");
        btForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onForward(evt);
            }
        });
        jPanel7.add(btForward);

        btEnd.setText(">|");
        btEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onEnd(evt);
            }
        });
        jPanel7.add(btEnd);

        jPanel6.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jPanel4.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jPanel5.setLayout(new java.awt.GridLayout(3, 4));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Kat-Nr.:");
        jPanel5.add(jLabel5);

        tfCat.setEditable(false);
        jPanel5.add(tfCat);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Klasse:");
        jPanel5.add(jLabel6);

        tfClass.setEditable(false);
        jPanel5.add(tfClass);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Vorname:");
        jPanel5.add(jLabel7);

        tfFirstname.setEditable(false);
        jPanel5.add(tfFirstname);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Nachname:");
        jPanel5.add(jLabel8);

        tfSurname.setEditable(false);
        jPanel5.add(tfSurname);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Geb.dat.:");
        jPanel5.add(jLabel9);

        tfDoB.setEditable(false);
        jPanel5.add(tfDoB);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Alter:");
        jPanel5.add(jLabel10);

        tfAge.setEditable(false);
        jPanel5.add(tfAge);

        jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onNew(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onNew
        String className = null;
        String surname = null;
        String firstname = null;
        String gender = null;
        int day = 0;
        int month = 0;
        int year = 0;
        LocalDate DoB = null;
        try {
            Set<String> classNames = dba.getClassNames();
            do {
                className = JOptionPane.showInputDialog(this, "Gültigen Klassennamen eingeben:");
            } while (!classNames.contains(className));
            firstname = JOptionPane.showInputDialog(this, "Vornamen eingeben: ");
            surname = JOptionPane.showInputDialog(this, "Nachnamen eingeben: ");
            boolean valid = false;
            do {
                gender = JOptionPane.showInputDialog(this, "Geschlecht eingeben (m/w):");
                if (gender.equals("m") || gender.equals("w")) {
                    valid = true;
                }
            } while (!valid);

            valid = false;
            do {
                try {
                    day = Integer.parseInt(JOptionPane.showInputDialog(this, "Geburtsdatum Tag eingeben:"));
                    valid = true;
                } catch (NumberFormatException e) {
                }
            } while (!valid);
            valid = false;
            do {
                try {
                    month = Integer.parseInt(JOptionPane.showInputDialog(this, "Geburtsdatum Monat eingeben:"));
                    valid = true;
                } catch (NumberFormatException e) {
                }
            } while (!valid);
            valid = false;
            do {
                try {
                    year = Integer.parseInt(JOptionPane.showInputDialog(this, "Geburtsdatum Jahr eingeben:"));
                    valid = true;
                } catch (NumberFormatException e) {
                }
            } while (!valid);
            DoB = LocalDate.of(year, month, day);
            Student s = new Student(0, 0, className, firstname, surname, gender, DoB);
            dba.insertNewStudent(className, s);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Bitte Daten zuerst importieren!");
        } catch (NullPointerException ex) {
        } catch (DateTimeException ex) {
            JOptionPane.showMessageDialog(this, "Bitte gültige Datumsangaben eingeben!");
        }

    }//GEN-LAST:event_onNew

    private void onBegin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBegin
        if (currentCat != -1) {
            Student s = null;
            try {
                s = dba.getStudent((String) cbClass.getSelectedItem(), 1);
                currentCat = 1;
            } catch (SQLException ex) {
                Logger.getLogger(SchoolGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RuntimeException ex) {
                JOptionPane.showMessageDialog(this, "Mit keiner Datenbank verbunden!");
            }
            showStudentData(s);
        }

    }//GEN-LAST:event_onBegin

    private void onBack(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBack
        if (currentCat != 1 && currentCat != -1) {
            try {
                Student s = dba.getStudent((String) cbClass.getSelectedItem(), currentCat - 1);
                showStudentData(s);
                //currentCat--;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.toString());
            } catch (RuntimeException ex) {
                JOptionPane.showMessageDialog(this, "Mit keiner Datenbank verbunden!");
            }
        }
    }//GEN-LAST:event_onBack

    private void onForward(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onForward
        try {
            if (currentCat != -1 && currentCat != dba.getMaxCat((String) cbClass.getSelectedItem())) {
                try {
                    Student s = dba.getStudent((String) cbClass.getSelectedItem(), currentCat + 1);
                    showStudentData(s);
                    //currentCat++;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex.toString());
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Mit keiner Datenbank verbunden!");
        }
    }//GEN-LAST:event_onForward

    private void onEnd(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onEnd
        Student s = null;
        if (currentCat != -1) {
            try {
                String classname = (String) cbClass.getSelectedItem();
                int maxCat = dba.getMaxCat(classname);
                s = dba.getStudent(classname, maxCat);
                currentCat = maxCat;
            } catch (SQLException ex) {
                Logger.getLogger(SchoolGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RuntimeException ex) {
                JOptionPane.showMessageDialog(this, "Mit keiner Datenbank verbunden!");
            }
            showStudentData(s);
        }

    }//GEN-LAST:event_onEnd

    private void onConnect(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onConnect
        if (connected) {
            try {
                dba.disconnect();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Verbindung zur Datenbank konnte nicht beendet werden!");
            }
            connected = false;
            btConnect.setText("Verbinden");
        } else {
            try {
                dba.connect();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Verbindung zur Datenbank konnte nicht hergestellt werden!");
            }
            connected = true;
            btConnect.setText("Trennen");
        }

    }//GEN-LAST:event_onConnect

    private void onImport(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onImport
        Set<String> classnames = null;
        try {
            classnames = dba.insertStudents();
            cbClass.removeAllItems();
            for (String classname : classnames) {
                cbClass.addItem(classname);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Fehler beim Einlesen der Datei!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Mit keiner Datenbank verbunden!");
        } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Mit keiner Datenbank verbunden!");
        }

    }//GEN-LAST:event_onImport

    private void onViewClass(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onViewClass
        String className = (String) cbClass.getSelectedItem();
        if (className != null) {
            int catNr = 1;
            Student s = null;
            try {
                s = dba.getStudent(className, catNr);
            } catch (SQLException ex) {

            } catch (NullPointerException ex) {

            } catch (RuntimeException ex) {
                JOptionPane.showMessageDialog(this, "Mit keiner Datenbank verbunden!");
            }
            showStudentData(s);
        }

    }//GEN-LAST:event_onViewClass

    private void onExport(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onExport
        try {
            String fileName = JOptionPane.showInputDialog(this, "Dateinamen eingeben: ");
            List<Student> students = dba.getAllStudents();
            IO_Helper.exportStudents(students, fileName);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.toString());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Fehler bei Datei! Anderen Dateinamen probieren!");
        } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Mit keiner Datenbank verbunden!");
        }

    }//GEN-LAST:event_onExport

    private void showStudentData(Student s) {
        currentCat = s.getCatno();
        tfCat.setText(s.getCatno() + "");
        tfClass.setText(s.getClassname());
        tfFirstname.setText(s.getFirstname());
        tfSurname.setText(s.getSurname());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        tfDoB.setText(dtf.format(s.getDateOfBirth()));
        long age = ChronoUnit.YEARS.between(s.getDateOfBirth(), LocalDate.now());
        tfAge.setText(age + "");
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
            java.util.logging.Logger.getLogger(SchoolGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchoolGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchoolGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchoolGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchoolGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btBegin;
    private javax.swing.JButton btConnect;
    private javax.swing.JButton btEnd;
    private javax.swing.JButton btExport;
    private javax.swing.JButton btForward;
    private javax.swing.JButton btImport;
    private javax.swing.JButton btNew;
    private javax.swing.JComboBox<String> cbClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfCat;
    private javax.swing.JTextField tfClass;
    private javax.swing.JTextField tfDoB;
    private javax.swing.JTextField tfFirstname;
    private javax.swing.JTextField tfSurname;
    // End of variables declaration//GEN-END:variables
}
