package org.tracker.activitytracker.activity.repo;


import org.tracker.activitytracker.activity.UserActivity;

import java.util.List;

public interface ActivityRepository {

    UserActivity save(UserActivity userActivity);

    List<UserActivity> fetchActivityList();


    UserActivity updateActivity(UserActivity department,
                                int userId);


    void deleteActivityById(int userId);
}
