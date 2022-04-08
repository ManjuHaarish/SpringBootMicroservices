package org.tracker.activitytracker.activity.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tracker.activitytracker.activity.UserActivity;

import java.util.List;

@Service
public class ActivityRepositoryImpl implements ActivityRepository {

    @Autowired
    ActivityJPARepository activityRepository;

    public UserActivity save(UserActivity userActivity){
        System.out.println("Userdetails---->"+ userActivity.getId()+userActivity.getDescription()+userActivity.getName());
        return  activityRepository.save(userActivity);
    }


    public List<UserActivity>  fetchActivityList(){
        return  activityRepository.findAll();
    }

}
