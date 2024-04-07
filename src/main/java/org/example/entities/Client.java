package org.example.entities;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

@Getter
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @Length(min = 3, max = 200, message = "Client's name must be between 3 and 200 characters")
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
