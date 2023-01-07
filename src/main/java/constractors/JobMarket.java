package constractors;

public class JobMarket {
    public static void main(String[] args) {
        Job nurse = new Job(); // we are created new object


        nurse.jobType= " nurse";
        nurse.salary = 8500;
        nurse.isHighPaid = true;

        nurse.getPaid(nurse.salary);

        Job policeOfficer = new Job("police", 4000, false );
        policeOfficer.takeVacation();

       Job programmer = new Job("programmer", 5000, false);
       programmer.takeVacation();
       programmer.getPaid(5000);




    }




}
