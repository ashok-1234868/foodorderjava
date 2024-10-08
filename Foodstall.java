import java.util.*;

class Foodstall
{
// declare items

int Streetfood;
int Fastfood;
int Snacks;
int Nonveg;
int Veg;
String again;
int quantity;
static int total;

Scanner sc=new Scanner(System.in);


	public void Generatebill()
	{
		System.out.println();
		System.out.println("=====THANKYOU FOR ORDERING=====");
		System.out.println();
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<7;j++)
			{
				if((i==0&&j%3!=0)||(i==1&&j%3==0)||i-j==2||i+j==8)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("\b   YOUR BILL IS: "+total);
	}
		

	public void Menu()
	{
		System.out.println("^^^^^^^^^^^^^WELCOME TO OUR STALL^^^^^^^^^^^^^^");
		System.out.println();
		System.out.println("        	1.Streetfood           		  ");
		System.out.println("        	2.Fastfood	           	   	  ");	
		System.out.println("       		3.Snacks    	       		  ");
		System.out.println("       		4.Nonveg        	   		  ");
		System.out.println("       		5.Veg     		       		  ");
		System.out.println("       		6.Exit     		       		  ");
		System.out.println();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
}

	public void Order()
	{
			//streetfood
			int bajji=10;
			int panipoori=15;
			int thattuvadaset=20;
			int kalan=25;
			int sweetcorn=15;
			
			//fastfood
			int chickenrice=80;
			int eggrice=70;
			int friedrice=70;
			int noodles=80;
			int sawarma=60;
			
			//snacks
			int bingo=10;
			int lays=10;
			int kurkure=10;
			int puffcorn=20;
			int cheetos=20;
			
			//nonveg
			int chickenbiriyani=90;
			int muttonbiriyani=120;
			int fishfry=50;
			int gril=150;
			int tandoori=160;
			
			//veg
			int idly=10;
			int dosa=15;
			int poori=20;
			int pongal=25;
			int parrota=15;

			
		while(true){
			System.out.println("ENTER YOUR CHOICE");
			int ch=sc.nextInt();
			
	
			switch(ch)
			{
				case 1:
					System.out.println("^^^^^^^^^^^^STREET FOOD^^^^^^^^^^^^^");
					System.out.println();
					System.out.println("	  1.Bajji	 	  10/-	");
					System.out.println("	  2.Panipoori		  15/-	");
					System.out.println("	  3.Thattuvadaset	  20/-	");
					System.out.println("	  4.Kalan		  25/-	");
					System.out.println("	  5.Sweetcorn		  15/-	");
					System.out.println("       	  6.Exit     		       		  ");
					System.out.println();
					System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				
				//while(true){//
					System.out.println("YOU HAVE SELECTED STREETFOOD");
					System.out.println("ENTER YOUR CHOICE");
					int street=sc.nextInt();
						
						switch(street)
						{
							case 1:
								 System.out.println("You have Selected Bajji");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*bajji;
							break;
							
							case 2:
								 System.out.println("You have Selected Panipoori");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*panipoori;
							break;
							
							case 3:
								 System.out.println("You have Selected Thattuvadaset");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*thattuvadaset;
							break;
							
							case 4:
								 System.out.println("You have Selected Kalan");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*kalan;
							break;
							
							case 5:
								 System.out.println("You have Selected Sweetcorn");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*sweetcorn;
							break;
							
							case 6:
							    Generatebill();
								System.exit(1);
							break;
						}
			
			System.out.print(" DO YOU WANT TO CHOOSE ANYTHING(YES/NO):");
			again=sc.next();
			if(again.equalsIgnoreCase("yes"))
			{
				Menu();
				break;
			}
			else if(again.equalsIgnoreCase("no"))
			{
				Generatebill();
				System.exit(1);
			}
			else{
			System.out.println("INVALID CHOICE");}
			
			
			
			//}//
		
				case 2:
					System.out.println("^^^^^^^^^^^^^^FAST FOOD^^^^^^^^^^^^^");
					System.out.println();
					System.out.println("		  1.ChickenRice		    80/-	");
					System.out.println("		  2.EggRice		    70/-	");
					System.out.println("		  3.FriedRice	            70/-	");
					System.out.println("		  4.Noodles       	    80/-	");
					System.out.println("		  5.Sawarma		    60/-	");
					System.out.println("       		  6.Exit     		       		  ");
					System.out.println();
					System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
						//while(true){//
					System.out.println("YOU HAVE SELECTED FAST FOOD");
					System.out.println("ENTER YOUR CHOICE");
					int street1=sc.nextInt();
						
						switch(street1)
						{
							case 1:
								 System.out.println("You have Selected ChickenRice");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*chickenrice;
							break;
							
							case 2:
								 System.out.println("You have Selected EggRice");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*eggrice;
							break;
							
							case 3:
								 System.out.println("You have Selected FriedRice");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*friedrice;
							break;
							
							case 4:
								 System.out.println("You have Selected Noodles");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*noodles;
							break;
							
							case 5:
								 System.out.println("You have Selected Sawarma");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*sawarma;
							break;
							
							case 6:
							    Generatebill();
								System.exit(1);
							break;
						}
			System.out.print(" DO YOU WANT TO CHOOSE ANYTHING(YES/NO):");
			String again1=sc.next();
			if(again1.equalsIgnoreCase("yes"))
			{
				Menu();
				break;
			}
			else if(again1.equalsIgnoreCase("no"))
			{
				Generatebill();
				System.exit(1);
			}
			else{
			System.out.println("INVALID CHOICE");}

					
	//}//
				
		
				case 3:
					System.out.println("^^^^^^^^^^^^^^SNACKS^^^^^^^^^^^^^^^^");
					System.out.println();
					System.out.println("		  1.Bingo		   	  10/-	");
					System.out.println("		  2.Lays		  	  10/-	");
					System.out.println("		  3.Kurkure	  		  10/-	");
					System.out.println("		  4.Puffcorn		          20/-	");
					System.out.println("		  5.Cheetos		          20/-	");
					System.out.println("       		  6.Exit     		       		  ");
					System.out.println();
					System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
					
						//while(true){//
					System.out.println("YOU HAVE SELECTED SNACKS");
					System.out.println("ENTER YOUR CHOICE");
					int street2=sc.nextInt();
						
						switch(street2)
						{
							case 1:
								 System.out.println("You have Selected Bingo");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*bingo;
							break;
							
							case 2:
								 System.out.println("You have Selected Lays");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*lays;
							break;
							
							case 3:
								 System.out.println("You have Selected Kurkure");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*kurkure;
							break;
							
							case 4:
								 System.out.println("You have Selected Puffcorn");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*puffcorn;
							break;
							
							case 5:
								 System.out.println("You have Selected Cheetos");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*cheetos;
							break;
							
							case 6:
							    Generatebill();
								System.exit(1);
								
							break;
						}
			System.out.print(" DO YOU WANT TO CHOOSE ANYTHING(YES/NO):");
			String again2=sc.next();
			if(again2.equalsIgnoreCase("yes"))
			{
				Menu();
				break;
			}
			else if(again2.equalsIgnoreCase("no"))
			{
				Generatebill();
				System.exit(1);
			}
			else{
			System.out.println("INVALID CHOICE");}

						//}//
		
				case 4:
					System.out.println("^^^^^^^^^^^^^NONVEG^^^^^^^^^^^^^^^^^");
					System.out.println();
					System.out.println("		1.Chicken Biriyani	  90/-	");
					System.out.println("		2.Mutton Biriyani	  120/-	");
					System.out.println("		3.Fish Fry	  	  50/-	");
					System.out.println("		4.Gril Chicken		  150/-	");
					System.out.println("		5.Thandoori Chicken       160/-	");
					System.out.println("       		6.Exit     		       		  ");
					System.out.println();
					System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
					
						//while(true){//
					System.out.println("YOU HAVE SELECTED NONVEG");
					System.out.println("ENTER YOUR CHOICE");
					int street3=sc.nextInt();
						
						switch(street3)
						{
							case 1:
								 System.out.println("You have Selected Chicken Biriyani");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*chickenbiriyani;
							break;
							
							case 2:
								 System.out.println("You have Selected Mutton Biriyani");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*muttonbiriyani;
							break;
							
							case 3:
								 System.out.println("You have Selected Fishfry");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*fishfry;
							break;
							
							case 4:
								 System.out.println("You have Selected Gril Chicken");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*gril;
							break;
							
							case 5:
								 System.out.println("You have Selected Tandoori Chicken");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*tandoori;
							break;
							
							case 6:
							    Generatebill();
								System.exit(1);
								
							break;
						}
			System.out.print(" DO YOU WANT TO CHOOSE ANYTHING(YES/NO):");
			String again3=sc.next();
			if(again3.equalsIgnoreCase("yes"))
			{
				Menu();
				break;
			}
			else if(again3.equalsIgnoreCase("no"))
			{
				Generatebill();
				System.exit(1);
			}
			else{
			System.out.println("INVALID CHOICE");}

						//}//
			
				case 5:
					System.out.println("^^^^^^^^^^^^^^^VEG^^^^^^^^^^^^^^^^^^");
					System.out.println();
					System.out.println("		  1.Idly		      10/-	");
					System.out.println("		  2.Dosa		      15/-	");
					System.out.println("		  3.Poori	              20/-	");
					System.out.println("		  4.Pongal		      25/-	");
					System.out.println("		  5.Parrota		      15/-  ");
					System.out.println("       		  6.Exit     		       		  ");
					System.out.println();
					System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
					
						//while(true){//
					System.out.println("YOU HAVE SELECTED VEG");
					System.out.println("ENTER YOUR CHOICE");
					int street4=sc.nextInt();
						
						switch(street4)
						{
							case 1:
								 System.out.println("You have Selected Idly");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*idly;
							break;
							
							case 2:
								 System.out.println("You have Selected Dosa ");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*dosa;
							break;
							
							case 3:
								 System.out.println("You have Selected Poori");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*poori;
							break;
							
							case 4:
								 System.out.println("You have Selected Pongal");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*pongal;
							break;
							
							case 5:
								 System.out.println("You have Selected Parrota");
								 System.out.println();
								 System.out.println("Enter The Desired Quantity");
								 quantity=sc.nextInt();
								 total=total+quantity*parrota;
							break;
							
							case 6:
							    Generatebill();
								System.exit(1);
								
							break;
						}
			System.out.print(" DO YOU WANT TO CHOOSE ANYTHING(YES/NO):");
			String again4=sc.next();
			if(again4.equalsIgnoreCase("yes"))
			{
				Menu();
				break;
			}
			else if(again4.equalsIgnoreCase("no"))
			{
				Generatebill();
				System.exit(1);
			}
			else{
			System.out.println("INVALID CHOICE");}


						//}//
		
				case 6:
				    Generatebill();
					System.exit(1);
				break;
		
				default:
				break;
			}
			
		}
			
	}

public static void main(String args[])
	{
		Foodstall obj=new Foodstall();
		obj.Menu();
		obj.Order();
	}
}


	