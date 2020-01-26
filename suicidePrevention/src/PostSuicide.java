import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JOptionPane;


public class PostSuicide  { 
	/**
	 * The 2D array of jewels
	 */
	private int howHap;
	private int numAct; 
	//months
	private int duration;
	private int smFeel;
	private int smHours;
	private int lonely;
	private int meds;
	private int extreme;
	public static final int TOT_TOP = 7;
	
	
	private int curHappy;
	private int curActivities;
	private int curFeel;
	private int curHours;
	private int curLonely;

	/** Offsets for drawing the grid of Jewels*/
	
	public PostSuicide() {
		howHap = Happiness();
		numAct = Activities();
		duration = Dur();
		smFeel = SocialMediaFeel();
		smHours = SocialMediaHours();
		lonely = Lonely();
		meds =Meds();
		extreme = Extreme();
		System.out.println("yeet");
		
		curHappy = curHappiness();
		curActivities = curActivities();
		curFeel = curSocialMediaFeel();
		curHours = curSocialMediaHours();
		curLonely = curLonely();
		
	
		
	}

	public int Happiness() {
		int x;
		String option;
    	option = JOptionPane.showInputDialog("How happy were you before you started having sucidial feeling or anything related to anxiety and depression, 10 being really happy ?");
   	 	x = Integer.parseInt(option);
   	 	return x;

	}
	
	public int Activities() {
		int x;
		String option;
    	option = JOptionPane.showInputDialog("How many hours did you perform your regular weekly extra activities before?");
   	 	x = Integer.parseInt(option);
   	 	return x;
   	 
	}
	public int Dur() {
		int x;
		String option;
    	option = JOptionPane.showInputDialog("How long have you felt suicidal in weeks(start till end of your treatment)?");
   	 	x = Integer.parseInt(option);
   	 	return x;
	}
	
	public int SocialMediaFeel() {
		int x;
		String option;
    	option = JOptionPane.showInputDialog("On a scale of  1-10 (1-5 being negativley impacted, 6-10 being positivley impacted) how did social media affect you before?");
   	 	x = Integer.parseInt(option);
   	 	return x;
	}

   	 public int SocialMediaHours() {
   		int x;
   	 	String optin;
   	 	optin = JOptionPane.showInputDialog("How many hours a week did you spend on social media before?");
	 	x = Integer.parseInt(optin);
	 	return x;
	}
	
	public int Lonely() {
		int x;
		String option;
    	option = JOptionPane.showInputDialog("How isolated did you feel before on a scale of 1-10, 1 being most lonely?");
   	 	x = Integer.parseInt(option);
   	 	return x;
	}
	
	public int Meds() {
		int x;
		String option;
    	option = JOptionPane.showInputDialog("On a scale of 1-10 how much do you feel your treatment has helped you improve, 10 being you feel good: ");
   	 	x = Integer.parseInt(option);
   	 	return x;
	}
	
	public int Extreme() {
		int x;
		String option;
    	option = JOptionPane.showInputDialog("How extreme was your case on a scale of 1-10, 5-10 being attemped suicide");
   	 	x = Integer.parseInt(option);
   	 	return x;
	}
	
	
	
	//Past Question Getters
	public int getHappiness() {
		return howHap;
	}
	public int getActivities() {
		return numAct;
	}
	public int getDur() {
		return duration;
	}
	public int getSocialMediaFeel() {
		return smFeel;
	}
	public int getSocialMediaHours() {
		return smHours;
	}
	public int getLonely() {
		return lonely;
	}
	public int getMeds() {
		return meds;
	}
	public int getExtreme() {
		return extreme;
	}
	
	
	//Current Methods
	public int curHappiness() {
		int x;
		String option;
    	option = JOptionPane.showInputDialog("How happy did you feel this week on a scale of 1-10, 10 being happy");
   	 	x = Integer.parseInt(option);
   	 	return x;

	}
	
	public int curActivities() {
		int x;
		String option;
    	option = JOptionPane.showInputDialog("How many hours this week did you perform your regualar weekly extra activities: ");
   	 	x = Integer.parseInt(option);
   	 	return x;
   	 
	}
	
	public int curSocialMediaFeel() {
		int x;
		String option;
    	option = JOptionPane.showInputDialog("On a scale of  1-10 (1-5 being positively impacted, 6-10 being positivley impacted) how did social media affect you this week: ");
   	 	x = Integer.parseInt(option);
   	 	return x;
	}

   	 public int curSocialMediaHours() {
   		int x;
   	 	String optin;
   	 	optin = JOptionPane.showInputDialog("How many hours a week did you spend on social media this week: ");
	 	x = Integer.parseInt(optin);
	 	return x;
	}
	
	public int curLonely() {
		int x;
		String option;
    	option = JOptionPane.showInputDialog("How isolated did you feel this week on a scale of 1-10, 1 being most lonely: ");
   	 	x = Integer.parseInt(option);
   	 	return x;
	}

	
	//Current Question Getters
	public int getCurHappiness() {
		return curHappy;
	}
	public int getCurActivities() {
		return curActivities;
	}
	public int getCurSocialMediaFeel() {
		return curFeel;
	}
	public int getCurSocialMediaHours() {
		return curHours;
	}
	public int getCurLonely() {
		return curLonely;
	}
	
	
	

	
	
	
	
}