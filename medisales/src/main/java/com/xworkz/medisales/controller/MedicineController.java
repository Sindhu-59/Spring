package com.xworkz.medisales.controller;

import com.xworkz.medisales.service.MedicineService;
import com.xworkz.medisales.dto.MediSalesDTO;
import com.xworkz.medisales.utility.NumberValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Component
@RequestMapping("/")
public class MedicineController {
    @Autowired
    MedicineService service;

    public MedicineController() {
        System.out.println("MedicineController object is created");
    }

    @PostMapping("/addMedicine")
    public String addMedicine(MediSalesDTO dto) {

        boolean medicineStored = service.validateAndSave(dto);
        return medicineStored ? "error" : "response";
    }


//    @GetMapping("search")
//    public String searchByName(@RequestParam("medicineName")String medicineName, Model model) throws Exception {
//
//        Optional<MediSalesDTO> dto = service.getMedicineName(medicineName);
//        System.out.println(dto);
//        model.addAttribute("dto", dto.get());
//
//        return "search";
//    }
    @GetMapping("/getMedicine")
    public String getMedicine(@RequestParam("medicineId") int medicineId, Model model) {

        Optional<MediSalesDTO> dto = service.getMedicineId(medicineId);

        if (dto.isPresent()) {
            model.addAttribute("medicine", dto.get());
        } else {
            model.addAttribute("error", "Medicine not found");
        }

        return "searchById";
    }


    @GetMapping("/getMedicineInfo/{medicineId}")
    public String getMedicineInfo(@PathVariable("medicineId")String medicineId, Model model)throws Exception {

        Optional<MediSalesDTO> dto1 = service.getMedicineId(NumberValidation.parseIntSafe(medicineId));
        System.out.println(dto1);
        model.addAttribute("medicineById", dto1.get());
        return "update";
    }


        @PostMapping("/updateMedicine")
    public String updateMedicine(MediSalesDTO dto,Model model){
        boolean medicine=service.updateMedicine(dto);
        if(true){

            model.addAttribute("successMessage","Data updated successfully");
        }
        else{
            model.addAttribute("errorMessage","Please try again");
        }
        return "update";
        }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable ("id")int id, Model model) {

        boolean deleted = service.delete(id);

        if (deleted) {
            model.addAttribute("msg", " deleted successfully");
        } else {
            model.addAttribute("msg", "not found");
        }

        return "deleteResponse";
    }
    }

