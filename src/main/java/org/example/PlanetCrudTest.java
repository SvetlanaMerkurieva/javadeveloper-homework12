package org.example;

import org.example.config.DatabaseMigration;
import org.example.entities.Planet;
import org.example.hibernate.HibernateUtils;
import org.example.services.PlanetCrudServiceImpl;
import org.hibernate.Session;

import java.util.List;

public class PlanetCrudTest {
    public static void main(String[] args) {
        new DatabaseMigration().startMigration();
        Session session = HibernateUtils.getInstance().getSessionFactory().openSession();

        System.out.println("Існуючи планети в таблиці Planet:");

        List<Planet> planets = session.createQuery("from Planet", Planet.class).list();
        planets.forEach(planet -> System.out.println(planet.toString() + " "));

        PlanetCrudServiceImpl planetsTable = new PlanetCrudServiceImpl();

        System.out.println("Відкрився рейс ще на одну планету - Венеру");
        Planet newPlanet = new Planet();
        newPlanet.setName("Venera");
        planetsTable.createPlanet(newPlanet);
        System.out.println(newPlanet);

        System.out.println("Планета з id = 4: ");
        Planet planetById = planetsTable.getPlanetById(4L);
        System.out.println(planetById);


        System.out.println("Рейс на планету Сатурн перенаправлено на Нептун");
        planetById.setName("Neptun");
        planetsTable.updatePlanet(planetById);
        System.out.println(planetById);

        System.out.println("Рейси на і з планети з id = 1 (Марс) скасовано");
        planetsTable.deletePlanetById(1L);

        System.out.println("Оновлена таблиця планет: ");
        List<Planet> planetsAll = planetsTable.getAllPlanets();
        planetsAll.forEach(client -> System.out.println(client.toString() + " "));

        session.close();
    }
}

