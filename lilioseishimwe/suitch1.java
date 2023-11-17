 class Main { 

public static void main(String[] args) 

{ 

String Branch = "CS"; 

int year = 1; 

switch (year) { 

case 1: 

System.out.println("elective courses : Advance Maths, Algebra"); 

break; 

case 2: 

switch (Branch)  

{ 

case "CS": 

case "ECE": 

System.out.println("elective courses : ML, Big Data"); 

break; 

case "IT": 

System.out.println("elective courses : Software Engineering"); 

break; 

default: 

System.out.println("Elective courses : English"); 

} 

} 

} 

}