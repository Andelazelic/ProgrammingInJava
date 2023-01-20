package com.andelazelic.vjezba4.repositories;


import com.andelazelic.vjezba4.entitites.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;


public interface DataRepository extends JpaRepository<Data, Long> {

}
