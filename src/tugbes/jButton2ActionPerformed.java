package tugbes;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author User
 */
public class jButton2ActionPerformed {
    int total = 0;
    DefaultTableModel model1;//untuk jTable1
    DefaultTableModel model2;//untuk jTable2
    Update u = new Update ();
    
     public void jButton2ActionPerformed(JTable jTable1, JTable jTable2, JTextField paket, JTextField jenispaket, JTextField harga, JTextField kg, JTextField totalfield) {
        model1 = (DefaultTableModel)jTable1.getModel();
        model2 = (DefaultTableModel)jTable2.getModel();
        String [] data2 = new String [5];
        String pkt = paket.getText();
        String jpkt = jenispaket.getText();
        String hrg = harga.getText();
        int hargaaa = Integer.parseInt(harga.getText());
        int jumlah = Integer.parseInt(kg.getText());
        int h = 0,  baris = 0;
        String nama = "";
        boolean ada = false;
        if(pkt.equals("") || jumlah == 0 ){
            
        }
        else{
            for(int i = 0; i<model1.getRowCount();i++){
                if(pkt.equals(model1.getValueAt(i, 0))){
                    nama = model1.getValueAt(i, 1).toString();
                    hrg = model1.getValueAt(i, 2).toString();
                    
                    
                    
                    
                    baris = i;
                    ada = true;
                    paket.setText("");
                    jenispaket.setText("");
                    kg.setText("");
                    harga.setText("");
                    
                }
            }
            
            u.Update(jTable1);
            //l.loadData(jTable1);
            data2 [0] = pkt;
            data2 [1] = jpkt;
            data2 [2] = ""+jumlah;
            data2 [3] = hrg;
            data2 [4] = ""+(hargaaa*jumlah);
            
            model2.addRow(data2);
            
            
        }
        total += (hargaaa*jumlah);
        totalfield.setText("Rp. "+total);
    }
}
