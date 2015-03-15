package Developer_DZ;

public class TraineeDeveloper extends Developer {


    public TraineeDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return basicSalary - (basicSalary/100*50);
    }
}
