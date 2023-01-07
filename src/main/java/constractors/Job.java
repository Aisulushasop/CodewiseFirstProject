package constractors;

public class Job {

    public Job(String message) {

        System.out.println(" inside constructor of job class for:" + message);

    }

    public Job() {

    }

    String jobType;
    double salary;
    boolean isHighPaid;

   public Job ( String jobTypeP, double salaryP, boolean isHighPaidP ){
       jobType = jobTypeP;
       salary = salaryP;
       isHighPaid = isHighPaidP;
   }




    public void getPaid(double salary) {
        System.out.println(jobType + " got paid " + salary);


    }

    public  void takeVacation ( ){
        System.out.println( jobType+ " is on vacation");
    }



}
