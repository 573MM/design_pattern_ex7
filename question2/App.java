public class App {
    public static void main(String[] args) {
        GraphicObject ceo = setAllEmployee();
        printAllEmployee(ceo, 0);
    }
    public static void printAllEmployee(GraphicObject employee, int depth) {
        employee.print(depth);
    }
    public static GraphicObject setAllEmployee() {
        GraphicObject ceo = new GraphicObject();
        ceo.setAllEmployee("Settha", "CEO", 500000);

        GraphicObject headSales = new GraphicObject();
        headSales.setAllEmployee("Kamphaka", "Head Sales", 300000);
        ceo.children.add(headSales);

        headSales.children.add(new Employee("Wiroj", "Sales", 150000));
        headSales.children.add(new Employee("Weeranan", "Sales", 100000));

        GraphicObject headMarketing = new GraphicObject();
        headMarketing.setAllEmployee("UngInk", "Head Marketing", 300000);
        ceo.children.add(headMarketing);

        headMarketing.children.add(new Employee("Oak", "Marketing", 200000));
        headMarketing.children.add(new Employee("Aem", "Marketing", 250000));

        return ceo;
    }
}