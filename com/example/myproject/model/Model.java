import java.util.List;

public class Model {
    private FamilyTree<FamilyMember> familyTree;

    public Model() {
        familyTree = new FamilyTree<>();
    }

    public void addPerson(FamilyMember person) {
        familyTree.addPerson(person);
    }

    public List<FamilyMember> getAllPeople() {
        return familyTree.getPeople();
    }

    public void sortByName() {
        familyTree.sortByName();
    }

    public void sortByBirthDate() {
        familyTree.sortByBirthDate();
    }
}
