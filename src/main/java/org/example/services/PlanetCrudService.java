package org.example.services;

import org.example.entities.Planet;

import java.util.List;

public interface PlanetCrudService {
    Planet createPlanet(Planet planet);
    Planet updatePlanet(Planet planet);
    List<Planet> getAllPlanets();
    Planet getPlanetById(Long planetId);
    void deletePlanetById(Long planetId);
}
