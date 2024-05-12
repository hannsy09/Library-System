

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Table extends JTable{
    
    public Table(){ 
        setShowHorizontalLines(true);
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
        public  Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean blnl, int i, int il ){
            TableHeader header = new TableHeader(o + "");
            if(il == 3) {
                header.setHorizontalAlignment(JLabel.CENTER);
            }
            
            return header;
            
        }
        
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            private boolean selected;
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln,boolean blnl, int i, int il){
            if (il != 3){
                Component com = super.getTableCellRendererComponent(jtable, o, bln, blnl, i, il);
                com.setBackground(Color.WHITE);
                setBorder(noFocusBorder);
                if  (selected){
                    com.setForeground(new Color(187, 52, 52));
                } else {
                    com.setForeground(new Color(102, 102, 102));
                }
                
                return com;
            }else{
                StatusType type = (StatusType) o;
                return new CellStatus(type);
            }
        }
        });
    }
         public void addRow (Object [] row)  {
         DefaultTableModel model = (DefaultTableModel) getModel ();
         model.addRow(row);
}    

    private static class CellStatus extends Component {

        public CellStatus(StatusType type) {
        }
    }
}
              
