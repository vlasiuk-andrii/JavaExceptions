import java.io.FileInputStream;
import java.io.InputStream;

public class CloseMethod {
    public static void main(String[] args) throws Exception {
        InputStream is = null;
        int i=0;

        try{
            // new input stream created
            is = new FileInputStream("C://test.txt");

            // invoke available
            i = is.available();

            // number of bytes available is printed
            System.out.println(i);

            // releases any system resources associated with the stream
            is.close();

            // throws io exception on available() invocation
            i = is.available();
            System.out.println(i);

        }catch(Exception e){

            // if any I/O error occurs
            System.out.print("Sorry, the input stream is closed");
        }finally{

            // releases system resources associated with this stream
            if(is!=null)
                is.close();
        }
    }
}