import java.util.List;

public class ConsoleView implements View {
    @Override
    public void displayChildren(List<Person> children) {
        System.out.println("Дети выбранного человека:");
        for (Person child : children) {
            System.out.println(child);
        }
    }

    @Override
    public void displayParents(List<Person> parents) {
        System.out.println("Родители выбранного человека:");
        for (Person parent : parents) {
            System.out.println(parent);
        }
    }

    @Override
    public void displayPeople(List<FamilyMember> people) {
        System.out.println("Отсортированный список людей:");
        for (FamilyMember person : people) {
            System.out.println(person);
        }
    }
}
