package org.tracker.activitytracker.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tracker.activitytracker.activity.repo.ActivityRepositoryImpl;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    ActivityRepositoryImpl repository;

    @RequestMapping("/health")
    @GetMapping
    public String checkHealth() {
        return "I'm alive";
    }


    @RequestMapping("/getActivityList")
    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public List<UserActivity> getActivityList() {
        return repository.fetchActivityList();
    }



    @RequestMapping("/saveActivity")
    @PostMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public UserActivity saveActivity(@RequestBody UserActivity userActivity) {
        return repository.save(userActivity);
    }


    @RequestMapping("/updateActivity/{id}")
    @PostMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public UserActivity updateActivity(@RequestBody UserActivity userActivity,@PathVariable int id) {
        return repository.updateActivity(userActivity, id);
    }


    @RequestMapping("/deleteActivity")
    @DeleteMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public void deleteActivity(@RequestParam int id) {
        repository.deleteActivityById(id);
    }


}
