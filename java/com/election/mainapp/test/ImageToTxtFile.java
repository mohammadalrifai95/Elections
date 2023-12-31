package com.election.mainapp.test;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.springframework.web.multipart.MultipartFile;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Base64;
import java.io.*; 
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageToTxtFile extends JFrame {

	public ImageToTxtFile() {
		
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        JLabel photo = new JLabel();
	        photo.setVerticalTextPosition(JLabel.BOTTOM);
	        photo.setHorizontalTextPosition(JLabel.CENTER);
	        photo.setHorizontalAlignment(JLabel.CENTER);
	        photo.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
	        add(photo, BorderLayout.CENTER);
	        setSize(200, 100);
	        setLocationRelativeTo(null);

	        System.out.println(photo);
	        // Ex. stackoverflow.ico (then converted to png for this example)
	        String imgBase64 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsQAAA7EAZUrDhsAAAJ+SURBVFhH7ZXbS1RRFMb7Y5qHiu4PEfUQRS9B9FBEBBVFT70WvQQhmJpdLUkMS0mNikDKlKxIDR+iCz3YmJgWCZmlKWPNPvd9vvZeZ8+ZS3NmzlzoYn2wHmatYe/f2etbey/Ab9Z/gPkFwCcGoTVtB/8yojL5VTYA1/gGdnIV4hULoV3cBFefU5XcKusJ2G96BECEIPT2A4LKUZVglQYgNuBTo+qHJ7P3PAHIMB+dUtlglQRgdh1HvHIx7Jc3VEbI5dCvH1QQEdjRblXIrqIB3NhHsDNr/a81Oo4AlubVhB+0+s1erWop+OdhymdTSSfgfp+C3rLbh9AatoB/fU81Pv0OrGYl5VndBrhslvKZKt2E3KFeJ8zHalbAHrpPJWfksZ/XW/eSZzJVMIA92CkW7qVep8oZfuiPodzU7KkScDas/nqVE6aUuQwVBODN+mpaTLuwEdbTFsolxGc+QGvc6m+oN++COzcJ/eYhsOpl6WZVKghAjpxcNLGBDFa9HGZ3hd972AaMO0eT9dNr4IwNgM+Oe/UMFeUB/inqbSJGMAkTocvHGe2n9tivbiN+YgnYufV0CkEqyYQum4H15BLY2XUpIKI9YgStZ61wxl/kfRdCAzhv+4QB74rxGvvZzcJs9ut70K7sSAOxBhrVH4IVGkC/tie5uLhc9Ks7qffyqPnkEEFIyRfR6DhMl5RrximXS+EB2vbTjKd+YVpULoJ2eRuMzmOwnrfTRIRRYR4Q5pJut6Nd4vKpFZfLPrBabywzQ7YsjAIBmttuUYSRG5sQF9EDmH119BCR87UY1fKtUxaAXCobQLZjzhUJzR+AYvX3A5QrgvTnAvwq/esAwA/q0/BiaJrlDgAAAABJRU5ErkJggg==";
	        
	        String data = imgBase64.substring(imgBase64.indexOf(",") + 1);
	        ByteArrayInputStream stream = new ByteArrayInputStream(Base64.getDecoder().decode(data.getBytes()));
	        BufferedImage image = null;
	        try {
	            image = ImageIO.read(stream);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        ImageIcon imgIcon = new ImageIcon(image.getScaledInstance(32, 32, 0));
	        //photographLabel.setIcon(imgIcon);
	        photo.setIcon(imgIcon);
	
//	        Image image=GenerateImage.toImage(true);  //this generates an image file
//	        ImageIcon icon = new ImageIcon(image); 
//	        JLabel thumb = new JLabel();
//	        thumb.setIcon(imgIcon);
	        
	        
	}

	
	
	public static void main(String[] args) {
		
		Image img = null;
	    try {
	        img = ImageIO.read(new File("C:/tmp/device.jpg"));
	    } catch (IOException e) {
	    }       
		
	    
	    
		
//		MultipartFile file =  ((Object) img).getAttachment();  
//		byte[] result = file.getBytes(); // Good: The content of the uploaded file
//		Image img = new Image();
//		img.setContent(result);
//		ByteArrayInputStream in = new ByteArrayInputStream(img.getContent());
//		
		
	    
	    
		
//		SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//            	ImageToTxtFile app = new ImageToTxtFile();
//                app.setVisible(true);
//            }
//        });
	}
	
	
	
}
