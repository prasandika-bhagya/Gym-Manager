package sample;

public class StudentMember extends DefaultMember{
    //string for student member's school name - gym
    private String schoolNameOfStudentMembersOfGym;

    //string for student member's guardian name - gym
    private String guardianNameOfStudentMembersOfGym;

    public StudentMember(String membershipNoOfTheMemberOfGym,String membershipNameOfTheMemberOfGym,String membershipDateOfTheMemberOfGym,String  telephoneNumberOfTheMemberOfGym, String emailAddressOfTheMemberOfGym, String schoolNameOfStudentMembersOfGym,String guardianNameOfStudentMembersOfGym) {
        //variables from super class (DefaultMember)
        super(membershipNoOfTheMemberOfGym, membershipNameOfTheMemberOfGym, membershipDateOfTheMemberOfGym,telephoneNumberOfTheMemberOfGym,emailAddressOfTheMemberOfGym);

        //school name of the student member - gym
        this.schoolNameOfStudentMembersOfGym =schoolNameOfStudentMembersOfGym;

        //guardian name of the student member - gym
        this.guardianNameOfStudentMembersOfGym =guardianNameOfStudentMembersOfGym;
    }



    //implementing getters to school name of student members of gym
    public String getSchoolNameOfStudentMembersOfGym(){
        return schoolNameOfStudentMembersOfGym;
    }

    //implementing setters to guardian name of student members of gym
    public void setSchoolNameOfStudentMembersOfGym(String schoolNameOfStudentMembersOfGym){
        this.schoolNameOfStudentMembersOfGym=schoolNameOfStudentMembersOfGym;
    }

    //implementing getters to guardian name of student members of gym
    public String getGuardianNameOfStudentMembersOfGym(){
        return guardianNameOfStudentMembersOfGym;
    }

    //implementing setters to guardian name of student members of gym
    public void setGuardianNameOfStudentMembersOfGym(String guardianNameOfStudentMembersOfGym){
        this.guardianNameOfStudentMembersOfGym=guardianNameOfStudentMembersOfGym;
    }

}

