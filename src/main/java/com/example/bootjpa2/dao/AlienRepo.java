package com.example.bootjpa2.dao;

import com.example.bootjpa2.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepo extends JpaRepository<Alien,Integer> {

}
