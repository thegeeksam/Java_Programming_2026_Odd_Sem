package IV_Unit.ExceptionHandling;

public class User {
    private String name;
    private String mailId;
    private Integer age;

    public User(String name, String mailId, Integer age) {
        this.name = name;
        this.mailId = mailId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
