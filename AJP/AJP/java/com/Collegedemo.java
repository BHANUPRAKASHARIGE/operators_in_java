package AJP.java.com;

class College{

    String collegeCode;
    String collegeName;
    String address;
    long phoneNumber;
    static String affiliation="jntuh"; 
    void collegeDetails(){
        System.out.println("college Code :"+collegeCode+"\ncollegeName:"+collegeName+"\naddress:"+address+"\nphoneNumber:"+phoneNumber+"\naffiliation by:"+affiliation);
    }
    void transportation(){
        System.out.println("hyd-met");
    }
}
public class Collegedemo{
    public static void main(String[] args) {
        College college1= new College();
        college1.collegeCode="12345";
        college1.collegeName="Avanthi";
        college1.address="hyd";
        college1.phoneNumber=1234567890;
        college1.affiliation="Autonomus";                  //static variables are class properties
        college1.collegeDetails();
        System.out.println("transportation-");
        college1.transportation();

        College college2= new College();
        college2.collegeCode="9087";
        college2.collegeName="vijay";
        college2.address="NZB";
        college2.phoneNumber=987654321;
        college2.collegeDetails();                


        
    }

    
}