
package design;
import java.sql.PreparedStatement;
import java.sql.*;
import clases.Conectarbd;
import java.sql.Connection;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class registro extends javax.swing.JFrame {

    /**
     * Creates new form ventana1
     */
    public registro() {
        initComponents(); 
        
         jPanel2.setVisible(false);
       jPanel3.setVisible(false);
        jPanel4.setVisible(false);
      jPanel5.setVisible(false);
      jPanel6.setVisible(false);
     scroll.setVisible(false);
     scroll2.setVisible(false);
     jPanel23.setVisible(false);
      jPanel10.setVisible(false);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resumen = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        codigo = new javax.swing.JComboBox<>();
        msj = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        a_paterno = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        a_materno = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        fecha_nacimiento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lugar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        domicilio = new javax.swing.JTextField();
        provincia = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        sexo = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ciudad = new javax.swing.JTextField();
        distrito = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        dni = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        categoria = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cuspp = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        pais = new javax.swing.JTextField();
        estado = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        num = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        int_dom = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        brevete = new javax.swing.JComboBox<>();
        pension = new javax.swing.JComboBox<>();
        policial = new javax.swing.JComboBox<>();
        discapacidad = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        nacionalidad = new javax.swing.JComboBox<>();
        departamento = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabla_ee = new javax.swing.JTable();
        lbl_primaria = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        lbl_secundaria = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        ss1 = new javax.swing.JTable();
        javax.swing.JTextField jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jP1 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        empresa1 = new javax.swing.JTextField();
        sector1 = new javax.swing.JTextField();
        rubro1 = new javax.swing.JTextField();
        lugar1 = new javax.swing.JTextField();
        telef1 = new javax.swing.JTextField();
        jP2 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        inicio1 = new javax.swing.JTextField();
        final1 = new javax.swing.JTextField();
        jP4 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        indicaciones1 = new javax.swing.JTextArea();
        jTextField40 = new javax.swing.JTextField();
        jP5 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        motivo1 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        modalidad1 = new javax.swing.JTextField();
        jP6 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        area1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        cargo1 = new javax.swing.JTextField();
        puesto1 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        persCargo1 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        btnSigExperiencia = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        empresa2 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        sector2 = new javax.swing.JTextField();
        rubro2 = new javax.swing.JTextField();
        lugar2 = new javax.swing.JTextField();
        telef2 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        area2 = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        cargo2 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        puesto2 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        persCargo2 = new javax.swing.JTextField();
        jpanel = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        inicio2 = new javax.swing.JTextField();
        final2 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        ingreso2 = new javax.swing.JTextField();
        sueldo2 = new javax.swing.JTextField();
        relaLab2 = new javax.swing.JTextField();
        jefe2 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        indicaciones2 = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        motivo2 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        ingreso1 = new javax.swing.JTextField();
        sueldo1 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        relaLab1 = new javax.swing.JTextField();
        jefe1 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        empresa3 = new javax.swing.JTextField();
        sector3 = new javax.swing.JTextField();
        rubro3 = new javax.swing.JTextField();
        lugar3 = new javax.swing.JTextField();
        telef3 = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        area3 = new javax.swing.JTextField();
        cargo3 = new javax.swing.JTextField();
        puesto3 = new javax.swing.JTextField();
        persCargo3 = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        inicio3 = new javax.swing.JTextField();
        final3 = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        ingreso3 = new javax.swing.JTextField();
        sueldo3 = new javax.swing.JTextField();
        relaLab3 = new javax.swing.JTextField();
        jefe3 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jLabel128 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        indicaciones3 = new javax.swing.JTextArea();
        jPanel22 = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        motivo3 = new javax.swing.JTextField();
        scroll2 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        r1 = new javax.swing.JTextField();
        c2 = new javax.swing.JComboBox<>();
        r2 = new javax.swing.JTextField();
        c3 = new javax.swing.JComboBox<>();
        r3 = new javax.swing.JTextField();
        fp = new javax.swing.JComboBox<>();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        p1 = new javax.swing.JComboBox<>();
        p2 = new javax.swing.JComboBox<>();
        p3 = new javax.swing.JComboBox<>();
        ip1 = new javax.swing.JComboBox<>();
        ip2 = new javax.swing.JComboBox<>();
        ip3 = new javax.swing.JComboBox<>();
        jTextField50 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton17.setBackground(new java.awt.Color(0, 102, 204));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jButton17.setBorder(null);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 60, 40));

        jButton16.setBackground(new java.awt.Color(0, 0, 0));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(890, 712));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 204, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CURRÍCULUM POSTULANTE");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 310, 43));

        jLabel2.setBackground(new java.awt.Color(0, 204, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CÓDIGO:");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 89, 70, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("<html>Indicaciones: Ingrese la información <p>"
            + "requerida, las celdas de color <style='color:rgb(255,0,0);'>celeste</p>"
            + "son de" +
            "carácter obliglatorio, en que usted omita" +
            "registrar dicha información,"
            + "será descartado" +
            "del proceso de selección.<html>");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 61, 359, 90));

        jLabel4.setBackground(new java.awt.Color(0, 204, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("RESUMEN PROFESIONAL");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, -1, -1));

        resumen.setBackground(new java.awt.Color(204, 204, 255));
        resumen.setColumns(20);
        resumen.setRows(5);
        jScrollPane1.setViewportView(resumen);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 322, 647, 133));

        jLabel5.setText("<html>(Resuma sus estudios, experiencias, competencias / habilidades, conocimiento de idiomas, <p>conocimientos informáticos y aspiraciones profesionales).<html>");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 200, 418, 56));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        jButton1.setText("SIGUIENTE");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 617, 180, 50));

        codigo.setBackground(new java.awt.Color(102, 153, 255));
        codigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "014AME", "014TOCV-1", "013ACRR", "013AIET", "013ACE", "013TOEP", "07ACAN", "07APBAN", "07AINFRA", "07ASOPBD", "07AGTI", "02AU" }));
        codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                codigoMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                codigoMouseReleased(evt);
            }
        });
        jPanel1.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 71, 100, 30));

        msj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        msj.setText("Seleccione el código a la cual postula");
        jPanel1.add(msj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, 310, 71));

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 710));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(890, 740));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Ap. Paterno");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel8.setText("Nombres");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel9.setText("Ap. Materno");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        a_paterno.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.add(a_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 260, -1));

        nombre.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 350, -1));

        a_materno.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.add(a_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 270, -1));
        jPanel2.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 50, -1));

        fecha_nacimiento.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.add(fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 100, -1));

        jLabel10.setText("Edad");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel11.setText("Nacionalidad");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel12.setText("Fecha de nacimiento");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, 20));

        jLabel13.setText("Lugar de nacimiento");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, 20));

        lugar.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.add(lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 260, -1));

        jLabel14.setText("Domicilio");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jLabel15.setText("Provincia");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        jLabel16.setText("Sexo");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        jLabel17.setText("Teléfono contacto");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        domicilio.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.add(domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 280, -1));

        provincia.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.add(provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 80, -1));

        telefono.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 70, -1));

        sexo.setBackground(new java.awt.Color(102, 153, 255));
        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });
        jPanel2.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 143, 30));

        jLabel18.setText("Estado civil");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        jLabel19.setText("Distrito");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        ciudad.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 108, -1));

        distrito.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.add(distrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 170, -1));

        jLabel20.setText("Ciudad");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        jLabel21.setText("País");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, -1, -1));

        jLabel22.setText("Otro teléfono");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));
        jPanel2.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 119, -1));

        jLabel23.setText("E-mail(solo uno)");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 230, -1));

        dni.setBackground(new java.awt.Color(102, 153, 255));
        dni.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "DNI", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 140, -1));

        jLabel24.setText("Documento de identidad");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        jLabel25.setText("Brevete");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        jLabel26.setText("Categoria");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, 20));
        jPanel2.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 110, -1));

        jLabel28.setText("S. Pensiones");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, -1));

        jLabel29.setText("N° CUSPP");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, -1, -1));
        jPanel2.add(cuspp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 190, -1));

        jLabel30.setBackground(new java.awt.Color(0, 204, 153));
        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("1. DATOS PERSONALES");
        jLabel30.setOpaque(true);
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 330, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        jButton3.setText("SIGUIENTE");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 180, 50));
        jPanel2.add(pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 128, -1));

        estado.setBackground(new java.awt.Color(102, 153, 255));
        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero (a)", "Casado (a)", "Viudo(a)" }));
        jPanel2.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 133, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton4.setText("ATRÁS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 180, 50));

        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        jPanel2.add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 70, -1));

        jLabel63.setText("Núm");
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jLabel64.setText("Int.");
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));
        jPanel2.add(int_dom, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 60, -1));

        jLabel65.setText("Departamento");
        jPanel2.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, -1, -1));

        brevete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jPanel2.add(brevete, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        pension.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AFP Integra", "AFP Prima", "AFP Profuturo", "SNP", "AFP Integra", "No estoy afiliaado" }));
        jPanel2.add(pension, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 160, 30));

        policial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jPanel2.add(policial, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 470, -1, -1));
        jPanel2.add(discapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 140, 20));

        jLabel66.setText("Antecedente policial");
        jPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, -1, -1));

        jLabel71.setText("Discapacidad");
        jPanel2.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 90, 20));

        nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        nacionalidad.setSelectedIndex(121);
        nacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadActionPerformed(evt);
            }
        });
        jPanel2.add(nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 190, 30));

        departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali" }));
        departamento.setSelectedIndex(14);
        jPanel2.add(departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 130, 30));

        jLayeredPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1151));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(890, 740));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setBackground(new java.awt.Color(0, 204, 153));
        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("2. EDUCACIÓN ESCOLAR");
        jLabel31.setOpaque(true);
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 330, 30));

        jLabel32.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel32.setText("En caso que haya cursado en más de dos instituciones por nivel, empiece ubicando la última en la primera línea que corresponda");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, 20));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton5.setText("ATRÁS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 180, 50));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        jButton6.setText("SIGUIENTE");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 180, 50));

        tabla_ee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE DE LA INSTITUCIÓN", "PAIS", "AÑO DE INICIO", "AÑO TÉRMINO", "ORDEN MÉRITO"
            }
        ));
        tabla_ee.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jScrollPane8.setViewportView(tabla_ee);

        jPanel3.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 770, 90));

        lbl_primaria.setText("Primaria");
        jPanel3.add(lbl_primaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 50, 10));

        jLabel73.setText("Primaria");
        jPanel3.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        lbl_secundaria.setText("Secundaria");
        jPanel3.add(lbl_secundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel75.setText("Secundaria");
        jPanel3.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLayeredPane1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 715));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre de la Institución", "Grado Instrucción", "Ciclo", "Mes/año", "Último mes/año", "Años de estudio", "Especialidad"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 106, 758, 224));

        jLabel33.setBackground(new java.awt.Color(0, 153, 153));
        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel33.setText("EDUCACIÓN SUPEROR O TÉCNICA");
        jLabel33.setOpaque(true);
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 20, -1, -1));

        jButton7.setBackground(new java.awt.Color(255, 51, 51));
        jButton7.setText("ANTERIOR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 200, 50));

        jButton8.setBackground(new java.awt.Color(0, 204, 51));
        jButton8.setText("SIGUIENTE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 210, 50));

        jLayeredPane1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setBackground(new java.awt.Color(0, 153, 153));
        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel34.setText("IDIOMAS Y COMPUTACIÓN");
        jLabel34.setOpaque(true);
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel36.setText("COMPUTACIÓN");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 130, -1));

        jLabel41.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel41.setText("Al posicionarse en los campos habilitados, lea atentamente el mensaje emergente y seleccione el nivel con el que Ud. cuenta.");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, -1));
        jPanel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, -1));
        jPanel5.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 100, -1));

        rb1.setText("Lee");
        jPanel5.add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        rb2.setText("Habla");
        jPanel5.add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        rb3.setText("Escribe");
        jPanel5.add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        rb4.setText("Entiende");
        jPanel5.add(rb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        jRadioButton5.setText("Entiende");
        jPanel5.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jRadioButton6.setText("Lee");
        jPanel5.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jRadioButton7.setText("Habla");
        jPanel5.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jRadioButton8.setText("Escribe");
        jPanel5.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jRadioButton9.setText("Escribe");
        jPanel5.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        jRadioButton10.setText("Lee");
        jPanel5.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jRadioButton11.setText("Habla");
        jPanel5.add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jRadioButton12.setText("Entiende");
        jPanel5.add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jRadioButton13.setText("Escribe");
        jPanel5.add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        jRadioButton14.setText("Entiende");
        jPanel5.add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        jRadioButton15.setText("Habla");
        jPanel5.add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jRadioButton16.setText("Lee");
        jPanel5.add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jLabel38.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel38.setText("Otro idioma:");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 100, -1));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel39.setText("IDIOMAS");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 100, -1));

        jLabel40.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel40.setText("INGLÉS");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 130, 20));
        jPanel5.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 100, -1));
        jPanel5.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 100, -1));

        jRadioButton17.setText("E-mail");
        jPanel5.add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, -1, -1));

        jRadioButton18.setText("Ms. Windows");
        jPanel5.add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, -1));

        jRadioButton19.setText("Ms. Word");
        jPanel5.add(jRadioButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        jRadioButton20.setText("Ms. Excel");
        jPanel5.add(jRadioButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        jRadioButton21.setText("Ms. Power Point");
        jPanel5.add(jRadioButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, -1, -1));

        jRadioButton22.setText("Ms. Visio");
        jPanel5.add(jRadioButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, -1, -1));

        jRadioButton23.setText("Ms. Project");
        jPanel5.add(jRadioButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, -1, -1));

        jRadioButton24.setText("Ms. Access");
        jPanel5.add(jRadioButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, -1));

        jButton10.setBackground(new java.awt.Color(0, 204, 51));
        jButton10.setText("SIGUIENTE");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 210, 50));

        jButton11.setBackground(new java.awt.Color(255, 51, 51));
        jButton11.setText("ANTERIOR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 200, 50));

        jLayeredPane1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel6.setMinimumSize(new java.awt.Dimension(480, 480));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel27.setText("OTROS ESTUDIOS");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RAMA DEL ESTUDIO", "NOMBRE DEL ESTUDIO", "NIVEL DE ESTUDIOS", "CLASE INSTITUCION", "NOMBRE DE LA INSTITUCION", "PAIS", "MES/ AÑO  INICIO", "MES/AÑO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable3);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 740, 110));

        jButton12.setText("ANTERIOR");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 130, 40));

        jButton13.setText("SIGUIENTE");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 130, 40));

        jLayeredPane1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ss1.setBackground(new java.awt.Color(102, 102, 255));
        ss1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRES Y APELLIDOS", "EMPRESA", "CARGO", "TELEFONO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane10.setViewportView(ss1);

        jTextField47.setBackground(new java.awt.Color(51, 255, 0));
        jTextField47.setForeground(new java.awt.Color(0, 51, 204));
        jTextField47.setText("7. REFERENCIAS LABORALES");
        jTextField47.setCaretColor(new java.awt.Color(153, 255, 0));
        jTextField47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField47ActionPerformed(evt);
            }
        });

        jTextField48.setBackground(new java.awt.Color(255, 153, 153));
        jTextField48.setForeground(new java.awt.Color(255, 51, 51));
        jTextField48.setText("8. DATOS FAMILIARES");
        jTextField48.setCaretColor(new java.awt.Color(0, 204, 51));
        jTextField48.setInheritsPopupMenu(true);
        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });

        jTable5.setBackground(new java.awt.Color(204, 255, 51));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Padre", "", null, null},
                {"Madre", null, null, null},
                {"Cónyuge", null, null, null},
                {"Hijo", null, null, null},
                {"Hermano", null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "NOMBRES Y APELLIDOS", "AÑO DE NACIMIENTO", "OCUPACION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable5.setSelectionForeground(new java.awt.Color(255, 51, 51));
        jScrollPane11.setViewportView(jTable5);

        jButton2.setText("ATRAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton21.setText("SIGUIENTE");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(279, 279, 279)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(624, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
        );

        jLayeredPane1.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        scroll.setAutoscrolls(true);
        scroll.setPreferredSize(new java.awt.Dimension(890, 700));

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel35.setBackground(new java.awt.Color(0, 204, 153));
        jLabel35.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel35.setText("6 .EXPERIENCIA LABORAL");

        jP1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel37.setBackground(new java.awt.Color(204, 204, 204));
        jLabel37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("DATOS DE LA EMPRESA");

        jLabel45.setText("Empresa ");

        jLabel46.setText("Sector");

        jLabel47.setText("Rubro");

        jLabel48.setText("Lugar");

        jLabel49.setText("Telefono");

        empresa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP1Layout = new javax.swing.GroupLayout(jP1);
        jP1.setLayout(jP1Layout);
        jP1Layout.setHorizontalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lugar1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telef1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rubro1)
                            .addGroup(jP1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empresa1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(sector1))))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jP1Layout.setVerticalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(empresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(sector1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(rubro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(lugar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(telef1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel43.setBackground(new java.awt.Color(204, 204, 204));
        jLabel43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("FECHAS MES/AÑO");

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Inicio");

        jLabel55.setText("Termino");

        javax.swing.GroupLayout jP2Layout = new javax.swing.GroupLayout(jP2);
        jP2.setLayout(jP2Layout);
        jP2Layout.setHorizontalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP2Layout.createSequentialGroup()
                .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jP2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel55)
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addGroup(jP2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(inicio1))
                    .addGroup(jP2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(final1)))
                .addContainerGap())
        );
        jP2Layout.setVerticalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2Layout.createSequentialGroup()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(final1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jP4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel60.setText("Indicar funciones desempeñanadas y su principales logros");

        indicaciones1.setColumns(20);
        indicaciones1.setRows(5);
        jScrollPane5.setViewportView(indicaciones1);

        jTextField40.setText("jTextField40");

        javax.swing.GroupLayout jP4Layout = new javax.swing.GroupLayout(jP4);
        jP4.setLayout(jP4Layout);
        jP4Layout.setHorizontalGroup(
            jP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP4Layout.createSequentialGroup()
                        .addGroup(jP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))))
        );
        jP4Layout.setVerticalGroup(
            jP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jP5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel61.setText("Motivo del cese: ");

        jLabel62.setText("Por modalidad de contrato");

        javax.swing.GroupLayout jP5Layout = new javax.swing.GroupLayout(jP5);
        jP5.setLayout(jP5Layout);
        jP5Layout.setHorizontalGroup(
            jP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(motivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modalidad1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
        );
        jP5Layout.setVerticalGroup(
            jP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(motivo1)
            .addComponent(modalidad1)
            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jP6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("DATOS DEL PUESTO");

        jLabel50.setText("Area");

        jLabel51.setText("Cargo");

        jLabel52.setText("Nombre de Puesto");

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Personas a cargo");
        jLabel53.setToolTipText("");
        jLabel53.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jP6Layout = new javax.swing.GroupLayout(jP6);
        jP6.setLayout(jP6Layout);
        jP6Layout.setHorizontalGroup(
            jP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP6Layout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(area1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jP6Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jP6Layout.createSequentialGroup()
                        .addGroup(jP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP6Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(puesto1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87))
                    .addGroup(jP6Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(persCargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jP6Layout.setVerticalGroup(
            jP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP6Layout.createSequentialGroup()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(area1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel52)
                .addGap(1, 1, 1)
                .addComponent(puesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(persCargo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton14.setBackground(new java.awt.Color(255, 51, 51));
        jButton14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton14.setText("ANTERIOR");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        btnSigExperiencia.setBackground(new java.awt.Color(0, 204, 51));
        btnSigExperiencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSigExperiencia.setText("SIGUIENTE");
        btnSigExperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigExperienciaActionPerformed(evt);
            }
        });

        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel96.setText("Empresa ");

        jLabel97.setText("Sector");

        jLabel98.setText("Rubro");

        jLabel99.setText("Lugar");

        jLabel100.setText("Telefono");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel96)
                        .addGap(18, 18, 18)
                        .addComponent(empresa2))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lugar2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telef2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel97)
                        .addGap(31, 31, 31)
                        .addComponent(sector2))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel98)
                        .addGap(33, 33, 33)
                        .addComponent(rubro2)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(empresa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(sector2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98)
                    .addComponent(rubro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel99)
                        .addComponent(lugar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel100))
                    .addComponent(telef2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel101.setText("Area");

        jLabel102.setText("Cargo");

        jLabel103.setText("Nombre de Puesto");

        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("Personas a cargo");
        jLabel104.setToolTipText("");
        jLabel104.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(area2))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargo2))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel104)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(persCargo2))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel103)
                            .addComponent(puesto2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 81, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(area2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102)
                    .addComponent(cargo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(puesto2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(persCargo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104))
                .addGap(19, 19, 19))
        );

        jpanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("Inicio");

        jLabel106.setText("Termino");

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel106)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inicio2))
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(final2)))
                .addContainerGap())
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel105)
                .addGap(4, 4, 4)
                .addComponent(inicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(final2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel107.setText("Ingreso bruto Mensual");

        jLabel108.setText("N° Sueldo al año");

        jLabel109.setText("Relacion laboral");

        jLabel110.setText("Nombre Jefe");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jefe2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel109)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relaLab2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sueldo2))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(ingreso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(sueldo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109)
                    .addComponent(relaLab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(jefe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel111.setText("Indicar funciones desempeñanadas y su principales logros");

        indicaciones2.setColumns(20);
        indicaciones2.setRows(5);
        jScrollPane2.setViewportView(indicaciones2);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 603, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel112.setText("Motivo del cese: ");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(motivo2, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(motivo2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("DATOS VARIOS");

        jLabel56.setText("Ingreso bruto Mensual");

        jLabel57.setText("N° Sueldo al año");

        jLabel58.setText("Relacion laboral");

        jLabel59.setText("Nombre Jefe");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relaLab1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(18, 18, 18)
                        .addComponent(jefe1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingreso1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel44)
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sueldo1)))
                .addGap(6, 6, 6))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(ingreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sueldo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(relaLab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jefe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel113.setText("Empresa ");

        jLabel114.setText("Sector");

        jLabel115.setText("Rubro");

        jLabel116.setText("Lugar");

        jLabel117.setText("Telefono");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(empresa3))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel116)
                        .addGap(1, 1, 1)
                        .addComponent(lugar3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel117)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telef3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel114)
                        .addGap(23, 23, 23)
                        .addComponent(sector3))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel115)
                        .addGap(25, 25, 25)
                        .addComponent(rubro3)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(empresa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(sector3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(rubro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telef3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel117)
                    .addComponent(lugar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116))
                .addContainerGap())
        );

        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel118.setText("Area");

        jLabel119.setText("Cargo");

        jLabel120.setText("Nombre de Puesto");

        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel121.setText("Personas a cargo");
        jLabel121.setToolTipText("");
        jLabel121.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel119)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargo3))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(persCargo3))
                    .addComponent(jLabel120)
                    .addComponent(puesto3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(area3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(130, 130, 130))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(area3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel119)
                    .addComponent(cargo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel120)
                .addGap(3, 3, 3)
                .addComponent(puesto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121)
                    .addComponent(persCargo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel122.setText("Inicio");

        jLabel123.setText("Termino");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addComponent(jLabel123)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inicio3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(final3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(8, 8, 8))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel122)
                .addGap(1, 1, 1)
                .addComponent(inicio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel123)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(final3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel124.setText("Ingreso bruto Mensual");

        jLabel125.setText("N° Sueldo al año");

        jLabel126.setText("Relacion laboral");

        jLabel127.setText("Nombre Jefe");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingreso3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel125)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sueldo3))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel127)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jefe3))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel126)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relaLab3)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(ingreso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(sueldo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126)
                    .addComponent(relaLab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel127)
                    .addComponent(jefe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel128.setText("Indicar funciones desempeñanadas y su principales logros");

        indicaciones3.setColumns(20);
        indicaciones3.setRows(5);
        jScrollPane9.setViewportView(indicaciones3);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 603, Short.MAX_VALUE))
                    .addComponent(jScrollPane9))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel128)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel129.setText("Motivo del cese: ");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel129)
                .addGap(26, 26, 26)
                .addComponent(motivo3, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(motivo3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jP6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(btnSigExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253)))
                .addGap(2, 2, 2))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jP4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSigExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        scroll.setViewportView(jPanel7);

        jLayeredPane1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        scroll2.setPreferredSize(new java.awt.Dimension(870, 700));

        jLabel6.setBackground(new java.awt.Color(0, 204, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("10. DATOS VARIOS");
        jLabel6.setOpaque(true);

        jLabel67.setText("¿ Ha trabajado anteriormente en alguna entidad del Estado ? De ser afirmativo, indicar en cuál y en que fechas.");

        c1.setBackground(new java.awt.Color(102, 153, 255));
        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));

        r1.setBackground(new java.awt.Color(102, 153, 255));

        c2.setBackground(new java.awt.Color(102, 153, 255));
        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "SI" }));

        r2.setBackground(new java.awt.Color(102, 153, 255));

        c3.setBackground(new java.awt.Color(102, 153, 255));
        c3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "si" }));

        r3.setBackground(new java.awt.Color(102, 153, 255));

        fp.setBackground(new java.awt.Color(102, 153, 255));
        fp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nunca estuve inhabilitado", "Estoy inhabilitado", "Estuve inhabilitado" }));

        jLabel68.setText("Ejercicio de la");

        jLabel69.setText("Precise en que lugares de preferencia tendría disponibilidad para laborar. (dentro del País):");

        p1.setBackground(new java.awt.Color(102, 153, 255));
        p1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En cualquier punto del país", "Cualquiera: Zona de selva", "Cualquiera: Zona de sierra", "Cualquiera: Zona de costa", "Cualquiera: Zona norte", "Cualquiera: Zona centro", "Cualquiera: Zona sur", "Cualquiera: Zona de selva", "-------------------------------", "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali", " " }));

        p2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En cualquier punto del país", "Cualquiera: Zona de selva", "Cualquiera: Zona de sierra", "Cualquiera: Zona de costa", "Cualquiera: Zona norte", "Cualquiera: Zona centro", "Cualquiera: Zona sur", "Cualquiera: Zona de selva", "-------------------------------", "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali" }));

        p3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En cualquier punto del país", "Cualquiera: Zona de selva", "Cualquiera: Zona de sierra", "Cualquiera: Zona de costa", "Cualquiera: Zona norte", "Cualquiera: Zona centro", "Cualquiera: Zona sur", "Cualquiera: Zona de selva", "-------------------------------", "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali" }));

        ip1.setBackground(new java.awt.Color(102, 153, 255));
        ip1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auditoria", "Calidad", "Contabilidad", "Créditos", "Finanzas", "Imagen y comunicaciones", "Legal", "Logística", "Operaciones", "Organización", "Métodos ", "Planeamiento" }));

        ip2.setBackground(new java.awt.Color(102, 153, 255));
        ip2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auditoria", "Calidad", "Contabilidad", "Créditos", "Finanzas", "Imagen y comunicaciones", "Legal", "Logística", "Operaciones", "Organización", "Métodos ", "Planeamiento" }));

        ip3.setBackground(new java.awt.Color(102, 153, 255));
        ip3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auditoria", "Calidad", "Contabilidad", "Créditos", "Finanzas", "Imagen y comunicaciones", "Legal", "Logística", "Operaciones", "Organización", "Métodos ", "Planeamiento" }));

        jLabel70.setText("DNI");

        jLabel76.setText("¿ Ha experimentado problemas o dificultades trascendentes en su vida profesional, laboral o personal ? De ser afirmativo, comente su experiencia y como lo enfrento.");

        jLabel77.setText("¿Ha participado en otro proceso de selección para alguna Entidad del Estado? De ser afirmativo indique para que puesto, el nombre de la empresa,");

        jLabel78.setText("fecha aproximada de postulación y la etapa en la que se quedo.");

        jLabel79.setText("Función Pública");

        jLabel80.setText("Indique en orden de preferencia las áreas de su interés profesional. ");

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel81.setText("1°");

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel82.setText("2°");

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel83.setText("3°");

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel84.setText("1°");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel85.setText("2°");

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel86.setText("3°");

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        jButton18.setText("SIGUIENTE");
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton19.setText("ATRÁS");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel68)
                                    .addGap(29, 29, 29)
                                    .addComponent(fp, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel76)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(r1))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addComponent(r2))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addComponent(jLabel77)
                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel84))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ip3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ip1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(188, 188, 188)
                                    .addComponent(jLabel70)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField50))
                                .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addGap(50, 50, 50)
                                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83))
                .addGap(18, 18, 18)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel84)
                    .addComponent(ip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85)
                    .addComponent(ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(ip3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70)
                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        scroll2.setViewportView(jPanel8);

        jLayeredPane1.add(scroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel87.setBackground(new java.awt.Color(0, 204, 153));
        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel87.setText("11. Fecha");
        jLabel87.setOpaque(true);

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel88.setText("Fecha");

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel89.setText("Revise si olvidó llenar algún casillero \"celeste\" en los");

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel90.setText("campos ó si ingresó erróneamente alguna fecha. ");

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel91.setText("Observación:");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel92.setText("Por la presente, declaro que los datos consignados en el documento son ciertos y comprobables.");

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel93.setText("Ante cualquier falsedad detectada la empresa se reserva el derecho de dar por terminada la postulación o la relación laboral en");

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel94.setText("caso ingrese a nuestra empresa.");

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel95.setText("El presente documento no constituye una aceptación de una relación o vínculo laboral, este documento es de uso interno.");

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setText("Registrar mi solicitud");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton20.setText("ATRÁS");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel95)
                            .addComponent(jLabel94)
                            .addComponent(jLabel93)
                            .addComponent(jLabel92)
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel88)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel90)
                                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel88)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel90))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel92)
                .addGap(18, 18, 18)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel94)
                .addGap(18, 18, 18)
                .addComponent(jLabel95)
                .addGap(121, 121, 121)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jPanel1.setVisible(false);
        this.jPanel2.setVisible(true);
 
            
            
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPanel2.setVisible(false);
        this.jPanel3.setVisible(true);
        if(!nombre.getText().isEmpty())
        if(!dni.getText().isEmpty()) {
                   try { Conectarbd con=new Conectarbd();
          Connection c = con.Conectar();
String sql="INSERT INTO postulante(dni, ap_paterno, ap_materno, nombre, edad, fecha_nacimiento,"
        + "lugar_nacimiento, nacionalidad, sexo, estado_civil, brevete, resumen_profesional,"
        + "nombre_discapacidad, antecedente_policial, domicilio, num, int ,"
        + "departamento, idpuesto, num_cuspp) values(?,?,?,?,?,?,?,?, ?,?,?,?,?,?,?,?,?,?,?,?)";
      
 PreparedStatement ps =c.prepareStatement(sql);
                 
            ps.setString(1, dni.getText());
            ps.setString(2, a_paterno.getText());
            ps.setString(3, a_materno.getText());
            ps.setString(4, nombre.getText());
            ps.setString(5, edad.getText());
          ps.setString(6, fecha_nacimiento.getText());
          ps.setString(7, lugar.getText());
          ps.setString(8, (String)nacionalidad.getSelectedItem());
          if(sexo.getSelectedItem().equals("Masculino")){
           ps.setString(9,"M" );
          }else{
               ps.setString(9,"F" );
          }
         if(estado.getSelectedItem().equals("Soltero (a)")){
             ps.setString(10, "Soltero"); 
         }else if(estado.getSelectedItem().equals("Casado (a)")){
            ps.setString(10, "Casado");  
         }
         else {ps.setString(10, "Viudo"); 
                 
                 }        
          if(brevete.getSelectedItem().equals("Si")){
          ps.setString(11, categoria.getText());}else{
           ps.setString(11, null);   
          }
          ps.setString(12, resumen.getText());
          ps.setString(13, discapacidad.getText());
          ps.setString(14, (String)policial.getSelectedItem());
          ps.setString(15, domicilio.getText());
          ps.setString(16, num.getText());
          ps.setString(17, int_dom.getText());
          ps.setString(18, (String)departamento.getSelectedItem());
          ps.setString(19, (String)codigo.getSelectedItem());
          ps.setString(20, cuspp.getText());
          
         ps.executeUpdate();  
          JOptionPane.showMessageDialog(null, "¡Sus datos fueron enviados con éxito!");
          c.close();
        } catch (SQLException ex) {
            Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jPanel2.setVisible(false);
        this.jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jPanel3.setVisible(false);
        this.jPanel4.setVisible(true);
        try {
            insertartablaEE();
            insertarEducacioBasica();
        } catch (SQLException ex) {
            Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jPanel2.setVisible(true);
        this.jPanel3.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jPanel4.setVisible(false);
        jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jPanel4.setVisible(false);
        jPanel5.setVisible(true);
        try {       
            insertar_edu_superior();
        } catch (SQLException ex) {
            Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jButton8ActionPerformed
public void insertar_edu_superior() throws SQLException{
   Conectarbd con = new Conectarbd();
    Connection c = con.Conectar();
    String sql = "INSERT INTO educacion(num_institucion,dni, grado_instrucion, ciclo, a_estudio,"
            + " especialidad, idinstitucion) values(?, ?,?,?, ?, ?, ?)";
 
    for (int i = 0; i < tabla_ee.getRowCount(); i++) {
      if (tabla_ee.getValueAt(i, 2) != null) {
               if (tabla_ee.getValueAt(i, 3) != null) {
                   PreparedStatement ps = c.prepareStatement(sql);
                  if(i<2){ ps.setString(1, String.valueOf(i+1));}else{ps.setString(1, String.valueOf(i-1));}
                      ps.setString(2, dni.getText());
                   ps.setString(3, tabla_ee.getValueAt(i, 1).toString());
           
            ps.setString(4, tabla_ee.getValueAt(i, 2).toString());
            ps.setString(5, tabla_ee.getValueAt(i, 3).toString());
 ps.setString(6, tabla_ee.getValueAt(i, 6).toString());
 ps.setString(7, "1");
            
                ps.executeUpdate();
            }        }    }    
    
}
    
    
    
    
    
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jPanel5.setVisible(false);
        jPanel6.setVisible(true);
        try {  
            insertarIdioma();
                    
                    
                    } catch (SQLException ex) {
            Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

    public void insertarIdioma() throws SQLException{
   Conectarbd con = new Conectarbd();
    Connection c = con.Conectar();
    String sql = "INSERT INTO detalle_postulante_idioma(dni, ididioma, nivel"
            + ") values( ?, ?, ?)";
 PreparedStatement ps =c.prepareStatement(sql);
 if(rb1.isSelected()){
 ps.setString(1, dni.getText());
  ps.setString(2, "0004");
   ps.setString(3, "Lee");
 
       ps.executeUpdate(); 
 }
 if(rb2.isSelected()){
 ps.setString(1, dni.getText());
  ps.setString(2, "0004");
   ps.setString(3, "Habla");
 
       ps.executeUpdate(); 
 }
 if(rb3.isSelected()){
 ps.setString(1, dni.getText());
  ps.setString(2, "0004");
   ps.setString(3, "Escribe");
 
       ps.executeUpdate(); 
 }
 if(rb4.isSelected()){
 ps.setString(1, dni.getText());
  ps.setString(2, "0004");
   ps.setString(3, "Entiende");
 
       ps.executeUpdate(); 
 }
        
    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jPanel5.setVisible(false);
        jPanel4.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jPanel6.setVisible(false);
        jPanel5.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jPanel6.setVisible(false);
        scroll.setVisible(true);
        
      
    }//GEN-LAST:event_jButton13ActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numActionPerformed

    private void codigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoMouseClicked
    

    }//GEN-LAST:event_codigoMouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
      
        
          new Confirmar(this,true).setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void codigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoMouseEntered
       
            if(codigo.getSelectedItem().equals("014AME")){
            msj.setText("ANALISTA DE MEDIOS ELECTRONICOS");
        }else if(codigo.getSelectedItem().equals("014TOCV-1")){
            msj.setText("TECNICO OPERATIVO DE CANALES VIRTUALES");
        }else if(codigo.getSelectedItem().equals("013ACRR"))
        {
            msj.setText("ANALISTA DE CORRESPONSALIA");
        }

        else if(codigo.getSelectedItem().equals("013AIET"))
        {
            msj.setText("ANALISTA DE INGRESOS Y EGRESOS DEL TESORO");
        }
        else if(codigo.getSelectedItem().equals("013ACE"))
        {
            msj.setText("ANALISTA DE COMERCIO EXTERIOR Y ADM. DE\n" +
                "CONVENIOS");
        }
        else if(codigo.getSelectedItem().equals("013TOEP"))
        {
            msj.setText("TECNICO OPERATIVO ENTIDADES PUBLICAS");
        }
               else if(codigo.getSelectedItem().equals("07ACAN"))
        {
            msj.setText("ANALISTA CANALES DE ATENCION");
        }
               else if(codigo.getSelectedItem().equals("07APBAN"))
        {
            msj.setText("ANALISTA DE PRODUCTOS BANCARIOS");
        }
               else if(codigo.getSelectedItem().equals("07AINFRA"))
        {
            msj.setText("ANALISTA DE INFRAESTRUCTURA Y COMUNICACIONES");
        }
               else if(codigo.getSelectedItem().equals("07ASOPBD"))
        {
            msj.setText("ANALISTA DE SOPORTE DE PLATAFORMAS");
        }
               else if(codigo.getSelectedItem().equals("07AGTI"))
        {
            msj.setText("ANALISTA DE GESTION DE TECNOLOGIAS DE\n" +
"INFORMACION");
        }
                 else if(codigo.getSelectedItem().equals("02AU"))
        {
            msj.setText("AUDITOR");
        }
    }//GEN-LAST:event_codigoMouseEntered

    private void codigoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoMouseReleased

    private void nacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidadActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        
        new main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        scroll2.setVisible(false);
        jPanel10.setVisible(true);
        
        if(!dni.getText().isEmpty())
        try {
            Conectarbd con = new Conectarbd();
            Connection c = con.Conectar();
            String sql = "INSERT INTO pregunta values(?,?,?)";
            PreparedStatement ps = c.prepareStatement(sql);
            if (c1.getSelectedItem().equals("Si")) {
                ps.setString(1, "1");
                ps.setString(2, r1.getText());
                ps.setString(3, dni.getText());

                ps.executeUpdate();
                
                c.close();
            }
            if(c2.getSelectedItem().equals("Si")){
                    ps.setString(1, "1");
                ps.setString(2, r2.getText());
                ps.setString(3, dni.getText());
                JOptionPane.showMessageDialog(null, "¡Sus datos fueron enviados con éxito!");
            }
                 if(c3.getSelectedItem().equals("Si")){
                    ps.setString(1, "1");
                ps.setString(2, r3.getText());
                ps.setString(3, dni.getText());
                JOptionPane.showMessageDialog(null, "¡Sus datos fueron enviados con éxito!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
        }

                
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       scroll2.setVisible(false);
        scroll.setVisible(true); 
        
    }//GEN-LAST:event_jButton19ActionPerformed
public void insertar_historial_trabajo(){
    
}
    
    
    
    
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
      jPanel10.setVisible(false);
        scroll2.setVisible(true);
      
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.dispose();
        new confirmacion(this,true).setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void empresa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empresa1ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jPanel7.setVisible(false);
        jPanel6.setVisible(true);
        scroll.setVisible(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void btnSigExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigExperienciaActionPerformed
        //SIGUIENTE DE EXPERIENCIAS LABORALES
        scroll.setVisible(false);
        scroll2.setVisible(false);
        jPanel23.setVisible(true);
        jPanel7.setVisible(false);

        registroempresa(empresa1,sector1, rubro1,lugar1,telef1,area1,cargo1,puesto1,persCargo1,inicio1,final1,ingreso1,sueldo1,relaLab1,jefe1,indicaciones1,motivo1);
        registroempresa(empresa2,sector2, rubro2,lugar2,telef2,area2,cargo2,puesto2,persCargo2,inicio2,final2,ingreso2,sueldo2,relaLab2,jefe2,indicaciones2,motivo2);
        registroempresa(empresa3,sector3, rubro3,lugar3,telef3,area3,cargo3,puesto3,persCargo3,inicio3,final3,ingreso3,sueldo3,relaLab3,jefe3,indicaciones3,motivo3);

    }//GEN-LAST:event_btnSigExperienciaActionPerformed

    private void jTextField47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField47ActionPerformed

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jPanel23.setVisible(false);
        scroll.setVisible(true);
        jPanel7.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // BOTON SIGUIENTE  DE REFERENCIA LABORALES Y DATOS FAMILIARES
        jPanel23.setVisible(false);
        scroll2.setVisible(true);
        jPanel8.setVisible(true);

        try {
            insertartablaDF();
        } catch (SQLException ex) {
            Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            insertartablaRL();
        } catch (SQLException ex) {
            Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton21ActionPerformed
public void registroempresa(JTextField empresa,JTextField sector,JTextField rubro,JTextField lugar ,JTextField telef, 
            JTextField area,JTextField cargo,JTextField puesto,JTextField persCargo,JTextField inicio,JTextField final1,
            JTextField ingreso,JTextField sueldo,JTextField relaLab,JTextField jefe,JTextArea indicaciones, JTextField motivo){
        
        try { Conectarbd con=new Conectarbd();
          Connection c = con.Conectar();
        String sql="INSERT INTO empresa(nombre, sector, rubro, lugar, telefono)values(?,?,?,?,?)";
      
        PreparedStatement ps =c.prepareStatement(sql);
                    
            ps.setString(1,empresa.getText());
            ps.setString(2, sector.getText());
            ps.setString(3, rubro.getText());
            ps.setString(4, lugar.getText());
            ps.setString(5, telef.getText());
            
         String sql1="INSERT INTO puesto(area, cargo,nombre_puesto,personas_a_cargo)  values(?,?,?,?)";
         
         PreparedStatement ps1 =c.prepareStatement(sql1);
          ps1.setString(1, area.getText());
          ps1.setString(2, cargo.getText());
          ps1.setString(3, puesto.getText());
          ps1.setString(4, persCargo.getText());
          
         String sql2="INSERT INTO historial_trabajo(fecha_inicio, fecha_fin, ingreso_bruto_mensual, cant_sueldos,"
        + "relacion_laboral,nombre_jefe,funcion_desem,motivo_cese)  values(?,?,?,?,?,?,?,?)";
         
         PreparedStatement ps2 =c.prepareStatement(sql2);
         
            ps2.setDate(1,Date.valueOf(inicio.getText()));
            ps2.setDate(2,Date.valueOf(final1.getText()));
            ps2.setString(3, ingreso.getText());
            ps2.setString(4,sueldo.getText());
            ps2.setString(5, relaLab.getText());
            ps2.setString(6, jefe.getText());
            ps2.setString(7,indicaciones.getText());
            ps2.setString(8, motivo.getText());
         
            ps.executeUpdate();  
            ps1.executeUpdate();
            ps2.executeUpdate();
            
          JOptionPane.showMessageDialog(null, "¡Sus datos fueron enviados con éxito!");
          c.close();
        } catch (SQLException ex) {
            Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void insertartablaEE() throws SQLException{
  Conectarbd con = new Conectarbd();
    Connection c = con.Conectar();
    String sql = "INSERT INTO educacion(num_institucion,dni, anio_inicio, anio_fin, tipo) values(?, ?,?,?, ?)";
 
    for (int i = 0; i < tabla_ee.getRowCount(); i++) {
      if (tabla_ee.getValueAt(i, 2) != null) {
               if (tabla_ee.getValueAt(i, 3) != null) {
                   PreparedStatement ps = c.prepareStatement(sql);
                  if(i<2){ ps.setString(1, String.valueOf(i+1));}else{ps.setString(1, String.valueOf(i-1));}
                      ps.setString(2, dni.getText());
                   ps.setString(3, tabla_ee.getValueAt(i, 2).toString());
           
            ps.setString(4, tabla_ee.getValueAt(i, 3).toString());

                if (i == 0 || i == 1) {
                    ps.setString(5, "Primaria");
                } else {
                    ps.setString(5, "Secundaria");
                }
                ps.executeUpdate();
            }        }    }  
}

public void insertarEducacioBasica() throws SQLException{
   Conectarbd con = new Conectarbd();
    Connection c = con.Conectar();
    String sql = "INSERT INTO educacion_basica(num_institucion,dni, orden, id_institucion) values(?,?,?, ?)";
 
    for (int i = 0; i < tabla_ee.getRowCount(); i++) {
     
               if (tabla_ee.getValueAt(i, 4) != null) {
                   PreparedStatement ps = c.prepareStatement(sql);
                   ps.setString(1, String.valueOf(i+1));
                      ps.setString(2, dni.getText());
                   ps.setString(3, tabla_ee.getValueAt(i, 4).toString());
           
            ps.setString(4, "5");

            
                ps.executeUpdate();
            }           }      
}
    
   //PARA INSERTAR EN LA TABLA DE REFERENCIAS LABORALES 
public void insertartablaDF() throws SQLException
{
 Conectarbd con=new Conectarbd();
          Connection c = con.Conectar();
String sql="INSERT INTO familiar(dni,nombre_completo, anio_nacimiento,"
        + "ocupacion,tipo_parentezco,postulante_dni) values(?,?,?,?,?,?)";
          for(int i=0; i<jTable5.getRowCount();i++){
               PreparedStatement ps =c.prepareStatement(sql);
              ps.setString(1, jTable5.getValueAt(i, 0).toString()); 
             ps.executeUpdate();  
          }             
}

//PARA INSERTAR EN LA TABLA DE DATOS FAMILIARES

public void insertartablaRL() throws SQLException
{
 Conectarbd con=new Conectarbd();
          Connection c = con.Conectar();
String sql="INSERT INTO referencia_laboral(dni,nombre_completo,cargo,postulante_dni"
        + "idempresa) values(?,?,?,?,?)";
          for(int i=0; i<ss1.getRowCount();i++){
               PreparedStatement ps =c.prepareStatement(sql);
              ps.setString(1, ss1.getValueAt(i, 0).toString()); 
             ps.executeUpdate();  
          }             
} 
    
    
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
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_materno;
    private javax.swing.JTextField a_paterno;
    private javax.swing.JTextField area1;
    private javax.swing.JTextField area2;
    private javax.swing.JTextField area3;
    private javax.swing.JComboBox<String> brevete;
    private javax.swing.JButton btnSigExperiencia;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JComboBox<String> c3;
    private javax.swing.JTextField cargo1;
    private javax.swing.JTextField cargo2;
    private javax.swing.JTextField cargo3;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField ciudad;
    private javax.swing.JComboBox<String> codigo;
    private javax.swing.JTextField cuspp;
    private javax.swing.JComboBox<String> departamento;
    private javax.swing.JTextField discapacidad;
    private javax.swing.JTextField distrito;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField domicilio;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField email;
    private javax.swing.JTextField empresa1;
    private javax.swing.JTextField empresa2;
    private javax.swing.JTextField empresa3;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JTextField fecha_nacimiento;
    private javax.swing.JTextField final1;
    private javax.swing.JTextField final2;
    private javax.swing.JTextField final3;
    private javax.swing.JComboBox<String> fp;
    private javax.swing.JTextArea indicaciones1;
    private javax.swing.JTextArea indicaciones2;
    private javax.swing.JTextArea indicaciones3;
    private javax.swing.JTextField ingreso1;
    private javax.swing.JTextField ingreso2;
    private javax.swing.JTextField ingreso3;
    private javax.swing.JTextField inicio1;
    private javax.swing.JTextField inicio2;
    private javax.swing.JTextField inicio3;
    private javax.swing.JTextField int_dom;
    private javax.swing.JComboBox<String> ip1;
    private javax.swing.JComboBox<String> ip2;
    private javax.swing.JComboBox<String> ip3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jP2;
    private javax.swing.JPanel jP4;
    private javax.swing.JPanel jP5;
    private javax.swing.JPanel jP6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jefe1;
    private javax.swing.JTextField jefe2;
    private javax.swing.JTextField jefe3;
    private javax.swing.JPanel jpanel;
    private javax.swing.JLabel lbl_primaria;
    private javax.swing.JLabel lbl_secundaria;
    private javax.swing.JTextField lugar;
    private javax.swing.JTextField lugar1;
    private javax.swing.JTextField lugar2;
    private javax.swing.JTextField lugar3;
    private javax.swing.JTextField modalidad1;
    private javax.swing.JTextField motivo1;
    private javax.swing.JTextField motivo2;
    private javax.swing.JTextField motivo3;
    private javax.swing.JLabel msj;
    private javax.swing.JComboBox<String> nacionalidad;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField num;
    private javax.swing.JComboBox<String> p1;
    private javax.swing.JComboBox<String> p2;
    private javax.swing.JComboBox<String> p3;
    private javax.swing.JTextField pais;
    private javax.swing.JComboBox<String> pension;
    private javax.swing.JTextField persCargo1;
    private javax.swing.JTextField persCargo2;
    private javax.swing.JTextField persCargo3;
    private javax.swing.JComboBox<String> policial;
    private javax.swing.JTextField provincia;
    private javax.swing.JTextField puesto1;
    private javax.swing.JTextField puesto2;
    private javax.swing.JTextField puesto3;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField r2;
    private javax.swing.JTextField r3;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JTextField relaLab1;
    private javax.swing.JTextField relaLab2;
    private javax.swing.JTextField relaLab3;
    private javax.swing.JTextArea resumen;
    private javax.swing.JTextField rubro1;
    private javax.swing.JTextField rubro2;
    private javax.swing.JTextField rubro3;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JTextField sector1;
    private javax.swing.JTextField sector2;
    private javax.swing.JTextField sector3;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JTable ss1;
    private javax.swing.JTextField sueldo1;
    private javax.swing.JTextField sueldo2;
    private javax.swing.JTextField sueldo3;
    private javax.swing.JTable tabla_ee;
    private javax.swing.JTextField telef1;
    private javax.swing.JTextField telef2;
    private javax.swing.JTextField telef3;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
