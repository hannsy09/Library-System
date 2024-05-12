
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class panelMenu extends javax.swing.JPanel {

    static void add(ButtonMenu menu) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public panelMenu() {
        setOpaque(false);
        init();
    }

    
    private void init(){
        
    }
 
    
    @SuppressWarnings("unchecked")
    

    /**
     *
     * @param grphcs
     */
    @Override
    protected void paintChildren(Graphics grphcs) {
        
    Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#0F2027"), 0, getHeight(), Color.decode("#2C5364"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15,15);
        g2.fillRect(getWidth()-20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs); 
}
}
