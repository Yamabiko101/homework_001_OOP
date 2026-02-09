package homework001.exercises.bookstore;

public class Author {

    private String name;
    private String email;    
    private char gender;

    public Author(){}

    public Author (String name, String email, char gender){
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        if (gender != 'M' && gender != 'F') {
            throw new IllegalArgumentException("Gender must be M or F");
        }
    this.name = name;
    this.email = email;
    this.gender = gender;
    }

    public String getName (){
    return name;
    }

    public String getEmail (){
    return email;
     }

    public void setEmail (String email){
        this.email = email;
    }

    public char getGender (){
        return gender;
    }

    public void setGender (char gender){
        this.gender = gender;
    }

    public String toString (){
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}


