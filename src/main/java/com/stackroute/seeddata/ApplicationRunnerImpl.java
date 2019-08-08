package com.stackroute.seeddata;
import com.stackroute.domain.Track;
import com.stackroute.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationListener;

//It will get execute, before the server get starts
@Component
@PropertySource("classpath:application.properties")
public class ApplicationRunnerImpl implements ApplicationListener {
    private TrackRepository trackRepository;
    @Autowired
    public ApplicationRunnerImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        Track track1=new Track(62,"aafi","good");
        trackRepository.save(track1);
        Track track2=new Track(63,"nani","great");
        trackRepository.save(track2);
        Track track3=new Track(64,"cheeku","best");
        trackRepository.save(track3);
    }
}
