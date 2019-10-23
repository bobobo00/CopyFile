package cn.io.study02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * @author dell
 *
 */

public class Copy {
	public static void main(String[] args) {
		File src=new File("abc.txt");
		File dest=new File("dest.txt");
		InputStream is=null;
		OutputStream os=null;
		try {
			is=new FileInputStream("abc.txt");
			os=new FileOutputStream("dest.txt");
			byte[] flush=new byte[3];
			int len=0;
			while((len=is.read(flush))!=-1) {
				String str=new String(flush,0,len);
				flush=str.getBytes();
				os.write(flush);
				os.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(is!=null||os!=null) {
				try {
					is.close();
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
	}

}
