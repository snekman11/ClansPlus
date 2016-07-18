package com.perkelle.dev.clansplus.abstractobs;

import com.perkelle.dev.clansplus.enums.Rank;

import java.util.Map;

public class CClan {

    private final String name;
    private Map<CPlayer, Rank> members;
    private boolean inviteOnly;

    public CClan(String name, Map<CPlayer, Rank> members, boolean inviteOnly) {
        this.name = name;
        this.members = members;
        this.inviteOnly = inviteOnly;
    }

    public String getName() { return name; }
    public Map<CPlayer, Rank> getMembers() { return members; }
    public boolean getInviteOnly() { return inviteOnly; }

    public void setMembers(Map<CPlayer, Rank> members) { this.members = members; }
    public void setInviteOnly(boolean inviteOnly) { this.inviteOnly = inviteOnly; }

    public void addMember(CPlayer p, Rank rank) { members.put(p, rank); }
    public void removeMember(CPlayer p) { members.remove(p); }
}
