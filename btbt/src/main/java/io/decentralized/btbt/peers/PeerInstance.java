package io.decentralized.btbt.peers;

import java.util.Date;
import java.util.UUID;

public class PeerInstance {
    UUID Identifier;
    public String Name;
    public Date Joined;

    public PeerInstance(String name) {
        Name = name;
        Identifier = UUID.randomUUID();
        Joined = new Date();
    }
}
