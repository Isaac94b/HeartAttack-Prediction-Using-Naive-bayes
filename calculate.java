

public class calculate {

	readData n= new readData() ;
	
    int countAge=0;
    int countSex=0;
    int countcp=0;
    int counttrestbps=0;
    int countchol=0;
    int countfbs=0;
    int countrestecg=0;
    int countthalach=0;
    int countexang=0;
    int countoldpeak=0;
    int countslope=0;
    int countca=0;
    int countthal=0;
    int countnum=0;
    
    
    
    
	public int getAgeNum(double p,int r){
		for(int i =0;i<n.attribut.size();i++){
			if(n.attribut.get(i).getAge()==p && n.attribut.get(i).getNum()==r){
				countAge++;
				
			}
		}
		return countAge;
		
	}
	
	public int getSexNum(double p,int r){
		for(int i =0;i<n.attribut.size();i++){
			if(n.attribut.get(i).getSex()==p && n.attribut.get(i).getNum()==r){
				countSex++;
				
			}
		}
		return countSex;
		
	}
	
	public int getCpNum(double p,int r){
		for(int i =0;i<n.attribut.size();i++){
			if(n.attribut.get(i).getCp()==p && n.attribut.get(i).getNum()==r){
				countcp++;
				
			}
		}
		return countcp;
		
	}
	
	public int getTrestbpsNum(double p,int r){
		for(int i =0;i<n.attribut.size();i++){
			if(n.attribut.get(i).getTrestbps()==p && n.attribut.get(i).getNum()==r){
				counttrestbps++;
				
			}
		}
		return counttrestbps;
		
	}
	
	public int getCholNum(double p,int r){
		for(int i =0;i<n.attribut.size();i++){
			if(n.attribut.get(i).getChol()==p && n.attribut.get(i).getNum()==r){
				countchol++;
				
			}
		}
		return countchol;
		
	}
	
	public int getFbsNum(double p,int r){
		for(int i =0;i<n.attribut.size();i++){
			if(n.attribut.get(i).getFbs()==p && n.attribut.get(i).getNum()==r){
				countfbs++;
				
			}
		}
		return countfbs;
		
	}
	
	public int getRestecgNum(double p,int r){
		for(int i =0;i<n.attribut.size();i++){
			if(n.attribut.get(i).getRestecg()==p && n.attribut.get(i).getNum()==r){
				countrestecg++;
				
			}
		}
		return countrestecg;
		
	}
	
	public int getThalachNum(double p,int r){
		for(int i =0;i<n.attribut.size();i++){
			if(n.attribut.get(i).getThalach()==p && n.attribut.get(i).getNum()==r){
				countthalach++;
				
			}
		}
		return countthalach;
		
	}
	public int getExangNum(double p,int r){
		for(int i =0;i<n.attribut.size();i++){
			if(n.attribut.get(i).getExang()==p && n.attribut.get(i).getNum()==r){
				countexang++;
				
			}
		}
		return countexang;
		
	}
	
	public int getOldpeakNum(double p,int r){
		for(int i =0;i<n.attribut.size();i++){
			if(n.attribut.get(i).getOldpeak()==p && n.attribut.get(i).getNum()==r){
				countoldpeak++;
				
			}
		}
		return countoldpeak;
		
	}
	
	public int getSlopeNum(double p,int r){
		for(int i =0;i<n.attribut.size();i++){
			if(n.attribut.get(i).getSlope()==p && n.attribut.get(i).getNum()==r){
				countslope++;
				
			}
		}
		return countslope;
		
	}
	
	public int getCaNum(double p,int r){
		for(int i =0;i<n.attribut.size();i++){
			if(n.attribut.get(i).getCa()==p && n.attribut.get(i).getNum()==r){
				countca++;
				
			}
		}
		return countca;
		
	}

	public int getThalNum(double p,int r){
		for(int i =0;i<n.attribut.size();i++){
			if(n.attribut.get(i).getThal()==p && n.attribut.get(i).getNum()==r){
				countthal++;
				
			}
		}
		return countthal;
		
	}
	
	public int getNumNum(int p){
		for(int i =0;i<n.attribut.size();i++){
			if(n.attribut.get(i).getNum()==p){
				countnum++;
				
			}
		}
		return countnum;
		
		
		
	}
	
	
	
	
	
	
}
