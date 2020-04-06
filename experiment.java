

import java.util.Scanner; 
class experiment{ 
public static void main(String arg[]){ 
experiment obj = new experiment(); 
int x = obj.setData(); 
int y = obj.setData(); 
obj.showResult(x,y); 
} 
int setData(){ 
Scanner scan=new Scanner(System.in); 
try { 
System.out.print("Enter a number : "); 
String a=scan.next(); 
int b = Integer.parseInt(a);return b; 
} 
catch (NumberFormatException m) { 
System.out.println ("Sorry only numbers"); 
} 
return 1; 
} 
void showResult(int a,int b){ 
try{ 
int result=a/b; 
System.out.println ("Result : "+result); 
} 
catch(ArithmeticException e){ 
System.out.println ("Sorry number divide by 0 is not possible"); 
} 
} 
}
