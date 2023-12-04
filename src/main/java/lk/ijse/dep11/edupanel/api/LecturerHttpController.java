package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lecturers")
@CrossOrigin
public class LecturerHttpController {
    @PostMapping
    public void createNewLecturer(){

    }
    @PatchMapping("/{lecturer-id}")
    public void updateLecturerDetails(){

    }
    @DeleteMapping("{lecturer-id}")
    public void deleteLecturer(){

    }
    @GetMapping
    public void getAllLecturers(){

    }
}
