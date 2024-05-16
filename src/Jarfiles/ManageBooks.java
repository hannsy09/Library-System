/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hanns
 */
import java.awt.Color;
import java.awt.Component;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class ManageBooks extends javax.swing.JFrame {

  
    public ManageBooks() {
        initComponents();
        
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
        jScrollPane1.getVerticalScrollBar().setBackground(Color.WHITE);
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.PENDING});
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.PENDING});
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.APPROVED});
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.PENDING});
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.REJECT});
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.PENDING});
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.APPROVED});
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.APPROVED});
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.APPROVED});
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.PENDING});
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.REJECT});
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.REJECT});
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.REJECT});
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.REJECT});
        table.addRow(new Object[] {"hanns dewey", "mike botawski", "1", StatusType.PENDING});
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        table1 = new Table();
        searchBar1 = new SearchBar();
        jPanel1 = new javax.swing.JPanel();
        Logout = new javax.swing.JLabel();
        ManageBooks = new javax.swing.JLabel();
        BorrowBooks = new javax.swing.JLabel();
        ManageStudents = new javax.swing.JLabel();
        LostBooks = new javax.swing.JLabel();
        LogoutIcon = new javax.swing.JLabel();
        ManageBooksIcon = new javax.swing.JLabel();
        BorrowBooksIcon = new javax.swing.JLabel();
        ManageStudentsIcon = new javax.swing.JLabel();
        LostBooksIcon = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        DashboardIcon = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        Logo = new javax.swing.JLabel();
        BookWise = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Table();
        jLabel17 = new javax.swing.JLabel();
        searchBar2 = new SearchBar();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 42, 48));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 100, 20));

        ManageBooks.setForeground(new java.awt.Color(255, 255, 255));
        ManageBooks.setText("Manage Books");
        ManageBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageBooksMouseClicked(evt);
            }
        });
        jPanel1.add(ManageBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, -1));

        BorrowBooks.setForeground(new java.awt.Color(255, 255, 255));
        BorrowBooks.setText("Borrow Books");
        BorrowBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrowBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrowBooksMouseClicked(evt);
            }
        });
        jPanel1.add(BorrowBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 100, -1));

        ManageStudents.setForeground(new java.awt.Color(255, 255, 255));
        ManageStudents.setText("Manage Students");
        ManageStudents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageStudentsMouseClicked(evt);
            }
        });
        jPanel1.add(ManageStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, -1));

        LostBooks.setForeground(new java.awt.Color(255, 255, 255));
        LostBooks.setText("Lost Books");
        LostBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LostBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LostBooksMouseClicked(evt);
            }
        });
        jPanel1.add(LostBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 100, 20));

        LogoutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout.png"))); // NOI18N
        LogoutIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutIconMouseClicked(evt);
            }
        });
        jPanel1.add(LogoutIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 20, 20));

        ManageBooksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Books.png"))); // NOI18N
        ManageBooksIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageBooksIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageBooksIconMouseClicked(evt);
            }
        });
        jPanel1.add(ManageBooksIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 20, 20));

        BorrowBooksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Transaction.png"))); // NOI18N
        BorrowBooksIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrowBooksIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrowBooksIconMouseClicked(evt);
            }
        });
        jPanel1.add(BorrowBooksIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 20, 20));

        ManageStudentsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Person.png"))); // NOI18N
        ManageStudentsIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageStudentsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageStudentsIconMouseClicked(evt);
            }
        });
        jPanel1.add(ManageStudentsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 20, 20));

        LostBooksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Book Shelf.png"))); // NOI18N
        LostBooksIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LostBooksIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LostBooksIconMouseClicked(evt);
            }
        });
        jPanel1.add(LostBooksIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 20, 20));

        Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard.setText("Dashboard");
        Dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });
        jPanel1.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 80, -1));

        DashboardIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard Layout.png"))); // NOI18N
        DashboardIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DashboardIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardIconMouseClicked(evt);
            }
        });
        jPanel1.add(DashboardIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 20, 20));

        kGradientPanel1.setkEndColor(new java.awt.Color(83, 105, 118));
        kGradientPanel1.setkStartColor(new java.awt.Color(41, 46, 73));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library Building.png"))); // NOI18N
        kGradientPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        BookWise.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BookWise.setForeground(new java.awt.Color(255, 255, 255));
        BookWise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BookWise.setText("BookWise");
        kGradientPanel1.add(BookWise, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        kGradientPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 500));

        jPanel2.setBackground(new java.awt.Color(76, 177, 181));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("X");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel2.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 16, -1, 20));

        jLabel14.setFont(new java.awt.Font("The Bold Font", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Latest Books Added ");

        jScrollPane1.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Author", "Book Id", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(204, 204, 204));
        table.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 610, 380));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("LIST OF BOOKS");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        searchBar2.setText("Search  a book.....");
        searchBar2.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/Search.png"))); // NOI18N
        searchBar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBar2ActionPerformed(evt);
            }
        });
        searchBar2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBar2KeyReleased(evt);
            }
        });
        jPanel2.add(searchBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 260, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 670, 500));

        setSize(new java.awt.Dimension(817, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
       System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
       setVisible(false);
       new LoginMain().setVisible(true);
    }//GEN-LAST:event_LogoutMouseClicked

    private void LogoutIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutIconMouseClicked
       setVisible(false);
       new LoginMain().setVisible(true);
    }//GEN-LAST:event_LogoutIconMouseClicked

    private void ManageBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooksMouseClicked
     
    }//GEN-LAST:event_ManageBooksMouseClicked

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
          setVisible(false);
       new Dashboard().setVisible(true);
    }//GEN-LAST:event_DashboardMouseClicked

    private void BorrowBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowBooksMouseClicked
         setVisible(false);
       new BorrowBooks().setVisible(true);
    }//GEN-LAST:event_BorrowBooksMouseClicked

    private void ManageStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageStudentsMouseClicked
        setVisible(false);
       new ManageStudents().setVisible(true);
    }//GEN-LAST:event_ManageStudentsMouseClicked

    private void DashboardIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardIconMouseClicked
        setVisible(false);
       new Dashboard().setVisible(true);
    }//GEN-LAST:event_DashboardIconMouseClicked

    private void ManageBooksIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooksIconMouseClicked
       setVisible(false);
       new ManageBooks().setVisible(true);
    }//GEN-LAST:event_ManageBooksIconMouseClicked

    private void BorrowBooksIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowBooksIconMouseClicked
       setVisible(false);
       new BorrowBooks().setVisible(true);
    }//GEN-LAST:event_BorrowBooksIconMouseClicked

    private void ManageStudentsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageStudentsIconMouseClicked
        setVisible(false);
       new ManageStudents().setVisible(true);
    }//GEN-LAST:event_ManageStudentsIconMouseClicked

    private void LostBooksIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LostBooksIconMouseClicked
        setVisible(false);
       new LostBooks().setVisible(true);
    }//GEN-LAST:event_LostBooksIconMouseClicked

    private void LostBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LostBooksMouseClicked
        setVisible(false);
       new LostBooks().setVisible(true);
    }//GEN-LAST:event_LostBooksMouseClicked

    private void searchBar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBar2ActionPerformed

    private void searchBar2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBar2KeyReleased
        if(searchBar2.getText() .equals("")){
            searchBar2.setSuffixIcon(null); 
        }else{
            searchBar2.setSuffixIcon(new javax.swing.ImageIcon(getClass().getResource("/system-solid-716-spinner-three-dots.gif"))); 
        }
        
        
        

    }//GEN-LAST:event_searchBar2KeyReleased

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookWise;
    private javax.swing.JLabel BorrowBooks;
    private javax.swing.JLabel BorrowBooksIcon;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel DashboardIcon;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel LogoutIcon;
    private javax.swing.JLabel LostBooks;
    private javax.swing.JLabel LostBooksIcon;
    private javax.swing.JLabel ManageBooks;
    private javax.swing.JLabel ManageBooksIcon;
    private javax.swing.JLabel ManageStudents;
    private javax.swing.JLabel ManageStudentsIcon;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private SearchBar searchBar1;
    private SearchBar searchBar2;
    private Table table;
    private Table table1;
    // End of variables declaration//GEN-END:variables

    private static class ScrollBar extends JScrollBar {

        public ScrollBar() {
        }
    }

    private static class Jpanel {

        public Jpanel() {
        }

        private void setBackground(Color WHITE) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}