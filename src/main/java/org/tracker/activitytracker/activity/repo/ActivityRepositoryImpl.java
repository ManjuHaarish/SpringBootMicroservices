package org.tracker.activitytracker.activity.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tracker.activitytracker.activity.UserActivity;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ActivityRepositoryImpl implements ActivityRepository {

    private Logger log = Logger.getLogger(ActivityRepository.class.getName());

    @Autowired
    ActivityJPARepository activityRepository;

    public UserActivity save(UserActivity userActivity){
        log.log(Level.FINE,"Userdetails : Description : " +userActivity.getDescription()+"  Name : " +userActivity.getTitle());
        return  activityRepository.save(userActivity);
    }


    public List<UserActivity>  fetchActivityList(){
        return  activityRepository.findAll();
    }

    @Override
    public UserActivity updateActivity(UserActivity userActivity, int userId) {
        UserActivity activity =  activityRepository.findById(userId).get();
        if(activity!=null && activity.getTitle()!=null){
            activity.setTitle(userActivity.getTitle());
            if(activity.getDescription()!=null){
                activity.setDescription(userActivity.getDescription());
            }if(activity.getFromDate()!=null){
                activity.setFromDate(userActivity.getFromDate());
            }if(activity.getToDate()!=null){
                activity.setToDate(userActivity.getToDate());
            }
        }
        return activityRepository.save(activity);
    }

    @Override
    public void deleteActivityById(int userId) {
        activityRepository.deleteById(userId);
    }

}
