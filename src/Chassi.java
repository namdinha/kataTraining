public class Chassi extends Component{

    public Chassi(int length, String frameRepresentation, String axleRepresentation, String headlightRepresentation) {
        component = CarConstructor.makeBottomPart(length, axleRepresentation, frameRepresentation, headlightRepresentation);
    }

    @Override
    public String toString() {
        return component;
    }
}
