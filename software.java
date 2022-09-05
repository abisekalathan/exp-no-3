
package oops;

import java.util.Scanner;

public class software {
    public static void main(String[] args) {
        Scanner o =new Scanner(System.in);
        String a,b,j,k,m;
        int d,e,h,i,n;
        float c;
        boolean f,g,l;
        System.out.println("Enter makers name:");
        a=o.next();
        System.out.println("Enter vehicle id number:");
        b=o.next();
        System.out.println("Enter Blue Book Value:");
        c=o.nextFloat();
        System.out.println("Enter making Year:");
        d=o.nextInt();
        System.out.println("Enter No of passenger:");
        e=o.nextInt();
        System.out.println("Car Details:");
        System.out.println("Do you have warranty (True or Flase):");
        f=o.nextBoolean();
        System.out.println("Whether car Imported (True or Flase):");
        g=o.nextBoolean();
        System.out.println("Enter No of doors:");
        h=o.nextInt();
        System.out.println("Enter Top Speed:");
        i=o.nextInt();
        System.out.println("Enter Size:");
        j=o.next();
        System.out.println("Enter model of reardoor:");
        k=o.next();
        System.out.println("Whether have Topper (True or Flase):");
        l=o.nextBoolean();
        System.out.println("Truck Details:");
        System.out.println("Enter Name of Wheels:");
        m=o.next();
        System.out.println("Enter Number of Racks:");
        n=o.nextInt();
        System.out.println("Automobile Information:");
       automobile obj;
        obj = new automobile(a,b,c,d,e,f,g,h,i,j,k,l,m,n);
        System.out.println(obj.tostring());
    }   
}
class automobile extends car
{
    String makersname,vehicleid;
    int year,passenger;
    float bookvalue;
    automobile(String a, String b, float c, int d, int e, boolean f, boolean g, int h, int i, String j, String k, boolean l, String m, int n) {
       super(f,g,h,i,j,k,l,m,n);
       makersname=a;
       vehicleid=b;
       bookvalue=c;
       year=d;
       passenger=e;
    }
    @Override
    public String tostring(){
        
        return "Maker Name:"+makersname+"\nVehicle Identification Number:"+vehicleid+"\nBlue Book Value:"+bookvalue+"\nYear:"+year+"\nPassengers:"+passenger+super.tostring();
        
    }
}
class car extends truck
{
    String size,reardoor;
    boolean warranty,imported;
    int doors,topspeed;
    car(boolean f, boolean g, int h, int i, String j, String k, boolean l, String m, int n)
    {
        super(l,m,n);
        warranty=f;
        imported=g;
        doors=h;
        topspeed=i;
        size=j;
        reardoor=k;
    }
    @Override
    public String tostring(){
        return "\n\n\nCar Details:"+"\nWarranty:"+warranty+"\nImported:"+imported+"\nDoors:"+doors+"\nTop Speed:"+topspeed+"\nSize:"+size+"\nRear Door:"+reardoor+super.tostring() ;
    }
}
class truck
{
    boolean tooper;
    String wheels;
    int racks;
    truck(boolean l, String m, int n)
    {
        tooper=l;
        wheels=m;
        racks=n;
    }
    public String tostring(){
        return "\n\n\nTruxk Details:"+"\nTooper:"+tooper+"\nWheels:"+wheels+"\nRacks:"+racks ;
    }
}