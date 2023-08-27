import java.util.List;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void getChildren(Person person) {
        List<Person> children = person.getChildren();
        view.displayChildren(children);
    }

    public void getParents(Person person) {
        List<Person> parents = person.getParents();
        view.displayParents(parents);
    }

    public void getAllPeople() {
        List<FamilyMember> people = model.getAllPeople();
        view.displayPeople(people);
    }

    public void sortByName() {
        model.sortByName();
        getAllPeople();
    }

    public void sortByBirthDate() {
        model.sortByBirthDate();
        getAllPeople();
    }
}
