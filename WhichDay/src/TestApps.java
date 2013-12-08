import java.net.URL;

/**
 * Author: Rinat Tainov
 * Email: rinat@tainov.com
 * Date: 10/24/13
 * Time: 10:44 PM
 */
public class TestApps {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://softdream.taintech.kz/");
        for(int i=0;i<100;i++){
            url.openConnection();
            System.out.println("i:"+i);
            Thread.sleep(100);
        }
    }
}
