import java.util.HashMap;

public class ImageFactory {
	
	private static final HashMap<String, MyImage> imageByName = new HashMap<String, MyImage>();
   
	public static MyImage getRect(String name) {
        MyImage image = (MyImage)imageByName.get(name);
		if(image == null) {
			image = new MyImage(name);			
			imageByName.put(name, image);
		}
		return image;
	}
}


