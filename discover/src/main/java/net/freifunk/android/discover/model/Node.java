/*
 * Node.java
 *
 * Copyright (C) 2014  Philipp Dreimann
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 */

package net.freifunk.android.discover.model;

import com.google.android.gms.maps.model.LatLng;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.maps.android.clustering.ClusterItem;
/**
 * Created by pd on 31.03.14.
 */
public class Node implements ClusterItem {

    public static final Set<Node> nodes = Collections.synchronizedSet(new HashSet<Node>());


    private List<String> macs;
    private String name;
    private String firmware;
    private Map<String, String> flags;
    private LatLng geo;
    private String id;

    public Node(List<String> macs, String name, String firmware, Map<String, String> flags, LatLng geo, String id) {
        this.macs = macs;
        this.name = name;
        this.firmware = firmware;
        this.flags = flags;
        this.geo = geo;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Node{" +
                "macs=" + macs +
                ", name='" + name + '\'' +
                ", firmware='" + firmware + '\'' +
                ", flags=" + flags +
                ", geo=" + geo +
                ", id='" + id + '\'' +
                '}';
    }
    @Override
    public LatLng getPosition() { return geo; }

    public List<String> getMacs() {
        return macs;
    }

    public void setMacs(List<String> macs) {
        this.macs = macs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public Map<String, String> getFlags() {
        return flags;
    }

    public void setFlags(Map<String, String> flags) {
        this.flags = flags;
    }

    public LatLng getGeo() {
        return geo;
    }

    public void setGeo(LatLng geo) {
        this.geo = geo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
