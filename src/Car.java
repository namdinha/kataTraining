public class Car {

    public Body body;
    public Chassi chassi;

    public Car(int length, int doorsQuantity) throws ErrorException{

        String roofRepresentation = "_",
                backRepresentation = "|", doorRepresentation = "[]", betweenDoorsRepresentation = " ", frontRepresentation = "\\",
                frameRepresentation = "-", axleRepresentation = "o", headlightRepresentation = "'";

        int doorSize = doorRepresentation.length();

        if(length < 7) throw new ErrorException("Minimum length: 7");
        if(doorsQuantity < 1) throw new ErrorException("Minimum doors: 1");
        if(doorsQuantity*doorSize > length - 2) throw new ErrorException("Doors does not fit.");

        body = new Body(length, doorsQuantity, roofRepresentation, backRepresentation, doorRepresentation, betweenDoorsRepresentation, frontRepresentation);
        chassi = new Chassi(length, frameRepresentation, axleRepresentation, headlightRepresentation);
    }

    @Override
    public String toString() {
        return body.toString() + chassi.toString();
    }
}
