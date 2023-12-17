
public class Attribut {
private	double age,sex,cp,trestbps,chol,fbs,restecg,thalach,exang,oldpeak,slope,ca,thal;
private int num;
	
	
	public double getAge() {
		return age;
	}


	public void setAge(double age) {
		this.age = age;
	}


	public double getSex() {
		return sex;
	}

public Attribut() {
	// TODO Auto-generated constructor stub
}
	public void setSex(double sex) {
		this.sex = sex;
	}


	public double getCp() {
		return cp;
	}


	public void setCp(double cp) {
		this.cp = cp;
	}


	public double getTrestbps() {
		return trestbps;
	}


	public void setTrestbps(double trestbps) {
		this.trestbps = trestbps;
	}


	public double getChol() {
		return chol;
	}


	public void setChol(double chol) {
		this.chol = chol;
	}


	public double getFbs() {
		return fbs;
	}


	public void setFbs(double fbs) {
		this.fbs = fbs;
	}


	public double getRestecg() {
		return restecg;
	}


	public void setRestecg(double restecg) {
		this.restecg = restecg;
	}


	public double getThalach() {
		return thalach;
	}


	public void setThalach(double thalach) {
		this.thalach = thalach;
	}


	public double getExang() {
		return exang;
	}


	public void setExang(double exang) {
		this.exang = exang;
	}


	public double getOldpeak() {
		return oldpeak;
	}


	public void setOldpeak(double oldpeak) {
		this.oldpeak = oldpeak;
	}


	public double getSlope() {
		return slope;
	}


	public void setSlope(double slope) {
		this.slope = slope;
	}


	public double getCa() {
		return ca;
	}


	public void setCa(double ca) {
		this.ca = ca;
	}


	public double getThal() {
		return thal;
	}


	public void setThal(double thal) {
		this.thal = thal;
	}


	public double getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public Attribut(double i , double j , double m , double k , double e , double r, double p , double n, double o , double t,double y , double u, double h , int g ){
		age= i ;
		sex= j ;
		cp = m ; 
		trestbps = k;
		chol = e;
		fbs = r ; 
		restecg = p;
		thalach = n ;
		exang = o;
		oldpeak = t ; 
		slope = y ;
		ca = u ; 
		thal = h ; 
		num = g ;
		
		
	}
	

	@Override public String toString() { return "attribut [age=" + age + ", sex=" + sex + ", cp=" + cp +", treastbps="+trestbps+", chol="+chol+", fbs="+fbs+
			", restecg="+restecg+", thalach="+thalach+", exang="+exang+", oldpeak="+oldpeak+", slope="+slope+", ca="+ca+", thal="+thal+", num="+num+"]"; }


}
