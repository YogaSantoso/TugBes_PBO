package tugbes;

/**
 *
 * @author User
 */
public class loading {
    public static void main(String[] args) throws InterruptedException {
        LOAD s = new LOAD();
        for(int i = 0 ; i <= 100 ; i++){
          Thread.sleep(40);
          s.setVisible(true);
          s.loading.setText("Loading . . "+i+"%");
          s.load.setValue(i);
          
          if(i==100){
              new LogIn().setVisible(true);
              s.dispose();
          }
        }
        
    }
}
