package Developer_DZ;

import java.util.ArrayList;
import java.util.List;

public class HR {
    private static ArrayList<Developer> developerList = new ArrayList<Developer>();

    public static void setDeveloper(Developer dev) {
        developerList.add(dev);
    }

    public List<Developer> getSeniorDeveloper() {

        List<Developer> result = new ArrayList<Developer>();

        for (Developer developer : developerList){
            if (developer instanceof SeniorDeveloper) {
                result.add(developer);
            }
        }
        return result;
    }

    public List<Developer> getJuniorDeveloper() {

        List<Developer> resultJun = new ArrayList<Developer>();

        for (Developer developer : developerList) {
            if(developer instanceof JuniorDeveloper) {
                resultJun.add(developer);
            }
        }
        return resultJun;
    }

    public List<Developer> getTeamLeadDeveloper() {

        List<Developer> resultTL = new ArrayList<Developer>();

        for (Developer developer : developerList) {
            if(developer instanceof TeamLeadDeveloper) {
                resultTL.add(developer);
            }
        }
        return resultTL;
    }

    public List<Developer> getTraineeDeveloper() {

        List<Developer> resultTra = new ArrayList<Developer>();

        for (Developer developer : developerList) {
            if(developer instanceof TraineeDeveloper) {
                resultTra.add(developer);
            }
        }
        return resultTra;
    }
}
