package Developer_DZ;

import java.util.List;

public class Main {
    private static StringBuilder getStringB(Developer d, String title) {
      return new StringBuilder()
                .append(title)
                .append(d.getName())
                .append(": salary ")
                .append(d.getSalary())
                .append(" $");
    }

    static void printDeveloperList(List<Developer> dev, String title) {
        for (Developer d : dev) {
            System.out.println(getStringB(d, title));
        }
    }

	public static void main(String[] args) {

        HR hr = new HR();

        HR.setDeveloper(new TraineeDeveloper("Billy", 500, 0));
        HR.setDeveloper(new JuniorDeveloper("Mike", 500, 0));
        HR.setDeveloper(new JuniorDeveloper("Dima", 500, 1));
        HR.setDeveloper(new JuniorDeveloper("Vova", 500, 2));
        HR.setDeveloper(new SeniorDeveloper("Jack", 1000, 5));
        HR.setDeveloper(new SeniorDeveloper("Robby", 1000, 9));
        HR.setDeveloper(new SeniorDeveloper("Rob", 1000, 6));
        HR.setDeveloper(new TeamLeadDeveloper("Bob", 2000, 8));

        printDeveloperList(hr.getTraineeDeveloper(), "Trainee Developer: ");

        System.out.println("------------");

        printDeveloperList(hr.getJuniorDeveloper(), "Junior Developer: ");

        System.out.println("------------");

        printDeveloperList(hr.getSeniorDeveloper(), "Senior Developer: ");

        System.out.println("------------");

        printDeveloperList(hr.getTeamLeadDeveloper(), "Team Lead Developer: ");
    }
}
 