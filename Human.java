import java.util.Objects;

public class Human implements Sized{
    private String name;
    public Human(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void close(String what, String then) {
        System.out.print(getName() + " прикрыл " + what + " " + then.substring(0, then.length() - 1) + "ой");
    }
    public void cough(String how) {
        if (how == "LITE") {
            System.out.print("потихоньку покашлял");
        }
        if (how == "HARD") {
            System.out.print("на всю ракету покашлял");
        }
    }
    public void lookaround(String when) {
        if (when == "PAST"){
            System.out.print("после чего огляделся по сторонам ");
        }
        if (when == "BEFORE"){
            System.out.print("перед этим огляделся по сторонам ");
        }
    }
    public String continues(Predlog_USSR soyuznerushimiy){
        switch (soyuznerushimiy) {
            case AND:
                System.out.print("и продолжал: ");
                break;
            case A:
                System.out.print("а продолжал: ");
                break;
        }
        return null;
    }
    public void see(String when) {
        if (when == "THIS_TIME"){
            System.out.print(getName() + " на самом деле видели в это время ");
        }
        if (when == "NO_THIS_TIME"){
            System.out.print(getName() + " на самом деле видели не в это время ");
        }

    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
