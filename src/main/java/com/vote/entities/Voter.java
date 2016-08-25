package com.vote.entities;


import com.vote.enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "voters")
//@Data
public class Voter {
    @Id
    @GeneratedValue

    private int id;
    @Version
    private int version;
    @Column(nullable=false)
    private String name;
    @Column(nullable=false)
    private  int age;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('M', 'F')")
    private Gender gender;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name="candidates_voters", joinColumns = @JoinColumn(name="voter_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name="candidate_id", referencedColumnName = "id"))
//
//    private List<Candidate> candidates;
//    public List<Candidate> getCandidates() {
//        return candidates;
//    }
//
//    public void setCandidates(List<Candidate> candidates) {
//        this.candidates = candidates;
//    }
//



    public Voter() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
