package com.pl.premier.stats.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_stats")
public class player {
    @Id
    @Column(name = "name", unique = true)
    private String name;
    private String team;
    private String nation;
    private String position;
    private Integer age;
    private Integer starts;
    private Integer minutes;
    private Integer goals;
    private Integer assists;
    private Integer g_a;
    private Integer pk_scored;
    private Integer pk_att;
    private Double xg;
    private Double x_ag;
    private Integer yellow_cards;
    private Integer red_cards;

    public player() {
    }

    public player(String name, String team, String nation, String position, Integer age, Integer starts, Integer minutes, Integer goals, Integer assists, Integer g_a, Integer pk_scored, Integer pk_att, Double xg, Double x_ag, Integer yellow_cards, Integer red_cards) {
        this.name = name;
        this.team = team;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.starts = starts;
        this.minutes = minutes;
        this.goals = goals;
        this.assists = assists;
        this.g_a = g_a;
        this.pk_scored = pk_scored;
        this.pk_att = pk_att;
        this.xg = xg;
        this.x_ag = x_ag;
        this.yellow_cards = yellow_cards;
        this.red_cards = red_cards;
    }

    public player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getG_a() {
        return g_a;
    }

    public void setG_a(Integer g_a) {
        this.g_a = g_a;
    }

    public Integer getPk_scored() {
        return pk_scored;
    }

    public void setPk_scored(Integer pk_scored) {
        this.pk_scored = pk_scored;
    }

    public Integer getPk_att() {
        return pk_att;
    }

    public void setPk_att(Integer pk_att) {
        this.pk_att = pk_att;
    }

    public Double getXg() {
        return xg;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    public Double getX_ag() {
        return x_ag;
    }

    public void setX_ag(Double x_ag) {
        this.x_ag = x_ag;
    }

    public Integer getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(Integer yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public Integer getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(Integer red_cards) {
        this.red_cards = red_cards;
    }
}

