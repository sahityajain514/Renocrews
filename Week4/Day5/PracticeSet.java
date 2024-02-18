import java.util.*;
//question 1

// import java.util.ArrayList;
// public class PracticeSet{
//             public static void main(String[] args) {
//                 ArrayList<String> ar = new ArrayList();
//                 ar.add("Student 1");
//                 ar.add("Student 2");
//                 ar.add("Student 3");
//                 ar.add("Student 4");
//                 ar.add("Student 5");
//                 ar.add("Student 6");
//                 ar.add("Student 7");
//                 ar.add("Student 8");
//                 ar.add("Student 9");
//                 ar.add("Student 10");
//                 for(Object o: ar){
//                     System.out.println(o);
//                 }
// }
// }

//question 2

// public class PracticeSet{
//     public static void main(String[] args) {
//       Date d = new Date();
//       System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
        
//     }
// }

//Question 3
// import java.util.Calendar;
// import java.util.Date;

// public class PracticeSet{
//             public static void main(String[] args) {
//                 Calendar c = Calendar.getInstance();
//                 System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
// }
// }


//question 4
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// public class PracticeSet{
//             public static void main(String[] args) {
//                 LocalDateTime dt = LocalDateTime.now(); // This is the date
//                 DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // This is the format
//                 String myDate = dt.format(df); // Creating date string using date and format
//                 System.out.println(myDate);
// }
// }

//Question 5
import java.util.HashSet;

public class PracticeSet{
            public static void main(String[] args) {
                HashSet<Integer> s = new HashSet();
                s.add(5);
                s.add(6);
                s.add(46);
                s.add(60);
                s.add(9);
                s.add(6);
                System.out.println(s);
}
}
