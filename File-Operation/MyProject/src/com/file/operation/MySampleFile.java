package com.file.operation;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class MySampleFile {

	private JFrame frmoof;
	private JTextField folderPath;
	private JLabel oldFileName;
	private JTextField oldFileNameText;
	private JTextField newFileNameText;
	private JLabel newFileName;
	private JLabel lblOperation;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textFieldExtension;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySampleFile window = new MySampleFile();
					window.frmoof.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MySampleFile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmoof = new JFrame();
		frmoof.setBackground(new Color(204, 255, 255));
		frmoof.setResizable(false);
		frmoof.setTitle("[ooF]");
		frmoof.setBounds(121, -28, 650, 481);
		frmoof.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmoof.getContentPane().setLayout(null);
		
		folderPath = new JTextField();
		folderPath.setText("Browse a Folder to rename or copy with a new file name.");
		folderPath.setToolTipText("Select a folder to rename or copy");
		folderPath.setBounds(187, 35, 283, 28);
		frmoof.getContentPane().add(folderPath);
		folderPath.setColumns(10);
		
		JLabel lblFolderPath = new JLabel("Folder Path");
		lblFolderPath.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblFolderPath.setBounds(86, 33, 109, 28);
		frmoof.getContentPane().add(lblFolderPath);
		
		oldFileName = new JLabel("Old File Name");
		oldFileName.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		oldFileName.setBounds(86, 86, 109, 28);
		frmoof.getContentPane().add(oldFileName);
		
		oldFileNameText = new JTextField();
		oldFileNameText.setToolTipText("which old file name part to be renamed, or while copying to new file ");
		oldFileNameText.setBounds(187, 88, 125, 28);
		frmoof.getContentPane().add(oldFileNameText);
		oldFileNameText.setColumns(10);
		
		newFileNameText = new JTextField();
		newFileNameText.setToolTipText("Name of a new file name part from old file.");
		newFileNameText.setColumns(10);
		newFileNameText.setBounds(422, 88, 125, 28);
		frmoof.getContentPane().add(newFileNameText);
		
		newFileName = new JLabel("New File Name");
		newFileName.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		newFileName.setBounds(322, 86, 109, 28);
		frmoof.getContentPane().add(newFileName);
		
		lblOperation = new JLabel("Operation");
		lblOperation.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblOperation.setBounds(86, 144, 109, 28);
		frmoof.getContentPane().add(lblOperation);
		
		JRadioButton rdbtnOperationCopy = new JRadioButton("Copy");
		buttonGroup.add(rdbtnOperationCopy);
		rdbtnOperationCopy.setBounds(187, 149, 58, 23);
		frmoof.getContentPane().add(rdbtnOperationCopy);
		
		JRadioButton rdbtnRename = new JRadioButton("Rename");
		buttonGroup.add(rdbtnRename);
		rdbtnRename.setBounds(245, 149, 67, 23);
		frmoof.getContentPane().add(rdbtnRename);
		
		JLabel lblExtension = new JLabel("Extension");
		lblExtension.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblExtension.setBounds(322, 142, 109, 28);
		frmoof.getContentPane().add(lblExtension);
		
		textFieldExtension = new JTextField();
		textFieldExtension.setToolTipText("Extesions to be changed. this fields not mandatory. If extensions is not available then all the file changed");
		textFieldExtension.setColumns(10);
		textFieldExtension.setBounds(422, 144, 125, 28);
		frmoof.getContentPane().add(textFieldExtension);
		
		JButton btnDoIt = new JButton("Do it...");
		btnDoIt.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnDoIt.setBounds(187, 244, 89, 28);
		frmoof.getContentPane().add(btnDoIt);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnCancel.setBounds(305, 244, 89, 28);
		frmoof.getContentPane().add(btnCancel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 74, 624, 121);
		frmoof.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 125, 624, 121);
		frmoof.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 183, 624, 121);
		frmoof.getContentPane().add(separator_2);
		
		JButton btnBrowse = new JButton("Browse...");
		final JFileChooser fileChooserBrowse;
		fileChooserBrowse=new JFileChooser();
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileChooserBrowse.showOpenDialog(fileChooserBrowse);
			}
		});
		btnBrowse.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnBrowse.setBounds(480, 32, 89, 30);
		frmoof.getContentPane().add(btnBrowse);
	}

}
