/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.eventmanagementsystem.repository;

import com.example.eventmanagementsystem.model.Event;
import com.example.eventmanagementsystem.model.Sponsor;

import java.util.ArrayList;
import java.util.List;

public interface SponsorRepository {
    public ArrayList<Sponsor> getSponsors();

    public Sponsor getSponsorById(int SponsorId);

    public Sponsor addSponsor(Sponsor sponsor);

    public Sponsor updateSponsor(int sponsorId, Sponsor sponsor);

    void deleteSponsor(int sponsorId);

    public List<Event> getSponsorEvent(int sponsorId);

}
