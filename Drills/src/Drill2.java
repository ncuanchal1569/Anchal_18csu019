class Drill2
public static void main(String[]args)
{
	Reportcard reportcard;
	Report report;
	Marks marks(1);
	Grade grade(1);
	Sgpa sgpa(1);
	Cgpa cgpa(1);
	report.write(reportcard);
	reportcard.add(marks);
	reportcard.add(grade);
	report.result(2,false);
	reportcard.add(sgpa);
	reportcard.add(cgpa);
	report.result(2,true);
	report.stop();
	System.out.println("Report Card is ready.")
}