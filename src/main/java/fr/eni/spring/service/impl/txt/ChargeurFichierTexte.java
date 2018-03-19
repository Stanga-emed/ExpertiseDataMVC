package fr.eni.spring.service.impl.txt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Lecture des donnees a charger en admettant qu'une entree correspond a une ligne.
 */
@Component
public class ChargeurFichierTexte 
implements IChargerDonnees {
	
	/** Chemin du fichier a charger */
	@Value("${loader.file}")
	private String cheminFichier;
	
	/** Fichier en cours de lecture */
	private BufferedReader fluxLecture;
	
	/**
	 * Constructeur par defaut : initialisation
	 */
	public ChargeurFichierTexte() {
		cheminFichier = null;
		fluxLecture = null;
	}
	
	public ChargeurFichierTexte(final String pCheminfichier) {
		this();
		setCheminFichier(pCheminfichier);
	}
	
	public void setCheminFichier(final String pCheminfichier) {
		cheminFichier = pCheminfichier;
	}

	/**
	 * Lire les entrees du fichier une par une.
	 */
	@Override
	public String lireEntree() {
		String _strDonnees = null;
		boolean _bEtat = true;
		
		// Lire la prochaine ligne
		if (null == fluxLecture) {
			// Initialiser la lecture
			_bEtat = _initialiserLecture();
		}
		if (true == _bEtat) {
			// Lire la ligne
			try {
				_strDonnees = fluxLecture.readLine();
				System.out.println("Ligne lue : " + _strDonnees);
			} catch (final IOException _exceptionIO) {
				// Erreur sur lecture de donnees
				_exceptionIO.printStackTrace();
				_strDonnees = null;
			}
		}
		
		// En fin de lecture ou sur erreur : fermer flux
		if (null == _strDonnees) {
			_terminerLecture();
		}
		
		return _strDonnees;
	} // lireEntree
	
	/**
	 * Avant lecture de la premiere entree, ouvrir le fichier.
	 */
	private boolean _initialiserLecture() {
		boolean _bEtat = true;
		FileReader _fluxFichier;
		
		try {
			_fluxFichier = new FileReader(cheminFichier);
			fluxLecture = new BufferedReader(_fluxFichier);
		} catch (final FileNotFoundException _exceptionFichierAbsent) {
			// Erreur : fichier a lire introuvable
			_exceptionFichierAbsent.printStackTrace();
			_bEtat = false;
		}
		
		return _bEtat;
	} // initialiserLecture
	
	/** 
	 * Apres lecture de la derniere entree, fermer le fichier.
	 */
	private void _terminerLecture() {
		try {
			fluxLecture.close();
		} catch (final IOException _exceptionIO) {
			// Erreur sur fermeture du flux de donnees
			_exceptionIO.printStackTrace();
		} finally {
			// Malgre tout, liberer les ressources
			fluxLecture = null;
		}
	} // terminerLecture
} // ChargeurFichierTexte
