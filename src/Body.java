public class Body extends Component{

    public Body(int length, int doorsQuantity, String roofRepresentation, String backRepresentation, String doorRepresentation, String betweenDoorsRepresentation, String frontRepresentation) {
        component = CarConstructor.makeTopPart(length - 2, roofRepresentation);
        component += CarConstructor.makeMidPart(length - 1, doorsQuantity, doorRepresentation, frontRepresentation, betweenDoorsRepresentation, backRepresentation);
    }

    @Override
    public String toString() {
        return component;
    }
}
