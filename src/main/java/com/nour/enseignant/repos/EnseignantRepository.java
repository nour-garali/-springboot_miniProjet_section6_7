package com.nour.enseignant.repos;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nour.enseignant.entities.Enseignant;
import com.nour.enseignant.entities.University;
public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
	
	List<Enseignant> findByNomEnseignant(String nom);
	List<Enseignant> findByNomEnseignantContains(String nom);
	
	@Query("select e from Enseignant e where e.nomEnseignant like %:nom and e.salaire > :salaire")
	List<Enseignant> findByNomSalaire (@Param("nom") String nom,@Param("salaire") Double salaire);
	
	//@Query("select e from Enseignant e where e.Unv = ?1")
	//List<Enseignant> findByUniversity (University university);

	
	
	@Query("SELECT e FROM Enseignant e WHERE e.Unv.idUniversity = :idUniversity")
	List<Enseignant> findByUniversity(@Param("idUniversity") University university);
	
	List<Enseignant> findByIdUniversity(Long idUniversity);

	
	
	
	
	
	
	
	List<Enseignant> findByOrderBynomEnseignantAsc();
	
	@Query("select e from Enseignant p order by e.nomEnseignant ASC, e.salaire DESC")
	List<Enseignant> trierEnseignantnomEsalaire ();
}


