import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/**
 * 
 */

/**
 * @author YaoJN
 *
 */
public class CreateQRCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�趨��ά���ߣ����ͣ���ά��Ҫչʾ�����ݡ�
		int width = 300;
		int height = 300;
		String format = "png";
		String content = "http://www.cnblogs.com/zgsyjn/";
		//�����ά�����(��ʽ,����ȼ�)
		HashMap hints = new HashMap();
		hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		hints.put(EncodeHintType.ERROR_CORRECTION,ErrorCorrectionLevel.M);
		hints.put(EncodeHintType.MARGIN,2);
		
		try {	
			BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height);
		    // ��ά������·��
			Path file = new File("D:/code/img.png").toPath();
			MatrixToImageWriter.writeToPath(bitMatrix, format, file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
