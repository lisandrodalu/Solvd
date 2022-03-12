import java.util.Objects;

public class Room {
    private int price;
    private int roomNumber;

    public Room() {
    }

    public Room(int price,int roomNumber) {
        this.price = price;
        this.roomNumber = roomNumber;
    }

    public int getPrice() {
        return price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void addPatient(Patient p){

    }
    public double calculateAmount(int days){
        return days*this.price;

    }
    @Override
    public String toString() {
        return "Room Nro: "+this.roomNumber+" Price: "+this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return price == room.price && roomNumber == room.roomNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, roomNumber);
    }
}
