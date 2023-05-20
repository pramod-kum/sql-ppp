package com.geekster.Gulshan.repository;

import com.geekster.Gulshan.mode.Userss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<Userss, Integer> {
}
