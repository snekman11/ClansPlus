package com.perkelle.dev.clansplus.abstractobs;

public class CPlayer {

    private CClan clan;
    private double influence;
    private double maxInfluence;

    public CPlayer(CClan clan, double influence, double maxInfluence) {
        this.clan = clan;
        this.influence = influence;
        this.maxInfluence = maxInfluence;
    }

    public CClan getClan() { return clan; }
    public double getInfluence() { return influence; }
    public double getMaxInfluence() { return maxInfluence; }

    public void setClan(CClan clan) { this.clan = clan; }
    public void setInfluence(double influence) { this.influence = influence; }
    public void setMaxInfluence(double maxInfluence) { this.maxInfluence = maxInfluence; }
}
