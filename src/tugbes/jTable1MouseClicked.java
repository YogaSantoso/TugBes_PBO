package tugbes;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Lulita
 */
public class jTable1MouseClicked{
    
    public void jTable1MouseClicked(JTable jTable1, JTextField paket, JTextField jenispaket, JTextField harga) {
        // TODO add your handling code here
        paket.setText("");
        paket.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jenispaket.setText("");
        jenispaket.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        harga.setText("");
        harga.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
    }
}
