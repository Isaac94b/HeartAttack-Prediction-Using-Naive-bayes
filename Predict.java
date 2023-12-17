import java.util.ArrayList;
import java.lang.Math.*;



public class Predict {
	int i =0;
	 double max ;
	 String Max;
	calculate caa = new calculate();
	mainwindow a;
	
	double Proba1,Proba2,Proba3,Proba4,Proba5;
	public	double age,sex,cp,trestbps,chol,fbs,restecg,thalach,exang,oldpeak,slope,ca,thal;
	public double age2,age3,age4,age5;
	public double sex2,sex3,sex4,sex5;
	public double cp2,cp3,cp4,cp5;
	public double trestbps2,trestbps3,trestbps4,trestbps5;
	public double chol2,chol3,chol4,chol5;
	public double fbs2,fbs3,fbs4,fbs5;
	public double restecg2,restecg3,restecg4,restecg5;
	public double thalach2,thalach3,thalach4,thalach5;
	public double exang2,exang3,exang4,exang5;
	public double oldpeak2,oldpeak3,oldpeak4,oldpeak5;
	public double slope2,slope3,slope4,slope5;
	public double ca2,ca3,ca4,ca5;
	public double thal2,thal3,thal4,thal5;
	
	public void CalculerProba(double age1,double sex1,double cp1,double trestbps1,double chol1,double fbs1,double restecg1,double thalach1,double exang1,double oldpeak1,double slope1,double ca1,double thal1){
		
		
		double p0=caa.getNumNum(0);
		caa.countnum=0;
		double p1=caa.getNumNum(1);
		caa.countnum=0;
		double p2=caa.getNumNum(2);
		caa.countnum=0;
		double p3=caa.getNumNum(3);
		caa.countnum=0;
		double p4=caa.getNumNum(4);
		
		///System.out.println(p0+" "+p1+" "+p2+" "+p3+" "+p4+" ");
		
		age=caa.getAgeNum(age1,0);
		caa.countAge=0;
		age2=caa.getAgeNum(age1,1);
		caa.countAge=0;
		age3=caa.getAgeNum(age1,2);
		caa.countAge=0;
		age4=caa.getAgeNum(age1,3);
		caa.countAge=0;
		age5=caa.getAgeNum(age1,4);
		caa.countAge=0;
		//System.out.println(age+" "+age2+" "+age3+" "+age4+" "+age5+" ");
		sex=caa.getSexNum(sex1,0);
		caa.countSex=0;
		sex2=caa.getSexNum(sex1,1);
		caa.countSex=0;
		sex3=caa.getSexNum(sex1,2);
		caa.countSex=0;
		sex4=caa.getSexNum(sex1,3);
		caa.countSex=0;
		sex5=caa.getSexNum(sex1,4);
		caa.countSex=0;
		//System.out.println(sex+" "+sex2+" "+sex3+" "+sex4+" "+sex5+" ");
		cp=caa.getCpNum(cp1,0);
		caa.countcp=0;
		cp2=caa.getCpNum(cp1,1);
		caa.countcp=0;
		cp3=caa.getCpNum(cp1,2);
		caa.countcp=0;
		cp4=caa.getCpNum(cp1,3);
		caa.countcp=0;
		cp5=caa.getCpNum(cp1,4);
		caa.countcp=0;
		//System.out.println(cp+" "+cp2+" "+cp3+" "+cp4+" "+cp5+" ");
		
		trestbps=caa.getTrestbpsNum(trestbps1,0);
		caa.counttrestbps=0;
		trestbps2=caa.getTrestbpsNum(trestbps1,1);
		caa.counttrestbps=0;
		trestbps3=caa.getTrestbpsNum(trestbps1,2);
		caa.counttrestbps=0;
		trestbps4=caa.getTrestbpsNum(trestbps1,3);
		caa.counttrestbps=0;
		trestbps5=caa.getTrestbpsNum(trestbps1,4);
		caa.counttrestbps=0;
		//System.out.println(trestbps+" "+trestbps2+" "+trestbps3+" "+trestbps4+" "+trestbps5+" ");
		chol=caa.getCholNum(chol1,0);
		caa.countchol=0;
		chol2=caa.getCholNum(chol1,1);
		caa.countchol=0;
		chol3=caa.getCholNum(chol1,2);
		caa.countchol=0;
		chol4=caa.getCholNum(chol1,3);
		caa.countchol=0;
		chol5=caa.getCholNum(chol1,4);
		caa.countchol=0;
		//System.out.println(chol+" "+chol2+" "+chol3+" "+chol4+" "+chol5+" ");
		fbs=caa.getFbsNum(fbs1,0);
		caa.countfbs=0;
		fbs2=caa.getFbsNum(fbs1,1);
		caa.countfbs=0;
		fbs3=caa.getFbsNum(fbs1,2);
		caa.countfbs=0;
		fbs4=caa.getFbsNum(fbs1,3);
		caa.countfbs=0;
		fbs5=caa.getFbsNum(fbs1,4);
		caa.countfbs=0;
		//System.out.println(fbs+" "+fbs2+" "+fbs3+" "+fbs4+" "+fbs5+" ");
		restecg=caa.getRestecgNum(restecg1,0);
		caa.countrestecg=0;
		restecg2=caa.getRestecgNum(restecg1,1);
		caa.countrestecg=0;
		restecg3=caa.getRestecgNum(restecg1,2);
		caa.countrestecg=0;
		restecg4=caa.getRestecgNum(restecg1,3);
		caa.countrestecg=0;
		restecg5=caa.getRestecgNum(restecg1,4);
		caa.countrestecg=0;
		//System.out.println(restecg+" "+restecg2+" "+restecg3+" "+restecg4+" "+restecg5+" ");
		thalach=caa.getThalachNum(thalach1,0);
		caa.countthalach=0;
		thalach2=caa.getThalachNum(thalach1,1);
		caa.countthalach=0;
		thalach3=caa.getThalachNum(thalach1,2);
		caa.countthalach=0;
		thalach4=caa.getThalachNum(thalach1,3);
		caa.countthalach=0;
		thalach5=caa.getThalachNum(thalach1,4);
		caa.countthalach=0;
		//System.out.println(thalach+" "+thalach2+" "+thalach3+" "+thalach4+" "+thalach5+" ");
		exang=caa.getExangNum(exang1,0);
		caa.countexang=0;
		exang2=caa.getExangNum(exang1,1);
		caa.countexang=0;
		exang3=caa.getExangNum(exang1,2);
		caa.countexang=0;
		exang4=caa.getExangNum(exang1,3);
		caa.countexang=0;
		exang5=caa.getExangNum(exang1,4);
		caa.countexang=0;
		//System.out.println(exang+" "+exang2+" "+exang3+" "+exang4+" "+exang5+" ");
		oldpeak=caa.getOldpeakNum(oldpeak1,0);
		caa.countoldpeak=0;
		oldpeak2=caa.getOldpeakNum(oldpeak1,1);
		caa.countoldpeak=0;
		oldpeak3=caa.getOldpeakNum(oldpeak1,2);
		caa.countoldpeak=0;
		oldpeak4=caa.getOldpeakNum(oldpeak1,3);
		caa.countoldpeak=0;
		oldpeak5=caa.getOldpeakNum(oldpeak1,4);
		caa.countoldpeak=0;
		//System.out.println(oldpeak+" "+oldpeak2+" "+oldpeak3+" "+oldpeak4+" "+oldpeak5+" ");
		slope=caa.getSlopeNum(slope1,0);
		caa.countslope=0;
		slope2=caa.getSlopeNum(slope1,1);
		caa.countslope=0;
		slope3=caa.getSlopeNum(slope1,2);
		caa.countslope=0;
		slope4=caa.getSlopeNum(slope1,3);
		caa.countslope=0;
		slope5=caa.getSlopeNum(slope1,4);
		caa.countslope=0;
		//System.out.println(slope+" "+slope2+" "+slope3+" "+slope4+" "+slope5+" ");
		ca=caa.getCaNum(ca1,0);
		caa.countca=0;
		ca2=caa.getCaNum(ca1,1);
		caa.countca=0;
		ca3=caa.getCaNum(ca1,2);
		caa.countca=0;
		ca4=caa.getCaNum(ca1,3);
		caa.countca=0;
		ca5=caa.getCaNum(ca1,4);
		caa.countca=0;
		//System.out.println(ca+" "+ca2+" "+ca3+" "+ca4+" "+ca5+" ");
		thal=caa.getThalNum(thal1,0);
		caa.countthal=0;
		thal2=caa.getThalNum(thal1,1);
		caa.countthal=0;
		thal3=caa.getThalNum(thal1,2);
		caa.countthal=0;
		thal4=caa.getThalNum(thal1,3);
		caa.countthal=0;
		thal5=caa.getThalNum(thal1,4);
		caa.countthal=0;
		//System.out.println(thal+" "+thal2+" "+thal3+" "+thal4+" "+thal5+" ");

	    Proba1=Calculator(age, sex, cp, trestbps, chol, fbs, restecg, thalach, exang, oldpeak, slope, ca, thal, p0);
	    Proba2=Calculator(age2, sex2, cp2, trestbps2, chol2, fbs2, restecg2, thalach2, exang2, oldpeak2, slope2, ca2, thal2, p1);
	    Proba3=Calculator(age3, sex3, cp3, trestbps3, chol3, fbs3, restecg3, thalach3, exang3, oldpeak3, slope3, ca3, thal3, p2);
	    Proba4=Calculator(age4, sex4, cp4, trestbps4, chol4, fbs4, restecg4, thalach4, exang4, oldpeak4, slope4, ca4, thal4, p3);
	    Proba5=Calculator(age5, sex5, cp5, trestbps5, chol5, fbs5, restecg5, thalach5, exang5, oldpeak5, slope5, ca5, thal5, p4);
		
		
		System.out.println(Proba1+" "+Proba2+" "+Proba3+" "+Proba4+" "+Proba5);
	
		
		
		compareProb(Proba1,Proba2,Proba3,Proba4,Proba5);
		
		
		
		
		
	}
	
	
	public void compareProb(double Proba1,double Proba2,double Proba3,double Proba4,double Proba5){
		
	    	max=Proba1;
	    	Max="No Disease";
	    	if(max<Proba2){
	    		max=Proba2;
		    	Max="Mild Disease";
	    	}
	    	if(max<Proba3){
	    		max=Proba3;
		    	Max="Moderate Disease";
		    	
	    	}
	    	if(max<Proba4){
	    		max=Proba4;
		    	Max="Acute Disease";
	    	}
	    	if(max<Proba5){
	    		max=Proba5;
	    		Max="Severe Disease";
	    	}
	    }
	
	public double Calculator(double age11,double sex11,double cp11,double trestbps11,double chol11,double fbs11,double restecg11,double thalach11,double exang11,double oldpeak11,double slope11,double ca11,double thal11,double p){
		double r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14;
		if(age11 ==0 || sex11==0 || cp11==0 || trestbps11==0 || chol11==0 || fbs11==0 || restecg11==0 || thalach11==0 || exang11==0 || oldpeak11==0 || slope11==0 || ca11==0 || thal11==0){
		r1=(age11+1)/(p+13);
		r2=(sex11+1)/(p+13);
		r3=(cp11+1)/(p+13);
		r4=(trestbps11+1)/(p+13);
		r5=(chol11+1)/(p+13);
		r6=(fbs11+1)/(p+13);
		r7=(restecg11+1)/(p+13);
		r8=(thalach11+1)/(p+13);
		r9=(exang11+1)/(p+13);
		r10=(oldpeak11+1)/(p+13);
		r11=(slope11+1)/(p+13);
		r12=(ca11+1)/(p+13);
		r13=(thal11+1)/(p+13);
		r14=p/284;
		}else {
			r1=age11/p;
			r2=sex11/p;
			r3=cp11/p;
			r4=trestbps11/p;
			r5=chol11/p;
			r6=fbs11/p;
			r7=restecg11/p;
			r8=thalach11/p;
			r9=exang11/p;
			r10=oldpeak11/p;
			r11=slope11/p;
			r12=ca11/p;
			r13=thal11/p;
			r14=p/284;
		}
		//System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5+" "+r6+" "+r7+" "+r8+" "+r9+" "+r10+" "+r11+" "+r12+" "+r13+" "+r14);
		
		double proba =r1*r2*r3*r4*r5*r6*r7*r8*r9*r10*r11*r12*r13*r14;
		return proba ;
		
	}
	    
	
	

}
