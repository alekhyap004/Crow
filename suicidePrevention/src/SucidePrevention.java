import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class SucidePrevention extends PostSuicide {
	private int[] happy;
	private int[] act;
	private int[] feel;
	private int[] hours;
	private int[] alone;
	private boolean chillHap = false;
	private boolean mediumHap = false;
	private boolean extremeHap = false;
	private boolean chillAct = false;
	private boolean mediumAct = false;
	private boolean extremeAct = false;
	private boolean chillFeel = false;
	private boolean mediumFeel = false;
	private boolean extremeFeel = false;
	private boolean chillHours = false;
	private boolean mediumHours = false;
	private boolean extremeHours = false;
	private boolean chillAlone = false;
	private boolean mediumAlone = false;
	private boolean extremeAlone = false;
	private int count = 0;
	
	
	public SucidePrevention() {
		System.out.println("were here");
		happy = new int[3];
		happy[0] = getHappiness();
		happy[1] = getCurHappiness();
		
		act = new int[3];
		act[0] = getActivities();
		act[1] = getCurActivities();
		
		feel = new int[3];
		feel[0] = getSocialMediaFeel();
		feel[1] = getCurSocialMediaFeel();
		
		hours = new int[3];
		hours[0] = getSocialMediaHours();
		hours[1] = getCurSocialMediaHours();
		
		alone = new int[3];
		alone[0] = getLonely();
		alone[1] = getCurLonely();
		analysis();
		System.out.println(finalAnalysis());
	}
	
	int dur = getDur();

	int weeks = 0;
	public void happThreshold() {
		int threshold = happy[0];
		int timelapse = threshold - happy[1];
		dur = getDur(); 
		if((dur < 52 && timelapse <= 3 && timelapse != 0)) {
			mediumHap = true;
			count +=2;
		}
		else if(dur < 52 && timelapse > 3) {
			extremeHap = true;	
			count +=4;
		}
		else if(dur > 52 && timelapse > 3) {
			extremeHap = true;	
			count += 4;
		}
		else  {
			chillHap = true;
		}
		
	}
	
	public void activitiesThreshold() {
		int threshold = act[0];
		int timelapse = threshold - act[1];
		if( dur < 52 && timelapse <= 3 && timelapse != 0) {
			mediumAct = true; 
			count +=2;
		}
		else if (dur < 52 && timelapse > 3) {
			extremeAct = true;
			count +=4;
		}
		else if(dur < 52 && timelapse > 2) {
			extremeAct = true;
			count +=4;
		}
		else if(dur > 52 && timelapse > 3) {
			extremeAct = true;
			count +=4;
		}
		else  {
			chillAct = true;
		}
	}
	
	public void socialMediaFeel() {
		int threshold = feel[0];
		int timelapse = threshold - feel[1];
		if( dur < 52 && timelapse <= 3) {
			mediumFeel = true; 
			count +=2;
		}
		else if (dur < 52 && timelapse > 3 && timelapse != 0) {
			extremeFeel = true;
			count +=4;
		}
		else if(dur < 52 && timelapse > 2) {
			extremeFeel = true;
			count +=4;
		}
		else if(dur > 52 && timelapse > 3) {
			extremeFeel = true;
			count +=4;
		}
		else  {
			chillFeel = true;
		}
	}
	
	public void socialMediaHours() {
		int threshold = feel[0];
		int timelapse = threshold - feel[1];
		if( dur < 52 && timelapse <= 1 && timelapse != 0) {
			mediumHours = true; 
			count +=2;
		}
		else if (dur < 52 && timelapse > 2) {
			extremeHours = true;
			count +=4;
		}
		else if(dur < 52 && timelapse > 2) {
			extremeHours = true;
			count +=4;
		}
		else if(dur > 52 && timelapse > 2) {
			extremeHours = true;
			count +=4;
		}
		else  {
			chillHours = true;
		}
	
	}
	
	public void alone() {
		int threshold = alone[0];
		int timelapse = threshold - alone[1];
		if( dur < 52 && timelapse <=2 && timelapse != 0 ) {
			mediumAlone = true; 
			count +=2;
		}
		else if(dur < 52 && timelapse > 2) {
			extremeAlone = true;
			count +=4;
		}
		else if(dur > 52 && timelapse > 2) {
			extremeAlone = true;
			count +=4;
		}
		else  {
			chillAlone = true;
		}
	}
	public void analysis() {
		alone();
		socialMediaHours();
		socialMediaFeel();
		activitiesThreshold();
		happThreshold();
		System.out.println(count);
		
	}
	
	public String finalAnalysis() {
		String ans = "";
		if(chillHap)
			ans = ans +"Your happiness level is fine! Good job.";
		else if(mediumHap)
			ans = ans + "You are almost to your goal! Keep it up and meditate atleat once a day.";
		else if(extremeHap)
			ans = ans + "Meditate atleat 3 times a day. Try to find out what make you happy. Consult a doctor or therapist. ";
		if(chillAct)
			ans = ans + " You're doing great! ";
		else if(mediumAct)
			ans = ans + "Make more time for yourself.";
		else if(extremeAct)
			ans = ans+ "Consult a therapist regarding your lack of usual enthusiasm in performing your regular activities.";
		if (chillFeel) 
			ans = ans  + " Regarding social media, your actvity has been normal, keep up the good work!";
		else if (mediumFeel)
			ans = ans + " Your recent feelings towards social media have taken a negative turn, try to take a break and get back on track!";
		else if (extremeFeel)
			ans = ans + " Social media has recently affected you severely in a negative way, take a break and create time for yourself.";
		if(chillHours)
			ans = ans + "Your social media activity has been perfectly normal this whole week, good job!";
		else if (mediumHours)
			ans = ans + " Your soocial media activity has been slightly irregular, this can lead to worse problems if you aren't careful";
		else if (extremeHours)
			ans = ans + " Your social media activity has been abnormally high these recent days, try to source the root of the problem and talk to someone if this keeps continuing";
		if (chillAlone)
			ans = ans + " Regarding your social interactions, it has been very positive, good job and good luck continuing this!";
		else if (mediumAlone)
			ans = ans + " It seems as if you have been feeling a little lonely recently, try to meet up with some friends and have a little fun! Make sure the problem doesn't escalate.";
		else if (extremeAlone)
			ans = ans + " You have recently been feeling extremely alone, try to interact more with your friends and family and remember that you aren't alone! If this feeling continues, try to talk wih your therapist.";
		return ans;
	}
	

	
}
