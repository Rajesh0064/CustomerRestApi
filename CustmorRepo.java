package com.Web.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Web.model.Custmer;
@Repository
public interface CustmorRepo extends JpaRepository<Custmer, Integer> {

}
