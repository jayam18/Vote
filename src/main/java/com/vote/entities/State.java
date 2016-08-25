package com.vote.entities;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;

@Entity
@Table(name="states")
@Data

public class State {
    @Id
    @GeneratedValue
    private int id;
    @Version
    private int version;
    @Column(name = "electoral_votes", nullable = false)
    private int electoralVotes;
    @Column(nullable = false)
    private String state;




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

    public int getElectoralVotes() {
        return electoralVotes;
    }

    public void setElectoralVotes(int electoralVotes) {
        this.electoralVotes = electoralVotes;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
