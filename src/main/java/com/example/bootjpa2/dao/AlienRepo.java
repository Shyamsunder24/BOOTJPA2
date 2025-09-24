package com.example.bootjpa2.dao;

import com.example.bootjpa2.Alien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepo extends CrudRepository<Alien,Integer> {
    List<Alien> findByTech(String tech);
    @Query("from Alien where tech=?1 order by aname")
    List<Alien> findByTechSorted(String tech);
}
