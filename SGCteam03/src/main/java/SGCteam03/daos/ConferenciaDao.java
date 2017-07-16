package SGCteam03.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import SGCteam03.models.Conferencia;

@Repository
public class ConferenciaDao
{

   @PersistenceContext
   private EntityManager manager;

   public List<Conferencia> all()
   {
      return manager.createQuery("select c from conferencia c", Conferencia.class).getResultList();
   }

   public void save(Conferencia conferencia)
   {
      manager.persist(conferencia);
   }

   public Conferencia findById(Integer id)
   {
      return manager.find(Conferencia.class, id);
   }

   public void remove(Conferencia conferencia)
   {
      manager.remove(conferencia);
   }

   public void update(Conferencia conferencia)
   {
      manager.merge(conferencia);
   }

}
