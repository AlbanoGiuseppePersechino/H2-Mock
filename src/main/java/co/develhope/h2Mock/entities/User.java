package co.develhope.h2Mock.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "firstName", nullable = false)
    private String fristName;

    @Column(name = "lastName", nullable = false)
    private String lasttName;

    public User() {
    }

    public User(Integer id, String fristName, String lasttName) {
        this.id = id;
        this.fristName = fristName;
        this.lasttName = lasttName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }
}
