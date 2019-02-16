import java.util.*;
import javax.swing.JOptionPane;

public class CreateEmotion{
	static{
		//System.loadLibrary("HelloWorld");
		//System.loadLibrary("C:\\android_ndk_study\\simple_example\\libHelloWorld");		
		System.loadLibrary("libdbt_face_detection");		
	}
	
	private native void captureCommons();
	private native void captureDisgusts();
	private native void captureHappys();
	private native void resize();
	private native void createXml();
	private native void createSVM();
	private native void predictEmotion();
	
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null,"��׼����������ͨ��Ƭ","title",JOptionPane.PLAIN_MESSAGE);
		new CreateEmotion().captureCommons();
		JOptionPane.showMessageDialog(null,"��׼��������������Ƭ","title",JOptionPane.PLAIN_MESSAGE);
		new CreateEmotion().captureDisgusts();		
		JOptionPane.showMessageDialog(null,"��׼�������Ÿ�����Ƭ","title",JOptionPane.PLAIN_MESSAGE);
		new CreateEmotion().captureHappys();		
		new CreateEmotion().resize();		
		new CreateEmotion().createXml();		
		new CreateEmotion().createSVM();
		
		new CreateEmotion().predictEmotion();
		
	}
}
