package dev.taskorganizerbackend;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="tasks")
@ToString
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    @Getter
    @Setter
    private String title;

    @Column(name = "description")
    @Getter
    @Setter
    private String description;

    @Column(name = "status")
    @Setter
    @Getter
    private boolean status;

    public Task(String title, String description, boolean status ){
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public Task() {

    }
}
