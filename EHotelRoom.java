package javaProgramss;
//Step 1: Define the class
class HotelRoom1 {

 // Step 2: Declare all fields as private (data hiding)
 private int roomNumber;
 private String roomType;
 private boolean isAvailable;
 private double pricePerNight;

 // Step 3: Constructor to initialize required fields
 public HotelRoom1(int roomNumber, String roomType, double pricePerNight) {
     this.roomNumber = roomNumber;
     this.roomType = roomType;
     this.pricePerNight = pricePerNight;
     this.isAvailable = true; // default availability
 }

 // Step 4: Public getter for roomNumber (read-only)
 public int getRoomNumber() {
     return roomNumber;
 }

 // Step 5: Public getter and setter for roomType
 public String getRoomType() {
     return roomType;
 }

 public void setRoomType(String roomType) {
     if (roomType != null && !roomType.isEmpty()) {
         this.roomType = roomType;
     }
 }

 // Step 6: Public getter and setter for availability
 public boolean isAvailable() {
     return isAvailable;
 }

 public void setAvailability(boolean isAvailable) {
     this.isAvailable = isAvailable;
 }

 // Step 7: Public getter and setter for pricePerNight with validation
 public double getPricePerNight() {
     return pricePerNight;
 }

 public void setPricePerNight(double pricePerNight) {
     if (pricePerNight > 0) {
         this.pricePerNight = pricePerNight;
     }
 }

 // Step 8: Business logic method (encapsulated behavior)
 public double calculateTotalCost(int nights) {
     if (nights <= 0) return 0;
     return pricePerNight * nights;
 }

 // Step 9: Display method (controlled access to internal state)
 public void displayRoomDetails() {
     System.out.println("Room Number: " + roomNumber);
     System.out.println("Room Type: " + roomType);
     System.out.println("Available: " + isAvailable);
     System.out.println("Price per Night: ₹" + pricePerNight);
 }
}
public class EHotelRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HotelRoom1 room = new HotelRoom1(101, "Deluxe", 2500.0);
	        room.setAvailability(false);
	        room.setPricePerNight(2700.0);

	        room.displayRoomDetails();
	        System.out.println("Total cost for 3 nights: ₹" + room.calculateTotalCost(3));

	}

}
