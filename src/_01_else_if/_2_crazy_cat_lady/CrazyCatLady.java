
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String cats = JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
		//int fourAsInt = Integer.parseInt(fourAsString);
		
		int intCats = Integer.parseInt(cats);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		if(intCats>2) {
			JOptionPane.showMessageDialog(null, "You are a crazy cat lady");
		} else if(intCats>0 && intCats<3) {
			playVideo("https://www.google.com/search?sca_esv=ce3cef7d3e0e1deb&q=cat+video&udm=7&fbs=ABzOT_CWdhQLP1FcmU5B0fn3xuWp6IcynRBrzjy_vjxR0KoDMp_4ut2Z3jppK72fzdIpWsBpYmR8fwcVczrRGmP-Hf4k8TNdw0hYkrFPYGyfZnlaQTXsgCV5v5F-ZEusHyPYUmDnGkm0J8BNIsZGr8ZQdTdvE8SIQx_yYVjvZ3uOcifh0_n6B-yR3e9Q7B3x5dqYNdXH31VakC3CM1pjsNkO9a4iQpwAqQ&sa=X&ved=2ahUKEwiDpf3DspyMAxU_EkQIHWWcJZoQtKgLegQIFRAB&biw=1792&bih=895&dpr=2#fpstate=ive&vld=cid:26a0bd28,vid:wy7OR78KCE4,st:0");
		}else if(intCats==0) {
			playVideo("https://www.google.com/search?sca_esv=b275642f2649e319&q=frog+sitting+on+bench+video&udm=7&fbs=ABzOT_CWdhQLP1FcmU5B0fn3xuWp6IcynRBrzjy_vjxR0KoDMp_4ut2Z3jppK72fzdIpWsBpYmR8fwcVczrRGmP-Hf4k8E3HhH0FkewPslVYtPbS7kB2xAs5YSOHZO5EqeKGc26SHX0xXSminLbaX8Sg7bBh8XB9dgB3v-mENjEJ7mDW-Qjp9Cb3fCNvxepLOzZv82Wkp153fQbMLAybZ_khZFArCYgCYA&sa=X&ved=2ahUKEwjxl5H7spyMAxXJH0QIHQULKz4QtKgLegQIFBAB&biw=1792&bih=895&dpr=2#fpstate=ive&vld=cid:783bf851,vid:oj_yLBltPE8,st:0");
		}
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

