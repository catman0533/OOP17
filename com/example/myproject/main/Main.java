


public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new ConsoleView(); // Имплементируйте интерфейс View и создайте соответствующий класс
        Presenter presenter = new Presenter(model, view);

        // Добавление людей в модель
        Person person1 = new Person("John", "Male", "01-01-1980", "N/A");
        Person person2 = new Person("Amy", "Female", "05-03-1985", "N/A");
        Person person3 = new Person("David", "Male", "10-07-1990", "N/A");
        Person person4 = new Person("Emily", "Female", "15-09-1995", "N/A");

        person3.addParent(person1);
        person3.addParent(person2);
        person4.addParent(person1);
        person4.addParent(person2);
        person1.addChild(person3);
        person1.addChild(person4);
        person2.addChild(person3);
        person2.addChild(person4);

        model.addPerson(person1);
        model.addPerson(person2);
        model.addPerson(person3);
        model.addPerson(person4);

        // Взаимодействие с данными через презентера
        presenter.getChildren(person1);
        presenter.getParents(person3);
        presenter.sortByName();
        presenter.sortByBirthDate();
    }
}

