package sample;

import java.util.Date;

//public class named DefaultMember
public class DefaultMember implements Comparable<DefaultMember> {
    //string for membership number of member - gym
    private String membershipNoOfTheMemberOfGym;

    //string for membership name of member - gym
    private String membershipNameOfTheMemberOfGym;

    //string for membership date of member - gym
    private String membershipDateOfTheMemberOfGym;

    //String for membership tp number of member - gym
    private String telephoneNumberOfTheMemberOfGym;

    //string for membership e-mail address of member - gym
    private String emailAddressOfTheMemberOfGym;


    public DefaultMember(String membershipNoOfTheMemberOfGym,String membershipNameOfTheMemberOfGym,String membershipDateOfTheMemberOfGym,String telephoneNumberOfTheMemberOfGym, String emailAddressOfTheMemberOfGym) {
        super();

        //membership number of the member - gym
        this.membershipNoOfTheMemberOfGym = membershipNoOfTheMemberOfGym;

        //membership name of the member- gym
        this.membershipNameOfTheMemberOfGym = membershipNameOfTheMemberOfGym;

        //membership date of admission- gym
        this.membershipDateOfTheMemberOfGym = membershipDateOfTheMemberOfGym;

        //tp number of the member- gym
        this.telephoneNumberOfTheMemberOfGym = telephoneNumberOfTheMemberOfGym;

        //member e-mail address of the member- gym
        this.emailAddressOfTheMemberOfGym = emailAddressOfTheMemberOfGym;

    }


    //implementing getters to Membership Number of member - gym
    public String getMembershipNoOfTheMemberOfGym(){
        return membershipNoOfTheMemberOfGym;
    }

    //implementing setters to guardian name of members of gym
    public void setMembershipNoOfTheMemberOfGym(String membershipNoOfTheMemberOfGym){
        this.membershipNoOfTheMemberOfGym = membershipNoOfTheMemberOfGym;
    }

    //implementing getters to Member Name of member - gym
    public String getMembershipNameOfTheMemberOfGym(){
        return membershipNameOfTheMemberOfGym;
    }

    //implementing setters to guardian name of members of gym
    public void setMembershipNameOfTheMemberOfGym(String membershipNameOfTheMemberOfGym){
        this.membershipNameOfTheMemberOfGym = membershipNameOfTheMemberOfGym;
    }

    //implementing getters to date of member - gym
    public String getMembershipDateOfTheMemberOfGym(){
        return membershipDateOfTheMemberOfGym;
    }

    //implementing setters to guardian name of members of gym
    public void setMembershipDateOfTheMemberOfGym(String membershipDateOfTheMemberOfGym){
        this.membershipDateOfTheMemberOfGym = membershipDateOfTheMemberOfGym;
    }

    //implementing getters to telephone number of member - gym
    public String getTelephoneNumberOfTheMemberOfGym(){
        return telephoneNumberOfTheMemberOfGym;
    }

    //implementing setters to guardian name of members of gym
    public void setTelephoneNumberOfTheMemberOfGym(String telephoneNumberOfTheMemberOfGym){
        this.telephoneNumberOfTheMemberOfGym = telephoneNumberOfTheMemberOfGym;
    }

    //implementing getters to Membership email address of member - gym
    public String getEmailAddressOfTheMemberOfGym(){
        return emailAddressOfTheMemberOfGym;
    }

    //implementing setters to guardian name of members of gym
    public void setEmailAddressOfTheMemberOfGym(String emailAddressOfTheMemberOfGym){
        this.emailAddressOfTheMemberOfGym = emailAddressOfTheMemberOfGym;
    }

    //comparing and sorting member details
    @Override
    //default member - compare
    public int compareTo(DefaultMember o) {

        //sorting by membership name
    int memberComparingOfDbGym= membershipNameOfTheMemberOfGym.compareTo(o.membershipNameOfTheMemberOfGym);
        //memberComparingOfDbGym == 0
    if (memberComparingOfDbGym==0){

        memberComparingOfDbGym=Integer.compare(Integer.parseInt(o.membershipNoOfTheMemberOfGym),Integer.parseInt(membershipNoOfTheMemberOfGym));
    }
        //return value
        return memberComparingOfDbGym;
    }
}