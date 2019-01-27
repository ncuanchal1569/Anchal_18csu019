class Student
{
 String firstName;
 String lastName;
 Address address;
 String[] skills;
 Qualification[] qual;
 String[] projects;
 String eMail;
 String contactNo;
 Student(String firstname, String lastname, Address address, String skills[], Qualification qual[], Projects projects[],String eMail, String contactNo)
   { 
       this.firstName= firstName;
       this.lastName= lastName;
       this.address= address;
       this.skills= skills;
       this.qualification= qualification;
       this.projects= projects;
       this.eMail= eMail;
       this.contactNo= contactNo;
    } 
    Student(String firstName, String lastName, Address address, String Skills[],Qualification qual[], String eMail,String contactNo)
    {
    	this.firstName= firstName;
    	this.lastName= lastname;
    	this.address= address;
    	this.skills= skills;
    	this.qualification= qualification;
    	this.eMail= eMail;
    	this.contactNo= contactNo;
    }
    void display()
    {
    	System.out.println("First name:" +this.firstName);
    	System.out.println("Last name:" +this.lastName);
    	this.addr.display;
    	for(int i=0; i<qual.length; i++)
    	{
    		qual[i].display;
    	}
    	System.out.print("Skills:" +skills[i]);
    	for(int i=0; i<project.length; i++)
    	{
    		project[i].display;
    	}
    	System.out.print("Email:" +this.eMail);
    	System.out.print("ContactNo:" +this.contactNo);
    }
}
    