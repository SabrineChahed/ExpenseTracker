package TrackerView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TopPanel extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JButton btnNewButton;
	private JTextField txtTxtprice;
	private JButton btnNewButton_1;
	private JTextField txtTxtexpense;
	// instance variables 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TopPanel frame = new TopPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TopPanel() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TopPanel.class.getResource("/TrackerResources/up-arrow.png")));

		
		initComponents();
		createEvents();

	}
	
	
	
	
	//////////////////////////////////////////////////////////
	// contains code creating and initializing components //
	
	private void initComponents(){
		setTitle("Welcome to your Expense Tracker");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Expense");
		
		txtTxtexpense = new JTextField();
		txtTxtexpense.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Price");
		
		txtTxtprice = new JTextField();
		txtTxtprice.setColumns(10);
		
		btnNewButton = new JButton("ADD");

		
		table_1 = new JTable();
		table_1.setToolTipText("");
		table_1.setColumnSelectionAllowed(true);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Expense", "Price"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		btnNewButton_1 = new JButton("AddItems");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(180)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
					.addGap(191))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTxtexpense, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
							.addComponent(txtTxtprice, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addComponent(table_1, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(33, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtTxtprice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTxtexpense, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(33)
					.addComponent(table_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(btnNewButton)
					.addGap(27))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(52)
					.addComponent(btnNewButton_1)
					.addContainerGap(176, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
	
	
	
	
	//////////////////////////////////////////////////////////
	// contains code creating events //
	private void createEvents() {
		
		btnNewButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cograts !");
				
				
			}
		});
		
		
		
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, txtTxtexpense.getText() );
				txtTxtexpense.setText( txtTxtexpense.getText()+"your Expense : ");

				
				
			}
		});

		
		
		
	}
}
