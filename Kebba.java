import java.io.*; 
import java.util.*; 
class Kebba{ 
public static void main(String[] args) throws IOException { 
File fileS = new File("data.txt"); 
ArrayList<String> list = new ArrayList<>(); 
try (BufferedReader bf = new BufferedReader(new FileReader(fileS))){ 
String readLine; 
int line = 0; 
while ((readLine = bf.readLine()) != null) { 
if (line % 2 == 0) { 
list.add(readLine); 
} 
line++;} 
for(int i =0; i<list.size(); i++){ 
System.out.println(list.get(i)); 
}
} 
} 
}
