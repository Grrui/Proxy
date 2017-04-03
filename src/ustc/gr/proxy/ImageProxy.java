package ustc.gr.proxy;

/**
 * Created by Black on 2017/4/3.
 */
public class ImageProxy implements Image{
    private Image image;

    public ImageProxy(Image image) {
        this.image = image;
    }

    @Override
    public void show() {
        if(image==null){
            image = new BigImage();
        }
        image.show();
    }
}
