package org.example.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 200, nullable = false)
    private  String name;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                '}';
    }
}
