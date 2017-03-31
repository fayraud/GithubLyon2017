package presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import metier.Client;
import service.ClientService;
import service.IClientService;

public class Fenetre extends JFrame {

	private IClientService service = new ClientService();

	// liste des composant de l'onglet ajouter
	private JLabel jlaj1 = new JLabel("Nom");
	private JTextField jtfaj1 = new JTextField(12);
	private JLabel jlaj2 = new JLabel("prenom");
	private JTextField jtfaj2 = new JTextField(12);
	private JLabel jlaj3 = new JLabel("Yeux");
	private JTextField jtfaj3 = new JTextField(12);
	private JButton jbaj1 = new JButton("Ajouter");
	private Client caj = new Client();

	// liste des composant de l'onglet suprimer
	private JLabel jlsupr = new JLabel("ID");
	private JTextField jtfsupr = new JTextField(12);
	private JButton jbsupr = new JButton("Supprimer");

	// liste des composant de l'onglet modifier
	private JLabel jlmo1 = new JLabel("ID");
	private JTextField jtfmo1 = new JTextField(12);
	private JLabel jlmo2 = new JLabel("Nom");
	private JTextField jtfmo2 = new JTextField(12);
	private JLabel jlmo3 = new JLabel("prenom");
	private JTextField jtfmo3 = new JTextField(12);
	private JButton jbmo1 = new JButton("Modifier");
	private Client cmo = new Client();

	public Fenetre(String nom) {
		// TODO Auto-generated constructor stub
		super(nom); // nom fenetre
		setSize(800, 600); // taille fenetre

		// disposition de la fenetre principale
		this.setLayout(new BorderLayout()); // dire que tout ce que j'ajoute se
											// met ligne par ligne
		// creation onglets
		JTabbedPane onglets = new JTabbedPane();

		// onglet ajouter

		JPanel jpaj5 = new JPanel();
		jpaj5.setLayout(new BoxLayout(jpaj5, BoxLayout.Y_AXIS));
		jpaj5.setBackground(Color.LIGHT_GRAY);

		// ajout de la premiere ligne

		JPanel jpaj1 = new JPanel();
		jpaj1.setLayout(new FlowLayout());
		jpaj1.add(jlaj1);
		jpaj1.add(jtfaj1);
		jpaj1.setBackground(jpaj5.getBackground());

		// ajout de la 2EME ligne
		JPanel jpaj2 = new JPanel();
		jpaj2.setLayout(new FlowLayout());
		jpaj2.add(jlaj2);
		jpaj2.add(jtfaj2);
		jpaj2.setBackground(jpaj5.getBackground());

		// ajout de la 3EME ligne
		JPanel jpaj3 = new JPanel();
		jpaj3.setLayout(new FlowLayout());
		jpaj3.add(jlaj3);
		jpaj3.add(jtfaj3);
		jpaj3.setBackground(jpaj5.getBackground());

		// ajout de la 4EME ligne
		JPanel jpaj4 = new JPanel();
		jpaj4.setLayout(new FlowLayout());
		jpaj4.add(jbaj1);
		jpaj4.setBackground(jpaj5.getBackground());
		//

		jpaj5.add(jpaj1);
		jpaj5.add(jpaj2);
		jpaj5.add(jpaj3);
		jpaj5.add(jpaj4);

		// rendre le bouton actif en lui donnant une action à réaliser

		jbaj1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nomaj = jtfaj1.getText();
				String prenomaj = jtfaj2.getText();
				String yeuxaj = jtfaj3.getText();
				caj.setNom(nomaj);
				caj.setPrenom(prenomaj);
				caj.setCouleurYeux(yeuxaj);
				service.ajouterClient(caj);

				// vider les champs

				jtfaj1.setText("");
				jtfaj2.setText("");
				jtfaj3.setText("");
			}
		});

		// onglet supprimer

		JPanel jpsupr = new JPanel();
		jpsupr.setLayout(new FlowLayout());
		jpsupr.add(jlsupr);
		jpsupr.add(jtfsupr);
		jpsupr.add(jbsupr);

		jpsupr.setBackground(Color.LIGHT_GRAY);

		// rendre le bouton actif en lui donnant une action à réaliser

		jbsupr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int idsupr = Integer.parseInt(jtfsupr.getText());
				service.supprimerClient(idsupr);

				// vider les champs

				jtfsupr.setText("");

			}
		});

		// onglet modifier

		JPanel jpmo5 = new JPanel();
		jpmo5.setLayout(new BoxLayout(jpmo5, BoxLayout.Y_AXIS));
		jpmo5.setBackground(Color.LIGHT_GRAY);

		// ajout de la premiere ligne

		JPanel jpmo1 = new JPanel();
		jpmo1.setLayout(new FlowLayout());
		jpmo1.add(jlmo1);
		jpmo1.add(jtfmo1);
		jpmo1.setBackground(jpmo5.getBackground());

		// ajout de la 2EME ligne
		JPanel jpmo2 = new JPanel();
		jpmo2.setLayout(new FlowLayout());
		jpmo2.add(jlmo2);
		jpmo2.add(jtfmo2);
		jpmo2.setBackground(jpmo5.getBackground());

		// ajout de la 3EME ligne
		JPanel jpmo3 = new JPanel();
		jpmo3.setLayout(new FlowLayout());
		jpmo3.add(jlmo3);
		jpmo3.add(jtfmo3);
		jpmo3.setBackground(jpmo5.getBackground());

		// ajout de la 4EME ligne
		JPanel jpmo4 = new JPanel();
		jpmo4.setLayout(new FlowLayout());
		jpmo4.add(jbmo1);
		jpmo4.setBackground(jpmo5.getBackground());
		//

		jpmo5.add(jpmo1);
		jpmo5.add(jpmo2);
		jpmo5.add(jpmo3);
		jpmo5.add(jpmo4);
		
		
		jbmo1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int idmo = Integer.parseInt(jtfmo1.getText());
				
				String  nommo= jtfmo2.getText();
				String prenommo = jtfmo3.getText();
				
				
				service.modifierClient(idmo, nommo,prenommo);

				// vider les champs

				jtfmo1.setText("");
				jtfmo2.setText("");
				jtfmo3.setText("");
			}
		});

		// ajouter les jpanels a tabbedPane
		onglets.addTab("ajouter", jpaj5);
		onglets.addTab("Supprimer", jpsupr);
		onglets.addTab("Modifier", jpmo5);

		// ajouter les onglets a la fenetre
		this.add(onglets);

	}

}
