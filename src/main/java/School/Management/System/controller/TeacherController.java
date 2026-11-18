package School.Management.System.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/teacher")
public class TeacherController {

    @GetMapping("")
    public String a() {
        return "AAA";
    }


}
