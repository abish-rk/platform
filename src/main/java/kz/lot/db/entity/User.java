package kz.lot.db.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    private Long id;
    private String login;
    private String firstName;
    private String lastName;

    @Id
    @GeneratedValue(generator = "user_gen")
    @SequenceGenerator(name = "user_gen", sequenceName = "user_seq")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
