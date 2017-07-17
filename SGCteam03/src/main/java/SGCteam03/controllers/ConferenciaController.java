package SGCteam03.controllers;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import SGCteam03.daos.ConferenciaDao;
import SGCteam03.models.Conferencia;

@Controller
@RequestMapping("/conferencia")
@Transactional
public class ConferenciaController
{

   @Autowired
   private ConferenciaDao conferenciaDao;

   @GetMapping("/form")
   public ModelAndView form(Conferencia conferencia)
   {
      ModelAndView modelAndView = new ModelAndView("category/form-add");
      return modelAndView;

   }

   @PostMapping
   public ModelAndView save(@Valid Conferencia conferencia, BindingResult bindingResult)
   {
      if (bindingResult.hasErrors())
      {
         return form(conferencia);
      }
      conferenciaDao.save(conferencia);
      return new ModelAndView("redirect:/category");
   }

   @GetMapping("/{id}")
   public ModelAndView load(@PathVariable("id") Integer id)
   {
      ModelAndView modelAndView = new ModelAndView("category/form-update");
      modelAndView.addObject("category", conferenciaDao.findById(id));
      return modelAndView;
   }
/*
   @GetMapping
   public ModelAndView list(@RequestParam(defaultValue = "0", required = false) int page)
   {
      ModelAndView modelAndView = new ModelAndView("conferencia/list");
      modelAndView.addObject("paginatedList", conferenciaDao.paginated(page, 10));
      return modelAndView;
   }*/

   //just because get is easier here. Be my guest if you want to change.
   @GetMapping("/remove/{id}")
   public String remove(@PathVariable("id") Integer id)
   {
	   Conferencia conferencia = conferenciaDao.findById(id);
      conferenciaDao.remove(conferencia);
      return "redirect:/category";
   }

   @PostMapping("/{id}")
   public ModelAndView update(@PathVariable("id") Integer id, @Valid Conferencia conferencia, BindingResult bindingResult)
   {
	  conferencia.setIdconferencia(id);
      if (bindingResult.hasErrors())
      {
         return new ModelAndView("category/form-update");
      }
      conferenciaDao.update(conferencia);
      return new ModelAndView("redirect:/category");
   }
}
