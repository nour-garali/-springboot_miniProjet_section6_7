package com.nour.enseignant;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.nour.enseignant.entities.Enseignant;
import com.nour.enseignant.repos.EnseignantRepository;
import com.nour.enseignant.services.EnseignantService;


@SpringBootTest
class EnseignantApplicationTests {
	
	@Autowired
	private EnseignantRepository enseignantRepository;


	@Autowired
	private EnseignantService enseignantService;

	
	
	@Test
	public void testFindByNomEnseignant()
	{
	List<Enseignant> enseignants = enseignantRepository.findByNomEnseignant("alia");
	for (Enseignant p : enseignants)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testFindByNomEnseignantContains ()
	{
	List<Enseignant> enseignants=enseignantRepository.findByNomEnseignantContains("a");
	for (Enseignant p : enseignants)
	{
	System.out.println(p);
	} }
	
	
	
	@Test
	public void testFindByNomSalaire()
	{
	List<Enseignant> Enseignants = enseignantRepository.findByNomSalaire("rania", 1000.0);
	for (Enseignant p : Enseignants)
	{
	System.out.println(p);
	}
	}
	
	
	/*@Test
	public void testfindByUniversity()
	{
		University u = new University();
	u.setIdUniversity(2L);
	List<Enseignant> Enseignants = enseignantRepository.findByUniversity(u);
	for (Enseignant e : Enseignants)
	{
	System.out.println(e);
	}
	}
	*/
	
	
	
	/*
	@Test public void testFindByIdUniversity()
	{ List<Enseignant> Enseignants =enseignantRepository.findByIdUniversity(1L); 
	for (Enseignant e : Enseignants)
	{
		System.out.println(e); 
		} }
	 */
	
	/*
	@Test
	public void testFindByUniversity() {
	    List<Enseignant> enseignants = enseignantRepository.findByUniversity(1L);
	    for (Enseignant enseignant : enseignants) {
	        System.out.println(enseignant);
	    }
	}
*/
	
	
	
	
	/*@Test public void testFindByIdUniversity() 
	{ 
		List<Enseignant> Enseignants =enseignantRepository.findByIdUniversity(1L); 
		for (Enseignant e : Enseignants)
			  { System.out.println(e); } }
			 
	
	@Test public void testFindByOrderBynomEnseignantAsc() { List<Enseignant>
	  Enseignants = enseignantRepository.findByOrderBynomEnseignantAsc(); for
	  (Enseignant e : Enseignants) { System.out.println(e); } }
	 
	
	
	@Test public void testTrierEnseignantnomEsalaire() { List<Enseignant> prods =
			  enseignantRepository.trierEnseignantnomEsalaire(); for (Enseignant p : prods)
			  { System.out.println(p); } }*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @Test public void testFindByNomEnseignantContains () { List<Enseignant>
	 * enseignants=enseignantRepository.findByNomEnseignantContains("a"); for
	 * (Enseignant p : enseignants) { System.out.println(p); } }
	 * 
	 * @Test public void testFindByNomSalaire() { List<Enseignant> Enseignants =
	 * enseignantRepository.findByNomSalaire("rania", 1000.0); for (Enseignant p :
	 * Enseignants) { System.out.println(p); } }
	 * 
	 * 
	 * @Test public void testfindByUniversity() { University u = new University();
	 * u.setIdUniversity(1L); List<Enseignant> Enseignants =
	 * enseignantRepository.findByUniversity(u); for (Enseignant e : Enseignants) {
	 * System.out.println(e); } }
	 * 
	 * @Test public void testFindByIdUniversity() { List<Enseignant> Enseignants =
	 * enseignantRepository.findByIdUniversity(1L); for (Enseignant e : Enseignants)
	 * { System.out.println(e); } }
	 * 
	 * 
	 * 
	 * @Test public void testFindByOrderBynomEnseignantAsc() { List<Enseignant>
	 * Enseignants = enseignantRepository.findByOrderBynomEnseignantAsc(); for
	 * (Enseignant e : Enseignants) { System.out.println(e); } }
	 * 
	 * 
	 * 
	 * 
	 * @Test public void testTrierEnseignantnomEsalaire() { List<Enseignant> prods =
	 * enseignantRepository.trierEnseignantnomEsalaire(); for (Enseignant p : prods)
	 * { System.out.println(p); } }
	 * 
	 * 
	 * 
	 * 
	 */

}
