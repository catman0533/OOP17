import java.util.List;

public interface View {
    void displayChildren(List<Person> children);
    void displayParents(List<Person> parents);
    void displayPeople(List<FamilyMember> people);
}
