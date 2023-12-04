package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lecturers/part-time")
@CrossOrigin
public class PartTimeLecturerHttpController {
    @PatchMapping("/rank")
    public void arrangePartTimeLecturersOrder(){

    }
    @GetMapping
    public void getPartTimeLecturers(){

    }
}
