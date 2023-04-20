
    import java.util.*;
class first
{
 public static void main(String args[])
 {
  System.out.println("HELLO SIR WELCOME TO THE HOTEL HOW CAN I HELP YOU");
   System.out.println("                                                ");
  Scanner sc=new Scanner(System.in);
 
  int total_room=25;
  int booked_room=0;
  int available_room=total_room-booked_room;
  String name;
  int age;
  int days;
 
 for(int i=1;i==1;i++)
 {
   //available_room=available_room+total_room-booked_room;
   if(available_room <=25)
   {
    System.out.println("YOUR ROOM IS ALLOCATE SOON PLEASE WAIT :)  ");
   }
   else
   {
    System.out.println("SORRY SIR ALL ROOM ARE BOOKED   "); 
   }
   
   System.out.print("YOUR NAME : "); 
   name=sc.next();

   System.out.print("YOUR AGE : "); 
   age=sc.nextInt();
   if(age <= 18)
   {
     System.out.print("SORRY YOU ARE KID NOW : "); 
     break;
   }

  System.out.print("HOW MUCH TIME ARE YOU GOING TO STAY IN HOTEL: ");
  days=sc.nextInt();
  if(days>=10)
  {
    System.out.println("YOU GET DISCOUNT 30%: ");
  }
   available_room=total_room-1;
   booked_room=booked_room+1;
   total_room=total_room-booked_room;
   System.out.println("YOUR ROOM IS BOOKED");
    
 }
//System.out.println(available_room);
//System.out.println(total_room);
//System.out.println(booked_room);
}}

