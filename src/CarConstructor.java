public class CarConstructor{

    private CarConstructor() {

    }

    public static String makeTopPart(int length, String roofRepresentation) {
        String component = " ";
        for(int i = 1; i < length; i++) {
            component += roofRepresentation;
        }
        component += "\n";
        return component;
    }

    public static String makeMidPart(int length, int doorsQuantity, String doorRepresentation, String frontRepresentation, String betweenDoorsRepresentation, String backRepresentation) {
        String component = backRepresentation;

        int frontDoorsQuantity;
        int backDoorsQuantity;

        if(doorsQuantity == 1) {
            frontDoorsQuantity = 1;
            backDoorsQuantity = 0;
        }
        else {
            frontDoorsQuantity = doorsQuantity/2;
            backDoorsQuantity = doorsQuantity/2 + doorsQuantity%2;
        }

        int partBetweenDoorsQuantity = length - 2 - frontDoorsQuantity*2 - backDoorsQuantity*2;

        for(int i = 0; i < backDoorsQuantity; i++) {
            component += doorRepresentation;
        }
        for(int i = 0; i < partBetweenDoorsQuantity; i++) {
            component += betweenDoorsRepresentation;
        }
        for(int i = 0; i < frontDoorsQuantity; i++) {
            component += doorRepresentation;
        }
        component += frontRepresentation + "\n";

        return component;
    }

    public static String makeBottomPart(int length, String axleRepresentation, String frameRepresentation, String headlightRepresentation) {
        String component = frameRepresentation;
        int axlesQuantity = 2;

        if(length >= 12) axlesQuantity += (length - 10)/2;

        int frontAxlesQuantity = axlesQuantity/2;
        int backAxlesQuantity = axlesQuantity/2 + axlesQuantity%2;

        int partBetweenAxles = length - 3 - frontAxlesQuantity*2 - backAxlesQuantity*2;
        for(int i = 0; i < backAxlesQuantity; i++) {
            component += axleRepresentation + frameRepresentation;
        }
        for(int i = 0; i < partBetweenAxles; i++) {
            component += frameRepresentation;
        }
        for(int i = 0; i < frontAxlesQuantity; i++) {
            component += frameRepresentation + axleRepresentation;
        }
        component += frameRepresentation + headlightRepresentation;

        return component;
    }
}
