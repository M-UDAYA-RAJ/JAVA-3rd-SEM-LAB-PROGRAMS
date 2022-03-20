import SEE.externals;
import CIE.internals;
import CIE.students;
import java.util.*;
class totalMarks
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int i,j,n;
System.out.println("ENTER NUMBER OF STUDENTS ");
n = sc.nextInt();
students s[] = new students[n];
internals cie[] = new internals[n];
externals see[] = new externals[n];
for(i = 0;i<n;i++)
{
System.out.println("ENTER DETAILS OF "+(i+1)+" STUDENT");
s[i] = new students();
cie[i] = new internals();
see[i] = new externals();
s[i].accept();
cie[i].get_marksc();
see[i].get_markss();
}
System.out.println("STUDENT DETAILS");
for(i = 0;i<n;i++)
{
s[i].display();
System.out.println("TOTAL MARKS = "+(cie[i].sumc+see[i].sums));
}
}
}