package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaceController {

    @RequestMapping("/pace")
    public Pace getPace(@RequestParam double distance,
                         @RequestParam int hours,
                         @RequestParam int minute
                         ) {


        return new Pace(distance,hours,minute);
        //return new Pace(distance);
    }
}