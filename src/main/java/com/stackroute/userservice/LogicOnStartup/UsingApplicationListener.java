package com.stackroute.userservice.LogicOnStartup;
import com.stackroute.userservice.Exceptions.MovieAlreadyExistsException;
import com.stackroute.userservice.Model.Movie;
import com.stackroute.userservice.Repository.MovieRepository;
import com.stackroute.userservice.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
public class UsingApplicationListener implements ApplicationListener<ContextRefreshedEvent>   {
    @Autowired
    private static MovieRepository movieRepository;
    private static Movie movie=new Movie(1,"Bangalore Days","Malayalam","12-05-2015");

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        movieRepository.deleteAll();
        movieRepository.save(movie);
    }
}
