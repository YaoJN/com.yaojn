import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

/**
 * 
 */

/**
 * @author YaoJN
 * 
 */
public class ReadQRCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MultiFormatReader formatReader = new MultiFormatReader();
		// 二维码路径
		File file = new File("D:/code/img.png");
		BufferedImage image;
		try {
			image = ImageIO.read(file);
			BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
					new BufferedImageLuminanceSource(image)));
			// 定义二维码参数(格式,错误等级)
			HashMap hints = new HashMap();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			Result result = formatReader.decode(binaryBitmap, hints);
			// 输出二维码内容
			System.out.println("解析结果：" + result.toString());
			System.out.println("解析结果：" + result.getBarcodeFormat());
			System.out.println("解析结果：" + result.getText());
		} catch (IOException | NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
