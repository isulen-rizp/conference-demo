package com.pluralsight.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity(name = "sessions")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "session_id")
    private Long session_id;
    private String session_name;
    private String session_description;
    private Integer session_length;

    @ManyToMany
    @JoinTable(
            name = "session_speakers",
            joinColumns = @JoinColumn(name = "session_id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id")
    )
    private List<Speaker> speakers;

    public Session() {

    }
}
