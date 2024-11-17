package com.io.file.example;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.UUID;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

import org.apache.commons.io.FilenameUtils;

/**
 * 缩略图 工具类
 * 
 * @author Bangwen_Chen
 * 
 */
public class ImageCompressionUtil {

	/**
	 * 对指定的图片进行压缩
	 * 
	 * @param imageFile
	 * @param quality
	 * @return
	 */
	public static File compressFile(File imageFile, float quality) {
		InputStream is = null;
		OutputStream os = null;
		ImageOutputStream ios = null;
		ImageWriter writer = null;

		try {
			// File imageFile = new
			// File("C:\\Users\\AnandhKumar_J\\Pictures\\Capture.PNG");
			String fileExt = FilenameUtils.getExtension(imageFile.getName());

			File compressedImageFile = File.createTempFile(UUID.randomUUID()
					.toString(), "." + fileExt);

			is = new FileInputStream(imageFile);
			os = new FileOutputStream(compressedImageFile);

			// float quality = 1.0f;

			// create a BufferedImage as the result of decoding the supplied
			// InputStream
			BufferedImage image = ImageIO.read(is);

			// get all image writers for JPG format
			Iterator<ImageWriter> writers = ImageIO
					.getImageWritersByFormatName(fileExt);

			if (!writers.hasNext()) {
				throw new IllegalStateException("No writers found");
			}

			writer = (ImageWriter) writers.next();
			ios = ImageIO.createImageOutputStream(os);
			writer.setOutput(ios);

			ImageWriteParam param = writer.getDefaultWriteParam();

			// compress to a given quality
			param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
			param.setCompressionQuality(quality);

			// appends a complete image stream containing a single image and
			// associated stream and image metadata and thumbnails to the output
			writer.write(null, new IIOImage(image, null, null), param);

			return compressedImageFile;
		} catch (Exception e) {
			System.out.println("Error While Doing image Compression "+e);
			return imageFile;
		} finally {
			// close all streams
			try {
				if (is != null) {
					is.close();
				}
				if (os != null) {
					os.close();
				}
				if (ios != null) {
					ios.close();
				}
				if (writer != null) {
					writer.dispose();
				}
			} catch (IOException e) {
				System.out.println("Error While Doing image Compression "+e);
			}

		}
	}

	/**
	 * 压缩图片
	 * 
	 * @param imageFile
	 * @returnn
	 */
	public static File compressFile(File file) {
		return compressFile(file, 0.7f);
	}
	
	public static void main(String[] args) {
		ImageCompressionUtil icu = new ImageCompressionUtil();
		icu.compressFile(new File("G:\\javaTest\\1432.png"));
	}

}
