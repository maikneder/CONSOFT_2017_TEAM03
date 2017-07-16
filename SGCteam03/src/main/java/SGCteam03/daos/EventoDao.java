package SGCteam03.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import SGCteam03.models.Evento;

@Repository
public class EventoDao
{

   @PersistenceContext
   private EntityManager manager;

   public List<Evento> all()
   {
      return manager.createQuery("select c from Evento c", Evento.class).getResultList();
   }

   public void save(Evento evento)
   {
      manager.persist(evento);
   }

   public Evento findById(Integer id)
   {
      return manager.find(Evento.class, id);
   }

   public void remove(Evento evento)
   {
      manager.remove(evento);
   }


}