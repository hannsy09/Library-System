

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends javax.swing.JPanel {

    Color DefaultColor,ClickedColor;
    
    public Menu() {
        initComponents();
        setOpaque(false);
        DefaultColor=new Color(13,36,51);
        ClickedColor=new Color(240,151,57);
        
        Dashboard.setBackground(DefaultColor);
        ManageBooks.setBackground(DefaultColor);
        BorrowBooks.setBackground(DefaultColor);
        ManageStudents.setBackground(DefaultColor);
        LostBooks.setBackground(DefaultColor);
        Logout.setBackground(DefaultColor);
    }

    public void initMenu(){
    }
    
    
    
    
    
 
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelmoving = new javax.swing.JPanel();
        panelMenu1 = new panelMenu();
        jLabel1 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        ManageBooks = new javax.swing.JLabel();
        BorrowBooks = new javax.swing.JLabel();
        ManageStudents = new javax.swing.JLabel();
        LostBooks = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelmoving.setOpaque(false);
        panelmoving.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library Building.png"))); // NOI18N
        jLabel1.setText("BookWise");

        Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard Layout.png"))); // NOI18N
        Dashboard.setText("Dashboard");
        Dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DashboardMousePressed(evt);
            }
        });

        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout.png"))); // NOI18N
        Logout.setText("Logout");

        ManageBooks.setForeground(new java.awt.Color(255, 255, 255));
        ManageBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Books.png"))); // NOI18N
        ManageBooks.setText("Manage Books");
        ManageBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManageBooksMousePressed(evt);
            }
        });

        BorrowBooks.setForeground(new java.awt.Color(255, 255, 255));
        BorrowBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrowBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Transaction.png"))); // NOI18N
        BorrowBooks.setText("Borrow Books");
        BorrowBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BorrowBooksMousePressed(evt);
            }
        });

        ManageStudents.setForeground(new java.awt.Color(255, 255, 255));
        ManageStudents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Person.png"))); // NOI18N
        ManageStudents.setText("Manage Students");
        ManageStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManageStudentsMousePressed(evt);
            }
        });

        LostBooks.setForeground(new java.awt.Color(255, 255, 255));
        LostBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LostBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Book Shelf.png"))); // NOI18N
        LostBooks.setText("Lost Books");
        LostBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LostBooksMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelMenu1Layout = new javax.swing.GroupLayout(panelMenu1);
        panelMenu1.setLayout(panelMenu1Layout);
        panelMenu1Layout.setHorizontalGroup(
            panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LostBooks)
                    .addComponent(Dashboard)
                    .addComponent(ManageBooks)
                    .addComponent(Logout)
                    .addComponent(BorrowBooks)
                    .addComponent(ManageStudents))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenu1Layout.setVerticalGroup(
            panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Dashboard)
                .addGap(24, 24, 24)
                .addComponent(ManageBooks)
                .addGap(18, 18, 18)
                .addComponent(BorrowBooks)
                .addGap(18, 18, 18)
                .addComponent(ManageStudents)
                .addGap(18, 18, 18)
                .addComponent(LostBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout panelmovingLayout = new javax.swing.GroupLayout(panelmoving);
        panelmoving.setLayout(panelmovingLayout);
        panelmovingLayout.setHorizontalGroup(
            panelmovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmovingLayout.createSequentialGroup()
                .addComponent(panelMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 112, Short.MAX_VALUE))
        );
        panelmovingLayout.setVerticalGroup(
            panelmovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(panelmoving, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void LostBooksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LostBooksMousePressed
        Dashboard.setBackground(DefaultColor);
        ManageBooks.setBackground(DefaultColor);
        BorrowBooks.setBackground(DefaultColor);
        ManageStudents.setBackground(DefaultColor);
        LostBooks.setBackground(ClickedColor);
        Logout.setBackground(DefaultColor);
    }//GEN-LAST:event_LostBooksMousePressed

    private void ManageStudentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageStudentsMousePressed
        Dashboard.setBackground(DefaultColor);
        ManageBooks.setBackground(DefaultColor);
        BorrowBooks.setBackground(DefaultColor);
        ManageStudents.setBackground(ClickedColor);
        LostBooks.setBackground(DefaultColor);
        Logout.setBackground(DefaultColor);
    }//GEN-LAST:event_ManageStudentsMousePressed

    private void BorrowBooksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowBooksMousePressed
        Dashboard.setBackground(DefaultColor);
        ManageBooks.setBackground(DefaultColor);
        BorrowBooks.setBackground(ClickedColor);
        ManageStudents.setBackground(DefaultColor);
        LostBooks.setBackground(DefaultColor);
        Logout.setBackground(DefaultColor);
    }//GEN-LAST:event_BorrowBooksMousePressed

    private void ManageBooksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooksMousePressed
        Dashboard.setBackground(DefaultColor);
        ManageBooks.setBackground(ClickedColor);
        BorrowBooks.setBackground(DefaultColor);
        ManageStudents.setBackground(DefaultColor);
        LostBooks.setBackground(DefaultColor);
        Logout.setBackground(DefaultColor);
    }//GEN-LAST:event_ManageBooksMousePressed

    private void DashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMousePressed
        Dashboard.setBackground(ClickedColor);
        ManageBooks.setBackground(DefaultColor);
        BorrowBooks.setBackground(DefaultColor);
        ManageStudents.setBackground(DefaultColor);
        LostBooks.setBackground(DefaultColor);
        Logout.setBackground(DefaultColor);
    }//GEN-LAST:event_DashboardMousePressed

    
    
    /**
     *
     */
    private int x;

    /**
     *
     */
    private int y;
    
    /**
     *
     * @param fram
     */
    public void initMoving(JFrame fram){
        panelmoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
               x=me.getX();
               y=me.getY();
            }
            
        });
        panelmoving.addMouseMotionListener(new MouseMotionAdapter (){
            @Override
            public void mouseDragged(MouseEvent me) {
              fram.setLocation(me.getXOnScreen()-x, me.getYOnScreen()-y);
            }
        
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BorrowBooks;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel LostBooks;
    private javax.swing.JLabel ManageBooks;
    private javax.swing.JLabel ManageStudents;
    private javax.swing.JLabel jLabel1;
    private panelMenu panelMenu1;
    private javax.swing.JPanel panelmoving;
    // End of variables declaration//GEN-END:variables
}
