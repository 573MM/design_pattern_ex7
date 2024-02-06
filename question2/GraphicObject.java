import java.util.ArrayList;
import java.util.List;

public class GraphicObject {
    protected String name;
    protected String position;
    protected int salary;

    public void setAllEmployee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        print(0);
        return ("Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]");
    }

    public List<GraphicObject> children = new ArrayList<>();

    protected void print(int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("  ");
        }

        System.out.println(indent + "Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]");
        for (GraphicObject child : children) {
            child.print(depth + 1);
        }
    }
}