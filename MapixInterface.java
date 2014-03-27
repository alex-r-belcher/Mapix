/**
 * <Insert Mapix Description Here>
 * @author Alex Belcher
 * @author Insert your name
 * @author ""
 * @version 0.1
 */

package mapix;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class MapixInterface {

	private JFrame frame;
	private JTextField txtPathtophotos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapixInterface window = new MapixInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MapixInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null); //using absolute layout
		
		//slider for timeline manipulation
		JSlider slider = new JSlider();
		slider.setBounds(0, 243, 448, 16);
		frame.getContentPane().add(slider, BorderLayout.SOUTH);
		
		//Currently empty place holder panel .. use this for map 
		Panel panel = new Panel();
		panel.setBounds(312, 205, -305, -202);
		frame.getContentPane().add(panel);
		
	
	    //Text field to enter path to folder containing photos	
		txtPathtophotos = new JTextField();
		txtPathtophotos.setText("Path/to/photos");
		txtPathtophotos.setBounds(312, 10, 124, 19);
		frame.getContentPane().add(txtPathtophotos);
		txtPathtophotos.setColumns(10);
		
		//Button to initiate mapping of photos 
		JButton btnMapPhotos = new JButton("Map Photos");
		btnMapPhotos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMapPhotos.setBounds(314, 208, 124, 25);
		frame.getContentPane().add(btnMapPhotos);
		
		//Button to initiate importing photos/extracting metadata
		JButton btnImportPhotos = new JButton("Import");
		btnImportPhotos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnImportPhotos.setBounds(312, 31, 117, 25);
		frame.getContentPane().add(btnImportPhotos);
	}
	
	/**
	 * Imports (recursively) all photos at the specified path
	 * @param path		Full path to folder containing photos
	 * @return void 	May change to array/arraylist of photo objects or potentially stay void and
	 * implement the array of photo objects as a global variable
	 */
	public void importPhotos(String path)
	{
		//This should grab each photo in the folder and:
		//1. Create a photo object, inserting the picture/path into the object
		//2. Call extractMetadata to pull the GPS and Date/Time -OR- call the photo Object's extractMetadata
		//		method. 
		//3. Insert into array(list) utilizing some sorting algorithm to sort by date/time
		
	}
	
	/**
	 * THIS WILL PROBABLY BE IMPLEMENTED IN THE PHOTO OBJECT not here. 
	 * Extracts metadata (GPS and Time/Date) from photo
	 * I'm thinking the param will be an instance of a Photo object created in import photos
	 * This function will fill in the metadata fields in the photo object
	 * @param 
	 */
	public void extractMetadata()
	{
		
	}
	
	/** 
	 * This function pulls in a map covering the area included in the obtained GPS coordinates
	 * return and params may change as needed
	 */
	public void buildMap()
	{
		
	}
	
	/**
	 * This function plots a photo(s) on the map based on where the timeline slider is.
	 * return and params may change as needed 
	 */
	public void plotPhoto()
	{
		
	}
}
