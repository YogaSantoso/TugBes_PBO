package tugbes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;

/**
 *
 * @author Lulita
 */
public class Update {
    String path;
    File file;
    BufferedWriter bw;
    
    public void Update(JTable jTable1){
        path = "src/tugbes/Laundry.txt";
        file = new File(path);
        try {
            bw = new BufferedWriter(new FileWriter(file));
            for(int i=0;i<jTable1.getRowCount();i++){
                for(int j=0;j<jTable1.getColumnCount();j++){
                    if(j>0)
                        bw.write("/");
                    bw.write(jTable1.getValueAt(i, j).toString());
                }
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
        }
    }
}
