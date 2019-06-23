package tugbes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lulita
 */
public class loadData {
     String url;
     File file;
     BufferedReader br;
     DefaultTableModel model1;
     
     public void loadData(JTable jTable1) {
        model1 = (DefaultTableModel)jTable1.getModel();
        url = "src/tugbes/Laundry.txt";
        file = new File (url);
        try {
            br = new BufferedReader(new FileReader(file));
            Object[]dataBaris = br.lines().toArray();
            for(int i = 0; i<dataBaris.length;i++){
                String baris = dataBaris[i].toString();
                String[] data = baris.split("/");
                model1.addRow(data);
            }
        } catch (Exception e) {
        }
     }
}
