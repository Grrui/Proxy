package ustc.gr.proxy;

/**
 * Created by Black on 2017/4/3.
 */
public class BigImage implements Image {

    public BigImage() {
        try{
            //进程休眠3秒，模拟加载图片的系统开销
            Thread.sleep(3000);
            System.out.println("图片加载成功");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void show() {
        System.out.println("展现实际的大图");
    }
}
