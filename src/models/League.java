package models;

public class League {
    private String name;
    private Team[] teams;

    public League(String name, Team[] teams) {
        this.name = name;
        this.teams = teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    /**
     * REQUERIMIENTO 1 (OBLIGATORIO): Implementar este metodo.
     *
     * Calcula y retorna el total de goles anotados unicamente por jugadores
     * con isActive = true, sumando todos los equipos de esta liga.
     *
     * Sin este metodo implementado correctamente el resto del examen no funcionara.
     *
     * @return suma de goles de todos los jugadores activos de todos los equipos
     */
    public int getTotalActiveGoals() {
        // TODO: Implementar
        return 0;
    }

    @Override
    public String toString() {
        return "Liga: " + name + " | Goles activos totales: " + getTotalActiveGoals();
    }
}
