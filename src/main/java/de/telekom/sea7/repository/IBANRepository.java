package de.telekom.sea7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.telekom.sea7.entity.EntityIBAN;
import de.telekom.sea7.entity.EntityZahlungen;  


@Repository
public interface IBANRepository extends JpaRepository<EntityIBAN, Long> {

}













