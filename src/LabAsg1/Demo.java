package LabAsg1;

public class Demo {
    public static void main(String[] args) {
            Computer c1 = new Computer("24","Dell",6, 512,true );
            Computer c2 = new Computer("32","HP",18, 256,true );
            Lab l1 = new Lab("Comp",new Computer[]{c1,c2},LabStatus.OPERATIONAL,new Employee("12","Hi"));
            l1.addComputer(new Computer("12","MNM001",12,20,true));
            l1.addComputer(new Computer("14","PQR123",12,20,true));
            System.out.println(l1.computers[0]);
            System.out.println(l1.computers[1]);
            l1.removeComputer("14");
            System.out.println(l1.computers[1]);
        }



}

