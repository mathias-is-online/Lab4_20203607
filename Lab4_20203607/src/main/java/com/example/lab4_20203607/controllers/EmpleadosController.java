package com.example.lab4_20203607.controllers;

import com.example.lab4_20203607.entity.Department;
import com.example.lab4_20203607.entity.Empleados;
import com.example.lab4_20203607.entity.Jobs;
import com.example.lab4_20203607.entity.Locations;
import com.example.lab4_20203607.repositories.DepartmentRepository;
import com.example.lab4_20203607.repositories.EmpleadosRepository;
import com.example.lab4_20203607.repositories.JobsRepository;
import com.example.lab4_20203607.repositories.LocationsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/empleados")
public class EmpleadosController {



    final EmpleadosRepository empleadosRepository;
    final JobsRepository jobsRepository;
    final DepartmentRepository departmentRepository;
    final LocationsRepository locationsRepository;

    public EmpleadosController(EmpleadosRepository empleadosRepository,JobsRepository jobsRepository,DepartmentRepository departmentRepository, LocationsRepository locationsRepository) {
        this.empleadosRepository = empleadosRepository;
        this.jobsRepository = jobsRepository;
        this.departmentRepository = departmentRepository;
        this.locationsRepository = locationsRepository;
    }


    @GetMapping(value = {"/list", ""})
    public String listarTransportistas(Model model) {

        List<Empleados> lista = empleadosRepository.findAll();
        model.addAttribute("empleadosList", lista);

        List<Department> listadepartamentos = departmentRepository.findAll();
        model.addAttribute("listadepartamentos", listadepartamentos);

        List<Locations> listaciudad = locationsRepository.findAll();
        model.addAttribute("listaciudad", listaciudad);

        List<Jobs> listajobs = jobsRepository.findAll();
        model.addAttribute("listajobs", listajobs);

        return "empleados/list";
    }

    /*

    @GetMapping("/new")
    public String nuevoTransportistaFrm() {
        return "shipper/newFrm";
    }

    @PostMapping("/save")
    public String guardarNuevoTransportista(Shipper shipper, RedirectAttributes attr) {
        shipperRepository.save(shipper);
        return "redirect:/shipper/list";
    }

    @GetMapping("/edit")
    public String editarTransportista(Model model,
                                      @RequestParam("id") int id) {

        Optional<Shipper> optShipper = shipperRepository.findById(id);

        if (optShipper.isPresent()) {
            Shipper shipper = optShipper.get();
            model.addAttribute("shipper", shipper);
            return "shipper/editFrm";
        } else {
            return "redirect:/shipper/list";
        }
    }

    @GetMapping("/delete")
    public String borrarTransportista(Model model,
                                      @RequestParam("id") int id,
                                      RedirectAttributes attr) {

        Optional<Shipper> optShipper = shipperRepository.findById(id);

        if (optShipper.isPresent()) {
            shipperRepository.deleteById(id);
        }
        return "redirect:/shipper/list";

    }

    @PostMapping("/BuscarTransportistas")
    public String buscarTransportista(@RequestParam("searchField") String searchField,
                                      Model model) {

        List<Shipper> listaTransportistas = shipperRepository.buscarTransPorCompName(searchField);
        model.addAttribute("shipperList", listaTransportistas);

        return "shipper/list";
    }

     */


}
