import java.util.*;
class first
{
 public static void main(String args[])
 {
  System.out.println("HELLO SIR WELCOME TO THE BUS HOW CAN I HELP YOU");
   System.out.println("                                                ");
  Scanner sc=new Scanner(System.in);
 
  int total_seat=50;
  int booked_seat=0;
  int available_seat=total_seat-booked_seat;
  String name;
  int age;
  int stoppage;
 
 for(int i=1;i==1;i++)
 {
   //available_room=available_room+total_room-booked_room;
   if(available_seat <=50)
   {
    System.out.println("YOUR SEAT IS ALLOCATE SOON PLEASE WAIT :)  ");
   }
   else
   {
    System.out.println("SORRY SIR ALL SEAT ARE BOOKED   "); 
   }
   
   System.out.print("YOUR NAME : "); 
   name=sc.next();

   System.out.print("YOUR AGE : "); 
   age=sc.nextInt();
   if(age <= 18)
   {
     System.out.println("YOU WILL GET 40% OFF "); 
   }

  System.out.print("IN WHICH STOPPAGE YOU WANT TO GO DEAR MAKE SURE YOU REMEMBER YOUR STOOPAGE WE CONSULTING YOU IN FITURE:  ");
  stoppage=sc.nextInt();
  if(stoppage>=30)
  {
    System.out.println("THERE WAS NO SUCH STOPPAGE");
    System.out.println("THANKS TO VISIT HERE HAVE A GOOD DAY");
    break; 
  }
 available_seat=total_seat-1;
   booked_seat=booked_seat+1;
   total_seat=total_seat-booked_seat;
  
}
System.out.print("HOW MUCH SEAT:");  
int seat=sc.nextInt();

System.out.print("YOUR STOPPAGE PLS REPEAT IT SIR:"); 
 stoppage=sc.nextInt();
 switch(stoppage)
{
 case 1:
 System.out.println("SINGLE SEAT PRICE IS 20"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*20);
 }
break;
 
 case 2:
 System.out.println("SINGLE SEAT PRICE IS 25"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*25);
 } 
break;

case 3:
 System.out.println("SINGLE SEAT PRICE IS 27"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*27);
 }
 break;
 
 case 4:
 System.out.println("SINGLE SEAT PRICE IS 30"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*30);
 }
 break;

case 5:
 System.out.println("SINGLE SEAT PRICE IS 33"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*33);
 } 
break;
 
 case 6:
 System.out.println("SINGLE SEAT PRICE IS 34"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*34);
 } 
break;

case 7:
 System.out.println("SINGLE SEAT PRICE IS 42"); 
  if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*42);
 } 
break;
 
 case 8:
 System.out.println("SINGLE SEAT PRICE IS 45"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*45);
 } 
break;

case 9:
 System.out.println("SINGLE SEAT PRICE IS 48"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*48);
 } 
break;
 
 case 10:
 System.out.println("SINGLE SEAT PRICE IS 50"); 
  if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*50);
 } 
break;

case 11:
 System.out.println("SINGLE SEAT PRICE IS 55"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*55);
 } 
break;
 
 case 12:
 System.out.println("SINGLE SEAT PRICE IS 59"); 
  if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*59);
 } 
break;

case 13:
 System.out.println("SINGLE SEAT PRICE IS 60"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*60);
 } 
break;
 
 case 14:
 System.out.println("SINGLE SEAT PRICE IS 45"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*45);
 } 
break;
case 15:
 System.out.println("SINGLE SEAT PRICE IS 50"); 
  if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*50);
 } 
break;
 
 case 16:
 System.out.println("SINGLE SEAT PRICE IS 50"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*50);
 } 
break;
case 17:
 System.out.println("SINGLE SEAT PRICE IS 50"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*50);
 } 
break;
 case 18:
 System.out.println("SINGLE SEAT PRICE IS 55"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*55);
 } 
break;
case 19:
 System.out.println("SINGLE SEAT PRICE IS 55"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*55);
 } 
break; 
 case 20:
 System.out.println("SINGLE SEAT PRICE IS 45"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*45);
 } 
break;
case 21:
 System.out.println("SINGLE SEAT PRICE IS 48"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*48);
 } 
break;
 
 case 22:
 System.out.println("SINGLE SEAT PRICE IS 50"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*50);
 } 
break;
case 23:
 System.out.println("SINGLE SEAT PRICE IS 55"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*55);
 } 
break; 
 case 24:
 System.out.println("SINGLE SEAT PRICE IS 59"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*59);
 } 
break;
 
 case 25:
 System.out.println("SINGLE SEAT PRICE IS 45"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*45);
 } 
break;

case 26:
 System.out.println("SINGLE SEAT PRICE IS 48"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*48);
 } 
break; case 27:
 System.out.println("SINGLE SEAT PRICE IS 50"); 
  if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*50);
 } 
break;

case 28:
 System.out.println("SINGLE SEAT PRICE IS 55"); 
  if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*55);
 } 
break;
 case 29:
 System.out.println("SINGLE SEAT PRICE IS 59"); 
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*59);
 } 
break;

default:
System.out.println("SINGLE SEAT PRICE  IS 60");
 if(seat != 1)
 {
  System.out.println("YOUR PRICE IS:"+seat*60);
 } 
break;

}

 System.out.println("YOUR SEAT IS BOOKED"); 



//System.out.println(available_seat);
//System.out.println(total_seat);
//System.out.println(booked_seat);
}}


 
