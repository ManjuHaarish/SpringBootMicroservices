package org.tracker.activitytracker.activity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @RequestMapping("/health")
    @GetMapping
    public String checkHealth(){
        return "I'm alive";
    }

    @RequestMapping("/saveActivity")
    @PostMapping
    public ActivityModel saveActivity(@RequestBody ActivityModel activityModel){
            return activityModel;
    }
}
