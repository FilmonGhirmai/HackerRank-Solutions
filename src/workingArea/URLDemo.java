package workingArea;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**d
 * Created by
 * Filmon Ghirmai (skynet) on 9/6/17.
 */
public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost");
            url.openConnection();
            System.out.println("done!");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        List<Integer> list = new ArrayList();

        /*list.add("java");
        list.add("php");
        list.add("swift");*/
        list.add(44);
        list.add(12);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(0) + list.get(1));

    }
}
