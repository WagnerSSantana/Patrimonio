package br.com.softplan.sistemadepatrimonio.view;




import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;   // ver oque e isso
	private JPanel contentPane;
	private JPasswordField txtSenha;
	private JTextField txtUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setUndecorated(true);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(400, 410));
		contentPane.setSize(new Dimension(400, 410));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			// função para fehcar !
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSair.setBackground(new Color(255, 255, 255));
				btnSair.setForeground(new Color(217, 81, 51));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnSair.setBackground(new Color(217, 81, 51));
				btnSair.setForeground(new Color(255, 255, 255));
			}
		});
		btnSair.setBackground(new Color(217, 81, 51));
		btnSair.setBorderPainted(false);
		btnSair.setFocusPainted(false);
		btnSair.setForeground(new Color(255, 255, 255));
		btnSair.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnSair.setBounds(180, 366, 120, 25);
		contentPane.add(btnSair);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(144, 238, 144));
		panel.setBounds(0, 0, 480, 70);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Sistema De Patrimonio");
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Courier New", Font.BOLD, 34));
		lblNewLabel_2.setBounds(0, 17, 480, 35);
		panel.add(lblNewLabel_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 69, 480, 331);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Entre com suas credenciais");
		lblNewLabel_3.setBounds(125, 11, 230, 20);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setForeground(new Color(91, 95, 99));
		panel_1.add(lblNewLabel_3);

		txtUsuario = new JTextField();
		panel_1.add(txtUsuario);
		txtUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsuario.setBounds(60, 136, 360, 40);
		txtUsuario.setColumns(10);
		txtSenha = new JPasswordField();
		txtSenha.setHorizontalAlignment(SwingConstants.LEFT);
		txtSenha.setBounds(60, 201, 360, 40);
		panel_1.add(txtSenha);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar.setBounds(180, 265, 120, 25);
		panel_1.add(btnEntrar);
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnEntrar.setBackground(new Color(255, 255, 255));
				btnEntrar.setForeground(new Color(58, 65, 84));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnEntrar.setBackground(new Color(58, 65, 84));
				btnEntrar.setForeground(new Color(255, 255, 255));

			}
		});
		btnEntrar.setBackground(new Color(58, 65, 84));
		btnEntrar.setFocusPainted(false);
		btnEntrar.setBorderPainted(false);
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setFont(new Font("Segoe UI", Font.BOLD, 14));
	}
}
