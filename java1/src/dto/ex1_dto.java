package dto;

import java.util.ArrayList;

public class ex1_dto {
	private String prnm,dcok,prpr,dcpr,reco,ea;
	private ArrayList<String> datalist;
	
	public ex1_dto() {
		datalist= new ArrayList<>();
	}

	public String getPrnm() {
		return prnm;
		
	}

	public void setPrnm(String prnm) {
		this.prnm = prnm;
		datalist.add(prnm);
	}

	public String getDcok() {
		return dcok;
	}

	public void setDcok(String dcok) {
		this.dcok = dcok;
		datalist.add(dcok);
	}

	public String getPrpr() {
		return prpr;
	}

	public void setPrpr(String prpr) {
		this.prpr = prpr;
		datalist.add(prpr);
	}

	public String getDcpr() {
		return dcpr;
	}

	public void setDcpr(String dcpr) {
		this.dcpr = dcpr;
		datalist.add(dcpr);
	}

	public String getReco() {
		return reco;
	}

	public void setReco(String reco) {
		this.reco = reco;
		datalist.add(reco);
	}

	public String getEa() {
		return ea;
	}

	public void setEa(String ea) {
		this.ea = ea;
		datalist.add(ea);
	}
	
	
	
	public ArrayList<String> getDatalist(){
		return datalist;
	}

}

	


	