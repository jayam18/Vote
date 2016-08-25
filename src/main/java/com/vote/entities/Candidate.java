package com.vote.entities;

import com.vote.enums.Position;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "candidates")
@Data
public class Candidate {
    @Id
    @GeneratedValue
    private int id;
    @Version
    private int version;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String party;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('PRESIDENT', 'GOVERNOR', 'SENATOR')")
    private Position position;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "state_id")
    private State state;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="candidates_voters", joinColumns = @JoinColumn(name="candidate_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name="voter_id", referencedColumnName = "id"))
    private List<Voter> voters;

    public List<Voter> getVoters() {
        return voters;
    }

    public void setVoters(List<Voter> voters) {
        this.voters = voters;
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

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
