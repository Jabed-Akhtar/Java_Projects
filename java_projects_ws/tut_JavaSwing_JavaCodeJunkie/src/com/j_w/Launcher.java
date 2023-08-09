package com.j_w;

import javax.swing.SwingUtilities;

//import javax.swing.event.*;


public class Launcher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainWindow main = new MainWindow();
				main.show();
			}
		});
	}
}
