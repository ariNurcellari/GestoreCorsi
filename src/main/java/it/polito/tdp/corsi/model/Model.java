package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	
	private CorsoDAO corsoDAO;
	
	public Model() {
		corsoDAO = new CorsoDAO() ;
	}
	
	public List<Corso> corsiByPeriodo(Integer periodo){
		return corsoDAO.getCorsi(periodo);
	}
	
	public Map<Corso, Integer> getIscrittiByPeriodo(Integer periodo){
		return corsoDAO.getIscrittiByPeriodo(periodo) ;
	}
}
