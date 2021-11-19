package netw1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import java.awt.List;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSpinner;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Choice;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class P1 {

	private JFrame frmClientchat;
	private JTextField userntxt;
	private JTextField statustxt;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTextField textField_7;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P1 window = new P1();
					window.frmClientchat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public P1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClientchat = new JFrame();
		frmClientchat.setIconImage(Toolkit.getDefaultToolkit().getImage(P1.class.getResource("/netw1/icon 1.png")));
		frmClientchat.setTitle("ClientChat");
		frmClientchat.setBounds(100, 100, 932, 456);
		frmClientchat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClientchat.getContentPane().setLayout(null);
		
		JLabel usernlable = new JLabel("Username:");
		usernlable.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		usernlable.setVerticalAlignment(SwingConstants.TOP);
		usernlable.setBounds(21, 22, 72, 13);
		frmClientchat.getContentPane().add(usernlable);
		
		userntxt = new JTextField();
		usernlable.setLabelFor(userntxt);
		userntxt.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		userntxt.setBounds(85, 22, 138, 19);
		frmClientchat.getContentPane().add(userntxt);
		userntxt.setColumns(10);
		
		JButton loginbtn = new JButton("Login");
		loginbtn.setForeground(Color.RED);
		loginbtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, ١٢));
		loginbtn.setBounds(233, 14, 104, 27);
		frmClientchat.getContentPane().add(loginbtn);
		
		JButton logoutbtn = new JButton("Logout");
		logoutbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		logoutbtn.setBounds(349, 14, 96, 27);
		frmClientchat.getContentPane().add(logoutbtn);
		
		JLabel statuslbl = new JLabel("Status:");
		statuslbl.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		statuslbl.setBounds(21, 373, 72, 27);
		frmClientchat.getContentPane().add(statuslbl);
		
		statustxt = new JTextField();
		statuslbl.setLabelFor(statustxt);
		statustxt.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		statustxt.setBounds(97, 373, 501, 27);
		frmClientchat.getContentPane().add(statustxt);
		statustxt.setColumns(10);
		
		JLabel tcpsiplbl = new JLabel("TCP Server IP:");
		tcpsiplbl.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		tcpsiplbl.setBounds(455, 19, 104, 19);
		frmClientchat.getContentPane().add(tcpsiplbl);
		
		JLabel tcpsplbl = new JLabel("TCP Server Port:");
		tcpsplbl.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		tcpsplbl.setBounds(455, 50, 96, 20);
		frmClientchat.getContentPane().add(tcpsplbl);
		
		textField_4 = new JTextField();
		tcpsiplbl.setLabelFor(textField_4);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		textField_4.setBounds(561, 17, 115, 24);
		frmClientchat.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		tcpsplbl.setLabelFor(textField_5);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		textField_5.setBounds(561, 49, 115, 24);
		frmClientchat.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Available Interfaces");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		lblNewLabel_4.setBounds(455, 78, 111, 20);
		frmClientchat.getContentPane().add(lblNewLabel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 55, 424, 206);
		frmClientchat.getContentPane().add(scrollPane);
		
		JTextArea txtchat = new JTextArea();
		txtchat.setFont(new Font("Courier New", Font.BOLD, ١٠));
		scrollPane.setViewportView(txtchat);
		txtchat.setLineWrap(true);
		txtchat.setWrapStyleWord(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(21, 279, 424, 72);
		frmClientchat.getContentPane().add(scrollPane_1);
		
		JTextArea messagetxt = new JTextArea();
		messagetxt.setFont(new Font("Courier New", Font.BOLD, ١٠));
		scrollPane_1.setViewportView(messagetxt);
		
		JLabel lblNewLabel_5 = new JLabel("Local IP:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		lblNewLabel_5.setBounds(455, 150, 100, 20);
		frmClientchat.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Local Port:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		lblNewLabel_6.setBounds(455, 184, 100, 20);
		frmClientchat.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Remote IP:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		lblNewLabel_7.setBounds(455, 225, 100, 20);
		frmClientchat.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Remote Port:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		lblNewLabel_8.setBounds(455, 258, 100, 20);
		frmClientchat.getContentPane().add(lblNewLabel_8);
		
		textField_1 = new JTextField();
		lblNewLabel_5.setLabelFor(textField_1);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		textField_1.setBounds(542, 149, 115, 24);
		frmClientchat.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		lblNewLabel_6.setLabelFor(textField_2);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		textField_2.setBounds(542, 183, 115, 24);
		frmClientchat.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_6 = new JTextField();
		lblNewLabel_7.setLabelFor(textField_6);
		textField_6.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		textField_6.setBounds(542, 224, 115, 24);
		frmClientchat.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		lblNewLabel_8.setLabelFor(textField_7);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		textField_7.setBounds(542, 255, 115, 24);
		frmClientchat.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Send");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(455, 301, 85, 48);
		frmClientchat.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("test Button");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		btnNewButton_3.setBounds(603, 312, 100, 27);
		frmClientchat.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_9 = new JLabel("Online Users");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, ١٠));
		lblNewLabel_9.setBounds(759, 18, 100, 20);
		frmClientchat.getContentPane().add(lblNewLabel_9);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(748, 41, 145, 346);
		frmClientchat.getContentPane().add(scrollPane_2);
		
		JTextArea textArea_2 = new JTextArea();
		lblNewLabel_9.setLabelFor(textArea_2);
		scrollPane_2.setViewportView(textArea_2);
		textArea_2.setFont(new Font("Courier New", Font.BOLD, ١٠));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, ١١));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"aaaa", "bbb", "ccc"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(456, 108, 282, 30);
		frmClientchat.getContentPane().add(comboBox);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
