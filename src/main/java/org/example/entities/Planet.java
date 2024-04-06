package org.example.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "planet")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 500, nullable = false)
    private  String name;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planet { " +
                "id = " + id +
                ", name = '" + name + '\'' +
                '}';
    }
}
