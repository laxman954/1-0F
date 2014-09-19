package com.file.operation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class FileRename {
	public static File folder = new File(
			"D:/GeniusFoodsDev1/hybris_geniusfoods/custom");
	static String temp = "";
	static int i = 0;

	public static void main(String[] args) throws IOException {
		System.out.println("Reading files under the folder "
				+ folder.getAbsolutePath());
		// Method take input folder, new name,old name
		listFilesForFolder(folder, "_nl_NL.", "_en.");
		System.out.println("No of files modified " + i);
	}

	public static void listFilesForFolder(final File folder,
			String renameValue, String currentValue) throws IOException {

		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				// System.out.println("Reading files under the folder "+folder.getAbsolutePath());
				listFilesForFolder(fileEntry, renameValue, currentValue);
			} else {
				if (fileEntry.isFile()) {
					temp = fileEntry.getName();
					if ((temp.substring(temp.lastIndexOf('.') + 1,
							temp.length()).toLowerCase())
							.equalsIgnoreCase("impex")) {
						String fname = fileEntry.getName();
						int index = fname.indexOf(currentValue);
						if (index < 0)
							continue;
						String newName = fname.substring(0, index)
								+ renameValue
								+ fname.substring(index + currentValue.length());

						System.out.println(fileEntry.getAbsolutePath());
						i++;
						// fileEntry.renameTo(new File(folder.getAbsolutePath()+
						// "/" + newName));
						FileUtils.copyFile(fileEntry,
								new File(folder.getAbsolutePath() + "/"
										+ newName));
						System.out.println(folder.getAbsolutePath() + "/"
								+ newName);
					}
				}

			}
		}
	}

}
