package uk.co.keybound.quizgame;

/**
 * Created by MOS14206603 on 23/04/2016.
 * Person Object
 */
public class Person {
    //Private variables
        private String email;
        private String password;
        private String forename;
        private String surname;

    //get and setters, will check incoming data for impurities
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) { if(email.contains("@")) this.email = email;}

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) { if(password.matches("^(?=.*[A-Z])(?=.*[0-9])[A-Z0-9]+$")) this.password = password;}

        public String getForename() {
            return forename;
        }

        public void setForename(String forename) {
            if(!forename.equals("")) this.forename = forename;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            if(!surname.equals("")) this.surname = surname;
        }
        Person() {
            setForename("dftName");
            setSurname("dftSurname");
            setEmail("dftEmail@Email.com");
            setPassword("DftPassword123#!");
        }
        Person(String newF,String newS, String newE, String newP) {
            setForename(newF);
            setSurname(newS);
            setEmail(newE);
            setPassword(newP);
        }
}
