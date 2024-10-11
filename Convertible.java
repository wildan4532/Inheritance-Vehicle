public class Convertible extends Car{
    String roofType;

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public Convertible() {
        super();
        roofType = "";
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Roof Type     : " +roofType);
    }
}
