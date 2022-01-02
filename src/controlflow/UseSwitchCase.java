package controlflow;

public class UseSwitchCase {

	public static void main(String[] args) {
		int foodSeries = 5;
		String myFood;
		
		switch(foodSeries) {
		case 1:
			myFood = "Pizza";
		break;
		case 2:
			myFood = "Pasta";
			break;
		case 3:
			myFood = "Salad";
			break;
		case 4:
			myFood = "Fried Rice";
			break;
		default:
			myFood = "Invalid Item";
			break;
		}
		System.out.println("My food item is : " + myFood);

	}

}
