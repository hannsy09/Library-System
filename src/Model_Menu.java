
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author hanns
 */
public class Model_Menu {

    /**
     *
     * @param string
     * @param string0
     * @param menuType
     */
    Model_Menu(String string, String string0, MenuType menuType) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @return
     */
    public String getIcon() {
        return icon;
    }

    /**
     *
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public MenuType getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(MenuType type) {
        this.type = type;
    }
    
    /**
     *
     */
    private String icon;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private MenuType type;
    
    /**
     *
     * @return
     */
    public Icon toIcon(){
        return new ImageIcon(getClass(). getResource("/com/library/icon/"+icon+".png"));
    }

    /**
     *
     */
    public static enum MenuType {

        /**
         *
         */
        TITLE,

        /**
         *
         */
        MENU,

        /**
         *
         */
        EMPTY
    }
    
    
}
