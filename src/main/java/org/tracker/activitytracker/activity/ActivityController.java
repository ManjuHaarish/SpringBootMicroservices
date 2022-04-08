package org.tracker.activitytracker.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tracker.activitytracker.activity.repo.ActivityRepositoryImpl;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    ActivityRepositoryImpl repository;

    @RequestMapping("/health")
    @GetMapping
    public String checkHealth(){
        return "I'm alive";
    }

    @RequestMapping("/saveActivity")
    @PostMapping
    public UserActivity saveActivity(@RequestBody UserActivity userActivity){
        return repository.save(userActivity);
    }
}
