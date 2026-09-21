package javalanguagefundamentals;

public class BugTracker {
 int bugId;
 String applicationName;
 String bugTitle;
 String severity;
 String priority;
 String status;
 String assignedDeveloper;
 int getbugId() {
	 return bugId;
 }
 String getapplicationName() {
	 return applicationName;
 }
 String getbugTitle() {
	 return bugTitle;
 }
String getseverity() {
	return severity;
}
String getpriority() {
	return priority;
}
String getstatus() {
	return status;
}
String getassignedDeveloper() {
	return assignedDeveloper;
}

void assignToDeveloper(int id,String developerName) {
	assignedDeveloper=developerName;
	updatestatus("IN Development");
	
}
void updatestatus(String newstatus) {
	status=newstatus;
}
void displayBugSummary() {
   System.out.println("bugId is:"+bugId);
   System.out.println("applicationName is:"+applicationName);
   System.out.println("bugTitle is:"+bugTitle);
    System.out.println("severity"+severity);
    System.out.println("Priority is:"+priority);
    System.out.println("status is:"+status);
    System.out.println("AssignedDeveloper"+assignedDeveloper);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BugTracker b1=new BugTracker();
		b1.bugId=101;
		b1.applicationName="weatherApp";
		b1.bugTitle="Temparature become high";
		b1.severity="high";
		b1.priority="medium";
		b1.status="good";
		b1.assignedDeveloper="siri Assigned";
		b1.assignToDeveloper(101,"Siri");
		b1.displayBugSummary();

	}

}
