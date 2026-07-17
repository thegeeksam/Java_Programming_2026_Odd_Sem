/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * It is a "has-a" relationship, but with a weaker ownership.
 * *
 * * In this example, we will create a simple aggregation
 * * between a Team and a Player. A Team has a Player, 
 * * but the Player can exist independently of the Team.
 * *
 * * Relationship:
 * * +------------+       has-a          +------------+
 * * |   Team     | -------------------> |  Player    |
 * * +------------+                      +------------+
 * * |  sTeamName |                      |  sName     |
 * * +------------+                      +------------+
 * * |  display() |                      
 * * +------------+  
 * *                       
 * @package II_Unit.Asso_Aggre_Comp
 * @author Dr. S. Sampath Kumar
 * @since 14-07-2026
 * @version 1.0
 */

package II_Unit.Asso_Aggre_Comp;

class Player {

    String sName;

    Player(String sName) {
        this.sName = sName;
    }
}

class Team {
    String sTeamName;

    // Stores Player as its state
    Player objPlayer;

    // Faculty reference is passed to the Department,
    // but the Department does not own the Faculty.
    Team(String sTeamName, Player objPlayer) {
        this.sTeamName = sTeamName;
        this.objPlayer = objPlayer;
    }

    void display() {
        System.out.println("Team Name: " + sTeamName);
        System.out.println("Player Name: " + objPlayer.sName);
    }
}

public class B_Aggregation {
    public static void main(String[] args) {
        // Player object is created independently
        Player objPlayer = new Player("Dhoni");

        // Existing Player object is passed to Team
        Team objTeam = new Team("Chennai Super Kings", objPlayer);

        objTeam.display();
    }
}