package MVC;

import java.util.Scanner;

public class View {
	


	   public static void main(String[] args){
	        Controller controller = new Controller();
	        Scanner scanner = new Scanner(System.in);

	        for (boolean i = true; i; ){
	            System.out.println("\n what page do you want to see?" +
	                    "\n1 = View Pages" +
	                    "\n2 = Add page" +
	                    "\n3 = Get Description of a page" +
	                    "\n4 = Exit\n");
	            int input = scanner.nextInt();

	            switch (input){
	                case (1):
	                    System.out.println(controller.getMap());
	                    break;
	                case (2):
	                	scanner.nextLine();
	                    System.out.println("\nwhat do you want the new page to be called:");
	                    String homeInput = scanner.nextLine();
	                    System.out.println("\nwhat do you want the new description to be:");
	                    String descInput = scanner.nextLine();
	                    controller.addPage(homeInput, descInput);
	                    break;
	                case (3):
	                	scanner.nextLine();
	                    System.out.println("Which page do you want the description for?");
	                    String choosePage = scanner.nextLine();
	                    controller.getDesc(choosePage);
	                    break;
	                default:
	                    i = false;
	                    break;
	            }
	        }
	    }
	}
