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
		// ��ά��·��
		File file = new File("D:/code/img.png");
		BufferedImage image;
		try {
			image = ImageIO.read(file);
			BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
					new BufferedImageLuminanceSource(image)));
			// �����ά�����(��ʽ,����ȼ�)
			HashMap hints = new HashMap();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			Result result = formatReader.decode(binaryBitmap, hints);
			// �����ά������
			System.out.println("���������" + result.toString());
			System.out.println("���������" + result.getBarcodeFormat());
			System.out.println("���������" + result.getText());
		} catch (IOException | NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
