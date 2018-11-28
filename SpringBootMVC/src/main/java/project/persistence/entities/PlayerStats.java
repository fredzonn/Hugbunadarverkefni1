package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "PlayerStats")
public class PlayerStats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long playerId;
    private Long points;
    private Long rebounds;
    private Long assists;
    private Long turnovers;
    private Long blocks;
    private Long fouls;
    private Long threePointHit;
    private Long threePointMiss;
    private Long freeThrowHit;
    private Long freeThrowMiss;
    private String twoPointer;
    private String threePointer;
    private String freeThrow;


    public PlayerStats() {
    }

    public PlayerStats(Long id, Long playerId, Long points, Long rebounds, Long assists, Long turnovers, Long blocks, Long fouls, Long threePointHit, Long threePointMiss, Long freeThrowHit, Long freeThrowMiss, String twoPointer, String threePointer, String freeThrow) {
        this.id = id;
        this.playerId = playerId;
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
        this.turnovers = turnovers;
        this.blocks = blocks;
        this.fouls = fouls;
        this.threePointHit = threePointHit;
        this.threePointMiss = threePointMiss;
        this.freeThrowHit = freeThrowHit;
        this.freeThrowMiss = freeThrowMiss;
        this.twoPointer = twoPointer;
        this.threePointer = threePointer;
        this.freeThrow = freeThrow;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Long getPoints() {
        return points != null ? points:0;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public Long getRebounds() {
        return rebounds != null ? rebounds:0;

    }

    public void setRebounds(Long rebounds) {
        this.rebounds = rebounds;
    }

    public Long getAssists() {
        return assists != null ? assists:0;

    }

    public void setAssists(Long assists) {
        this.assists = assists;
    }

    public Long getTurnovers() {
        return turnovers != null ? turnovers:0;

    }

    public void setTurnovers(Long turnovers) {
        this.turnovers = turnovers;
    }

    public Long getBlocks() {
        return blocks != null ? blocks:0;

    }

    public void setBlocks(Long blocks) {
        this.blocks = blocks;
    }

    public Long getFouls() {
        return fouls != null ? fouls:0;

    }

    public void setFouls(Long fouls) {
        this.fouls = fouls;
    }


    public String getTwoPointer() {
        return twoPointer;
    }

    public void setTwoPointer(String twoPointer) {
        this.twoPointer = twoPointer;
    }

    public String getThreePointer() {
        return threePointer;
    }

    public void setThreePointer(String threePointer) {
        this.threePointer = threePointer;
    }

    public String getFreeThrow() {
        return freeThrow;
    }

    public void setFreeThrow(String freeThrow) {
        this.freeThrow = freeThrow;
    }

    public Long getThreePointHit() {
        return threePointHit != null ? threePointHit:0;


    }

    public void setThreePointHit(Long threePointHit) {
        this.threePointHit = threePointHit;
    }

    public Long getThreePointMiss() {

        return threePointMiss != null ? threePointMiss:0;
    }


    public void setThreePointMiss(Long threePointMiss) {
        this.threePointMiss = threePointMiss;
    }

    public Long getFreeThrowHit() {
        return freeThrowHit != null ? freeThrowHit:0;
    }

    public void setFreeThrowHit(Long freeThrowHit) {
        this.freeThrowHit = freeThrowHit;
    }

    public Long getFreeThrowMiss() {
        return freeThrowMiss != null ? freeThrowMiss:0;
    }

    public void setFreeThrowMiss(Long freeThrowMiss) {
        this.freeThrowMiss = freeThrowMiss;
    }
}
