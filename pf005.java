import java.util.List;  
import java.util.ArrayList;

class Kurs {
	public static List<String> replan(List<String> plan, String newChapter, String beforeChapter) {
		int newChapterIndex = plan.indexOf(beforeChapter);
		List<String> replanned = new ArrayList<>(plan); //This creates a copy of original list
		replanned.add(newChapterIndex, newChapter);	//Now you change a copy, which does not interfere with the original
		return replanned;
	}
	public static void showPlan(List<String> plan){
		for(int i = 0; i < plan.size(); i++){
			System.out.println((i+1) + " " + plan.get(i));
		}
	}
}

class pf005 {
	public static void main(String args[]){
		List<String> planA = new ArrayList();
		planA.add("INTRODUCTION");
		planA.add("CHAPTER 1");
		planA.add("1.1 Creating videogames");
		planA.add("CHAPTER 2");
		
		System.out.println("planA containments: ");
		Kurs.showPlan(planA);
		
		System.out.println("Creating planB via insertion in planA");
		List<String> planB = Kurs.replan(planA, "1.2 Target audience analysis", "CHAPTER 2");
		
		System.out.println("\nplanB containments: ");
		Kurs.showPlan(planB);
	
		System.out.println("\nplanA containments: ");
		Kurs.showPlan(planA);
		//Now this works as intended!
		//Changes to planB happen not to plan A, because method replan() is changing a copy of planA data
		//

		
	}
}
