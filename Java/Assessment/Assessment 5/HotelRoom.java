class HotelRoom {
    int roomNumber;
    String roomType;
    double pricePerNight;
    boolean isBooked;

    HotelRoom() {
        roomNumber = 0;
        roomType = "Standard";
        pricePerNight = 5000.0;
        isBooked = false;
    }

    HotelRoom(int roomNumber, String roomType, double pricePerNight, boolean isBooked) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isBooked = isBooked;
    }

    double bookRoom(int nights) {
        if (!isBooked) {
            isBooked = true;
            return pricePerNight * nights;
        } else {
            System.out.println("Room is already booked.");
            return 0.0;
        }
    }

    void checkoutRoom() {
        isBooked = false;
        System.out.println("Room " + roomNumber + " is now available.");
    }

    String getRoomSummary() {
        return "Room " + roomNumber + " - " + roomType +
               " - Rs. " + pricePerNight +
               " per night - Booked: " + isBooked;
    }

    public static void main(String[] args) {
        HotelRoom room1 = new HotelRoom();

        HotelRoom room2 = new HotelRoom(101, "Deluxe", 8500.0, false);

        double totalCost = room2.bookRoom(3);
        System.out.println("Total Cost for 3 nights: Rs. " + totalCost);

        room2.bookRoom(2);

        room2.checkoutRoom();

        double newBooking = room2.bookRoom(2);
        System.out.println("New Booking Cost for 2 nights: Rs. " + newBooking);

        System.out.println("\nRoom Summaries:");
        System.out.println(room1.getRoomSummary());
        System.out.println(room2.getRoomSummary());
    }
}