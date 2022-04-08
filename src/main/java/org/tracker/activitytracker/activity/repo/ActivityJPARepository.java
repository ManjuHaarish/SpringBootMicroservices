package org.tracker.activitytracker.activity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tracker.activitytracker.activity.UserActivity;

@Repository
public interface ActivityJPARepository extends JpaRepository <UserActivity,Integer>{

}
