public class EnginnerCollege {
    public static void main(String[] args)
    {
        Enginner enginnObj1=new Enginner("John","CSE","FY",80);
        Enginner enginnObj2=new Enginner("Mike","CIVIL","FY",90);
        Enginner enginnObj3=new Enginner("Joy","MECH","SY",60);

        enginnObj1.showDetails();
        enginnObj2.showDetails();
        enginnObj3.showDetails();
        double percen;
        percen=enginnObj1.calculcatePercentage(550);
        System.out.println(percen);
        enginnObj1.result(percen);
    }
}


class Enginner{
    String name;
    String branch;
    String year;
    int marks;
    Enginner(String name,String branch,String year,int marks)
    {
        this.name=name;
        this.branch=branch;
        this.year=year;
        this.marks=marks;
    }

    void showDetails()
    {
       System.out.println("Name:"+name);
       System.out.println("branch:"+branch);
       System.out.println("year:"+year);
       System.out.println("marks:"+marks);
       System.out.println("---------");
    }

    double calculcatePercentage(int semMarks)
    {
        double total=(semMarks/600.0)*100;
        return total;
    }

    void result(double percen)
    {
        if(percen>=80)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("fail");
        }
    }

}