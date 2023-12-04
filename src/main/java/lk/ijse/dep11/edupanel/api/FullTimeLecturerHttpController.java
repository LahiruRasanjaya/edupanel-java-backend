package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lecturers/full-time")
@CrossOrigin
public class FullTimeLecturerHttpController {
    @PatchMapping("/rank")
    public void arrangeFullTimeLecturersOrder(){
        System.out.println("arrangeFullTimeLecturersOrder()");
    }
    @GetMapping
    public void getFullTimeLecturers(){
        System.out.println("getFullTimeLecturers()");

    }
}
