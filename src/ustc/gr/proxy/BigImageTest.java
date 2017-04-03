package ustc.gr.proxy;

/**
 * Created by Black on 2017/4/3.
 */
public class BigImageTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Image image = new ImageProxy(null);
        System.out.println("得到image对象的时间开销："+(System.currentTimeMillis()-start));
        image.show();
    }
}
