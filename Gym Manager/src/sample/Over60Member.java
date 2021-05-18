package sample;

public class Over60Member extends DefaultMember{
    private int memberAgeAbove60OfGym;
    private String memberRelativeAbove60OfGym;

    public Over60Member(String membershipNoOfTheMemberOfGym, String membershipNameOfTheMemberOfGym, String membershipDateOfTheMemberOfGym, String telephoneNumberOfTheMemberOfGym, String emailAddressOfTheMemberOfGym, int memberAgeAbove60OfGym, String memberRelativeAbove60OfGym) {
        //variables from super class (DefaultMember)
        super(membershipNoOfTheMemberOfGym, membershipNameOfTheMemberOfGym, membershipDateOfTheMemberOfGym,telephoneNumberOfTheMemberOfGym,emailAddressOfTheMemberOfGym);

        //age of the adult member - gym
        this.memberAgeAbove60OfGym =memberAgeAbove60OfGym;

        //relative name of the student member - gym
        this.memberRelativeAbove60OfGym =memberRelativeAbove60OfGym;
    }


    //implementing getters to member age above 60
    public int getMemberAgeAbove60OfGym(){
        return memberAgeAbove60OfGym;
    }



    //implementing setters to member age above 60
    public void setMemberAgeAbove60OfGym(int memberAgeAbove60OfGym) {
        //validating age is over 60 or below 60
        if (memberAgeAbove60OfGym >= 60) {
            this.memberAgeAbove60OfGym = memberAgeAbove60OfGym;
        } else {
            //massage when wrong input of age
            throw new IllegalArgumentException("Invalid age. Please enter an valid age for over 60 member.");
        }
    }

    //implementing getters to member relatives above 60
    public String getMemberRelativeAbove60OfGym(){
        return memberRelativeAbove60OfGym;
    }

    //implementing setters to member relatives above 60
    public void setMemberRelativeAbove60OfGym(String memberRelativeAbove60OfGym){
        this.memberRelativeAbove60OfGym=memberRelativeAbove60OfGym;
    }
}