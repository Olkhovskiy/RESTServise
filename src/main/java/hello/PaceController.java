package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaceController {

    @RequestMapping("/pace")
    public Pace getPace(@RequestParam(defaultValue = "1") double distance,
                        @RequestParam(defaultValue = "0") int hours,
                        @RequestParam(defaultValue = "0") int minute
    ) {
        return new Pace(distance, hours, minute);
    }
}