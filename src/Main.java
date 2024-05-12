
import java.awt.Color;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    
    Color DefaultColor,ClickedColor;
    
    public Main() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        DefaultColor=new Color(240,240,240);
        ClickedColor=new Color(76,177,181);
        
        Main.setForeground(DefaultColor);
        ManageBooks.setForeground(DefaultColor);
        BorrowBooks.setForeground(DefaultColor);
        ManageStudents.setForeground(DefaultColor);
        LostBooks.setForeground(DefaultColor);
        Logout.setForeground(DefaultColor);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new PanelBorder();
        panelBorder2 = new PanelBorder();
        jPanel1 = new javax.swing.JPanel();
        panelMenu1 = new panelMenu();
        jLabel14 = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        ManageBooks = new javax.swing.JLabel();
        BorrowBooks = new javax.swing.JLabel();
        ManageStudents = new javax.swing.JLabel();
        LostBooks = new javax.swing.JLabel();
        Main = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        MenuName = new javax.swing.JLabel();
        JDesktopPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/library/icon/Library Building.png"))); // NOI18N
        jLabel14.setText("BookWise");

        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/library/icon/Logout.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoutMousePressed(evt);
            }
        });

        ManageBooks.setForeground(new java.awt.Color(255, 255, 255));
        ManageBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/library/icon/Book Shelf.png"))); // NOI18N
        ManageBooks.setText("Manage Books");
        ManageBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageBooksMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManageBooksMousePressed(evt);
            }
        });

        BorrowBooks.setForeground(new java.awt.Color(255, 255, 255));
        BorrowBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrowBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/library/icon/Transaction.png"))); // NOI18N
        BorrowBooks.setText("Borrow Books");
        BorrowBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrowBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrowBooksMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BorrowBooksMousePressed(evt);
            }
        });

        ManageStudents.setForeground(new java.awt.Color(255, 255, 255));
        ManageStudents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/library/icon/Person.png"))); // NOI18N
        ManageStudents.setText("Manage Students");
        ManageStudents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageStudentsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManageStudentsMousePressed(evt);
            }
        });

        LostBooks.setForeground(new java.awt.Color(255, 255, 255));
        LostBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LostBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/library/icon/Books.png"))); // NOI18N
        LostBooks.setText("Lost Books");
        LostBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LostBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LostBooksMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LostBooksMousePressed(evt);
            }
        });

        Main.setForeground(new java.awt.Color(255, 255, 255));
        Main.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/library/icon/Dashboard Layout.png"))); // NOI18N
        Main.setText("Dashboard");
        Main.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelMenu1Layout = new javax.swing.GroupLayout(panelMenu1);
        panelMenu1.setLayout(panelMenu1Layout);
        panelMenu1Layout.setHorizontalGroup(
            panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManageBooks)
                    .addComponent(BorrowBooks)
                    .addComponent(LostBooks)
                    .addComponent(ManageStudents)
                    .addComponent(Main)
                    .addComponent(Logout))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelMenu1Layout.setVerticalGroup(
            panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Main)
                .addGap(18, 18, 18)
                .addComponent(ManageBooks)
                .addGap(18, 18, 18)
                .addComponent(BorrowBooks)
                .addGap(18, 18, 18)
                .addComponent(ManageStudents)
                .addGap(18, 18, 18)
                .addComponent(LostBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(39, 39, 39))
        );

        jPanel1.add(panelMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 500));

        jPanel2.setBackground(new java.awt.Color(76, 177, 181));

        MenuName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuName.setForeground(new java.awt.Color(255, 255, 255));
        MenuName.setText("Welcome, Admin");

        JDesktopPanel.setBackground(new java.awt.Color(76, 177, 181));
        JDesktopPanel.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Library Management System");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/library/icon/LOGO.png"))); // NOI18N

        javax.swing.GroupLayout JDesktopPanelLayout = new javax.swing.GroupLayout(JDesktopPanel);
        JDesktopPanel.setLayout(JDesktopPanelLayout);
        JDesktopPanelLayout.setHorizontalGroup(
            JDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopPanelLayout.createSequentialGroup()
                .addGroup(JDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDesktopPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1))
                    .addGroup(JDesktopPanelLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );
        JDesktopPanelLayout.setVerticalGroup(
            JDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(196, 196, 196))
        );

        Exit.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("x");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(MenuName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JDesktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 610, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LostBooksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LostBooksMousePressed
        Main.setForeground(DefaultColor);
        ManageBooks.setForeground(DefaultColor);
        BorrowBooks.setForeground(DefaultColor);
        ManageStudents.setForeground(DefaultColor);
        LostBooks.setForeground(ClickedColor);
        Logout.setForeground(DefaultColor);
        
        MenuName.setText("List of Lost Books");
    }//GEN-LAST:event_LostBooksMousePressed

    private void ManageStudentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageStudentsMousePressed
        Main.setForeground(DefaultColor);
        ManageBooks.setForeground(DefaultColor);
        BorrowBooks.setForeground(DefaultColor);
        ManageStudents.setForeground(ClickedColor);
        LostBooks.setForeground(DefaultColor);
        Logout.setForeground(DefaultColor);
        
        MenuName.setText("List of Students");
    }//GEN-LAST:event_ManageStudentsMousePressed

    private void BorrowBooksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowBooksMousePressed
        Main.setForeground(DefaultColor);
        ManageBooks.setForeground(DefaultColor);
        BorrowBooks.setForeground(ClickedColor);
        ManageStudents.setForeground(DefaultColor);
        LostBooks.setForeground(DefaultColor);
        Logout.setForeground(DefaultColor);
        
        MenuName.setText("List of Borrowers");
    }//GEN-LAST:event_BorrowBooksMousePressed

    private void ManageBooksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooksMousePressed
        Main.setForeground(DefaultColor);
        ManageBooks.setForeground(ClickedColor);
        BorrowBooks.setForeground(DefaultColor);
        ManageStudents.setForeground(DefaultColor);
        LostBooks.setForeground(DefaultColor);
        Logout.setForeground(DefaultColor);
        
        MenuName.setText("List of Books");
    }//GEN-LAST:event_ManageBooksMousePressed

    private void MainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMousePressed
        Main.setForeground(ClickedColor);
        ManageBooks.setForeground(DefaultColor);
        BorrowBooks.setForeground(DefaultColor);
        ManageStudents.setForeground(DefaultColor);
        LostBooks.setForeground(DefaultColor);
        Logout.setForeground(DefaultColor);
        
        MenuName.setText("Dashboard");
    }//GEN-LAST:event_MainMousePressed

    private void LogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMousePressed
        Main.setForeground(DefaultColor);
        ManageBooks.setForeground(DefaultColor);
        BorrowBooks.setForeground(DefaultColor);
        ManageStudents.setForeground(DefaultColor);
        LostBooks.setForeground(DefaultColor);
        Logout.setForeground(ClickedColor);
    }//GEN-LAST:event_LogoutMousePressed

    private void MainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMouseClicked
        Dashboard dashboard=new Dashboard();
        JDesktopPanel.removeAll();
        JDesktopPanel.add(dashboard).setVisible(true);
    }//GEN-LAST:event_MainMouseClicked

    private void ManageBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooksMouseClicked
        ManageBooks managebooks=new ManageBooks();
        JDesktopPanel.removeAll();
        JDesktopPanel.add(managebooks).setVisible(true);
    }//GEN-LAST:event_ManageBooksMouseClicked

    private void BorrowBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowBooksMouseClicked
        BorrowBooks borrowbooks=new BorrowBooks();
        JDesktopPanel.removeAll();
        JDesktopPanel.add(borrowbooks).setVisible(true);
    }//GEN-LAST:event_BorrowBooksMouseClicked

    private void ManageStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageStudentsMouseClicked
        ManageStudents managestudents=new ManageStudents();
        JDesktopPanel.removeAll();
        JDesktopPanel.add(managestudents).setVisible(true);
    }//GEN-LAST:event_ManageStudentsMouseClicked

    private void LostBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LostBooksMouseClicked
        LostBooks lostbooks=new LostBooks();
        JDesktopPanel.removeAll();
        JDesktopPanel.add(lostbooks).setVisible(true);
    }//GEN-LAST:event_LostBooksMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        setVisible(false);
       new LoginMain().setVisible(true);
    }//GEN-LAST:event_LogoutMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BorrowBooks;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel JDesktopPanel;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel LostBooks;
    private javax.swing.JLabel Main;
    private javax.swing.JLabel ManageBooks;
    private javax.swing.JLabel ManageStudents;
    private javax.swing.JLabel MenuName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private PanelBorder panelBorder1;
    private PanelBorder panelBorder2;
    private panelMenu panelMenu1;
    // End of variables declaration//GEN-END:variables

    private static class Table {

        public Table() {
        }

        private void setSelectionForeground(Color color) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setGridColor(Color color) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setModel(DefaultTableModel defaultTableModel) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
