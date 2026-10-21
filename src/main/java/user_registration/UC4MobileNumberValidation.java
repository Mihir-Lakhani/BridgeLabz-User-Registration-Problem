package user_registration;


class UC4MobileNumberValidation {

    boolean UC3MobileNumberValidation(String phone){
        return phone!=null &&
                phone.matches("91 [6-9][0-9]{9}");
    }

}
