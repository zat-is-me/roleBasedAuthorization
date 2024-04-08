package com.tatek.roleBasedAuthorization.repositories;

import com.tatek.roleBasedAuthorization.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {
}
