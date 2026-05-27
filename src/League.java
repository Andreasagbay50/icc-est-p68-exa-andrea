import java.time.temporal.TemporalAccessor;
import java.util.Arrays;

public class League {
  private String name;
  private Team[] teams;

  public League(String name, Team[] teams) {
    this.name = name;
    this.teams = teams;

  }

  public int getTotalActiveGoals() {
    int contador = 0;
    for (Team n : teams) {
      for (Player goles : n.getPlayers()) {
        if (goles.isActive()) {
        }
        contador++;
      }

    }
    return contador;
  }

  public String getName() {
    return name;
  }

  public Team[] getTeams() {
    return teams;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTeams(Team[] teams) {
    this.teams = teams;
  }

  @Override
  public String toString() {
    return "League [name=" + name + ", teams=" + Arrays.toString(teams) + "]";
  }

}
